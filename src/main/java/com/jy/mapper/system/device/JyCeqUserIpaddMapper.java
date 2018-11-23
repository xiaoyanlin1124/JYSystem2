package com.jy.mapper.system.device;

import com.jy.base.dao.BaseDao;
import com.jy.base.dao.JYBatis;
import com.jy.entity.system.device.JyCeqUserIpadd;
import com.jy.entity.system.device.JyCeqUserIpaddExample;
import java.util.List;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@JYBatis
@Repository
public interface JyCeqUserIpaddMapper extends BaseDao<JyCeqUserIpadd> {

    int countByExample(JyCeqUserIpaddExample example);

    int deleteByExample(JyCeqUserIpaddExample example);

    int deleteByPrimaryKey(String id);

  /*  int insert(JyCeqUserIpadd record);*/

    int insertSelective(JyCeqUserIpadd record);

    List<JyCeqUserIpadd> selectByExample(JyCeqUserIpaddExample example);

    JyCeqUserIpadd selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JyCeqUserIpadd record, @Param("example") JyCeqUserIpaddExample example);

    int updateByExample(@Param("record") JyCeqUserIpadd record, @Param("example") JyCeqUserIpaddExample example);

    int updateByPrimaryKeySelective(JyCeqUserIpadd record);

    int updateByPrimaryKey(JyCeqUserIpadd record);
}