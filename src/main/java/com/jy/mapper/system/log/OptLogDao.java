package com.jy.mapper.system.log;

import java.util.List;


import com.jy.base.dao.JYBatis;
import org.apache.ibatis.annotations.Param;

import com.jy.common.mybatis.Page;
import com.jy.entity.system.log.OptLog;

@JYBatis
public interface OptLogDao {

	public List<OptLog> findByPage(@Param("param") OptLog o, Page<OptLog> page);
	
	public void insert(OptLog o);
	
	public void deleteBatch(List<String> os);
}
