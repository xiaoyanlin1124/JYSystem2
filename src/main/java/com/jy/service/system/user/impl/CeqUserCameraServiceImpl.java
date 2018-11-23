package com.jy.service.system.user.impl;

import com.aliyuncs.exceptions.ClientException;
import com.jy.base.controller.BaseController;
import com.jy.base.service.BaseServiceImp;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.device.DevRes;
import com.jy.common.device.PushI18n;
import com.jy.common.mybatis.Page;
import com.jy.common.user.AccountValidatorUtil;
import com.jy.common.user.SmsTool;
import com.jy.common.utils.base.Const;
import com.jy.common.utils.base.UuidUtil;
import com.jy.entity.system.device.JyCeqUserCamera;
import com.jy.entity.system.device.JyCeqUserIpadd;
import com.jy.mapper.system.device.JyCeqUserCameraMapper;
import com.jy.service.system.user.CeqUserCameraService;
import com.jy.service.system.user.CeqUserIpAddService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @CalssName CeqUserCameraServiceImpl
 * @Description 作用：设备（摄像头）的基本信息业务逻辑
 * @Author Xiao
 * @Date 2018/11/10 0010 11:13
 * @Version 1.0
 **/
@Service
public class CeqUserCameraServiceImpl extends BaseServiceImp<JyCeqUserCamera> implements CeqUserCameraService {

    @Resource
    private JyCeqUserCameraMapper jyCeqUserCameraMapper;

    @Resource
    private JyCeqUserCameraMapper cameraMapper;

    @Resource
    private BaseController<JyCeqUserCamera> baseController;

    @Resource
    private CeqUserIpAddService ipAddService;

    @Resource
    private DevRes ar;


    @Override
    public List<JyCeqUserCamera> findDeviceByKey(String id) {
        return this.jyCeqUserCameraMapper.findDeviceByKey(id);
        }



    @Override
    public List<JyCeqUserCamera> findDeviceSafe_key_value(JyCeqUserCamera o) {
        return cameraMapper. findDeviceSafe_key_value(o);
    }

    /**
     * 上线记录分页显示   有待重构
     * @param page
     * @param o
     * @return
     */
    @Override
    public AjaxRes findByPage(Page<JyCeqUserCamera> page, JyCeqUserCamera o) {
        AjaxRes ar=new AjaxRes();
        if(ar.setNoAuth(baseController.doSecurityIntercept(Const.RESOURCES_TYPE_MENU,"/backstage/UserCamear/index"))){
            try {
                Page<JyCeqUserCamera> result = this.findByPage(o,page);
                //获取IP 这里会形响效率
                for(int i = 0 ; i < result.getResults().size() ; i++) {
                    JyCeqUserIpadd userIp = new JyCeqUserIpadd();
                    userIp.setUser_id(result.getResults().get(i).getId());
                    List<JyCeqUserIpadd> ipAdd = ipAddService.find(userIp);
                    if(!ipAdd.isEmpty()){
                        result.getResults().get(i).setLogin_ip( ipAdd.get(0).getIp() );
                        result.getResults().get(i).setUpdateTime(ipAdd.get(0).getUpdateTime());
                    }else{
                        result.getResults().get(i).setUpdateTime(null);
                    }
                }
                Map<String, Object> p=new HashMap<String, Object>();
                p.put("permitBtn",baseController.getPermitBtn(Const.RESOURCES_TYPE_BUTTON));
                p.put("list",result);
                ar.setSucceed(p);
            } catch (Exception e) {
                logger.error(e.toString(),e);
                ar.setFailMsg(Const.DATA_FAIL);
            }
        }
        return ar;

    }

    /**
     * 用户注册页面，验证码获取
     * @param userCamera  email  or  phone
     * @return
     */
    @Override
    public DevRes findInfo(JyCeqUserCamera userCamera) {
        try {
            //判断用户输入email和phone是否合法
            if( AccountValidatorUtil.isEmail(userCamera.getEmail()) || AccountValidatorUtil.isPhone(userCamera.getPhone()))
            {
                List<JyCeqUserCamera> result = jyCeqUserCameraMapper.findemailphone(userCamera);
                if (result.isEmpty()){
                    List<JyCeqUserCamera> result2 = this.find(userCamera);
                    if (result2.isEmpty()) {
                        JyCeqUserCamera userCamera2 = sendSMS(userCamera);
                        userCamera2.setId(UuidUtil.get32UUID());
                        userCamera2.setCreateTime(new Date());
                        this.insert(userCamera2);
                    } else if ((new Date()).getTime() - result2.get(0).getVerification_send_Time().getTime() > SmsTool.verificationaInterval) {
                        result2.get(0).setLanguage(userCamera.getLanguage());
                        JyCeqUserCamera userCamera2 = sendSMS(result2.get(0));
                        this.update(userCamera2);
                    }
                    ar.setSucceedMsg(PushI18n.getI18nString(Const.sendsuccessful, userCamera.getLanguage()), Const.sendsuccessful_VALUE);
                } else {
                    ar.setFailMsg(PushI18n.getI18nString(Const.Registered, userCamera.getLanguage()), Const.Registered_VALUE);
                }
            }
        } catch (Exception e) {
            ar.setFailMsg( PushI18n.getI18nString( Const.sendFail , userCamera.getLanguage()),Const.sendFail_VALUE);
        }
        return ar;
    }

