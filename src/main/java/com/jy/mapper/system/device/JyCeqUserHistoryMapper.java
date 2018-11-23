package com.jy.mapper.system.device;

import com.jy.base.dao.BaseDao;
import com.jy.base.dao.JYBatis;
import com.jy.entity.system.device.JyCeqUserHistory;
import com.jy.entity.system.device.JyCeqUserHistoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@JYBatis
@Repository
public interface JyCeqUserHistoryMapper extends BaseDao<JyCeqUserHistory> {
    int countByExample(JyCeqUserHistoryExample example);

    int deleteByExample(JyCeqUserHistoryExample example);

    int deleteByPrimaryKey(Integer id);

/*    int insert(JyCeqUserHistory record);*/

    int insertSelective(JyCeqUserHistory record);

    List<JyCeqUserHistory> selectByExample(JyCeqUserHistoryExample example);

    JyCeqUserHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JyCeqUserHistory record, @Param("example") JyCeqUserHistoryExample example);

    int updateByExample(@Param("record") JyCeqUserHistory record, @Param("example") JyCeqUserHistoryExample example);

    int updateByPrimaryKeySelective(JyCeqUserHistory record);

    int updateByPrimaryKey(JyCeqUserHistory record);
}