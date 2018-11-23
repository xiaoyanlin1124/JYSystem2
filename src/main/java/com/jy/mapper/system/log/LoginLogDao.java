package com.jy.mapper.system.log;

import java.util.List;


import com.jy.base.dao.JYBatis;
import org.apache.ibatis.annotations.Param;

import com.jy.common.mybatis.Page;
import com.jy.entity.system.log.LoginLog;


@JYBatis
public interface LoginLogDao {

	public List<LoginLog> findByPage(@Param("param") LoginLog o, Page<LoginLog> page);
	
	public void insert(LoginLog o);
	
	public void deleteBatch(List<LoginLog> os);
}
