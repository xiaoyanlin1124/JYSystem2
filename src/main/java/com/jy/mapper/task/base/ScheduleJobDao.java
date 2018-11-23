package com.jy.mapper.task.base;


import com.jy.base.dao.BaseDao;
import com.jy.base.dao.JYBatis;
import org.apache.ibatis.annotations.Param;

import com.jy.entity.task.base.ScheduleJob;

/**
 * 动态任务数据层
 */
@JYBatis
public interface ScheduleJobDao extends BaseDao<ScheduleJob> {
	/**
	 * 根据Id获取任务
	 */
	public ScheduleJob getScheduleJobById(@Param("scheduleJobId") String scheduleJobId);
	
}
