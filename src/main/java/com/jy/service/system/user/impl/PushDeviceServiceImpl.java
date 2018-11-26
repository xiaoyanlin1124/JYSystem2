package com.jy.service.system.user.impl;

import com.jy.base.service.BaseServiceImp;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.device.AppPush.PushUtil;
import com.jy.common.device.IpAdrressUtil;
import com.jy.common.utils.base.Const;
import com.jy.entity.system.device.JyCeqPushDevice;
import com.jy.entity.system.device.JyCeqPushDeviceExample;
import com.jy.entity.system.device.JyCeqUserDevice;
import com.jy.entity.system.device.JyCeqUserDeviceExample;
import com.jy.mapper.system.device.JyCeqPushDeviceMapper;
import com.jy.mapper.system.device.JyCeqUserDeviceMapper;
import com.jy.service.system.user.PushDeviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @CalssName PushDeviceServiceImpl
 * @Description 作用：信息业务逻辑实现
 * @Author Xiao
 * @Date 2018/11/17 0017 10:27
 * @Version 1.0
 **/
@Service
public class PushDeviceServiceImpl extends BaseServiceImp<JyCeqPushDevice> implements PushDeviceService {

    @Resource
    private JyCeqPushDeviceMapper pushDeviceMapper;

    @Resource
    private JyCeqUserDeviceMapper deviceMapper;

    /**
     * 设备启动信息记录
     * @param o  设备id  设备型号
     * @param request 获取ip地址参数
     * @return
     */
    @Override
    public AjaxRes run(JyCeqPushDevice o, HttpServletRequest request) {
        //deviceid 插入不能重复  需要判断
        AjaxRes ar=new AjaxRes();
        try {
            //获取请求地址的ip信息
            String ip=IpAdrressUtil.getIpAdrress(request);
            JyCeqPushDeviceExample example=new JyCeqPushDeviceExample();
            JyCeqPushDeviceExample.Criteria criteria=example.createCriteria();
            criteria.andDevice_idEqualTo(o.getDevice_id());
            criteria.andDevice_modelEqualTo(o.getDevice_model());
            List<JyCeqPushDevice> list=pushDeviceMapper.selectByExample(example);
            //条件判断设备信息是否录入过系统，如果没有就insert，有的话就更新ip地址和时间
            if(list.size()>0){
                list.get(0).setUpdate_time(new Date());
                list.get(0).setUpdate_ip(ip);
                pushDeviceMapper.updateByPrimaryKeySelective(list.get(0));
                ar.setSucceedMsg(Const.POST_SUCCEED);
            }else {
               o.setCreate_ip(ip);
               o.setcreate_time(new Date());
               pushDeviceMapper.insert(o);
                ar.setSucceedMsg(Const.POST_SUCCEED);
            }
        } catch (Exception e) {
            ar.setFailMsg("设备信息请求错误！");
        }
        return ar;
    }

    /**
     * 通过设备传递消息给后台，后台在通过判断将消息发送APP
     * @param jyCeqPushDevice  device_id   device_model  or  [un_lock，hijack，warning，warning]
     * @param request 请求
     * @return
     */
    @Override
    public AjaxRes devicePush(JyCeqPushDevice jyCeqPushDevice, HttpServletRequest request) {
        AjaxRes ar=new AjaxRes();
        ar.setFailMsg("信息发送失败！");
        try {
            if(jyCeqPushDevice.getDevice_id()==null) return ar;
            if(!this.find(jyCeqPushDevice).isEmpty()){
                JyCeqPushDevice pushDevice=this.find(jyCeqPushDevice).get(0);
                pushDevice.setUpdate_ip(IpAdrressUtil.getIpAdrress(request));
                pushDevice.setUpdate_time(new Date()); //设置新的时间和ip地址
                pushDeviceMapper.updateByPrimaryKey(jyCeqPushDevice);  //设备信息存在就修改数据库信息

                JyCeqUserDeviceExample example=new JyCeqUserDeviceExample();
                JyCeqUserDeviceExample.Criteria criteria=example.createCriteria();
                criteria.andDevice_idEqualTo(pushDevice.getDevice_id());
                List<JyCeqUserDevice> list1=deviceMapper.selectByExample(example);  //查找该设备相关联用户的设备信息

                for (int i = 0; i <list1.size() ; i++) {
                    if(list1.get(i).getLockOnPush()>0&&list1.get(i).getLockOnPush()!=null){
                        sendInfo(pushDevice);
                    }
                    //判断是否短信发送
                    ar.setSucceedMsg("发送成功");
                }
                //判断是否劫持、开锁、警报、电量  在通过不同的功能发送不同的消息
                JyCeqPushDeviceExample example1=new JyCeqPushDeviceExample();
                JyCeqPushDeviceExample.Criteria criteria1=example1.createCriteria();
                criteria1.andDevice_idEqualTo(pushDevice.getDevice_id());
                int result=pushDeviceMapper.updateByExample(pushDevice,example1);
                if(result>0){
                    ar.setSucceedMsg(Const.UPDATE_SUCCEED);
                }else {
                    ar.setSucceedMsg(Const.UPDATE_FAIL);
                }
            }else {
                //插入新的数据
               return run(jyCeqPushDevice,request);
            }
        } catch (Exception e) {
            ar.setFailMsg("信息发送失败！");
        }
        return ar;
    }

    /**
     * 通过设备传送不同的key发送不同的消息给用户
     * @param o
     * @return
     */
    private void sendInfo(JyCeqPushDevice o){
        int i=1;
        if(o.getUn_lock()!=null){
            PushUtil pushUtil=new PushUtil();
            pushUtil.PushTokenAndroid("您的保险柜被开锁了","在买一台吧！++++++++++","45bef9cc23674fff89eeefa7ad820a972d23c84d");
            o.setUn_lock(o.getUn_lock()+i);
            pushDeviceMapper.updateByPrimaryKey(o);
            System.out.println("OK");
        }
        if(o.getHijack()!=null){
            PushUtil pushUtil=new PushUtil();
            pushUtil.PushTokenAndroid("您的保险柜被劫持了","需要报警了","45bef9cc23674fff89eeefa7ad820a972d23c84d");
            o.setUn_lock(o.getHijack()+i);
            pushDeviceMapper.updateByPrimaryKey(o);
            System.out.println("OK");
        }
        if(o.getLowPower()!=null){
            PushUtil pushUtil=new PushUtil();
            pushUtil.PushTokenAndroid("您的保险柜电量太低了","需要充电了","45bef9cc23674fff89eeefa7ad820a972d23c84d");
            o.setUn_lock(o.getLowPower()+i);
            pushDeviceMapper.updateByPrimaryKey(o);
            System.out.println("OK");
        }
       if(o.getWarning()!=null){
           PushUtil pushUtil=new PushUtil();
           pushUtil.PushTokenAndroid("您的保险柜发出警报","需要检查了","45bef9cc23674fff89eeefa7ad820a972d23c84d");
           o.setUn_lock(o.getWarning()+i);
           pushDeviceMapper.updateByPrimaryKey(o);
           System.out.println("OK");
       }
    }


}
