package com.jy.controller.system.user;

import com.jy.base.controller.BaseController;
import com.jy.common.device.DevRes;
import com.jy.entity.system.device.JyCeqUserCamera;
import com.jy.service.system.user.AppUserService;
import com.jy.service.system.user.CeqUserCameraService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * @CalssName AppLoginController 
 * @Description 作用： 该控制器主要作用于App用户的登录   授权码的更新  短信或者邮箱验证码的验证
 * @Author Xiao
 * @Date  2018/11/9 0009 16:43
 * @Version 1.0
 **/
@Controller
@RequestMapping("/appLogin/")
public class AppUserController extends BaseController<JyCeqUserCamera> {

	@Resource
	private CeqUserCameraService userCameraService;

	@Resource
	private AppUserService appUserService;

	/**
	 * 注册入口，发送验证码
	 * @param userCamera  email  or  phone
	 * @return {"res":20,"resMsg":"Send successful","obj":null}
	 */
	@RequestMapping(value="reg", method=RequestMethod.POST)
	@ResponseBody
	public DevRes AppReg(JyCeqUserCamera userCamera) {
		return userCameraService.findInfo(userCamera);
	}
	
	/**
	 * 注册入口，验证码验证
	 * @param userCamera  email  phone verificationCode(验证码数字)
	 * @return  {"res":26,"resMsg":"Register successfully","obj":null}
	 */
	@RequestMapping(value="regConfirm", method=RequestMethod.POST)
	@ResponseBody
	public DevRes AppRegConfirm(JyCeqUserCamera userCamera){
		return appUserService.regConfirm(userCamera);
	}


	/**
	 * APP登陆，可获得受权码，每次登陆受权码更新
	 * @param userCamera email  phone   password
	 * @param request  请求方式
	 * @return {"res":28,"resMsg":"loginSuccess","obj":{"email":"1013347382@qq.com","phone":null,"openid":null,"nickname":"CEQ_74274741","safe_key_value":"a2ac3f9cbb23461383de1d63c9e18562","name":null}}
	 */
	@RequestMapping(value={"login","checkLogin"}, method=RequestMethod.POST)
	@ResponseBody
	public DevRes AppLoginConfirm(JyCeqUserCamera userCamera,HttpServletRequest request){
		return appUserService.AppLoginConfirm(userCamera,request);
	}



	/**
	 * 查找第三方登陆写入信息，支持facebook QQ 微信
	 * POST发送数据
	 * 参数 openid access_token nickname access_type language safe_key_value
	 * @param userCamera  用户实体
	 * @return {"res":1,"resMsg":"保存成功","obj":null}
	 */
	@RequestMapping(value="thirdLogin", method=RequestMethod.POST)
	@ResponseBody
	public DevRes ThirdLogin(JyCeqUserCamera userCamera ){
		return appUserService.ThirdLogin(userCamera);
	}



	/**
	 * 通过手机号或者邮箱修改密码
	 * @param userCamera  手机号  原密码  新密码    邮箱     验证码   openid
	 * @return  {"res":13,"resMsg":"修改成功","obj":null}
	 */
	@RequestMapping(value = "forgetPassword",method = RequestMethod.POST)
	@ResponseBody
	public DevRes forgetPassword(JyCeqUserCamera userCamera){
		return appUserService.forgetPassword(userCamera);
	}


	/**
	 * 通过邮箱或者手机号获取验证码，并且更新数据库
	 * @param userCamera  email  or   phone
	 * @return {"res":1,"resMsg":"发送成功","obj":"sendsuccessful"}
	 */
	@RequestMapping(value = "sendVerificationCode",method = RequestMethod.POST)
	@ResponseBody
	public DevRes sendVerificationCode(JyCeqUserCamera userCamera){
		return appUserService.sendVerificationCode(userCamera);
	}

}

