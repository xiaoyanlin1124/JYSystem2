package com.jy.service.system.user.impl;

import com.jy.base.controller.BaseController;
import com.jy.base.service.BaseServiceImp;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.device.CopyProperties;
import com.jy.common.device.DevRes;
import com.jy.common.mybatis.Page;
import com.jy.common.utils.base.Const;
import com.jy.common.utils.base.UuidUtil;
import com.jy.entity.system.device.JyCeqUserCamera;
import com.jy.entity.system.device.JyCeqUserDevice;
import com.jy.entity.system.device.JyCeqUserDeviceExample;
import com.jy.entity.system.user.UserDeviceApp;
import com.jy.mapper.system.device.JyCeqUserDeviceMapper;
import com.jy.service.system.user.AppUserService;
import com.jy.service.system.user.CeqUserCameraService;
import com.jy.service.system.user.CeqUserDeviceService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @CalssName CeqUserDeviceServiceImpl
 * @Description 作用：设备功能业务逻辑
 * @Author Xiao
 * @Date 2018/11/10 0010 11:14
 * @Version 1.0
 **/
@Service
public class CeqUserDeviceServiceImpl extends BaseServiceImp<JyCeqUserDevice> implements CeqUserDeviceService {

    @Autowired
    private JyCeqUserDeviceMapper deviceMapper;

    @Resource
    private BaseController baseController;

    @Resource
    private AppUserService appUserService;

    @Resource
    private CeqUserCameraService cameraService;

    @Resource
    private CeqUserDeviceService deviceService;



    @Override
    public List<JyCeqUserDevice> selectAllInfo(String id) {
        JyCeqUserDeviceExample example=new JyCeqUserDeviceExample();
        JyCeqUserDeviceExample.Criteria criteria=example.createCriteria();
        criteria.andUser_idEqualTo(id);
        return  deviceMapper.selectByExample(example);
    }

    @Override
    public DevRes FindDeviceByKey(JyCeqUserCamera o) {
        DevRes ar=new DevRes();
        ar.setFailMsg(Const.DATA_FAIL ,Const.DATA_FAIL_VALUE );
        try {
            JyCeqUserCamera user = appUserService.LoginConfirm(o);
            if( user!=null){
                JyCeqUserDevice userDevice = new JyCeqUserDevice();
                userDevice.setUser_id(user.getId());
                List<JyCeqUserDevice> list = deviceService.find(userDevice );
                if( !list.isEmpty() ){
                    List<UserDeviceApp>   UserDeviceJsonlist = new ArrayList<>();
                    for(JyCeqUserDevice tmp:list ){
                        UserDeviceApp userDeviceApp = new UserDeviceApp();
                        CopyProperties.copyPropertiesIgnoreNull(tmp, userDeviceApp);
                        UserDeviceJsonlist.add(userDeviceApp);
                    }
                    ar.setObj(JSONArray.fromObject(UserDeviceJsonlist ));
                    ar.setSucceedMsg(Const.DATA_SUCCEED , Const.DATA_SUCCEED_VALUE);
                }
            }
        } catch (Exception e) {
            logger.error(e.toString(),e);
        }
        return ar;
    }

    @Override
    public AjaxRes deviceAdd(JyCeqUserDevice o, HttpServletRequest request) {
        return null;
    }


    /**
     * 添加
     * @param jyCeqUserDevice  用户设备
     * @return AjaxRes
     */
    @Override
    public AjaxRes add(JyCeqUserDevice jyCeqUserDevice) {
        AjaxRes ar=new AjaxRes();
        try {
            JyCeqUserDeviceExample example=new JyCeqUserDeviceExample();
            JyCeqUserDeviceExample.Criteria criteria=example.createCriteria();
            criteria.andIdEqualTo(UuidUtil.get32UUID());
            criteria.andCreateTimeEqualTo(new Date());
            deviceMapper.insertSelective(jyCeqUserDevice);
            ar.setFailMsg(Const.SAVE_SUCCEED);
        } catch (Exception e) {
            logger.error(e.toString(),e);
            ar.setFailMsg(Const.SAVE_FAIL);
        }
        return ar;
    }

    /**
     * 查找单个设备信息
     * @param jyCeqUserDevice  用户设备
     * @return AjaxRes
     */
    @Override
    public AjaxRes findDevice(JyCeqUserDevice jyCeqUserDevice) {
        AjaxRes ar=new AjaxRes();
        JyCeqUserDevice userDevice= deviceMapper.selectByPrimaryKey(jyCeqUserDevice.getId());
        if(userDevice!=null){
            ar.setSucceed(userDevice);
        }else{
            ar.setFailMsg(Const.DATA_FAIL);
        }
        return ar;
    }

    /**
     * 修改
     * @param jyCeqUserDevice 用户设备
     * @return AjaxRes
     */
    @Override
    public AjaxRes updateDevice(JyCeqUserDevice jyCeqUserDevice) {
        AjaxRes ar=new AjaxRes();
        JyCeqUserDeviceExample example=new JyCeqUserDeviceExample();
        JyCeqUserDeviceExample.Criteria criteria=example.createCriteria();
        criteria.andLockOnPushEqualTo(jyCeqUserDevice.getLockOnPush());
        int result=deviceMapper.updateByExampleSelective(jyCeqUserDevice,example);
        if(result>0){
            ar.setSucceed(Const.UPDATE_SUCCEED);
            return ar;
        }else {
            ar.setFailMsg(Const.UPDATE_FAIL);
            return ar;
        }
    }

    /**
     * 删除
     * @param jyCeqUserDevice
     * @return
     */
    @Override
    public AjaxRes del(JyCeqUserDevice jyCeqUserDevice) {
        AjaxRes ar=new AjaxRes();
        try {
            delete(jyCeqUserDevice);
            ar.setSucceedMsg(Const.DEL_SUCCEED);
        } catch (Exception e) {
            logger.error(e.toString(),e);
            ar.setSucceedMsg(Const.DEL_FAIL);
        }
        return ar;
    }

    /**
     * 批量删除
     * @param checkBox
     * @return
     */
    @Override
    public AjaxRes delBatch(String checkBox) {
        AjaxRes ar=new AjaxRes();
        if(ar.setNoAuth(baseController.doSecurityIntercept(Const.RESOURCES_TYPE_FUNCTION))){
            try {
                String[] chk =checkBox.split(",");
                List<JyCeqUserDevice> list=new ArrayList<JyCeqUserDevice>();
                for(String s:chk){
                    JyCeqUserDevice sd=new JyCeqUserDevice();
                    sd.setId(s);
                    list.add(sd);
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

    /**
     * 分页查询
     * @param page
     * @param o
     * @return
     */
    @Override
    public AjaxRes findByPage(Page<JyCeqUserDevice> page, JyCeqUserDevice o) {
        AjaxRes ar=new AjaxRes();
        if(ar.setNoAuth(baseController.doSecurityIntercept(Const.RESOURCES_TYPE_MENU,"/backstage/PushDevice/index"))) {
            try {
                Page<JyCeqUserDevice> result = this.findByPage(o, page);
                Map<String, Object> p = new HashMap<String, Object>();
                p.put("permitBtn", baseController.getPermitBtn(Const.RESOURCES_TYPE_BUTTON));
                p.put("list", result);
                ar.setSucceed(p);
            } catch (Exception e) {
                logger.error(e.toString(), e);
                ar.setFailMsg(Const.DATA_FAIL);
            }
        }
        return ar;
    }



}
