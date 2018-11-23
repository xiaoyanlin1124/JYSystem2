package com.jy.service.system.user;

import com.jy.base.service.BaseService;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.device.DevRes;
import com.jy.common.mybatis.Page;
import com.jy.entity.system.device.JyCeqUserCamera;

import java.util.List;

/**
 * @CalssName CeqUserCameraService
 * @Description 作用：设备信息相关
 * @Author Xiao
 * @Date  2018/11/10 0010 11:09
 * @Version 1.0
 **/
public interface CeqUserCameraService extends BaseService<JyCeqUserCamera> {
    /**
     * 根据设备
     * @param id
     * @return
     */
    public List<JyCeqUserCamera> findDeviceByKey(String id);



    List<JyCeqUserCamera> findDeviceSafe_key_value(JyCeqUserCamera o);

    /***整合Start---------------------------------------****/
    /**
     * 查找分页
     * @param page
     * @param o
     * @return
     */
     AjaxRes findByPage(Page<JyCeqUserCamera> page, JyCeqUserCamera o);



    /**
     *根据邮箱or手机号码获得用户
     * @param userCamera
     * @return
     */
    DevRes findInfo(JyCeqUserCamera userCamera);

    /**
     * 发送短信验证码
     * @param userCamera
     * @return
     */
    JyCeqUserCamera  sendSMS(JyCeqUserCamera userCamera);


    /**
     * 添加
     * @param o
     * @return
     */
    AjaxRes add(JyCeqUserCamera o);



    /**
     * 查找
     * @param o
     * @return
     */
    AjaxRes findCamear(JyCeqUserCamera o);

    /**
     * 更新数据
     * @param o
     * @return
     */
    AjaxRes updateCamear(JyCeqUserCamera o);

    /**
     * 删除
     * @param o
     * @return
     */
     AjaxRes del(JyCeqUserCamera o);


    /**
     * 批量删除
     */
    AjaxRes delBatch(String checkBox);



}
