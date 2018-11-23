package com.jy.mapper.oa.leave;

import com.jy.base.dao.BaseDao;
import com.jy.base.dao.JYBatis;
import org.apache.ibatis.annotations.Param;

import com.jy.entity.oa.leave.Leave;


/**
 * 请假数据层
 */
@JYBatis
public interface LeaveDao extends BaseDao<Leave> {
	
	public Leave findLeaveByPId(@Param("pId") String pId);
	
	public void updateRejectReason(Leave leave);
	
	public void updateDescription(Leave leave);
}
