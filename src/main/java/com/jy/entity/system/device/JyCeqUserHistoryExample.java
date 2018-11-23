package com.jy.entity.system.device;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JyCeqUserHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JyCeqUserHistoryExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("user like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("user not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("user not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andLogin_timeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLogin_timeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogin_timeEqualTo(Date value) {
            addCriterion("login_time =", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeGreaterThan(Date value) {
            addCriterion("login_time >", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeLessThan(Date value) {
            addCriterion("login_time <", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeIn(List<Date> values) {
            addCriterion("login_time in", values, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserIsNull() {
            addCriterion("login_count_loser is null");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserIsNotNull() {
            addCriterion("login_count_loser is not null");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserEqualTo(Integer value) {
            addCriterion("login_count_loser =", value, "login_count_loser");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserNotEqualTo(Integer value) {
            addCriterion("login_count_loser <>", value, "login_count_loser");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserGreaterThan(Integer value) {
            addCriterion("login_count_loser >", value, "login_count_loser");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_count_loser >=", value, "login_count_loser");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserLessThan(Integer value) {
            addCriterion("login_count_loser <", value, "login_count_loser");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserLessThanOrEqualTo(Integer value) {
            addCriterion("login_count_loser <=", value, "login_count_loser");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserIn(List<Integer> values) {
            addCriterion("login_count_loser in", values, "login_count_loser");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserNotIn(List<Integer> values) {
            addCriterion("login_count_loser not in", values, "login_count_loser");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserBetween(Integer value1, Integer value2) {
            addCriterion("login_count_loser between", value1, value2, "login_count_loser");
            return (Criteria) this;
        }

        public Criteria andLogin_count_loserNotBetween(Integer value1, Integer value2) {
            addCriterion("login_count_loser not between", value1, value2, "login_count_loser");
            return (Criteria) this;
        }

        public Criteria andUnlockedIsNull() {
            addCriterion("unlocked is null");
            return (Criteria) this;
        }

        public Criteria andUnlockedIsNotNull() {
            addCriterion("unlocked is not null");
            return (Criteria) this;
        }

        public Criteria andUnlockedEqualTo(Integer value) {
            addCriterion("unlocked =", value, "unlocked");
            return (Criteria) this;
        }

        public Criteria andUnlockedNotEqualTo(Integer value) {
            addCriterion("unlocked <>", value, "unlocked");
            return (Criteria) this;
        }

        public Criteria andUnlockedGreaterThan(Integer value) {
            addCriterion("unlocked >", value, "unlocked");
            return (Criteria) this;
        }

        public Criteria andUnlockedGreaterThanOrEqualTo(Integer value) {
            addCriterion("unlocked >=", value, "unlocked");
            return (Criteria) this;
        }

        public Criteria andUnlockedLessThan(Integer value) {
            addCriterion("unlocked <", value, "unlocked");
            return (Criteria) this;
        }

        public Criteria andUnlockedLessThanOrEqualTo(Integer value) {
            addCriterion("unlocked <=", value, "unlocked");
            return (Criteria) this;
        }

        public Criteria andUnlockedIn(List<Integer> values) {
            addCriterion("unlocked in", values, "unlocked");
            return (Criteria) this;
        }

        public Criteria andUnlockedNotIn(List<Integer> values) {
            addCriterion("unlocked not in", values, "unlocked");
            return (Criteria) this;
        }

        public Criteria andUnlockedBetween(Integer value1, Integer value2) {
            addCriterion("unlocked between", value1, value2, "unlocked");
            return (Criteria) this;
        }

        public Criteria andUnlockedNotBetween(Integer value1, Integer value2) {
            addCriterion("unlocked not between", value1, value2, "unlocked");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeIsNull() {
            addCriterion("unlock_time is null");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeIsNotNull() {
            addCriterion("unlock_time is not null");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeEqualTo(Date value) {
            addCriterion("unlock_time =", value, "unlock_time");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeNotEqualTo(Date value) {
            addCriterion("unlock_time <>", value, "unlock_time");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeGreaterThan(Date value) {
            addCriterion("unlock_time >", value, "unlock_time");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("unlock_time >=", value, "unlock_time");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeLessThan(Date value) {
            addCriterion("unlock_time <", value, "unlock_time");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeLessThanOrEqualTo(Date value) {
            addCriterion("unlock_time <=", value, "unlock_time");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeIn(List<Date> values) {
            addCriterion("unlock_time in", values, "unlock_time");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeNotIn(List<Date> values) {
            addCriterion("unlock_time not in", values, "unlock_time");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeBetween(Date value1, Date value2) {
            addCriterion("unlock_time between", value1, value2, "unlock_time");
            return (Criteria) this;
        }

        public Criteria andUnlock_timeNotBetween(Date value1, Date value2) {
            addCriterion("unlock_time not between", value1, value2, "unlock_time");
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