package com.jy.entity.system.device;

import com.jy.base.entity.BaseEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JyCeqUserCameraExample extends BaseEntity {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JyCeqUserCameraExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(String value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLike(String value) {
            addCriterion("user_id like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotLike(String value) {
            addCriterion("user_id not like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<String> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<String> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeIsNull() {
            addCriterion("login_Time is null");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeIsNotNull() {
            addCriterion("login_Time is not null");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeEqualTo(Date value) {
            addCriterion("login_Time =", value, "login_Time");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeNotEqualTo(Date value) {
            addCriterion("login_Time <>", value, "login_Time");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeGreaterThan(Date value) {
            addCriterion("login_Time >", value, "login_Time");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_Time >=", value, "login_Time");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeLessThan(Date value) {
            addCriterion("login_Time <", value, "login_Time");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeLessThanOrEqualTo(Date value) {
            addCriterion("login_Time <=", value, "login_Time");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeIn(List<Date> values) {
            addCriterion("login_Time in", values, "login_Time");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeNotIn(List<Date> values) {
            addCriterion("login_Time not in", values, "login_Time");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeBetween(Date value1, Date value2) {
            addCriterion("login_Time between", value1, value2, "login_Time");
            return (Criteria) this;
        }

        public Criteria andLogin_TimeNotBetween(Date value1, Date value2) {
            addCriterion("login_Time not between", value1, value2, "login_Time");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIs_enabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIs_enabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIs_enabledEqualTo(Integer value) {
            addCriterion("is_enabled =", value, "is_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_enabledNotEqualTo(Integer value) {
            addCriterion("is_enabled <>", value, "is_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_enabledGreaterThan(Integer value) {
            addCriterion("is_enabled >", value, "is_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_enabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_enabled >=", value, "is_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_enabledLessThan(Integer value) {
            addCriterion("is_enabled <", value, "is_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_enabledLessThanOrEqualTo(Integer value) {
            addCriterion("is_enabled <=", value, "is_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_enabledIn(List<Integer> values) {
            addCriterion("is_enabled in", values, "is_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_enabledNotIn(List<Integer> values) {
            addCriterion("is_enabled not in", values, "is_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_enabledBetween(Integer value1, Integer value2) {
            addCriterion("is_enabled between", value1, value2, "is_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_enabledNotBetween(Integer value1, Integer value2) {
            addCriterion("is_enabled not between", value1, value2, "is_enabled");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeIsNull() {
            addCriterion("locked_Time is null");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeIsNotNull() {
            addCriterion("locked_Time is not null");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeEqualTo(Date value) {
            addCriterion("locked_Time =", value, "locked_Time");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeNotEqualTo(Date value) {
            addCriterion("locked_Time <>", value, "locked_Time");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeGreaterThan(Date value) {
            addCriterion("locked_Time >", value, "locked_Time");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeGreaterThanOrEqualTo(Date value) {
            addCriterion("locked_Time >=", value, "locked_Time");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeLessThan(Date value) {
            addCriterion("locked_Time <", value, "locked_Time");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeLessThanOrEqualTo(Date value) {
            addCriterion("locked_Time <=", value, "locked_Time");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeIn(List<Date> values) {
            addCriterion("locked_Time in", values, "locked_Time");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeNotIn(List<Date> values) {
            addCriterion("locked_Time not in", values, "locked_Time");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeBetween(Date value1, Date value2) {
            addCriterion("locked_Time between", value1, value2, "locked_Time");
            return (Criteria) this;
        }

        public Criteria andLocked_TimeNotBetween(Date value1, Date value2) {
            addCriterion("locked_Time not between", value1, value2, "locked_Time");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countIsNull() {
            addCriterion("login_failure_count is null");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countIsNotNull() {
            addCriterion("login_failure_count is not null");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countEqualTo(Integer value) {
            addCriterion("login_failure_count =", value, "login_failure_count");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countNotEqualTo(Integer value) {
            addCriterion("login_failure_count <>", value, "login_failure_count");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countGreaterThan(Integer value) {
            addCriterion("login_failure_count >", value, "login_failure_count");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_failure_count >=", value, "login_failure_count");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countLessThan(Integer value) {
            addCriterion("login_failure_count <", value, "login_failure_count");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countLessThanOrEqualTo(Integer value) {
            addCriterion("login_failure_count <=", value, "login_failure_count");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countIn(List<Integer> values) {
            addCriterion("login_failure_count in", values, "login_failure_count");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countNotIn(List<Integer> values) {
            addCriterion("login_failure_count not in", values, "login_failure_count");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countBetween(Integer value1, Integer value2) {
            addCriterion("login_failure_count between", value1, value2, "login_failure_count");
            return (Criteria) this;
        }

        public Criteria andLogin_failure_countNotBetween(Integer value1, Integer value2) {
            addCriterion("login_failure_count not between", value1, value2, "login_failure_count");
            return (Criteria) this;
        }

        public Criteria andLogin_ipIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLogin_ipIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLogin_ipEqualTo(String value) {
            addCriterion("login_ip =", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipGreaterThan(String value) {
            addCriterion("login_ip >", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipLessThan(String value) {
            addCriterion("login_ip <", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipLike(String value) {
            addCriterion("login_ip like", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipNotLike(String value) {
            addCriterion("login_ip not like", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipIn(List<String> values) {
            addCriterion("login_ip in", values, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueIsNull() {
            addCriterion("safe_key_value is null");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueIsNotNull() {
            addCriterion("safe_key_value is not null");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueEqualTo(String value) {
            addCriterion("safe_key_value =", value, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueNotEqualTo(String value) {
            addCriterion("safe_key_value <>", value, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueGreaterThan(String value) {
            addCriterion("safe_key_value >", value, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueGreaterThanOrEqualTo(String value) {
            addCriterion("safe_key_value >=", value, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueLessThan(String value) {
            addCriterion("safe_key_value <", value, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueLessThanOrEqualTo(String value) {
            addCriterion("safe_key_value <=", value, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueLike(String value) {
            addCriterion("safe_key_value like", value, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueNotLike(String value) {
            addCriterion("safe_key_value not like", value, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueIn(List<String> values) {
            addCriterion("safe_key_value in", values, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueNotIn(List<String> values) {
            addCriterion("safe_key_value not in", values, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueBetween(String value1, String value2) {
            addCriterion("safe_key_value between", value1, value2, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_valueNotBetween(String value1, String value2) {
            addCriterion("safe_key_value not between", value1, value2, "safe_key_value");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireIsNull() {
            addCriterion("safe_key_expire is null");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireIsNotNull() {
            addCriterion("safe_key_expire is not null");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireEqualTo(Date value) {
            addCriterion("safe_key_expire =", value, "safe_key_expire");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireNotEqualTo(Date value) {
            addCriterion("safe_key_expire <>", value, "safe_key_expire");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireGreaterThan(Date value) {
            addCriterion("safe_key_expire >", value, "safe_key_expire");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireGreaterThanOrEqualTo(Date value) {
            addCriterion("safe_key_expire >=", value, "safe_key_expire");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireLessThan(Date value) {
            addCriterion("safe_key_expire <", value, "safe_key_expire");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireLessThanOrEqualTo(Date value) {
            addCriterion("safe_key_expire <=", value, "safe_key_expire");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireIn(List<Date> values) {
            addCriterion("safe_key_expire in", values, "safe_key_expire");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireNotIn(List<Date> values) {
            addCriterion("safe_key_expire not in", values, "safe_key_expire");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireBetween(Date value1, Date value2) {
            addCriterion("safe_key_expire between", value1, value2, "safe_key_expire");
            return (Criteria) this;
        }

        public Criteria andSafe_key_expireNotBetween(Date value1, Date value2) {
            addCriterion("safe_key_expire not between", value1, value2, "safe_key_expire");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIsNull() {
            addCriterion("verificationCode is null");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIsNotNull() {
            addCriterion("verificationCode is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeEqualTo(String value) {
            addCriterion("verificationCode =", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotEqualTo(String value) {
            addCriterion("verificationCode <>", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeGreaterThan(String value) {
            addCriterion("verificationCode >", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("verificationCode >=", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLessThan(String value) {
            addCriterion("verificationCode <", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLessThanOrEqualTo(String value) {
            addCriterion("verificationCode <=", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLike(String value) {
            addCriterion("verificationCode like", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotLike(String value) {
            addCriterion("verificationCode not like", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIn(List<String> values) {
            addCriterion("verificationCode in", values, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotIn(List<String> values) {
            addCriterion("verificationCode not in", values, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeBetween(String value1, String value2) {
            addCriterion("verificationCode between", value1, value2, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotBetween(String value1, String value2) {
            addCriterion("verificationCode not between", value1, value2, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeIsNull() {
            addCriterion("verification_Time is null");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeIsNotNull() {
            addCriterion("verification_Time is not null");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeEqualTo(Date value) {
            addCriterion("verification_Time =", value, "verification_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeNotEqualTo(Date value) {
            addCriterion("verification_Time <>", value, "verification_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeGreaterThan(Date value) {
            addCriterion("verification_Time >", value, "verification_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verification_Time >=", value, "verification_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeLessThan(Date value) {
            addCriterion("verification_Time <", value, "verification_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeLessThanOrEqualTo(Date value) {
            addCriterion("verification_Time <=", value, "verification_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeIn(List<Date> values) {
            addCriterion("verification_Time in", values, "verification_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeNotIn(List<Date> values) {
            addCriterion("verification_Time not in", values, "verification_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeBetween(Date value1, Date value2) {
            addCriterion("verification_Time between", value1, value2, "verification_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_TimeNotBetween(Date value1, Date value2) {
            addCriterion("verification_Time not between", value1, value2, "verification_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeIsNull() {
            addCriterion("verification_send_Time is null");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeIsNotNull() {
            addCriterion("verification_send_Time is not null");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeEqualTo(Date value) {
            addCriterion("verification_send_Time =", value, "verification_send_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeNotEqualTo(Date value) {
            addCriterion("verification_send_Time <>", value, "verification_send_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeGreaterThan(Date value) {
            addCriterion("verification_send_Time >", value, "verification_send_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verification_send_Time >=", value, "verification_send_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeLessThan(Date value) {
            addCriterion("verification_send_Time <", value, "verification_send_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeLessThanOrEqualTo(Date value) {
            addCriterion("verification_send_Time <=", value, "verification_send_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeIn(List<Date> values) {
            addCriterion("verification_send_Time in", values, "verification_send_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeNotIn(List<Date> values) {
            addCriterion("verification_send_Time not in", values, "verification_send_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeBetween(Date value1, Date value2) {
            addCriterion("verification_send_Time between", value1, value2, "verification_send_Time");
            return (Criteria) this;
        }

        public Criteria andVerification_send_TimeNotBetween(Date value1, Date value2) {
            addCriterion("verification_send_Time not between", value1, value2, "verification_send_Time");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenIsNull() {
            addCriterion("access_token is null");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenIsNotNull() {
            addCriterion("access_token is not null");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenEqualTo(String value) {
            addCriterion("access_token =", value, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenNotEqualTo(String value) {
            addCriterion("access_token <>", value, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenGreaterThan(String value) {
            addCriterion("access_token >", value, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenGreaterThanOrEqualTo(String value) {
            addCriterion("access_token >=", value, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenLessThan(String value) {
            addCriterion("access_token <", value, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenLessThanOrEqualTo(String value) {
            addCriterion("access_token <=", value, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenLike(String value) {
            addCriterion("access_token like", value, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenNotLike(String value) {
            addCriterion("access_token not like", value, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenIn(List<String> values) {
            addCriterion("access_token in", values, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenNotIn(List<String> values) {
            addCriterion("access_token not in", values, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenBetween(String value1, String value2) {
            addCriterion("access_token between", value1, value2, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_tokenNotBetween(String value1, String value2) {
            addCriterion("access_token not between", value1, value2, "access_token");
            return (Criteria) this;
        }

        public Criteria andAccess_typeIsNull() {
            addCriterion("access_type is null");
            return (Criteria) this;
        }

        public Criteria andAccess_typeIsNotNull() {
            addCriterion("access_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccess_typeEqualTo(String value) {
            addCriterion("access_type =", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeNotEqualTo(String value) {
            addCriterion("access_type <>", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeGreaterThan(String value) {
            addCriterion("access_type >", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeGreaterThanOrEqualTo(String value) {
            addCriterion("access_type >=", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeLessThan(String value) {
            addCriterion("access_type <", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeLessThanOrEqualTo(String value) {
            addCriterion("access_type <=", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeLike(String value) {
            addCriterion("access_type like", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeNotLike(String value) {
            addCriterion("access_type not like", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeIn(List<String> values) {
            addCriterion("access_type in", values, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeNotIn(List<String> values) {
            addCriterion("access_type not in", values, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeBetween(String value1, String value2) {
            addCriterion("access_type between", value1, value2, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeNotBetween(String value1, String value2) {
            addCriterion("access_type not between", value1, value2, "access_type");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordIsNull() {
            addCriterion("operation_password is null");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordIsNotNull() {
            addCriterion("operation_password is not null");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordEqualTo(String value) {
            addCriterion("operation_password =", value, "operation_password");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordNotEqualTo(String value) {
            addCriterion("operation_password <>", value, "operation_password");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordGreaterThan(String value) {
            addCriterion("operation_password >", value, "operation_password");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("operation_password >=", value, "operation_password");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordLessThan(String value) {
            addCriterion("operation_password <", value, "operation_password");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordLessThanOrEqualTo(String value) {
            addCriterion("operation_password <=", value, "operation_password");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordLike(String value) {
            addCriterion("operation_password like", value, "operation_password");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordNotLike(String value) {
            addCriterion("operation_password not like", value, "operation_password");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordIn(List<String> values) {
            addCriterion("operation_password in", values, "operation_password");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordNotIn(List<String> values) {
            addCriterion("operation_password not in", values, "operation_password");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordBetween(String value1, String value2) {
            addCriterion("operation_password between", value1, value2, "operation_password");
            return (Criteria) this;
        }

        public Criteria andOperation_passwordNotBetween(String value1, String value2) {
            addCriterion("operation_password not between", value1, value2, "operation_password");
            return (Criteria) this;
        }

        public Criteria andWxTokenIsNull() {
            addCriterion("wxToken is null");
            return (Criteria) this;
        }

        public Criteria andWxTokenIsNotNull() {
            addCriterion("wxToken is not null");
            return (Criteria) this;
        }

        public Criteria andWxTokenEqualTo(String value) {
            addCriterion("wxToken =", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotEqualTo(String value) {
            addCriterion("wxToken <>", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenGreaterThan(String value) {
            addCriterion("wxToken >", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenGreaterThanOrEqualTo(String value) {
            addCriterion("wxToken >=", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenLessThan(String value) {
            addCriterion("wxToken <", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenLessThanOrEqualTo(String value) {
            addCriterion("wxToken <=", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenLike(String value) {
            addCriterion("wxToken like", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotLike(String value) {
            addCriterion("wxToken not like", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenIn(List<String> values) {
            addCriterion("wxToken in", values, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotIn(List<String> values) {
            addCriterion("wxToken not in", values, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenBetween(String value1, String value2) {
            addCriterion("wxToken between", value1, value2, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotBetween(String value1, String value2) {
            addCriterion("wxToken not between", value1, value2, "wxToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenIsNull() {
            addCriterion("qqToken is null");
            return (Criteria) this;
        }

        public Criteria andQqTokenIsNotNull() {
            addCriterion("qqToken is not null");
            return (Criteria) this;
        }

        public Criteria andQqTokenEqualTo(String value) {
            addCriterion("qqToken =", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenNotEqualTo(String value) {
            addCriterion("qqToken <>", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenGreaterThan(String value) {
            addCriterion("qqToken >", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenGreaterThanOrEqualTo(String value) {
            addCriterion("qqToken >=", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenLessThan(String value) {
            addCriterion("qqToken <", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenLessThanOrEqualTo(String value) {
            addCriterion("qqToken <=", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenLike(String value) {
            addCriterion("qqToken like", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenNotLike(String value) {
            addCriterion("qqToken not like", value, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenIn(List<String> values) {
            addCriterion("qqToken in", values, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenNotIn(List<String> values) {
            addCriterion("qqToken not in", values, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenBetween(String value1, String value2) {
            addCriterion("qqToken between", value1, value2, "qqToken");
            return (Criteria) this;
        }

        public Criteria andQqTokenNotBetween(String value1, String value2) {
            addCriterion("qqToken not between", value1, value2, "qqToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenIsNull() {
            addCriterion("wbToken is null");
            return (Criteria) this;
        }

        public Criteria andWbTokenIsNotNull() {
            addCriterion("wbToken is not null");
            return (Criteria) this;
        }

        public Criteria andWbTokenEqualTo(String value) {
            addCriterion("wbToken =", value, "wbToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenNotEqualTo(String value) {
            addCriterion("wbToken <>", value, "wbToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenGreaterThan(String value) {
            addCriterion("wbToken >", value, "wbToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenGreaterThanOrEqualTo(String value) {
            addCriterion("wbToken >=", value, "wbToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenLessThan(String value) {
            addCriterion("wbToken <", value, "wbToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenLessThanOrEqualTo(String value) {
            addCriterion("wbToken <=", value, "wbToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenLike(String value) {
            addCriterion("wbToken like", value, "wbToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenNotLike(String value) {
            addCriterion("wbToken not like", value, "wbToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenIn(List<String> values) {
            addCriterion("wbToken in", values, "wbToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenNotIn(List<String> values) {
            addCriterion("wbToken not in", values, "wbToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenBetween(String value1, String value2) {
            addCriterion("wbToken between", value1, value2, "wbToken");
            return (Criteria) this;
        }

        public Criteria andWbTokenNotBetween(String value1, String value2) {
            addCriterion("wbToken not between", value1, value2, "wbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenIsNull() {
            addCriterion("fbToken is null");
            return (Criteria) this;
        }

        public Criteria andFbTokenIsNotNull() {
            addCriterion("fbToken is not null");
            return (Criteria) this;
        }

        public Criteria andFbTokenEqualTo(String value) {
            addCriterion("fbToken =", value, "fbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenNotEqualTo(String value) {
            addCriterion("fbToken <>", value, "fbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenGreaterThan(String value) {
            addCriterion("fbToken >", value, "fbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenGreaterThanOrEqualTo(String value) {
            addCriterion("fbToken >=", value, "fbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenLessThan(String value) {
            addCriterion("fbToken <", value, "fbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenLessThanOrEqualTo(String value) {
            addCriterion("fbToken <=", value, "fbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenLike(String value) {
            addCriterion("fbToken like", value, "fbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenNotLike(String value) {
            addCriterion("fbToken not like", value, "fbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenIn(List<String> values) {
            addCriterion("fbToken in", values, "fbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenNotIn(List<String> values) {
            addCriterion("fbToken not in", values, "fbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenBetween(String value1, String value2) {
            addCriterion("fbToken between", value1, value2, "fbToken");
            return (Criteria) this;
        }

        public Criteria andFbTokenNotBetween(String value1, String value2) {
            addCriterion("fbToken not between", value1, value2, "fbToken");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIsNull() {
            addCriterion("phoneBrand is null");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIsNotNull() {
            addCriterion("phoneBrand is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandEqualTo(String value) {
            addCriterion("phoneBrand =", value, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandNotEqualTo(String value) {
            addCriterion("phoneBrand <>", value, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandGreaterThan(String value) {
            addCriterion("phoneBrand >", value, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandGreaterThanOrEqualTo(String value) {
            addCriterion("phoneBrand >=", value, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandLessThan(String value) {
            addCriterion("phoneBrand <", value, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandLessThanOrEqualTo(String value) {
            addCriterion("phoneBrand <=", value, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandLike(String value) {
            addCriterion("phoneBrand like", value, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandNotLike(String value) {
            addCriterion("phoneBrand not like", value, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIn(List<String> values) {
            addCriterion("phoneBrand in", values, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandNotIn(List<String> values) {
            addCriterion("phoneBrand not in", values, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandBetween(String value1, String value2) {
            addCriterion("phoneBrand between", value1, value2, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandNotBetween(String value1, String value2) {
            addCriterion("phoneBrand not between", value1, value2, "phoneBrand");
            return (Criteria) this;
        }

        public Criteria andSmsSumIsNull() {
            addCriterion("smsSum is null");
            return (Criteria) this;
        }

        public Criteria andSmsSumIsNotNull() {
            addCriterion("smsSum is not null");
            return (Criteria) this;
        }

        public Criteria andSmsSumEqualTo(Integer value) {
            addCriterion("smsSum =", value, "smsSum");
            return (Criteria) this;
        }

        public Criteria andSmsSumNotEqualTo(Integer value) {
            addCriterion("smsSum <>", value, "smsSum");
            return (Criteria) this;
        }

        public Criteria andSmsSumGreaterThan(Integer value) {
            addCriterion("smsSum >", value, "smsSum");
            return (Criteria) this;
        }

        public Criteria andSmsSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("smsSum >=", value, "smsSum");
            return (Criteria) this;
        }

        public Criteria andSmsSumLessThan(Integer value) {
            addCriterion("smsSum <", value, "smsSum");
            return (Criteria) this;
        }

        public Criteria andSmsSumLessThanOrEqualTo(Integer value) {
            addCriterion("smsSum <=", value, "smsSum");
            return (Criteria) this;
        }

        public Criteria andSmsSumIn(List<Integer> values) {
            addCriterion("smsSum in", values, "smsSum");
            return (Criteria) this;
        }

        public Criteria andSmsSumNotIn(List<Integer> values) {
            addCriterion("smsSum not in", values, "smsSum");
            return (Criteria) this;
        }

        public Criteria andSmsSumBetween(Integer value1, Integer value2) {
            addCriterion("smsSum between", value1, value2, "smsSum");
            return (Criteria) this;
        }

        public Criteria andSmsSumNotBetween(Integer value1, Integer value2) {
            addCriterion("smsSum not between", value1, value2, "smsSum");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusIsNull() {
            addCriterion("smsSurplus is null");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusIsNotNull() {
            addCriterion("smsSurplus is not null");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusEqualTo(Integer value) {
            addCriterion("smsSurplus =", value, "smsSurplus");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusNotEqualTo(Integer value) {
            addCriterion("smsSurplus <>", value, "smsSurplus");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusGreaterThan(Integer value) {
            addCriterion("smsSurplus >", value, "smsSurplus");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusGreaterThanOrEqualTo(Integer value) {
            addCriterion("smsSurplus >=", value, "smsSurplus");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusLessThan(Integer value) {
            addCriterion("smsSurplus <", value, "smsSurplus");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusLessThanOrEqualTo(Integer value) {
            addCriterion("smsSurplus <=", value, "smsSurplus");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusIn(List<Integer> values) {
            addCriterion("smsSurplus in", values, "smsSurplus");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusNotIn(List<Integer> values) {
            addCriterion("smsSurplus not in", values, "smsSurplus");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusBetween(Integer value1, Integer value2) {
            addCriterion("smsSurplus between", value1, value2, "smsSurplus");
            return (Criteria) this;
        }

        public Criteria andSmsSurplusNotBetween(Integer value1, Integer value2) {
            addCriterion("smsSurplus not between", value1, value2, "smsSurplus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}