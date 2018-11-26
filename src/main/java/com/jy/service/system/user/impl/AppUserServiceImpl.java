package com.jy.service.system.user.impl;

import com.jy.base.service.BaseServiceImp;
import com.jy.common.device.CopyProperties;
import com.jy.common.device.DevRes;
import com.jy.common.device.IpAdrressUtil;
import com.jy.common.device.PushI18n;
import com.jy.common.user.AccountValidatorUtil;
import com.jy.common.user.SmsTool;
import com.jy.common.utils.base.Const;
import com.jy.common.utils.base.Data;
import com.jy.common.utils.base.UuidUtil;
import com.jy.entity.system.device.*;
import com.jy.entity.system.user.UserCameraApp;
import com.jy.entity.system.user.UserDeviceApp;
import com.jy.mapper.system.device.JyCeqUserCameraMapper;
import com.jy.mapper.system.device.JyCeqUserHistoryMapper;
import com.jy.service.system.user.AppUserService;
import com.jy.service.system.user.CeqUserCameraService;
import com.jy.service.system.user.CeqUserDeviceService;
import net.sf.json.JSONArray;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * @CalssName AppUserServiceImpl
 * @Description 作用：用户登录验证
 * @Author Xiao
 * @Date 2018/11/9 0009 15:41
 * @Version 1.0
 **/
@Service
public class AppUserServiceImpl extends BaseServiceImp<JyCeqUserCamera> implements AppUserService   {


    @Resource
    private CeqUserCameraService userCameraService;

    @Resource
    private CeqUserDeviceService userDeviceService;


    @Resource
    private JyCeqUserCameraMapper cameraMapper;

    @Resource
    private Data data;

    @Resource
    private JyCeqUserHistoryMapper historyMapper;

    /**
     * 验证用户登录
     * @param o  摄像头信息（包含用户信息）
     * @return JyCeqUserCamera
     */
    @Override
    public JyCeqUserCamera LoginConfirm(JyCeqUserCamera o) {
        try {
            if( getEmailPhoneOpenid(o)!=null ){
                List<JyCeqUserCamera> result = userCameraService.find(o);
                if( !result.isEmpty()&&CheckUser(o,result.get(0))){
                        return result.get(0);
                }
            }
        }catch (Exception e) {
            logger.error(e.toString(),e);
            return  null;
}
return null;
}

    /**
     * 手机注册码验证
     */
    @Override
    public DevRes regConfirm(JyCeqUserCamera o) {
        DevRes ar =new DevRes();
        try {
            //判断是否是邮箱 或者  是否是手机号   并且  判断验证码是不能为空  验证码的长度 ==6
            if(AccountValidatorUtil.isEmail(o.getEmail())||AccountValidatorUtil.isPhone(o.getPhone()))
            {
                List<JyCeqUserCamera> result = userCameraService.find(o);
                if(!result.isEmpty() && o.getPassword() != null &&  result.get(0).getIs_enabled() == null  ){
                    if( (result.get(0).getVerification_send_Time().getTime()+SmsTool.verificationTime ) > (new Date()).getTime() ){
                        if(result.get(0).getVerificationCode().equals(o.getVerificationCode())){//正确
                            String sha1Password=DigestUtils.sha256Hex(o.getPassword());
                            o.setId(result.get(0).getId());
                            o.setPassword(sha1Password);
                            o.setIs_enabled(1);
                            o.setUpdateTime(new Date());//authorizedCodeDay
                            o.setCreateTime(result.get(0).getCreateTime());
                            Calendar c = Calendar.getInstance();
                            c.setTime(new Date());
                            c.add(Calendar.DAY_OF_MONTH,  SmsTool.authorizedCodeDay);// 今天+最长时间
                            o.setSafe_key_expire(c.getTime());
                            o.setVerificationCode(null);
                            o.setSafe_key_value(UuidUtil.get32UUID());
                            o.setNickname("CEQ_"+SmsTool.verifierCode(8));
                            userCameraService.update(o);
                            ar.setSucceedMsg(PushI18n.getI18nString( Const.regSuccess , o.getLanguage()) , Const.regSuccess_VALUE  );
                        }else{//验证码错误
                            ar.setFailMsg( PushI18n.getI18nString( Const.verificationError , o.getLanguage()),Const.verificationError_VALUE);
                        }
                    }else{//验证码超时
                        ar.setFailMsg( PushI18n.getI18nString( Const.verificationTimeout , o.getLanguage()), Const.verificationTimeout_VALUE);
                    }
                }else{//没找到数据
                    ar.setFailMsg( PushI18n.getI18nString( Const.error , o.getLanguage()), Const.error_VALUE);
                }
            }
        } catch (Exception e) {
            ar.setFailMsg( PushI18n.getI18nString( Const.error , o.getLanguage()), Const.error_VALUE);
        }
        return ar;
    }



