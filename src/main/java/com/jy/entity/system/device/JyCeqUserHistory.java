package com.jy.entity.system.device;

import com.jy.base.entity.BaseEntity;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("JyCeqUserHistory")
public class JyCeqUserHistory extends BaseEntity {
    private Integer id;

    private String user;

    private Date login_time;

    private Integer login_count_loser;

    private Integer unlocked;

    private Date unlock_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public Integer getLogin_count_loser() {
        return login_count_loser;
    }

    public void setLogin_count_loser(Integer login_count_loser) {
        this.login_count_loser = login_count_loser;
    }

    public Integer getUnlocked() {
        return unlocked;
    }

    public void setUnlocked(Integer unlocked) {
        this.unlocked = unlocked;
    }

    public Date getUnlock_time() {
        return unlock_time;
    }

    public void setUnlock_time(Date unlock_time) {
        this.unlock_time = unlock_time;
    }
}