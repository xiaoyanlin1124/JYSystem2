package com.jy.service.system.user;

import com.jy.base.service.BaseService;
import com.jy.common.ajax.AjaxRes;
import com.jy.entity.system.device.JyCeqPushDevice;
import javax.servlet.http.HttpServletRequest;

/**
 * @CalssName PushDeviceService
 * @Description 作用：设备启动相关业务逻辑
 * @Author Xiao
 * @Date 2018/11/17 0017 10:24
 * @Version 1.0
 **/
public interface PushDeviceService extends BaseService<JyCeqPushDevice> {
    /**
     * 设备启动信息记录
     * @param o  设备id  设备型号
     * @param request 获取ip地址参数
     * @return
     */
    AjaxRes run(JyCeqPushDevice o, HttpServletRequest request);


    /**
     * 设备发送劫持 、电量低、开锁消息
     * @param jyCeqPushDevice
     * @param request
     * @return
     */
    AjaxRes  devicePush(JyCeqPushDevice jyCeqPushDevice, HttpServletRequest request);
}