    /**
     * 发送短信验证码
     * @param userCamera
     * @return
     */
    @Override
    public JyCeqUserCamera sendSMS(JyCeqUserCamera userCamera) {
        String verifier = SmsTool.verifierCode();
        userCamera.setVerification_send_Time(new Date());
        userCamera.setVerificationCode(verifier);
        if (AccountValidatorUtil.isEmail(userCamera.getEmail())) {
            SmsTool.snedMial(userCamera.getEmail(),
                    userCamera.getLanguage() != null ? new Locale((String) userCamera.getLanguage().subSequence(0, 2), (String) userCamera.getLanguage().subSequence(3, 5)) : null, verifier);
        } else {
            try {
                SmsTool.sendSms(userCamera.getPhone(),
                        userCamera.getLanguage() != null ? new Locale((String) userCamera.getLanguage().subSequence(0, 2),
                                (String) userCamera.getLanguage().subSequence(3, 5)) : null, verifier);
            } catch (ClientException e) {
                e.printStackTrace();
            }
        }
        Calendar Verification_Time = Calendar.getInstance();
        Verification_Time.setTimeInMillis((new Date()).getTime() + SmsTool.verificationTime);
        Date vdate = Verification_Time.getTime();
        userCamera.setVerification_Time(vdate);
        return userCamera;
    }

    @Override
    public AjaxRes add(JyCeqUserCamera o) {
        AjaxRes ar=new AjaxRes();
        if(ar.setNoAuth(baseController.doSecurityIntercept(Const.RESOURCES_TYPE_FUNCTION))){
            try {
                o.setId(UuidUtil.get32UUID());
                o.setCreateTime(new Date());
                this.insert(o);
                ar.setSucceedMsg(Const.SAVE_SUCCEED);
            } catch (Exception e) {
                logger.error(e.toString(),e);
                ar.setFailMsg(Const.SAVE_FAIL);
            }
        }
        return ar;
    }

    /**
     * 查找单个数据
     * @param o
     * @return
     */
    @Override
    public AjaxRes findCamear(JyCeqUserCamera o) {
        AjaxRes ar=new AjaxRes();
        try {
            JyCeqUserCamera userCamera=cameraMapper.find(o).get(0);
            ar.setSucceed(userCamera);
        }catch (Exception e){
            logger.error(e.toString(),e);
            ar.setFailMsg(Const.DATA_FAIL);
        }
        return ar;
    }

    /**
     * 修改
     * @param o
     * @return
     */
    @Override
    public AjaxRes updateCamear(JyCeqUserCamera o) {
        AjaxRes ar=new AjaxRes();
        try {
            this.update(o);
            ar.setSucceedMsg(Const.UPDATE_SUCCEED);
        }catch (Exception e){
            logger.error(e.toString(),e);
            ar.setFailMsg(Const.UPDATE_FAIL);
        }
        return ar;
    }

    /**
     * 删除
     * @param o
     * @return
     */
    @Override
    public AjaxRes del(JyCeqUserCamera o) {
        AjaxRes ar=new AjaxRes();
        if(ar.setNoAuth(baseController.doSecurityIntercept(Const.RESOURCES_TYPE_BUTTON))){
            try {
                this.delete(o);
                ar.setSucceedMsg(Const.DEL_SUCCEED);
            } catch (Exception e) {
                logger.error(e.toString(),e);
                ar.setFailMsg(Const.DEL_FAIL);
            }
        }
        return ar;
    }

    /**
     * 批量删除用户
     * @param checkBox
     * @return
     */
    @Override
    public AjaxRes delBatch(String checkBox) {
        AjaxRes ar=new AjaxRes();
        if(ar.setNoAuth(baseController.doSecurityIntercept(Const.RESOURCES_TYPE_FUNCTION))){
            try {
                String[] chk =checkBox.split(",");
                List<JyCeqUserCamera> list=new ArrayList<>();
                for(String s:chk){
                    JyCeqUserCamera userCamera=new JyCeqUserCamera();
                    userCamera.setId(s);
                    list.add(userCamera);
                }
                this.deleteBatch(list);
                ar.setSucceedMsg(Const.DEL_SUCCEED);
            } catch (Exception e) {
                logger.error(e.toString(),e);
                ar.setFailMsg(Const.DEL_FAIL);
            }
        }
        return ar;
    }


}
