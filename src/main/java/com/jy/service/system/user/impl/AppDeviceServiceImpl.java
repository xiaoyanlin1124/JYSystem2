package com.jy.service.system.user.impl;

import com.jy.base.service.BaseServiceImp;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.device.CopyProperties;
import com.jy.common.device.DevRes;
import com.jy.common.utils.base.Const;
import com.jy.common.utils.base.UuidUtil;
import com.jy.entity.system.device.JyCeqUserCamera;
import com.jy.entity.system.device.JyCeqUserCameraExample;
import com.jy.entity.system.device.JyCeqUserDevice;
import com.jy.entity.system.device.JyCeqUserDeviceExample;
import com.jy.entity.system.user.UserDeviceApp;
import com.jy.mapper.system.device.JyCeqUserCameraMapper;
import com.jy.mapper.system.device.JyCeqUserDeviceMapper;
import com.jy.service.system.user.AppDeviceService;
import com.jy.service.system.user.AppUserService;
import com.jy.service.system.user.CeqUserDeviceService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @CalssName AppDeviceServiceImpl
 * @Description 作用：App用户设备配置业务逻辑
 * @Author Xiao
 * @Date 2018/11/14 0014 18:38
 * @Version 1.0
 **/
@Service
public class AppDeviceServiceImpl extends BaseServiceImp<JyCeqUserDevice> implements AppDeviceService {

    @Resource
    private JyCeqUserCameraMapper cameraMapper;

    @Resource
    private JyCeqUserDeviceMapper deviceMapper;


    @Resource
    private AppUserService appUserService;

    @Resource
    private CeqUserDeviceService deviceService;

    /**
     * 推送功能
     * @return {"res":1,"resMsg":"修改成功","obj":null}
     */
    @Override
    public AjaxRes updateLockOnPush(JyCeqUserCamera userCamera, JyCeqUserDevice userDevice) {
        AjaxRes ar=new AjaxRes();
        if(userCamera.getOpenid()!=null){
            JyCeqUserCameraExample example1=new JyCeqUserCameraExample();
            JyCeqUserCameraExample.Criteria criteria1=example1.createCriteria();
            criteria1.andOpenidEqualTo(userCamera.getOpenid());
            userCamera=cameraMapper.selectByExample(example1).get(0);
            JyCeqUserDeviceExample example = new JyCeqUserDeviceExample();
            JyCeqUserDeviceExample.Criteria criteria = example.createCriteria();
            criteria.andDevice_idEqualTo(userDevice.getDevice_id());
            criteria.andUser_idEqualTo(userCamera.getId());
            int result = deviceMapper.updateByExampleSelective(userDevice, example);
            if (result > 0) {
                ar.setSucceedMsg(Const.UPDATE_SUCCEED);
            } else {
                ar.setFailMsg(Const.UPDATE_FAIL);
            }
        }else {
            userCamera.setPassword(DigestUtils.sha256Hex(userCamera.getPassword()));
            JyCeqUserCameraExample exampleCamera = new JyCeqUserCameraExample();
            JyCeqUserCameraExample.Criteria criteriaCamera = exampleCamera.createCriteria();
            criteriaCamera.andEmailEqualTo(userCamera.getEmail());
            criteriaCamera.andPasswordEqualTo(userCamera.getPassword());
            List<JyCeqUserCamera> list = cameraMapper.selectByExample(exampleCamera);
            if (list.size() > 0) {
                userDevice.setUser_id(list.get(0).getId());
                JyCeqUserDeviceExample example = new JyCeqUserDeviceExample();
                JyCeqUserDeviceExample.Criteria criteria = example.createCriteria();
                criteria.andDevice_idEqualTo(userDevice.getDevice_id());
                criteria.andUser_idEqualTo(list.get(0).getId());
                int result = deviceMapper.updateByExampleSelective(userDevice, example);
                if (result > 0) {
                    ar.setSucceedMsg(Const.UPDATE_SUCCEED);
                } else {
                    ar.setFailMsg(Const.UPDATE_FAIL);
                }
            } else {
                ar.setFailMsg("用户名或者密码错误！");
            }
        }
        return ar;
    }

    @Override
    public DevRes DelDeviceByDid(JyCeqUserCamera o,JyCeqUserDevice d) {
        DevRes ar=new DevRes();
        ar.setFailMsg(Const.DATA_FAIL ,Const.DATA_FAIL_VALUE );
        try {
            JyCeqUserCamera user = appUserService.LoginConfirm(o);
            if( user!=null && d.getDevice_id()!=null ){
                System.out.println(user.getUser_id());
                d.setUser_id(user.getId());
                System.out.println(d.toString());
                List<JyCeqUserDevice> UserDevicelist = deviceService.find(d);
                if( !UserDevicelist.isEmpty() ){
                    deviceService.delete(UserDevicelist.get(0));
                    ar.setSucceedMsg(Const.DEL_SUCCEED , Const.DEL_SUCCEED_VALUE);
                }
            }
        } catch (Exception e) {
            logger.error(e.toString(),e);
            ar.setFailMsg(Const.DATA_FAIL ,Const.DATA_FAIL_VALUE );
        }
        return ar;
    }

    @Override
    public DevRes AddDeviceByDid(JyCeqUserCamera u, UserDeviceApp d) {
        DevRes ar=new DevRes();
        ar.setFailMsg(Const.DATA_FAIL ,Const.DATA_FAIL_VALUE );
        try {
           JyCeqUserCamera user = appUserService.LoginConfirm(u);
            if( user!=null && d.getDevice_id()!=null ){
                JyCeqUserDevice userDevice = new JyCeqUserDevice();
                CopyProperties.copyPropertiesIgnoreNull(d, userDevice);
                userDevice.setId(UuidUtil.get32UUID());
                userDevice.setUser_id(user.getId());
                userDevice.setCreateTime(new Date());
                userDevice.setDevice_model("CEQP2"); //型号，后期更新
                userDevice.setLanguage(user.getLanguage());
                List<JyCeqUserDevice> UserDevicelist = deviceService.find(userDevice );
                if( UserDevicelist.isEmpty() ){
                    deviceService.insert(userDevice);
                    ar.setSucceedMsg(Const.AddDeviceSuccess , Const.AddDeviceSuccess_VALUE);
                }
            }
        } catch (Exception e) {
            logger.error(e.toString(),e);
        }
        return ar;
    }

}
