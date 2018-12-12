package org.software.ysu.pojo;

import java.util.ArrayList;
import java.util.List;

public class LogoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogoExample() {
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

        public Criteria andLogoIdIsNull() {
            addCriterion("logo_id is null");
            return (Criteria) this;
        }

        public Criteria andLogoIdIsNotNull() {
            addCriterion("logo_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogoIdEqualTo(Integer value) {
            addCriterion("logo_id =", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdNotEqualTo(Integer value) {
            addCriterion("logo_id <>", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdGreaterThan(Integer value) {
            addCriterion("logo_id >", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logo_id >=", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdLessThan(Integer value) {
            addCriterion("logo_id <", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdLessThanOrEqualTo(Integer value) {
            addCriterion("logo_id <=", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdIn(List<Integer> values) {
            addCriterion("logo_id in", values, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdNotIn(List<Integer> values) {
            addCriterion("logo_id not in", values, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdBetween(Integer value1, Integer value2) {
            addCriterion("logo_id between", value1, value2, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logo_id not between", value1, value2, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoDesIsNull() {
            addCriterion("logo_des is null");
            return (Criteria) this;
        }

        public Criteria andLogoDesIsNotNull() {
            addCriterion("logo_des is not null");
            return (Criteria) this;
        }

        public Criteria andLogoDesEqualTo(String value) {
            addCriterion("logo_des =", value, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoDesNotEqualTo(String value) {
            addCriterion("logo_des <>", value, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoDesGreaterThan(String value) {
            addCriterion("logo_des >", value, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoDesGreaterThanOrEqualTo(String value) {
            addCriterion("logo_des >=", value, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoDesLessThan(String value) {
            addCriterion("logo_des <", value, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoDesLessThanOrEqualTo(String value) {
            addCriterion("logo_des <=", value, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoDesLike(String value) {
            addCriterion("logo_des like", value, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoDesNotLike(String value) {
            addCriterion("logo_des not like", value, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoDesIn(List<String> values) {
            addCriterion("logo_des in", values, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoDesNotIn(List<String> values) {
            addCriterion("logo_des not in", values, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoDesBetween(String value1, String value2) {
            addCriterion("logo_des between", value1, value2, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoDesNotBetween(String value1, String value2) {
            addCriterion("logo_des not between", value1, value2, "logoDes");
            return (Criteria) this;
        }

        public Criteria andLogoPathIsNull() {
            addCriterion("logo_path is null");
            return (Criteria) this;
        }

        public Criteria andLogoPathIsNotNull() {
            addCriterion("logo_path is not null");
            return (Criteria) this;
        }

        public Criteria andLogoPathEqualTo(String value) {
            addCriterion("logo_path =", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotEqualTo(String value) {
            addCriterion("logo_path <>", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThan(String value) {
            addCriterion("logo_path >", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThanOrEqualTo(String value) {
            addCriterion("logo_path >=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThan(String value) {
            addCriterion("logo_path <", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThanOrEqualTo(String value) {
            addCriterion("logo_path <=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLike(String value) {
            addCriterion("logo_path like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotLike(String value) {
            addCriterion("logo_path not like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathIn(List<String> values) {
            addCriterion("logo_path in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotIn(List<String> values) {
            addCriterion("logo_path not in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathBetween(String value1, String value2) {
            addCriterion("logo_path between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotBetween(String value1, String value2) {
            addCriterion("logo_path not between", value1, value2, "logoPath");
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