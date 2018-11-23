package com.jy.entity.system.device;

import com.jy.base.entity.BaseEntity;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @CalssName JyCeqPushDevice
 * @Description 作用：设备信息录入
 * @Author Xiao
 * @Date  2018/11/17 0017 10:13
 * @Version 1.0
 **/
@Alias("jyCeqPushDevice")
public class JyCeqPushDevice extends BaseEntity {
    /**
     * 设备id
     */
    private String device_id;
    /**
     * 设备型号
     */
    private String device_model;
    /**
     * 记录设备第一IP地址
     */
    private String create_ip;
    /**
     * 记录设备第一次使用时间
     */
    private Date create_time;
    /**
     * 下次重启IP地址
     */
    private String update_ip;
    /**
     * 下次重启时间
     */
    private Date update_time;
    /**
     * 开锁次数
     */
    private Integer un_lock;
    /**
     * 劫持次数
     */
    private Integer hijack;
    /**
     * 警报次数
     */
    private Integer warning;
    /**
     * 电量低次数
     */
    private Integer lowPower;
    /**
     * 消息推送余额次数
     */
    private Integer smscount;

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id == null ? null : device_id.trim();
    }

    public String getDevice_model() {
        return device_model;
    }

    public void setDevice_model(String device_model) {
        this.device_model = device_model == null ? null : device_model.trim();
    }

    public String getCreate_ip() {
        return create_ip;
    }

    public void setCreate_ip(String create_ip) {
        this.create_ip = create_ip == null ? null : create_ip.trim();
    }

    public Date getcreate_time() {
        return create_time;
    }

    public void setcreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_ip() {
        return update_ip;
    }

    public void setUpdate_ip(String update_ip) {
        this.update_ip = update_ip == null ? null : update_ip.trim();
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Integer getUn_lock() {
        return un_lock;
    }

    public void setUn_lock(Integer un_lock) {
        this.un_lock = un_lock;
    }

    public Integer getHijack() {
        return hijack;
    }

    public void setHijack(Integer hijack) {
        this.hijack = hijack;
    }

    public Integer getWarning() {
        return warning;
    }

    public void setWarning(Integer warning) {
        this.warning = warning;
    }

    public Integer getLowPower() {
        return lowPower;
    }

    public void setLowPower(Integer lowPower) {
        this.lowPower = lowPower;
    }

    public Integer getSmscount() {
        return smscount;
    }

    public void setSmscount(Integer smscount) {
        this.smscount = smscount;
    }
}