    /**
     * App用户登录确认
     * @param o  App端传过来的数据  [ email  or  phone   or   open_id ] and  password   并且密码错误登录不能超过3次
     * @param request  请求
     * @return  DevRes {"res":28,"resMsg":"loginSuccess","obj":{"email":"10000000000@qq.com","phone":null,"openid":null,"nickname":"CEQ_74274741","safe_key_value":"648d9380474d48b28732ab912e3be836","name":null}}
     */
    @Override
    public DevRes AppLoginConfirm(JyCeqUserCamera o,HttpServletRequest request) {
        DevRes ar=new DevRes();
        try {
            JyCeqUserCamera user =this.LoginConfirm(o);
            //判断该用户是否锁定状态
            JyCeqUserHistory userHistory=selectHistory(getEmailPhoneOpenid(o));
            if( user!=null &&new Date().getTime()-userHistory.getUnlock_time().getTime()<2*60*60*1000){
                user.setLogin_ip(IpAdrressUtil.getIpAdrress(request));
                if(o.getPassword() != null){
                    user.setSafe_key_value(UuidUtil.get32UUID());
                    user.setSafe_key_expire(data.getAuthorizedTime());
                }
                userCameraService.update(user);
                UserCameraApp userAppLogin = new UserCameraApp();//APP登录后发送用户名，key，等消息
                CopyProperties.copyPropertiesIgnoreNull(user, userAppLogin);
                ar.setObj(userAppLogin);
                ar.setSucceedMsg(Const.loginSuccess , Const.loginSuccess_VALUE);
            }else {

                if( userHistory.getLogin_count_loser()<5&&new Date().getTime()-userHistory.getLogin_time().getTime()<2*60*60*1000&&getEmailPhoneOpenid(o)!=null&&user!=null){
                    //用户登录次数记录为0，
                    user.setLogin_ip(IpAdrressUtil.getIpAdrress(request));
                    if(o.getPassword() != null){
                        user.setSafe_key_value(UuidUtil.get32UUID());
                        user.setSafe_key_expire(data.getAuthorizedTime());
                    }
                    userCameraService.update(user);
                    UserCameraApp userAppLogin = new UserCameraApp();//APP登录后发送用户名，key，等消息
                    CopyProperties.copyPropertiesIgnoreNull(user, userAppLogin);
                    userHistory.setLogin_count_loser(0);
                    userHistory.setLogin_time(new Date());
                    historyMapper.updateByPrimaryKeySelective(userHistory);
                    System.out.println(userAppLogin.toString());
                    ar.setObj(userAppLogin);
                    ar.setSucceedMsg(Const.loginSuccess , Const.loginSuccess_VALUE);
                }else if(userHistory.getUser()!=null&&userHistory.getLogin_count_loser()>=5){
                    ar.setFailMsg(Const.Wrong_Message,Const.Wrong_Number);
                }else {
                    ar.setFailMsg("账户密码错误",Const.DATA_FAIL_VALUE);
                }


            }
        }catch (Exception e) {
            ar.setFailMsg("账户不存在" ,Const.DATA_FAIL_VALUE );
        }
        return ar;
    }

