package com.jy.entity.system.device;

import com.jy.base.entity.BaseEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JyCeqUserDeviceExample extends BaseEntity {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JyCeqUserDeviceExample() {
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

        public Criteria andDevice_modelIsNull() {
            addCriterion("device_model is null");
            return (Criteria) this;
        }

        public Criteria andDevice_modelIsNotNull() {
            addCriterion("device_model is not null");
            return (Criteria) this;
        }

        public Criteria andDevice_modelEqualTo(String value) {
            addCriterion("device_model =", value, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_modelNotEqualTo(String value) {
            addCriterion("device_model <>", value, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_modelGreaterThan(String value) {
            addCriterion("device_model >", value, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_modelGreaterThanOrEqualTo(String value) {
            addCriterion("device_model >=", value, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_modelLessThan(String value) {
            addCriterion("device_model <", value, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_modelLessThanOrEqualTo(String value) {
            addCriterion("device_model <=", value, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_modelLike(String value) {
            addCriterion("device_model like", value, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_modelNotLike(String value) {
            addCriterion("device_model not like", value, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_modelIn(List<String> values) {
            addCriterion("device_model in", values, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_modelNotIn(List<String> values) {
            addCriterion("device_model not in", values, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_modelBetween(String value1, String value2) {
            addCriterion("device_model between", value1, value2, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_modelNotBetween(String value1, String value2) {
            addCriterion("device_model not between", value1, value2, "device_model");
            return (Criteria) this;
        }

        public Criteria andDevice_nameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDevice_nameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDevice_nameEqualTo(String value) {
            addCriterion("device_name =", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameGreaterThan(String value) {
            addCriterion("device_name >", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameLessThan(String value) {
            addCriterion("device_name <", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameLike(String value) {
            addCriterion("device_name like", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameNotLike(String value) {
            addCriterion("device_name not like", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameIn(List<String> values) {
            addCriterion("device_name in", values, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "device_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameEqualTo(String value) {
            addCriterion("admin_name =", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameGreaterThan(String value) {
            addCriterion("admin_name >", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLessThan(String value) {
            addCriterion("admin_name <", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLike(String value) {
            addCriterion("admin_name like", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotLike(String value) {
            addCriterion("admin_name not like", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameIn(List<String> values) {
            addCriterion("admin_name in", values, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "admin_name");
            return (Criteria) this;
        }

        public Criteria andDevice_idIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDevice_idIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevice_idEqualTo(String value) {
            addCriterion("device_id =", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idNotEqualTo(String value) {
            addCriterion("device_id <>", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idGreaterThan(String value) {
            addCriterion("device_id >", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idLessThan(String value) {
            addCriterion("device_id <", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idLike(String value) {
            addCriterion("device_id like", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idNotLike(String value) {
            addCriterion("device_id not like", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idIn(List<String> values) {
            addCriterion("device_id in", values, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idNotIn(List<String> values) {
            addCriterion("device_id not in", values, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "device_id");
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

        public Criteria andAdmin_passwordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordEqualTo(String value) {
            addCriterion("admin_password =", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordGreaterThan(String value) {
            addCriterion("admin_password >", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLessThan(String value) {
            addCriterion("admin_password <", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLike(String value) {
            addCriterion("admin_password like", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotLike(String value) {
            addCriterion("admin_password not like", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordIn(List<String> values) {
            addCriterion("admin_password in", values, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "admin_password");
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

        public Criteria andLockOnPushIsNull() {
            addCriterion("lockOnPush is null");
            return (Criteria) this;
        }

        public Criteria andLockOnPushIsNotNull() {
            addCriterion("lockOnPush is not null");
            return (Criteria) this;
        }

        public Criteria andLockOnPushEqualTo(Byte value) {
            addCriterion("lockOnPush =", value, "lockOnPush");
            return (Criteria) this;
        }

        public Criteria andLockOnPushNotEqualTo(Byte value) {
            addCriterion("lockOnPush <>", value, "lockOnPush");
            return (Criteria) this;
        }

        public Criteria andLockOnPushGreaterThan(Byte value) {
            addCriterion("lockOnPush >", value, "lockOnPush");
            return (Criteria) this;
        }

        public Criteria andLockOnPushGreaterThanOrEqualTo(Byte value) {
            addCriterion("lockOnPush >=", value, "lockOnPush");
            return (Criteria) this;
        }

        public Criteria andLockOnPushLessThan(Byte value) {
            addCriterion("lockOnPush <", value, "lockOnPush");
            return (Criteria) this;
        }

        public Criteria andLockOnPushLessThanOrEqualTo(Byte value) {
            addCriterion("lockOnPush <=", value, "lockOnPush");
            return (Criteria) this;
        }

        public Criteria andLockOnPushIn(List<Byte> values) {
            addCriterion("lockOnPush in", values, "lockOnPush");
            return (Criteria) this;
        }

        public Criteria andLockOnPushNotIn(List<Byte> values) {
            addCriterion("lockOnPush not in", values, "lockOnPush");
            return (Criteria) this;
        }

        public Criteria andLockOnPushBetween(Byte value1, Byte value2) {
            addCriterion("lockOnPush between", value1, value2, "lockOnPush");
            return (Criteria) this;
        }

        public Criteria andLockOnPushNotBetween(Byte value1, Byte value2) {
            addCriterion("lockOnPush not between", value1, value2, "lockOnPush");
            return (Criteria) this;
        }

        public Criteria andHijackPushIsNull() {
            addCriterion("hijackPush is null");
            return (Criteria) this;
        }

        public Criteria andHijackPushIsNotNull() {
            addCriterion("hijackPush is not null");
            return (Criteria) this;
        }

        public Criteria andHijackPushEqualTo(Byte value) {
            addCriterion("hijackPush =", value, "hijackPush");
            return (Criteria) this;
        }

        public Criteria andHijackPushNotEqualTo(Byte value) {
            addCriterion("hijackPush <>", value, "hijackPush");
            return (Criteria) this;
        }

        public Criteria andHijackPushGreaterThan(Byte value) {
            addCriterion("hijackPush >", value, "hijackPush");
            return (Criteria) this;
        }

        public Criteria andHijackPushGreaterThanOrEqualTo(Byte value) {
            addCriterion("hijackPush >=", value, "hijackPush");
            return (Criteria) this;
        }

        public Criteria andHijackPushLessThan(Byte value) {
            addCriterion("hijackPush <", value, "hijackPush");
            return (Criteria) this;
        }

        public Criteria andHijackPushLessThanOrEqualTo(Byte value) {
            addCriterion("hijackPush <=", value, "hijackPush");
            return (Criteria) this;
        }

        public Criteria andHijackPushIn(List<Byte> values) {
            addCriterion("hijackPush in", values, "hijackPush");
            return (Criteria) this;
        }

        public Criteria andHijackPushNotIn(List<Byte> values) {
            addCriterion("hijackPush not in", values, "hijackPush");
            return (Criteria) this;
        }

        public Criteria andHijackPushBetween(Byte value1, Byte value2) {
            addCriterion("hijackPush between", value1, value2, "hijackPush");
            return (Criteria) this;
        }

        public Criteria andHijackPushNotBetween(Byte value1, Byte value2) {
            addCriterion("hijackPush not between", value1, value2, "hijackPush");
            return (Criteria) this;
        }

        public Criteria andAlarmPushIsNull() {
            addCriterion("alarmPush is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPushIsNotNull() {
            addCriterion("alarmPush is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPushEqualTo(Byte value) {
            addCriterion("alarmPush =", value, "alarmPush");
            return (Criteria) this;
        }

        public Criteria andAlarmPushNotEqualTo(Byte value) {
            addCriterion("alarmPush <>", value, "alarmPush");
            return (Criteria) this;
        }

        public Criteria andAlarmPushGreaterThan(Byte value) {
            addCriterion("alarmPush >", value, "alarmPush");
            return (Criteria) this;
        }

        public Criteria andAlarmPushGreaterThanOrEqualTo(Byte value) {
            addCriterion("alarmPush >=", value, "alarmPush");
            return (Criteria) this;
        }

        public Criteria andAlarmPushLessThan(Byte value) {
            addCriterion("alarmPush <", value, "alarmPush");
            return (Criteria) this;
        }

        public Criteria andAlarmPushLessThanOrEqualTo(Byte value) {
            addCriterion("alarmPush <=", value, "alarmPush");
            return (Criteria) this;
        }

        public Criteria andAlarmPushIn(List<Byte> values) {
            addCriterion("alarmPush in", values, "alarmPush");
            return (Criteria) this;
        }

        public Criteria andAlarmPushNotIn(List<Byte> values) {
            addCriterion("alarmPush not in", values, "alarmPush");
            return (Criteria) this;
        }

        public Criteria andAlarmPushBetween(Byte value1, Byte value2) {
            addCriterion("alarmPush between", value1, value2, "alarmPush");
            return (Criteria) this;
        }

        public Criteria andAlarmPushNotBetween(Byte value1, Byte value2) {
            addCriterion("alarmPush not between", value1, value2, "alarmPush");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushIsNull() {
            addCriterion("powerLowPush is null");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushIsNotNull() {
            addCriterion("powerLowPush is not null");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushEqualTo(Byte value) {
            addCriterion("powerLowPush =", value, "powerLowPush");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushNotEqualTo(Byte value) {
            addCriterion("powerLowPush <>", value, "powerLowPush");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushGreaterThan(Byte value) {
            addCriterion("powerLowPush >", value, "powerLowPush");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushGreaterThanOrEqualTo(Byte value) {
            addCriterion("powerLowPush >=", value, "powerLowPush");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushLessThan(Byte value) {
            addCriterion("powerLowPush <", value, "powerLowPush");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushLessThanOrEqualTo(Byte value) {
            addCriterion("powerLowPush <=", value, "powerLowPush");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushIn(List<Byte> values) {
            addCriterion("powerLowPush in", values, "powerLowPush");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushNotIn(List<Byte> values) {
            addCriterion("powerLowPush not in", values, "powerLowPush");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushBetween(Byte value1, Byte value2) {
            addCriterion("powerLowPush between", value1, value2, "powerLowPush");
            return (Criteria) this;
        }

        public Criteria andPowerLowPushNotBetween(Byte value1, Byte value2) {
            addCriterion("powerLowPush not between", value1, value2, "powerLowPush");
            return (Criteria) this;
        }

        public Criteria andSMSPushIsNull() {
            addCriterion("SMSPush is null");
            return (Criteria) this;
        }

        public Criteria andSMSPushIsNotNull() {
            addCriterion("SMSPush is not null");
            return (Criteria) this;
        }

        public Criteria andSMSPushEqualTo(Byte value) {
            addCriterion("SMSPush =", value, "SMSPush");
            return (Criteria) this;
        }

        public Criteria andSMSPushNotEqualTo(Byte value) {
            addCriterion("SMSPush <>", value, "SMSPush");
            return (Criteria) this;
        }

        public Criteria andSMSPushGreaterThan(Byte value) {
            addCriterion("SMSPush >", value, "SMSPush");
            return (Criteria) this;
        }

        public Criteria andSMSPushGreaterThanOrEqualTo(Byte value) {
            addCriterion("SMSPush >=", value, "SMSPush");
            return (Criteria) this;
        }

        public Criteria andSMSPushLessThan(Byte value) {
            addCriterion("SMSPush <", value, "SMSPush");
            return (Criteria) this;
        }

        public Criteria andSMSPushLessThanOrEqualTo(Byte value) {
            addCriterion("SMSPush <=", value, "SMSPush");
            return (Criteria) this;
        }

        public Criteria andSMSPushIn(List<Byte> values) {
            addCriterion("SMSPush in", values, "SMSPush");
            return (Criteria) this;
        }

        public Criteria andSMSPushNotIn(List<Byte> values) {
            addCriterion("SMSPush not in", values, "SMSPush");
            return (Criteria) this;
        }

        public Criteria andSMSPushBetween(Byte value1, Byte value2) {
            addCriterion("SMSPush between", value1, value2, "SMSPush");
            return (Criteria) this;
        }

        public Criteria andSMSPushNotBetween(Byte value1, Byte value2) {
            addCriterion("SMSPush not between", value1, value2, "SMSPush");
            return (Criteria) this;
        }

        public Criteria andPushTokenIsNull() {
            addCriterion("pushToken is null");
            return (Criteria) this;
        }

        public Criteria andPushTokenIsNotNull() {
            addCriterion("pushToken is not null");
            return (Criteria) this;
        }

        public Criteria andPushTokenEqualTo(String value) {
            addCriterion("pushToken =", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotEqualTo(String value) {
            addCriterion("pushToken <>", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenGreaterThan(String value) {
            addCriterion("pushToken >", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenGreaterThanOrEqualTo(String value) {
            addCriterion("pushToken >=", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenLessThan(String value) {
            addCriterion("pushToken <", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenLessThanOrEqualTo(String value) {
            addCriterion("pushToken <=", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenLike(String value) {
            addCriterion("pushToken like", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotLike(String value) {
            addCriterion("pushToken not like", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenIn(List<String> values) {
            addCriterion("pushToken in", values, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotIn(List<String> values) {
            addCriterion("pushToken not in", values, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenBetween(String value1, String value2) {
            addCriterion("pushToken between", value1, value2, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotBetween(String value1, String value2) {
            addCriterion("pushToken not between", value1, value2, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushPlatformIsNull() {
            addCriterion("pushPlatform is null");
            return (Criteria) this;
        }

        public Criteria andPushPlatformIsNotNull() {
            addCriterion("pushPlatform is not null");
            return (Criteria) this;
        }

        public Criteria andPushPlatformEqualTo(String value) {
            addCriterion("pushPlatform =", value, "pushPlatform");
            return (Criteria) this;
        }

        public Criteria andPushPlatformNotEqualTo(String value) {
            addCriterion("pushPlatform <>", value, "pushPlatform");
            return (Criteria) this;
        }

        public Criteria andPushPlatformGreaterThan(String value) {
            addCriterion("pushPlatform >", value, "pushPlatform");
            return (Criteria) this;
        }

        public Criteria andPushPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("pushPlatform >=", value, "pushPlatform");
            return (Criteria) this;
        }

        public Criteria andPushPlatformLessThan(String value) {
            addCriterion("pushPlatform <", value, "pushPlatform");
            return (Criteria) this;
        }

        public Criteria andPushPlatformLessThanOrEqualTo(String value) {
            addCriterion("pushPlatform <=", value, "pushPlatform");
            return (Criteria) this;
        }

        public Criteria andPushPlatformLike(String value) {
            addCriterion("pushPlatform like", value, "pushPlatform");
            return (Criteria) this;
        }

        public Criteria andPushPlatformNotLike(String value) {
            addCriterion("pushPlatform not like", value, "pushPlatform");
            return (Criteria) this;
        }

        public Criteria andPushPlatformIn(List<String> values) {
            addCriterion("pushPlatform in", values, "pushPlatform");
            return (Criteria) this;
        }

        public Criteria andPushPlatformNotIn(List<String> values) {
            addCriterion("pushPlatform not in", values, "pushPlatform");
            return (Criteria) this;
        }

        public Criteria andPushPlatformBetween(String value1, String value2) {
            addCriterion("pushPlatform between", value1, value2, "pushPlatform");
            return (Criteria) this;
        }

        public Criteria andPushPlatformNotBetween(String value1, String value2) {
            addCriterion("pushPlatform not between", value1, value2, "pushPlatform");
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