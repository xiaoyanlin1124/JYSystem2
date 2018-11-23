package com.jy.mapper.task.log;


import com.jy.base.dao.BaseDao;
import com.jy.base.dao.JYBatis;
import com.jy.entity.task.log.TaskLog;

/**
 * 动态任务数据层
 */
@JYBatis
public interface TaskLogDao extends BaseDao<TaskLog> {
	
}
