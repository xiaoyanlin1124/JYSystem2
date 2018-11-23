package com.jy.entity.system.device;

import com.jy.base.entity.BaseEntity;
import org.apache.ibatis.type.Alias;

import java.util.Date;
/**
 * @CalssName JyCeqUserDevice
 * @Description 作用：用户设备信息
 * @Author Xiao
 * @Date  2018/11/10 0010 9:24
 * @Version 1.0
 **/
@Alias("JyCeqUserDevice")
public class JyCeqUserDevice  extends BaseEntity {

    /**
     * 主键
     */
    private String id;
    /**
     * 设备产品型号
     */
    private String device_model;
    /**
     * 设备名称
     */
    private String device_name;
    /**
     * 设备用户姓名
     */
    private String admin_name;
    /**
     * 设备id
     */
    private String device_id;
    /**
     * 用户id
     */
    private String user_id;
    /**
     * 设备用户密码
     */
    private String admin_password;
    /**
     * 设备描述
     */
    private String description;
    /**
     * 开启锁推送功能，0：未开启  1： 开启
     */
    private Byte lockOnPush;


    private Integer lockOnPush1;
    /**
     * 开启推送劫持功能 0：未开启 1：开启
     */
    private Byte hijackPush;
    /**
     * 开启推送警报功能 0：未开启 1：开启
     */
    private Byte alarmPush;
    /**
     * 开启电量推送  0：未开启 1：开启
     */
    private Byte powerLowPush;
    /**
     * 短信息推送数量
     */
    private Byte SMSPush;
    /**
     * 推送的token
     */
    private String pushToken;
    /**
     * 手机品牌，不同的品牌有不同的推送接口
     */
    private String pushPlatform;
    /**
     * 用户设备信息创建时间
     */
    private Date createTime;
    /**
     * 用户设备信息修改时间
     */
    private Date updateTime;
    /**
     * 国际化语言
     */
    private String language;

    /*------------start-----------------------*/
    /**
     * 添加新的字段   对应mapper文件属性
     * @author   xiao
     * @data  2018-11-11
     */
    private  JyCeqUserIpadd jyCeqUserIpadd;


    /**
     *新字段
     */
    private String keyWord;
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public JyCeqUserIpadd getJyCeqUserIpadd() {
        return jyCeqUserIpadd;
    }

    public void setJyCeqUserIpadd(JyCeqUserIpadd jyCeqUserIpadd) {
        this.jyCeqUserIpadd = jyCeqUserIpadd;
    }

    /*------------end-----------------------*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDevice_model() {
        return device_model;
    }

    public void setDevice_model(String device_model) {
        this.device_model = device_model == null ? null : device_model.trim();
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name == null ? null : device_name.trim();
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name == null ? null : admin_name.trim();
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id == null ? null : device_id.trim();
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password == null ? null : admin_password.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getLockOnPush() {
        return lockOnPush;
    }

    public void setLockOnPush(int lockOnPush) {
        this.lockOnPush =(byte)lockOnPush;
    }

    public Byte getHijackPush() {
        return hijackPush;
    }

    public void setHijackPush(Byte hijackPush) {
        this.hijackPush = hijackPush;
    }

    public Byte getAlarmPush() {
        return alarmPush;
    }

    public void setAlarmPush(Byte alarmPush) {
        this.alarmPush = alarmPush;
    }

    public Byte getPowerLowPush() {
        return powerLowPush;
    }

    public void setPowerLowPush(Byte powerLowPush) {
        this.powerLowPush = powerLowPush;
    }

    public Byte getSMSPush() {
        return SMSPush;
    }

    public void setSMSPush(Byte SMSPush) {
        this.SMSPush = SMSPush;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken == null ? null : pushToken.trim();
    }

    public String getPushPlatform() {
        return pushPlatform;
    }

    public void setPushPlatform(String pushPlatform) {
        this.pushPlatform = pushPlatform == null ? null : pushPlatform.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    @Override
    public String toString() {
        return "JyCeqUserDevice{" +
                "id='" + id + '\'' +
                ", device_model='" + device_model + '\'' +
                ", device_name='" + device_name + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", device_id='" + device_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", admin_password='" + admin_password + '\'' +
                ", description='" + description + '\'' +
                ", lockOnPush=" + lockOnPush +
                ", hijackPush=" + hijackPush +
                ", alarmPush=" + alarmPush +
                ", powerLowPush=" + powerLowPush +
                ", SMSPush=" + SMSPush +
                ", pushToken='" + pushToken + '\'' +
                ", pushPlatform='" + pushPlatform + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", language='" + language + '\'' +
                ", jyCeqUserIpadd=" + jyCeqUserIpadd +
                ", keyWord='" + keyWord + '\'' +
                '}';
    }
}