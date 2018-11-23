package com.jy.controller.system.user;

import com.jy.base.controller.BaseController;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @CalssName RecordNewsController
 * @Description 作用： 消息记录
 * @Author Xiao
 * @Date 2018/11/13 0013 17:06
 * @Version 1.0
 **/
@Configuration   //加载spring
@EnableAsync     //支持异步执行任务
@Controller        //控制器
@RequestMapping("backstage/")
public class RecordNewsController extends BaseController {
}
