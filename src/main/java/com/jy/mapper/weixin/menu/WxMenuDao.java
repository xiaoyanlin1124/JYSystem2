package com.jy.mapper.weixin.menu;


import com.jy.base.dao.BaseDao;
import com.jy.base.dao.JYBatis;
import org.apache.ibatis.annotations.Param;

import com.jy.entity.weixin.menu.WxMenu;



/**
 * 微信菜单数据层
 */
@JYBatis
public interface WxMenuDao  extends BaseDao<WxMenu> {
	/**
	 * 统计菜单数目
	 * @param o 对象      
	 * @return long
	 */
	public int menuCount(WxMenu o);
	
	public WxMenu getWxMenuByKeyId(@Param("keyId") String keyId);
}
