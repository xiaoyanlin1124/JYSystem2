package com.jy.controller.system.tool;

import com.jy.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jy.common.utils.base.Const;

@Controller
@RequestMapping("/backstage/tool/document/")
public class DocumentController extends BaseController<Object> {

	@RequestMapping("index")	
	public String index(Model model){
		if(doSecurityIntercept(Const.RESOURCES_TYPE_MENU)){
			return "/system/tool/document/list";
		}
		return Const.NO_AUTHORIZED_URL;	
	}
}
