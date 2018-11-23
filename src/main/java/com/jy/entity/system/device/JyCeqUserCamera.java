package com.jy.entity.system.device;

import com.jy.base.entity.BaseEntity;
import org.apache.ibatis.type.Alias;

import java.util.Date;
/**
 * @CalssName JyCeqUserCamera
 * @Description 作用：用户摄像头信息资料
 * @Author Xiao
 * @Date  2018/11/10 0010 9:08
 * @Version 1.0
 **/
@Alias("JyCeqUserCamera")
public class JyCeqUserCamera extends BaseEntity {
    /**
     * 设备id,作为唯一标识
     */
    private String id;
    /**
     * 设备产品型号
     */
    private String openid;
    /**
     * 设备名称
     */
    private String user_id;
    /**
     * 设备对接的标识名,默认为admin
     */
    private String nickname;
    /**
     * 设备密码
     */
    private String password;
    /**
     * 盐（辅助密码专用）
     */
    private String salt;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 登陆时间
     */
    private Date login_Time;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 是否可用  默认null  为0  ：不可用   1：可用
     */
    private Integer is_enabled;
    /**
     * 锁定日期
     */
    private Date locked_Time;
    /**
     * 失败登陆次数
     */
    private Integer login_failure_count;
    /**
     * 登陆Ip地址
     */
    private String login_ip;
    /**
     * 语言
     */
    private String language;
    /**
     * 安全密钥
     */
    private String safe_key_value;
    /**
     * 密钥到期时间
     */
    private Date safe_key_expire;
    /**
     * 验证码
     */
    private String verificationCode;
    /**
     * 验证码到期时间
     */
    private Date verification_Time;
    /**
     * 验证码可发送时间
     */
    private Date verification_send_Time;
    /**
     * 备注  描述
     */
    private String description;
    /**
     * 令牌
     */
    private String access_token;
    /**
     * 令牌属性   ：微信   QQ   Facebook
     */
    private String access_type;
    /**
     * 令牌密码
     */
    private String operation_password;
    /**
     * 微信Token
     */
    private String wxToken;
    /**
     * qqToken
     */
    private String qqToken;
    /**
     * 微博Token
     */
    private String wbToken;
    /**
     * FacebookToken
     */
    private String fbToken;
    /**
     * 手机品牌
     */
    private String phoneBrand;
    /**
     * 短信总数
     */
    private Integer smsSum;
    /**
     * 短信余量
     */
    private Integer smsSurplus;

    /*------------start-----------------------*/
    /**
     *新字段
     */
    private String keyWord;

    private  String newPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
    /*------------end-----------------------*/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLogin_Time() {
        return login_Time;
    }

    public void setLogin_Time(Date login_Time) {
        this.login_Time = login_Time;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(Integer is_enabled) {
        this.is_enabled = is_enabled;
    }

    public Date getLocked_Time() {
        return locked_Time;
    }

    public void setLocked_Time(Date locked_Time) {
        this.locked_Time = locked_Time;
    }

    public Integer getLogin_failure_count() {
        return login_failure_count;
    }

    public void setLogin_failure_count(Integer login_failure_count) {
        this.login_failure_count = login_failure_count;
    }

    public String getLogin_ip() {
        return login_ip;
    }

    public void setLogin_ip(String login_ip) {
        this.login_ip = login_ip == null ? null : login_ip.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getSafe_key_value() {
        return safe_key_value;
    }

    public void setSafe_key_value(String safe_key_value) {
        this.safe_key_value = safe_key_value == null ? null : safe_key_value.trim();
    }

    public Date getSafe_key_expire() {
        return safe_key_expire;
    }

    public void setSafe_key_expire(Date safe_key_expire) {
        this.safe_key_expire = safe_key_expire;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode == null ? null : verificationCode.trim();
    }

    public Date getVerification_Time() {
        return verification_Time;
    }

    public void setVerification_Time(Date verification_Time) {
        this.verification_Time = verification_Time;
    }

    public Date getVerification_send_Time() {
        return verification_send_Time;
    }

    public void setVerification_send_Time(Date verification_send_Time) {
        this.verification_send_Time = verification_send_Time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token == null ? null : access_token.trim();
    }

    public String getAccess_type() {
        return access_type;
    }

    public void setAccess_type(String access_type) {
        this.access_type = access_type == null ? null : access_type.trim();
    }

    public String getOperation_password() {
        return operation_password;
    }

    public void setOperation_password(String operation_password) {
        this.operation_password = operation_password == null ? null : operation_password.trim();
    }

    public String getWxToken() {
        return wxToken;
    }

    public void setWxToken(String wxToken) {
        this.wxToken = wxToken == null ? null : wxToken.trim();
    }

    public String getQqToken() {
        return qqToken;
    }

    public void setQqToken(String qqToken) {
        this.qqToken = qqToken == null ? null : qqToken.trim();
    }

    public String getWbToken() {
        return wbToken;
    }

    public void setWbToken(String wbToken) {
        this.wbToken = wbToken == null ? null : wbToken.trim();
    }

    public String getFbToken() {
        return fbToken;
    }

    public void setFbToken(String fbToken) {
        this.fbToken = fbToken == null ? null : fbToken.trim();
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand == null ? null : phoneBrand.trim();
    }

    public Integer getSmsSum() {
        return smsSum;
    }

    public void setSmsSum(Integer smsSum) {
        this.smsSum = smsSum;
    }

    public Integer getSmsSurplus() {
        return smsSurplus;
    }

    public void setSmsSurplus(Integer smsSurplus) {
        this.smsSurplus = smsSurplus;
    }

    @Override
    public String toString() {
        return "JyCeqUserCamera{" +
                "id='" + id + '\'' +
                ", openid='" + openid + '\'' +
                ", user_id='" + user_id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                ", login_Time=" + login_Time +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", sex=" + sex +
                ", is_enabled=" + is_enabled +
                ", locked_Time=" + locked_Time +
                ", login_failure_count=" + login_failure_count +
                ", login_ip='" + login_ip + '\'' +
                ", language='" + language + '\'' +
                ", safe_key_value='" + safe_key_value + '\'' +
                ", safe_key_expire=" + safe_key_expire +
                ", verificationCode='" + verificationCode + '\'' +
                ", verification_Time=" + verification_Time +
                ", verification_send_Time=" + verification_send_Time +
                ", description='" + description + '\'' +
                ", access_token='" + access_token + '\'' +
                ", access_type='" + access_type + '\'' +
                ", operation_password='" + operation_password + '\'' +
                ", wxToken='" + wxToken + '\'' +
                ", qqToken='" + qqToken + '\'' +
                ", wbToken='" + wbToken + '\'' +
                ", fbToken='" + fbToken + '\'' +
                ", phoneBrand='" + phoneBrand + '\'' +
                ", smsSum=" + smsSum +
                ", smsSurplus=" + smsSurplus +
                ", keyWord='" + keyWord + '\'' +
                '}';
    }
}