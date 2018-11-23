package com.jy.entity.system.device;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JyCeqPushDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JyCeqPushDeviceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCreate_ipIsNull() {
            addCriterion("create_ip is null");
            return (Criteria) this;
        }

        public Criteria andCreate_ipIsNotNull() {
            addCriterion("create_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_ipEqualTo(String value) {
            addCriterion("create_ip =", value, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCreate_ipNotEqualTo(String value) {
            addCriterion("create_ip <>", value, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCreate_ipGreaterThan(String value) {
            addCriterion("create_ip >", value, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCreate_ipGreaterThanOrEqualTo(String value) {
            addCriterion("create_ip >=", value, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCreate_ipLessThan(String value) {
            addCriterion("create_ip <", value, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCreate_ipLessThanOrEqualTo(String value) {
            addCriterion("create_ip <=", value, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCreate_ipLike(String value) {
            addCriterion("create_ip like", value, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCreate_ipNotLike(String value) {
            addCriterion("create_ip not like", value, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCreate_ipIn(List<String> values) {
            addCriterion("create_ip in", values, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCreate_ipNotIn(List<String> values) {
            addCriterion("create_ip not in", values, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCreate_ipBetween(String value1, String value2) {
            addCriterion("create_ip between", value1, value2, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCreate_ipNotBetween(String value1, String value2) {
            addCriterion("create_ip not between", value1, value2, "create_ip");
            return (Criteria) this;
        }

        public Criteria andCrete_timeIsNull() {
            addCriterion("crete_time is null");
            return (Criteria) this;
        }

        public Criteria andCrete_timeIsNotNull() {
            addCriterion("crete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrete_timeEqualTo(Date value) {
            addCriterionForJDBCDate("crete_time =", value, "crete_time");
            return (Criteria) this;
        }

        public Criteria andCrete_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("crete_time <>", value, "crete_time");
            return (Criteria) this;
        }

        public Criteria andCrete_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("crete_time >", value, "crete_time");
            return (Criteria) this;
        }

        public Criteria andCrete_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("crete_time >=", value, "crete_time");
            return (Criteria) this;
        }

        public Criteria andCrete_timeLessThan(Date value) {
            addCriterionForJDBCDate("crete_time <", value, "crete_time");
            return (Criteria) this;
        }

        public Criteria andCrete_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("crete_time <=", value, "crete_time");
            return (Criteria) this;
        }

        public Criteria andCrete_timeIn(List<Date> values) {
            addCriterionForJDBCDate("crete_time in", values, "crete_time");
            return (Criteria) this;
        }

        public Criteria andCrete_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("crete_time not in", values, "crete_time");
            return (Criteria) this;
        }

        public Criteria andCrete_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("crete_time between", value1, value2, "crete_time");
            return (Criteria) this;
        }

        public Criteria andCrete_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("crete_time not between", value1, value2, "crete_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipIsNull() {
            addCriterion("update_ip is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipIsNotNull() {
            addCriterion("update_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipEqualTo(String value) {
            addCriterion("update_ip =", value, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipNotEqualTo(String value) {
            addCriterion("update_ip <>", value, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipGreaterThan(String value) {
            addCriterion("update_ip >", value, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipGreaterThanOrEqualTo(String value) {
            addCriterion("update_ip >=", value, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipLessThan(String value) {
            addCriterion("update_ip <", value, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipLessThanOrEqualTo(String value) {
            addCriterion("update_ip <=", value, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipLike(String value) {
            addCriterion("update_ip like", value, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipNotLike(String value) {
            addCriterion("update_ip not like", value, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipIn(List<String> values) {
            addCriterion("update_ip in", values, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipNotIn(List<String> values) {
            addCriterion("update_ip not in", values, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipBetween(String value1, String value2) {
            addCriterion("update_ip between", value1, value2, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_ipNotBetween(String value1, String value2) {
            addCriterion("update_ip not between", value1, value2, "update_ip");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterionForJDBCDate("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUn_lockIsNull() {
            addCriterion("un_lock is null");
            return (Criteria) this;
        }

        public Criteria andUn_lockIsNotNull() {
            addCriterion("un_lock is not null");
            return (Criteria) this;
        }

        public Criteria andUn_lockEqualTo(Integer value) {
            addCriterion("un_lock =", value, "un_lock");
            return (Criteria) this;
        }

        public Criteria andUn_lockNotEqualTo(Integer value) {
            addCriterion("un_lock <>", value, "un_lock");
            return (Criteria) this;
        }

        public Criteria andUn_lockGreaterThan(Integer value) {
            addCriterion("un_lock >", value, "un_lock");
            return (Criteria) this;
        }

        public Criteria andUn_lockGreaterThanOrEqualTo(Integer value) {
            addCriterion("un_lock >=", value, "un_lock");
            return (Criteria) this;
        }

        public Criteria andUn_lockLessThan(Integer value) {
            addCriterion("un_lock <", value, "un_lock");
            return (Criteria) this;
        }

        public Criteria andUn_lockLessThanOrEqualTo(Integer value) {
            addCriterion("un_lock <=", value, "un_lock");
            return (Criteria) this;
        }

        public Criteria andUn_lockIn(List<Integer> values) {
            addCriterion("un_lock in", values, "un_lock");
            return (Criteria) this;
        }

        public Criteria andUn_lockNotIn(List<Integer> values) {
            addCriterion("un_lock not in", values, "un_lock");
            return (Criteria) this;
        }

        public Criteria andUn_lockBetween(Integer value1, Integer value2) {
            addCriterion("un_lock between", value1, value2, "un_lock");
            return (Criteria) this;
        }

        public Criteria andUn_lockNotBetween(Integer value1, Integer value2) {
            addCriterion("un_lock not between", value1, value2, "un_lock");
            return (Criteria) this;
        }

        public Criteria andHijackIsNull() {
            addCriterion("hijack is null");
            return (Criteria) this;
        }

        public Criteria andHijackIsNotNull() {
            addCriterion("hijack is not null");
            return (Criteria) this;
        }

        public Criteria andHijackEqualTo(Integer value) {
            addCriterion("hijack =", value, "hijack");
            return (Criteria) this;
        }

        public Criteria andHijackNotEqualTo(Integer value) {
            addCriterion("hijack <>", value, "hijack");
            return (Criteria) this;
        }

        public Criteria andHijackGreaterThan(Integer value) {
            addCriterion("hijack >", value, "hijack");
            return (Criteria) this;
        }

        public Criteria andHijackGreaterThanOrEqualTo(Integer value) {
            addCriterion("hijack >=", value, "hijack");
            return (Criteria) this;
        }

        public Criteria andHijackLessThan(Integer value) {
            addCriterion("hijack <", value, "hijack");
            return (Criteria) this;
        }

        public Criteria andHijackLessThanOrEqualTo(Integer value) {
            addCriterion("hijack <=", value, "hijack");
            return (Criteria) this;
        }

        public Criteria andHijackIn(List<Integer> values) {
            addCriterion("hijack in", values, "hijack");
            return (Criteria) this;
        }

        public Criteria andHijackNotIn(List<Integer> values) {
            addCriterion("hijack not in", values, "hijack");
            return (Criteria) this;
        }

        public Criteria andHijackBetween(Integer value1, Integer value2) {
            addCriterion("hijack between", value1, value2, "hijack");
            return (Criteria) this;
        }

        public Criteria andHijackNotBetween(Integer value1, Integer value2) {
            addCriterion("hijack not between", value1, value2, "hijack");
            return (Criteria) this;
        }

        public Criteria andWarningIsNull() {
            addCriterion("warning is null");
            return (Criteria) this;
        }

        public Criteria andWarningIsNotNull() {
            addCriterion("warning is not null");
            return (Criteria) this;
        }

        public Criteria andWarningEqualTo(Integer value) {
            addCriterion("warning =", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningNotEqualTo(Integer value) {
            addCriterion("warning <>", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningGreaterThan(Integer value) {
            addCriterion("warning >", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningGreaterThanOrEqualTo(Integer value) {
            addCriterion("warning >=", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningLessThan(Integer value) {
            addCriterion("warning <", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningLessThanOrEqualTo(Integer value) {
            addCriterion("warning <=", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningIn(List<Integer> values) {
            addCriterion("warning in", values, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningNotIn(List<Integer> values) {
            addCriterion("warning not in", values, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningBetween(Integer value1, Integer value2) {
            addCriterion("warning between", value1, value2, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningNotBetween(Integer value1, Integer value2) {
            addCriterion("warning not between", value1, value2, "warning");
            return (Criteria) this;
        }

        public Criteria andLowPowerIsNull() {
            addCriterion("lowPower is null");
            return (Criteria) this;
        }

        public Criteria andLowPowerIsNotNull() {
            addCriterion("lowPower is not null");
            return (Criteria) this;
        }

        public Criteria andLowPowerEqualTo(Integer value) {
            addCriterion("lowPower =", value, "lowPower");
            return (Criteria) this;
        }

        public Criteria andLowPowerNotEqualTo(Integer value) {
            addCriterion("lowPower <>", value, "lowPower");
            return (Criteria) this;
        }

        public Criteria andLowPowerGreaterThan(Integer value) {
            addCriterion("lowPower >", value, "lowPower");
            return (Criteria) this;
        }

        public Criteria andLowPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("lowPower >=", value, "lowPower");
            return (Criteria) this;
        }

        public Criteria andLowPowerLessThan(Integer value) {
            addCriterion("lowPower <", value, "lowPower");
            return (Criteria) this;
        }

        public Criteria andLowPowerLessThanOrEqualTo(Integer value) {
            addCriterion("lowPower <=", value, "lowPower");
            return (Criteria) this;
        }

        public Criteria andLowPowerIn(List<Integer> values) {
            addCriterion("lowPower in", values, "lowPower");
            return (Criteria) this;
        }

        public Criteria andLowPowerNotIn(List<Integer> values) {
            addCriterion("lowPower not in", values, "lowPower");
            return (Criteria) this;
        }

        public Criteria andLowPowerBetween(Integer value1, Integer value2) {
            addCriterion("lowPower between", value1, value2, "lowPower");
            return (Criteria) this;
        }

        public Criteria andLowPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("lowPower not between", value1, value2, "lowPower");
            return (Criteria) this;
        }

        public Criteria andSmscountIsNull() {
            addCriterion("smscount is null");
            return (Criteria) this;
        }

        public Criteria andSmscountIsNotNull() {
            addCriterion("smscount is not null");
            return (Criteria) this;
        }

        public Criteria andSmscountEqualTo(Integer value) {
            addCriterion("smscount =", value, "smscount");
            return (Criteria) this;
        }

        public Criteria andSmscountNotEqualTo(Integer value) {
            addCriterion("smscount <>", value, "smscount");
            return (Criteria) this;
        }

        public Criteria andSmscountGreaterThan(Integer value) {
            addCriterion("smscount >", value, "smscount");
            return (Criteria) this;
        }

        public Criteria andSmscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("smscount >=", value, "smscount");
            return (Criteria) this;
        }

        public Criteria andSmscountLessThan(Integer value) {
            addCriterion("smscount <", value, "smscount");
            return (Criteria) this;
        }

        public Criteria andSmscountLessThanOrEqualTo(Integer value) {
            addCriterion("smscount <=", value, "smscount");
            return (Criteria) this;
        }

        public Criteria andSmscountIn(List<Integer> values) {
            addCriterion("smscount in", values, "smscount");
            return (Criteria) this;
        }

        public Criteria andSmscountNotIn(List<Integer> values) {
            addCriterion("smscount not in", values, "smscount");
            return (Criteria) this;
        }

        public Criteria andSmscountBetween(Integer value1, Integer value2) {
            addCriterion("smscount between", value1, value2, "smscount");
            return (Criteria) this;
        }

        public Criteria andSmscountNotBetween(Integer value1, Integer value2) {
            addCriterion("smscount not between", value1, value2, "smscount");
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