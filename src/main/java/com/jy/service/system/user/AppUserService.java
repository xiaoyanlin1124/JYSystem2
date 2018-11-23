package com.jy.service.system.user;

import com.jy.common.device.DevRes;
import com.jy.entity.system.device.JyCeqUserCamera;
import com.jy.entity.system.device.JyCeqUserHistory;

import javax.servlet.http.HttpServletRequest;

public interface AppUserService {

    /**
     * 验证用户登陆
     * @param userCamera   entity
     * @return json
     */
    JyCeqUserCamera LoginConfirm(JyCeqUserCamera userCamera );

    /**
     * 手机注册码验证
     */
    DevRes regConfirm(JyCeqUserCamera userCamera);

    /**
     * App用户登录确认
     * @param userCamera  App端传过来的数据  [ email  or  phone   or   open_id ] and  password
     * @param request  请求
     * @return  DevRes {"res":28,"resMsg":"loginSuccess","obj":{"email":"10000000000@qq.com","phone":null,"openid":null,"nickname":"CEQ_74274741","safe_key_value":"648d9380474d48b28732ab912e3be836","name":null}}
     */
    DevRes AppLoginConfirm(JyCeqUserCamera userCamera,HttpServletRequest request);

    /**
     * 查找第三方登陆写入信息，支持facebook QQ 微信
     * 参数 openid access_token nickname access_type language safe_key_value
     * @param    userCamera entity
     * @return {"res":1,"resMsg":"保存成功","obj":null}
     */
      DevRes ThirdLogin(JyCeqUserCamera userCamera);

    /**
     * 3种方式修改密码
     * @param userCamera  用户名   原密码   手机号 邮箱  验证码  密码
     * @return
     */
    DevRes forgetPassword(JyCeqUserCamera userCamera);


    String getEmailPhoneOpenid(JyCeqUserCamera u );


    DevRes findDeviceByKey(JyCeqUserCamera userCamera );

    /**
     * 短信发送  邮箱发送
     * @param userCamera
     * @return
     */
    DevRes sendVerificationCode(JyCeqUserCamera userCamera);

    /**
     * 查询用户登录密码输入错误次数
     * @param user  用户账号
     * @return 输错总次数
     */
    JyCeqUserHistory selectHistory(String user);


}
