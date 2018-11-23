package com.jy.controller.system.user;

import com.jy.base.controller.BaseController;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.mybatis.Page;
import com.jy.common.utils.base.Const;
import com.jy.entity.system.device.JyCeqUserDevice;
import com.jy.service.system.user.CeqUserDeviceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @CalssName UserDeviceController
 * @Description 作用：  用户设备
 * @Author Xiao
 * @Date 2018/11/12 0012 13:14
 * @Version 1.0
 **/
@Controller
@RequestMapping("/backstage/UserDevice")
public class UserDeviceController  extends BaseController<JyCeqUserDevice> {

    @Resource
    private CeqUserDeviceService deviceService;


    /**
     * 用户设备
     * @param model  模块
     * @return  路径
     */
    @RequestMapping("index")
    public String index(Model model){
        if(doSecurityIntercept(Const.RESOURCES_TYPE_MENU)){
            model.addAttribute("permitBtn",getPermitBtn(Const.RESOURCES_TYPE_FUNCTION));
            return "/system/user/userdevice/list";
        }
        return  Const.NO_AUTHORIZED_URL;
    }

    /**
     * 分页
     * @param page  分页设备大小
     * @param o  分页对象
     * @return  返回数据
     */
    @RequestMapping(value = "findByPage",method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes findByPage(Page<JyCeqUserDevice>page,JyCeqUserDevice o){
                AjaxRes ar=getAjaxRes();
                if(ar.setNoAuth(doSecurityIntercept(Const.RESOURCES_TYPE_MENU,"/backstage/UserDevice/index"))){
                    try {
                        Page<JyCeqUserDevice> userDevicePage=deviceService.findByPage(o, page);
                        Map<String,Object> map=new HashMap<>();
                        map.put("permitBtn",getPermitBtn(Const.RESOURCES_TYPE_BUTTON));
                        map.put("list",userDevicePage);
                        ar.setSucceed(map);
                    } catch (Exception e) {
                       logger.error(e.toString(),e);
                       ar.setFailMsg(Const.DATA_FAIL);
                    }
                }
                return  ar;
    }

    /**
     * 增加
     * @param o  实体
     * @return json
     */
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes add(JyCeqUserDevice o){
            return deviceService.add(o);
    }

    /**
     * 查找单个设备
     * @param o 实体
     * @return json
     */
    @RequestMapping(value = "find",method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes find(JyCeqUserDevice o){
        return deviceService.findDevice(o);
    }

    /**
     * 修改
     * @param o 实体
     * @return json
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes update(JyCeqUserDevice o){
        return deviceService.updateDevice(o);
    }

    /**
     * 删除
     * @param o 实体
     * @return json
     */
    @RequestMapping(value = "del",method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes del(JyCeqUserDevice o){
        return deviceService.del(o);
    }

    /**
     * 批量删除
     * @param checkBox 实体
     * @return  json
     */
    @RequestMapping(value = "delBatch",method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes delBatch(String checkBox){
        return deviceService.delBatch(checkBox);
    }


}
