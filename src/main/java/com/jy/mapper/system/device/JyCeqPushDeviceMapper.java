package com.jy.mapper.system.device;

import com.jy.base.dao.BaseDao;
import com.jy.base.dao.JYBatis;
import com.jy.entity.system.device.JyCeqPushDevice;
import com.jy.entity.system.device.JyCeqPushDeviceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@JYBatis
@Repository
public interface JyCeqPushDeviceMapper extends BaseDao<JyCeqPushDevice> {
    int countByExample(JyCeqPushDeviceExample example);

    int deleteByExample(JyCeqPushDeviceExample example);

    int deleteByPrimaryKey(String device_id);

/*    int insert(JyCeqPushDevice record);*/

    int insertSelective(JyCeqPushDevice record);

    List<JyCeqPushDevice> selectByExample(JyCeqPushDeviceExample example);

    JyCeqPushDevice selectByPrimaryKey(String device_id);

    int updateByExampleSelective(@Param("record") JyCeqPushDevice record, @Param("example") JyCeqPushDeviceExample example);

    int updateByExample(@Param("record") JyCeqPushDevice record, @Param("example") JyCeqPushDeviceExample example);

    int updateByPrimaryKeySelective(JyCeqPushDevice record);

    int updateByPrimaryKey(JyCeqPushDevice record);
}