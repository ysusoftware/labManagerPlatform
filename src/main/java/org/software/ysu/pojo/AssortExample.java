package org.software.ysu.pojo;

import java.util.ArrayList;
import java.util.List;

public class AssortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssortExample() {
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

        public Criteria andAssortNameIsNull() {
            addCriterion("assort_name is null");
            return (Criteria) this;
        }

        public Criteria andAssortNameIsNotNull() {
            addCriterion("assort_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssortNameEqualTo(String value) {
            addCriterion("assort_name =", value, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortNameNotEqualTo(String value) {
            addCriterion("assort_name <>", value, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortNameGreaterThan(String value) {
            addCriterion("assort_name >", value, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortNameGreaterThanOrEqualTo(String value) {
            addCriterion("assort_name >=", value, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortNameLessThan(String value) {
            addCriterion("assort_name <", value, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortNameLessThanOrEqualTo(String value) {
            addCriterion("assort_name <=", value, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortNameLike(String value) {
            addCriterion("assort_name like", value, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortNameNotLike(String value) {
            addCriterion("assort_name not like", value, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortNameIn(List<String> values) {
            addCriterion("assort_name in", values, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortNameNotIn(List<String> values) {
            addCriterion("assort_name not in", values, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortNameBetween(String value1, String value2) {
            addCriterion("assort_name between", value1, value2, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortNameNotBetween(String value1, String value2) {
            addCriterion("assort_name not between", value1, value2, "assortName");
            return (Criteria) this;
        }

        public Criteria andAssortParentidIsNull() {
            addCriterion("assort_parentid is null");
            return (Criteria) this;
        }

        public Criteria andAssortParentidIsNotNull() {
            addCriterion("assort_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andAssortParentidEqualTo(Integer value) {
            addCriterion("assort_parentid =", value, "assortParentid");
            return (Criteria) this;
        }

        public Criteria andAssortParentidNotEqualTo(Integer value) {
            addCriterion("assort_parentid <>", value, "assortParentid");
            return (Criteria) this;
        }

        public Criteria andAssortParentidGreaterThan(Integer value) {
            addCriterion("assort_parentid >", value, "assortParentid");
            return (Criteria) this;
        }

        public Criteria andAssortParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("assort_parentid >=", value, "assortParentid");
            return (Criteria) this;
        }

        public Criteria andAssortParentidLessThan(Integer value) {
            addCriterion("assort_parentid <", value, "assortParentid");
            return (Criteria) this;
        }

        public Criteria andAssortParentidLessThanOrEqualTo(Integer value) {
            addCriterion("assort_parentid <=", value, "assortParentid");
            return (Criteria) this;
        }

        public Criteria andAssortParentidIn(List<Integer> values) {
            addCriterion("assort_parentid in", values, "assortParentid");
            return (Criteria) this;
        }

        public Criteria andAssortParentidNotIn(List<Integer> values) {
            addCriterion("assort_parentid not in", values, "assortParentid");
            return (Criteria) this;
        }

        public Criteria andAssortParentidBetween(Integer value1, Integer value2) {
            addCriterion("assort_parentid between", value1, value2, "assortParentid");
            return (Criteria) this;
        }

        public Criteria andAssortParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("assort_parentid not between", value1, value2, "assortParentid");
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