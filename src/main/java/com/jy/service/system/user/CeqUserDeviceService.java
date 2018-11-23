package com.jy.service.system.user;

import com.jy.base.service.BaseService;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.device.DevRes;
import com.jy.common.mybatis.Page;
import com.jy.entity.system.device.JyCeqUserCamera;
import com.jy.entity.system.device.JyCeqUserDevice;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @CalssName CeqUserDeviceService
 * @Description 作用：设备功能相关
 * @Author Xiao
 * @Date  2018/11/10 0010 11:09
 * @Version 1.0
 **/
public interface CeqUserDeviceService extends BaseService<JyCeqUserDevice> {
    /**
     * 根据用户id查询所有的设备信息资料
     * @param id  用户id
     * @return list
     */
     List<JyCeqUserDevice> selectAllInfo(String id);

    /**
     * 结果反馈给controller
     * @param o 根据设备唯一id 查找信息
     * @return json
     */
    DevRes FindDeviceByKey(JyCeqUserCamera o);

    /**
     * 收集摄像头上线信息
     * @param o
     * @return
     */
    AjaxRes deviceAdd(JyCeqUserDevice o, HttpServletRequest request);



    /**
     * 添加
     * @param jyCeqUserDevice
     * @return
     */
    AjaxRes add(JyCeqUserDevice jyCeqUserDevice);

    /**
     * 查找单个设备信息
     * @param jyCeqUserDevice
     * @return
     */
    AjaxRes findDevice(JyCeqUserDevice jyCeqUserDevice);
    /**
     * 更新
     */
    AjaxRes updateDevice(JyCeqUserDevice jyCeqUserDevice);


    /**
     * 删除
     */
    AjaxRes del(JyCeqUserDevice jyCeqUserDevice);


    /**
     * 批量删除
     */
    AjaxRes delBatch(String checkBox);

 /**
  * 查找分页
  * @param page
  * @param o
  * @return
  */
  AjaxRes findByPage(Page<JyCeqUserDevice> page, JyCeqUserDevice o);






}
