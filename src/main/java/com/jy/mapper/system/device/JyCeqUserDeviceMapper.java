package com.jy.mapper.system.device;

import com.jy.base.dao.BaseDao;
import com.jy.base.dao.JYBatis;
import com.jy.entity.system.device.JyCeqUserDevice;
import com.jy.entity.system.device.JyCeqUserDeviceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@JYBatis
@Repository
public interface JyCeqUserDeviceMapper extends BaseDao<JyCeqUserDevice> {
    int countByExample(JyCeqUserDeviceExample example);

    int deleteByExample(JyCeqUserDeviceExample example);

    int deleteByPrimaryKey(String id);

/*    int insert(JyCeqUserDevice record);*/

    int insertSelective(JyCeqUserDevice record);

    List<JyCeqUserDevice> selectByExample(JyCeqUserDeviceExample example);

    JyCeqUserDevice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JyCeqUserDevice record, @Param("example") JyCeqUserDeviceExample example);

    int updateByExample(@Param("record") JyCeqUserDevice record, @Param("example") JyCeqUserDeviceExample example);

    int updateByPrimaryKeySelective(JyCeqUserDevice record);

    int updateByPrimaryKey(JyCeqUserDevice record);



}