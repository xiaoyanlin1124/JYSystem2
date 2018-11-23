package com.jy.mapper.system.device;

import com.jy.base.dao.BaseDao;
import com.jy.base.dao.JYBatis;
import com.jy.entity.system.device.JyCeqUserCamera;
import com.jy.entity.system.device.JyCeqUserCameraExample;
import java.util.List;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@JYBatis
@Repository
public interface JyCeqUserCameraMapper  extends BaseDao<JyCeqUserCamera> {

    int countByExample(JyCeqUserCameraExample example);

    int deleteByExample(JyCeqUserCameraExample example);

    int deleteByPrimaryKey(String id);

/*    int insert(JyCeqUserCamera record);*/

    int insertSelective(JyCeqUserCamera record);

    List<JyCeqUserCamera> selectByExample(JyCeqUserCameraExample example);

    JyCeqUserCamera selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JyCeqUserCamera record, @Param("example") JyCeqUserCameraExample example);

    int updateByExample(@Param("record") JyCeqUserCamera record, @Param("example") JyCeqUserCameraExample example);

    int updateByPrimaryKeySelective(JyCeqUserCamera record);

    int updateByPrimaryKey(JyCeqUserCamera record);

    /**
     * 根据设备id获取信息资料
     * @param id 资料
     * @return list集合
     */
    public List<JyCeqUserCamera> findDeviceByKey(@Param("id") String id);
    /**
     * 查找设备值
     * @param o
     * @return
     */
    List<JyCeqUserCamera> findDeviceSafe_key_value(JyCeqUserCamera o);

    /**
     * 根据email  或者 手机号获取用户信息
     * @param o
     * @return
     */
    List<JyCeqUserCamera> findemailphone(JyCeqUserCamera o);
}