    /**
     * 第三方登录
     * @param o access—token    openid   Safe_key_value 安全密钥
     * @return json
     */
    @Override
    public DevRes ThirdLogin(JyCeqUserCamera o) {
        o.setPassword(null);
        o.setEmail(null);
        o.setPhone(null);
        DevRes ar=new DevRes();
        ar.setFailMsg(Const.DATA_FAIL ,Const.DATA_FAIL_VALUE );
        //LOG.info( o.toString() );
        try {
            if( o.getOpenid() == null || o.getAccess_token() == null ){
                return null ;
            }
            List<JyCeqUserCamera> list=userCameraService.find(o);
            o.setSafe_key_value(UuidUtil.get32UUID());
            o.setSafe_key_expire(data.getAuthorizedTime());
            //这里以后要做个安全检测，即检测微信QQfacebook用户openid和accessTokey是否合法
            UserCameraApp userAppLogin = new UserCameraApp();//APP登际后发送用户名，key，等消息
            if( list.isEmpty()){
                CopyProperties.copyPropertiesIgnoreNull(o, userAppLogin);
                o.setId(UuidUtil.get32UUID());
                //数据库中插入数据
                userCameraService.insert(o);
                JyCeqUserHistory history=new JyCeqUserHistory();
                history.setUser(getEmailPhoneOpenid(o));
                historyMapper.insert(history);
            }else{
                list.get(0).setAccess_token(o.getAccess_token());
                list.get(0).setSafe_key_value(UuidUtil.get32UUID());
                list.get(0).setSafe_key_expire(data.getAuthorizedTime());
                CopyProperties.copyPropertiesIgnoreNull(list.get(0), userAppLogin);
                userCameraService.update(list.get(0));
            }
            ar.setObj(userAppLogin);
            ar.setSucceedMsg( Const.ThirdSuccess , Const.ThirdSuccess_VALUE);
        } catch (Exception e) {
            logger.error(e.toString(),e);
        }
        return ar;
    }

