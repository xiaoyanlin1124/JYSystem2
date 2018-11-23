package com.jy.controller.system.user;

import com.jy.base.controller.BaseController;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.mybatis.Page;
import com.jy.common.utils.base.Const;
import com.jy.entity.system.device.JyCeqUserCamera;
import com.jy.service.system.user.CeqUserCameraService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

/**
 * @CalssName UserCameraController
 * @Description 作用： 用户管理
 * @Author Xiao
 * @Date  2018/11/13 0013 15:47
 * @Version 1.0
 **/
@Controller
@RequestMapping("/backstage/UserCamear/")
public class UserController extends BaseController<JyCeqUserCamera> {

    @Resource
    private CeqUserCameraService userCameraService;

    /**
     * 系统字典首页
     */
    @RequestMapping("index")
    public String index(Model model) {
        if (doSecurityIntercept(Const.RESOURCES_TYPE_MENU)) {
            model.addAttribute("permitBtn", getPermitBtn(Const.RESOURCES_TYPE_FUNCTION));
            return "/system/user/userCamera/list";
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
    public AjaxRes findByPage(Page<JyCeqUserCamera> page, JyCeqUserCamera o) {
        return userCameraService.findByPage(page, o);
    }

    /**
     * 添加
     * @param o JyCeqUserCamera（用户摄像头信息）
     * @return AjaxRes
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes add(JyCeqUserCamera o) {
        return userCameraService.add(o);
    }

    /**
     * 查找
     * @param o JyCeqUserCamera（用户摄像头信息）
     * @return AjaxRes
     */
    @RequestMapping(value = "find", method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes find(JyCeqUserCamera o) {
        return userCameraService.findCamear(o);
    }

    /**
     * 修改
     * @param o JyCeqUserCamera（用户摄像头信息）
     * @return AjaxRes
     */
    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes update(JyCeqUserCamera o) {
        return userCameraService.updateCamear(o);
    }

    /**
     * 删除
     * @param o JyCeqUserCamera（用户摄像头信息）
     * @return AjaxRes
     */
    @RequestMapping(value = "del", method = RequestMethod.POST)
    @ResponseBody
    public AjaxRes del(JyCeqUserCamera o) {
        return userCameraService.del(o);
    }

    /**
     * 批量删除
     * @param checkBox 复选框行
     * @return AjaxRes
     */
    @RequestMapping(value="delBatch", method=RequestMethod.POST)
    @ResponseBody
    public AjaxRes delBatch(String checkBox) {
        return userCameraService.delBatch(checkBox);
    }


    }
