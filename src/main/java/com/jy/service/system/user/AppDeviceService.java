package com.jy.service.system.user;

import com.jy.base.service.BaseService;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.device.DevRes;
import com.jy.entity.system.device.JyCeqUserCamera;
import com.jy.entity.system.device.JyCeqUserDevice;
import com.jy.entity.system.user.UserDeviceApp;

/**
 * @CalssName AppDeviceService
 * @Description 作用：使用app修改设备的配置信息
 * @Author Xiao
 * @Date 2018/11/14 0014 18:37
 * @Version 1.0
 **/
public interface AppDeviceService extends BaseService<JyCeqUserDevice> {

    /**
     * 推送功能
     * @param  o emailOrPhone email或者phone
     * @param  d device_id 设备名称   lockOnPush  1：推送   0：不推送
     * @return {"res":1,"resMsg":"修改成功","obj":null}
     */
     AjaxRes updateLockOnPush(JyCeqUserCamera o,JyCeqUserDevice d);

    /**
     * 用户App端删除设备
     * @param o  设备id 和用户信息
     * @return
     */
     DevRes DelDeviceByDid(JyCeqUserCamera o ,JyCeqUserDevice d);

    /**
     * 用户app添加设备
     * @param 
     * @param d
     * @return
     */
    DevRes AddDeviceByDid(JyCeqUserCamera u ,  UserDeviceApp d  );



}