    /**
     * 修改密码
     * 3种方式：使用原密码  手机号   邮箱
     * @param o 手机号  邮箱   第三方id    验证码   新密码
     * @return DevRes
     */
    @Override
    public DevRes forgetPassword(JyCeqUserCamera o) {
        DevRes ar=new DevRes();
        //如果参数用户名和密码OK，则可以修改新的密码
            if(o.getPassword()!=null&&(userCameraService.find(o).get(0))!=null||!userCameraService.find(o).isEmpty())
            {
                try {
                    //原密码加密
                    o.setPassword(DigestUtils.sha256Hex(o.getPassword()));
                    //验证用户是否是OK
                    JyCeqUserCameraExample example=new JyCeqUserCameraExample();
                    JyCeqUserCameraExample.Criteria criteria=example.createCriteria();
                    criteria.andPasswordEqualTo(o.getPassword());
                    if(o.getEmail()!=null){
                        criteria.andEmailEqualTo(o.getEmail());
                    }
                    if(o.getPhone()!=null){
                        criteria.andPhoneEqualTo(o.getPhone());
                    }
                    //用户名和密码数据绝对唯一
                    //根据用户名和密码查询数据
                    JyCeqUserCamera user = cameraMapper.selectByExample(example).get(0);
                    //新密码赋值
                    user.setPassword(DigestUtils.sha256Hex(o.getNewPassword()));
                    int result = cameraMapper.updateByPrimaryKeySelective(user);
                    if (result > 0) {
                        ar.setFailMsg(Const.UPDATE_SUCCEED, Const.UPDATE_SUCCEED_VALUE);
                    } else {
                        ar.setFailMsg(Const.UPDATE_FAIL, Const.UPDATE_FAIL_VALUE);
                    }
                } catch (Exception e) {
                    ar.setFailMsg(Const.UPDATE_FAIL,Const.UPDATE_FAIL_VALUE);
                }
            } else  if(AccountValidatorUtil.isEmail(o.getEmail())||AccountValidatorUtil.isPhone(o.getPhone())&&o.getVerificationCode()!=null&&!userCameraService.find(o).isEmpty()) {//判断用户是否输入邮箱还是手机号
                //1.验证邮箱是否存在数据库中
                ar.setFailMsg("请正确输入",Const.verificationError_VALUE);
                JyCeqUserCamera userCamera1 = userCameraService.find(o).get(0);
                //邮箱用户验证 并且验证码过期时间验证
                if (userCamera1.getEmail() != null && new Date().getTime() - userCamera1.getVerification_Time().getTime() > SmsTool.verificationaInterval) {
                    JyCeqUserCameraExample example = new JyCeqUserCameraExample();
                    JyCeqUserCameraExample.Criteria criteria = example.createCriteria();
                    criteria.andEmailEqualTo(userCamera1.getEmail());
                    //3.效验验证码
                    criteria.andVerificationCodeEqualTo(o.getVerificationCode());
                    List<JyCeqUserCamera> list = cameraMapper.selectByExample(example);
                    if (!list.isEmpty()) {
                        //4.新密码二次加密
                        userCamera1.setPassword(DigestUtils.sha256Hex(o.getNewPassword()));
                        //5.数据update
                        criteria.andPasswordEqualTo(userCamera1.getPassword());
                        cameraMapper.updateByExampleSelective(userCamera1, example);
                        ar.setFailMsg(Const.UPDATE_SUCCEED, Const.UPDATE_SUCCEED_VALUE);
                    } else {
                        ar.setFailMsg(Const.UPDATE_FAIL, Const.UPDATE_FAIL_VALUE);
                    }
                }
                if (o.getPhone() != null && new Date().getTime() - userCamera1.getVerification_Time().getTime() > SmsTool.verificationaInterval) {
                    JyCeqUserCameraExample example = new JyCeqUserCameraExample();
                    JyCeqUserCameraExample.Criteria criteria = example.createCriteria();
                    criteria.andPhoneEqualTo(o.getPhone());
                    //3.效验验证码
                    criteria.andVerificationCodeEqualTo(o.getVerificationCode());
                    List<JyCeqUserCamera> list = cameraMapper.selectByExample(example);
                    if (!list.isEmpty()) {
                        //4.新密码二次加密
                        userCamera1.setPassword(DigestUtils.sha256Hex(o.getNewPassword()));
                        //5.数据update
                        criteria.andPasswordEqualTo(userCamera1.getPassword());
                        cameraMapper.updateByExampleSelective(userCamera1, example);
                        ar.setFailMsg(Const.UPDATE_SUCCEED, Const.UPDATE_SUCCEED_VALUE);
                    }else {
                        ar.setFailMsg("验证码不正确", Const.error_VALUE);
                    }
                }
            }else {
                ar.setFailMsg("请输入正确的电话号码或者验证码",Const.error_VALUE);
            }
            return ar;
    }


    //判断用户名是邮箱还是电话号
    @Override
    public  String getEmailPhoneOpenid(JyCeqUserCamera u ){
        if( u.getEmail() !=null )return u.getEmail();
        if( u.getPhone() !=null )return u.getPhone();
        if( u.getOpenid() !=null )return u.getOpenid();
        return null;
    }

    /**
     * 用户关联的设备信息
     * 参数1 phone email openid safeKeyValue
     * @param  o  phone  email
     * @return {"res":1,"resMsg":"保存成功","obj":null}
     */
    @Override
    public DevRes findDeviceByKey(JyCeqUserCamera o) {
        DevRes ar=new DevRes();
        ar.setFailMsg(Const.DATA_FAIL ,Const.DATA_FAIL_VALUE );
        try {
            JyCeqUserCamera user =this.LoginConfirm(o);
            if( user!=null){
                JyCeqUserDevice userDevice = new JyCeqUserDevice();
                userDevice.setUser_id(user.getId());
                List<JyCeqUserDevice> list = userDeviceService.find(userDevice );
                if( !list.isEmpty() ){
                    List<UserDeviceApp> UserDeviceJsonList = new ArrayList<>();
                    for(JyCeqUserDevice tmp:list ){
                        UserDeviceApp userDeviceApp = new UserDeviceApp();
                        CopyProperties.copyPropertiesIgnoreNull(tmp, userDeviceApp);
                        UserDeviceJsonList.add(userDeviceApp);
                    }
                    ar.setObj(JSONArray.fromObject(UserDeviceJsonList));
                    ar.setSucceedMsg(Const.DATA_SUCCEED , Const.DATA_SUCCEED_VALUE);
                }
            }
        } catch (Exception e) {
            logger.error(e.toString(),e);
        }
        return ar;
    }

