package com.jy.service.system.user;

import com.jy.base.service.BaseService;
import com.jy.entity.system.device.JyCeqUserIpadd;

/**
 * @CalssName CeqUserIpAddService
 * @Description 作用：  ip地址相关
 * @Author Xiao
 * @Date 2018/11/10 0010 11:08
 * @Version 1.0
 **/
public interface CeqUserIpAddService extends BaseService<JyCeqUserIpadd> {
    /**
     * 根据设备的id  获取ip地址
     * @param deviceId  设备id
     * @return ip地址
     */
    String findDeviceIp(String deviceId);

    /**
     * 修改ip地址信息
     * @param record  ip实体信息
     * @return 1：成功  0 ：失败
     */
    int updateByPrimaryKey(JyCeqUserIpadd record);

}
