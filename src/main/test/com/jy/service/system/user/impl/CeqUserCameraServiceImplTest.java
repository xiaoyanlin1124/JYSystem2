package com.jy.service.system.user.impl;

import com.jy.entity.system.device.JyCeqUserCamera;
import com.jy.mapper.system.device.JyCeqUserCameraMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath*:spring/spring-application.xml"})
public class CeqUserCameraServiceImplTest  {

    @Autowired
    private JyCeqUserCameraMapper  ceqUserCameraMapper;

    @Test
    public void findDeviceByKey() {
        JyCeqUserCamera userCamera=new JyCeqUserCamera();
        userCamera.setEmail("1013347382@qq.com");
        List<JyCeqUserCamera> list=ceqUserCameraMapper.findemailphone(userCamera);
        Assert.assertNotNull(list);
    }

    @Test
    public void findDeviceSafe_key_value() {
    }

    @Test
    public void findByPage() {
    }

    @Test
    public void findEmailPhone() {
    }

    @Test
    public void sendSMS() {
    }

    @Test
    public void add() {
    }

    @Test
    public void findCamear() {
    }

    @Test
    public void updateCamear() {
    }

    @Test
    public void del() {
    }

    @Test
    public void delBatch() {
    }
}