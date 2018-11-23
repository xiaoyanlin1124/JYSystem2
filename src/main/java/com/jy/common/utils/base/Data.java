package com.jy.common.utils.base;

import com.jy.common.user.SmsTool;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

/**
 * @CalssName Data
 * @Description 作用： 时间工具类
 * @Author Xiao
 * @Date 2018/11/10 0010 16:08
 * @Version 1.0
 **/
@Component
public class Data {
    /**
     * 工具类，用于计算受权key到期时间
     * @return
     */
    public Date getAuthorizedTime(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DAY_OF_MONTH,  SmsTool.authorizedCodeDay);// 今天+最长时间
        return c.getTime();
    }

}
