package com.jy.mapper.weixin.event;

import java.util.List;


import com.jy.base.dao.BaseDao;
import com.jy.base.dao.JYBatis;
import com.jy.entity.weixin.event.WxEventClick;


/**
 * 微信点击事件数据层
 */
@JYBatis
public interface WxEventClickDao  extends BaseDao<WxEventClick> {

	/**
	* 批量插入微信点击事件
	* @param o 微信点击事件集合
	*/
	public void insertItems(List<WxEventClick> o);
	
}
