
package com.jy.controller.system.user;

import com.jy.base.controller.BaseController;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.device.DevRes;
import com.jy.entity.system.device.JyCeqPushDevice;
import com.jy.entity.system.device.JyCeqUserCamera;
import com.jy.entity.system.device.JyCeqUserDevice;
import com.jy.entity.system.user.UserDeviceApp;
import com.jy.service.system.user.AppDeviceService;
import com.jy.service.system.user.AppUserService;
import com.jy.service.system.user.PushDeviceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * @CalssName DevicePushController
 * @Description 作用： 设备推送控制器
 * @Author Xiao
 * @Date 2018/11/16 0016 15:55
 * @Version 1.0
 **/
@Controller
@RequestMapping("/device/")
public class DevicePushController extends BaseController<JyCeqPushDevice> {

    @Resource
    private PushDeviceService pushDeviceService;

    @Resource
    private AppDeviceService appDeviceService;

    @Resource
    private AppUserService appUserService;

    /**
     * 修改配置文件
     * @param u [email 、phone、open_id]
     * @param d   设备id标识  device_id    开锁消息	lockOnPush   警报消息	hijackPush 劫持消息	alarmPush 短讯消息	SMSPush
     * @return {"res":1,"resMsg":"修改成功","obj":null}
     */
    @RequestMapping(value="editDeviceByDid",method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes updateLockOnPush(JyCeqUserCamera u, JyCeqUserDevice d) {
        return   appDeviceService.updateLockOnPush(u,d);
    }

    /**
     * 用户关联的设备信息
     * @param o phone email openid safeKeyValue
     * @return {"res":14,"resMsg":"数据获取成功","obj":[{"hijackPush":1,"device_id":"HSL417206GCBHF","device_model":"CEQP1","powerLowPush":0,"description":"","admin_password":"","pushPlatform":"xg","pushToken":"3d72a1e063cffba94fcda8ad61fe26bf87a2611a","SMSPush":1,"device_name":"WIFICAM","alarmPush":1,"admin_name":"admin","lockOnPush":1}]}
     */
    @RequestMapping(value="findDeviceByKey", method=RequestMethod.POST)
    @ResponseBody
    public DevRes findDeviceByKey(JyCeqUserCamera o ){
        return appUserService.findDeviceByKey(o);
    }


    /**
     * 根据设备id     删除设备
     * @param o  用户登录信息（password  user【email  phone   openId】）
     * @param d  device-id
     * @return {"res":12,"resMsg":"删除成功","obj":null}
     */
    @RequestMapping(value = "delDeviceByDid",method=RequestMethod.POST)
    @ResponseBody
    public DevRes DelDeviceByDid(JyCeqUserCamera o,JyCeqUserDevice d ){
        return appDeviceService.DelDeviceByDid(o, d);
    }

    /**
     * 用户添加设备
     * @param u 用户登录信息（password  user【email  phone   openId】）
     * @param d device_id   device_modle
     * @return {"res":30,"resMsg":"AddDeviceSuccess","obj":null}
     */
    @RequestMapping(value="addDeviceByDid", method=RequestMethod.POST)
    @ResponseBody
    public DevRes AddDeviceByDid(JyCeqUserCamera u ,  UserDeviceApp d  ){
        return appDeviceService.AddDeviceByDid(u,d);
    }

    /**
     * 设备启动信息记录
     * @param  o 设备id  设备型号
     * @param request 获取ip地址参数
     * @return {"res":1,"resMsg":"successfully","obj":null}
     */
    @RequestMapping(value="run", method=RequestMethod.GET)
    @ResponseBody
    public AjaxRes run(JyCeqPushDevice o, HttpServletRequest request){
        return pushDeviceService.run(o,request);
    }

    /**
     * 设备消息推送
     * @param o  device_id   device_model  or  [un_lock，hijack，warning，warning]
     * @param request 请求
     * @return   有待测试
     */
    @RequestMapping(value = "push",method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes  devicePush(JyCeqPushDevice o, HttpServletRequest request){
            return  pushDeviceService.devicePush(o,request);
    }



   /*@Async
    public AjaxRes getCityUpdate(OnlineDevice obj ) throws InterruptedException  {
        AjaxRes ar=getAjaxRes();
        IpAdrressUtil ipAdrressUtil = new IpAdrressUtil();
        String cityAdd = null;
        try {
            cityAdd = ipAdrressUtil.getAddress(obj.getIpAdd());
        } catch (Exception e) {
            logger.error(e.toString(),e);
            ar.setFailMsg(Const.IP_CITY_FAIL);
        }
        //LOG.info( cityAdd );
        if(cityAdd!=null){
            obj.setCityAdd(cityAdd);
            onlineDeviceService.update(obj);
            ar.setSucceedMsg(Const.UPDATE_SUCCEED);
        }
        return ar;
    }
    */

}

