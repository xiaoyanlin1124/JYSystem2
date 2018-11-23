package com.jy.entity.system.device;

import com.jy.base.entity.BaseEntity;
import org.apache.ibatis.type.Alias;

import java.util.Date;
/**
 * @CalssName JyCeqUserIpadd
 * @Description 作用：设备IP地址信息
 * @Author Xiao
 * @Date  2018/11/10 0010 9:40
 * @Version 1.0
 **/
@Alias("JyCeqUserIpadd")
public class JyCeqUserIpadd extends BaseEntity {
    /**
     * 主键.
     */
    private String id;
    /**
     * ip地址
     */
    private String ip;
    /**
     * 创建时的id
     */
    private String create_ip;
    /**
     * 用户id或者设备id
     */
    private String user_id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * ip访问次数
     */
    private Integer count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getCreate_ip() {
        return create_ip;
    }

    public void setCreate_ip(String create_ip) {
        this.create_ip = create_ip == null ? null : create_ip.trim();
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}