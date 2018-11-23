package com.jy.service.system.user.impl;

import com.jy.service.system.user.AppUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-application.xml")
public class AppUserServiceImplTest {
    @Resource
     private AppUserService userService;

    @Test
    public void select_login_LoserCount() {
        /*    int result=userService.select_login_LoserCount("993102029@qq.com");
            Assert.assertNotNull(result);
*/
    }
}