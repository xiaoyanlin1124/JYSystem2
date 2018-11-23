package com.jy.controller.system.user;

import com.jy.base.controller.BaseController;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.mybatis.Page;
import com.jy.common.utils.base.Const;
import com.jy.entity.system.device.JyCeqUserDevice;
import com.jy.service.system.user.CeqUserDeviceService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @CalssName PushConfigController
 * @Description 作用：推送配置
 * @Author Xiao
 * @Date 2018/11/13 0013 16:30
 * @Version 1.0
 **/
@Configuration
@Controller           //控制器
@RequestMapping("/backstage/PushDevice/")   //url
public class PushConfigController extends BaseController<JyCeqUserDevice> {

    @Resource
    private CeqUserDeviceService deviceService;

    /**
     * 系统字典首页
     */
    @RequestMapping("index")
    public String index(Model model) {
        if(doSecurityIntercept(Const.RESOURCES_TYPE_MENU)){
            model.addAttribute("permitBtn", getPermitBtn(Const.RESOURCES_TYPE_FUNCTION));
            return "/system/device/push/list";
        }
        return Const.NO_AUTHORIZED_URL;
    }

    /**
     * 用户上线分页查找
     * @param page  分页Map
     * @param o  JyCeqUserCamera（用户摄像头信息）
     * @return AjaxRes
     */
    @RequestMapping(value = "findByPage", method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes findByPage(Page<JyCeqUserDevice> page, JyCeqUserDevice o) {
        return deviceService.findByPage(page,o);
    }

    /**
     * 添加
     * @param o JyCeqUserCamera（用户摄像头信息）
     * @return AjaxRes
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes add(JyCeqUserDevice o) {
        return deviceService.add(o);
    }

    /**
     * 查找
     * @param o JyCeqUserCamera（用户摄像头信息）
     * @return AjaxRes
     */
    @RequestMapping(value = "find", method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes find(JyCeqUserDevice o) {
        return deviceService.findDevice(o);
    }

    /**
     * 修改
     * @param o JyCeqUserCamera（用户摄像头信息）
     * @return AjaxRes
     */
    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes update(JyCeqUserDevice o) {
        return deviceService.updateDevice(o);
    }

    /**
     * 删除
     * @param o JyCeqUserCamera（用户摄像头信息）
     * @return AjaxRes
     */
    @RequestMapping(value = "del", method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes del(JyCeqUserDevice o) {
        return deviceService.del(o);
    }

    /**
     * 批量删除
     * @param checkBox 复选框行
     * @return AjaxRes
     */
    @RequestMapping(value="delBatch", method=RequestMethod.POST)
    @ResponseBody
    public AjaxRes delBatch(String checkBox) {
        return deviceService.delBatch(checkBox);
    }




}
