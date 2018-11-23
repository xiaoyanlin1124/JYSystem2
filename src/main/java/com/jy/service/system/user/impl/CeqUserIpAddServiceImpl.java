package com.jy.service.system.user.impl;


import com.jy.base.service.BaseServiceImp;
import com.jy.entity.system.device.JyCeqUserIpadd;
import com.jy.entity.system.device.JyCeqUserIpaddExample;
import com.jy.mapper.system.device.JyCeqUserIpaddMapper;
import com.jy.service.system.user.CeqUserIpAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @CalssName CeqUserIpAddServiceImpl
 * @Description 作用：相关ip地址信息记录业务逻辑层
 * @Author Xiao
 * @Date 2018/11/10 0010 11:15
 * @Version 1.0
 **/
@Service
public class CeqUserIpAddServiceImpl extends BaseServiceImp<JyCeqUserIpadd> implements CeqUserIpAddService {
    @Autowired
    private JyCeqUserIpaddMapper ipAddMapper;

    @Override
    public String findDeviceIp(String deviceId) {
        JyCeqUserIpaddExample example=new JyCeqUserIpaddExample();
        JyCeqUserIpaddExample.Criteria criteria=example.createCriteria();
        criteria.andUser_idEqualTo(deviceId);
        return   ipAddMapper.selectByExample(example).get(0).getIp();
    }

    @Override
    public int updateByPrimaryKey(JyCeqUserIpadd record) {
        JyCeqUserIpaddExample example=new JyCeqUserIpaddExample();
        JyCeqUserIpaddExample.Criteria criteria=example.createCriteria();
        criteria.andIpEqualTo(record.getIp());
        return ipAddMapper.updateByExample(record,example);
    }
}
