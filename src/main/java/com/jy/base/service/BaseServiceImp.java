package com.jy.base.service;

import com.jy.base.dao.BaseDao;
import com.jy.common.mybatis.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @CalssName BaseServiceImp
 * @Description 作用：为service提供通用的方法，包括对数据库的增删改查，还有分页
 * @Author Xiao
 * @Date  2018/11/10 0010 8:23
 * @Version 1.0
 **/
public class BaseServiceImp<T> implements BaseService<T> {

	public Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public BaseDao<T> baseDao;

	@Override
	public void insert(T o) {
		baseDao.insert(o);
	}

	@Override
	public void delete(T o) {
		baseDao.delete(o);
	}

	@Override
	public void deleteBatch(List<T> os){
		baseDao.deleteBatch(os);
	}

	@Override
	public void update(T o) {
		baseDao.update(o);
	}

	@Override
	public List<T> find(T o) {
		return baseDao.find(o);
	}

	@Override
	public Page<T> findByPage(T o, Page<T> page) {
		page.setResults(baseDao.findByPage(o, page));
		return page;
	}

	@Override
	public int count(T o) {
		return baseDao.count(o);
	}



}
