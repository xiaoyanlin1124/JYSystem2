package com.jy.mapper.weixin.user;

import java.util.List;


import com.jy.base.dao.BaseDao;
import com.jy.base.dao.JYBatis;
import com.jy.entity.weixin.user.WxFollower;



/**
 * 微信关注者数据层
 */
@JYBatis
public interface WxFollowerDao  extends BaseDao<WxFollower> {
 
    public void clearFollower();
    
    public void insertFollowers(List<WxFollower> o);
}