    /**
     * 通过邮箱或者手机号获取验证码，并且更新数据库
     * @param o  email  or   phone
     * @return {"res":1,"resMsg":"发送成功","obj":"sendsuccessful"}
     */
    @Override
    public DevRes sendVerificationCode(JyCeqUserCamera o) {
        DevRes ar=new DevRes();
        //1.判断用户是否输入合法
        ar.setResMsg("用户输入不合法！");
        List<JyCeqUserCamera> user=userCameraService.find(o);
        if(AccountValidatorUtil.isEmail(o.getEmail())||AccountValidatorUtil.isPhone(o.getPhone())&&!user.isEmpty()){
                //3.发送验证码
                JyCeqUserCamera userCamera1=userCameraService.sendSMS(o);
                //时间设置问题
                userCamera1.setVerification_Time(new Date());
                long currentTime = System.currentTimeMillis() + 30 * 60 * 1000;
                userCamera1.setVerification_send_Time(new Date(currentTime));
                userCamera1.setId(user.get(0).getId());
                userCameraService.updateCamear(userCamera1);
                ar.setSucceed(Const.sendsuccessful,"发送成功");
        }
        return ar;
    }

    @Override
    public JyCeqUserHistory selectHistory(String user) {
        //1.验证用户是否存在
        JyCeqUserHistoryExample example=new JyCeqUserHistoryExample();
        JyCeqUserHistoryExample.Criteria criteria=example.createCriteria();
        criteria.andUserEqualTo(user);
        //2.获取用户详细数据
        return historyMapper.selectByExample(example).get(0);
    }

    /**
     * 判断合法登陆信息
     * @param o 收到的字段
     * @param targer 数据库字段
     * @return boolean
     */
    private  boolean CheckUser(JyCeqUserCamera o, JyCeqUserCamera targer ){
        try{
                boolean EmailPhoneOpenIdCheck = false;
                boolean Safe_key_valueCheck = false;
                boolean Safe_key_expireCheck = false;
                boolean PasswordCheck = false;
                boolean Access_tokenCheck = false;
                if(getEmailPhoneOpenid(o)!=null) EmailPhoneOpenIdCheck = getEmailPhoneOpenid(o).equalsIgnoreCase(getEmailPhoneOpenid(targer));
                if(o.getSafe_key_value()!=null)Safe_key_valueCheck= o.getSafe_key_value().equalsIgnoreCase(targer.getSafe_key_value());

                if(o.getPassword()!=null){
                    if(targer.getPassword().equals(DigestUtils.sha256Hex(o.getPassword()))){
                        JyCeqUserHistory userHistory=selectHistory(getEmailPhoneOpenid(o));
                        userHistory.setLogin_time(new Date());
                        historyMapper.updateByPrimaryKeySelective(userHistory);
                        System.out.println( historyMapper.updateByPrimaryKeySelective(userHistory));
                        PasswordCheck=targer.getPassword().equals(DigestUtils.sha256Hex(o.getPassword()));
                    }else {
                        JyCeqUserHistory userHistory=selectHistory(getEmailPhoneOpenid(o));
                        userHistory.setLogin_count_loser(userHistory.getLogin_count_loser()+1);
                        userHistory.setUnlock_time(new Date());
                        historyMapper.updateByPrimaryKeySelective(userHistory);
                    }
                }
                if( targer.getSafe_key_expire()!=null ) Safe_key_expireCheck = targer.getSafe_key_expire().getTime() > (new Date()).getTime();
                if(o.getAccess_token()!=null) Access_tokenCheck = o.getAccess_token().equalsIgnoreCase(targer.getAccess_token());
                if( getEmailPhoneOpenid(o)!=null && EmailPhoneOpenIdCheck && (( Safe_key_valueCheck && Safe_key_expireCheck) ||  PasswordCheck || Access_tokenCheck )) return true;

            } catch (Exception e) {
                    logger.error(e.toString(),e);
            }
        return false;
    }

}
