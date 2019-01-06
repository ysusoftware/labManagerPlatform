package org.software.ysu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatumExample() {
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

        public Criteria andDatumIdIsNull() {
            addCriterion("datum_id is null");
            return (Criteria) this;
        }

        public Criteria andDatumIdIsNotNull() {
            addCriterion("datum_id is not null");
            return (Criteria) this;
        }

        public Criteria andDatumIdEqualTo(Integer value) {
            addCriterion("datum_id =", value, "datumId");
            return (Criteria) this;
        }

        public Criteria andDatumIdNotEqualTo(Integer value) {
            addCriterion("datum_id <>", value, "datumId");
            return (Criteria) this;
        }

        public Criteria andDatumIdGreaterThan(Integer value) {
            addCriterion("datum_id >", value, "datumId");
            return (Criteria) this;
        }

        public Criteria andDatumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("datum_id >=", value, "datumId");
            return (Criteria) this;
        }

        public Criteria andDatumIdLessThan(Integer value) {
            addCriterion("datum_id <", value, "datumId");
            return (Criteria) this;
        }

        public Criteria andDatumIdLessThanOrEqualTo(Integer value) {
            addCriterion("datum_id <=", value, "datumId");
            return (Criteria) this;
        }

        public Criteria andDatumIdIn(List<Integer> values) {
            addCriterion("datum_id in", values, "datumId");
            return (Criteria) this;
        }

        public Criteria andDatumIdNotIn(List<Integer> values) {
            addCriterion("datum_id not in", values, "datumId");
            return (Criteria) this;
        }

        public Criteria andDatumIdBetween(Integer value1, Integer value2) {
            addCriterion("datum_id between", value1, value2, "datumId");
            return (Criteria) this;
        }

        public Criteria andDatumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("datum_id not between", value1, value2, "datumId");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameIsNull() {
            addCriterion("datum_oldname is null");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameIsNotNull() {
            addCriterion("datum_oldname is not null");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameEqualTo(String value) {
            addCriterion("datum_oldname =", value, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameNotEqualTo(String value) {
            addCriterion("datum_oldname <>", value, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameGreaterThan(String value) {
            addCriterion("datum_oldname >", value, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameGreaterThanOrEqualTo(String value) {
            addCriterion("datum_oldname >=", value, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameLessThan(String value) {
            addCriterion("datum_oldname <", value, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameLessThanOrEqualTo(String value) {
            addCriterion("datum_oldname <=", value, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameLike(String value) {
            addCriterion("datum_oldname like", value, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameNotLike(String value) {
            addCriterion("datum_oldname not like", value, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameIn(List<String> values) {
            addCriterion("datum_oldname in", values, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameNotIn(List<String> values) {
            addCriterion("datum_oldname not in", values, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameBetween(String value1, String value2) {
            addCriterion("datum_oldname between", value1, value2, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumOldnameNotBetween(String value1, String value2) {
            addCriterion("datum_oldname not between", value1, value2, "datumOldname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameIsNull() {
            addCriterion("datum_newname is null");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameIsNotNull() {
            addCriterion("datum_newname is not null");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameEqualTo(String value) {
            addCriterion("datum_newname =", value, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameNotEqualTo(String value) {
            addCriterion("datum_newname <>", value, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameGreaterThan(String value) {
            addCriterion("datum_newname >", value, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameGreaterThanOrEqualTo(String value) {
            addCriterion("datum_newname >=", value, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameLessThan(String value) {
            addCriterion("datum_newname <", value, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameLessThanOrEqualTo(String value) {
            addCriterion("datum_newname <=", value, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameLike(String value) {
            addCriterion("datum_newname like", value, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameNotLike(String value) {
            addCriterion("datum_newname not like", value, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameIn(List<String> values) {
            addCriterion("datum_newname in", values, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameNotIn(List<String> values) {
            addCriterion("datum_newname not in", values, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameBetween(String value1, String value2) {
            addCriterion("datum_newname between", value1, value2, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumNewnameNotBetween(String value1, String value2) {
            addCriterion("datum_newname not between", value1, value2, "datumNewname");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateIsNull() {
            addCriterion("datum_lastdate is null");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateIsNotNull() {
            addCriterion("datum_lastdate is not null");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateEqualTo(Date value) {
            addCriterion("datum_lastdate =", value, "datumLastdate");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateNotEqualTo(Date value) {
            addCriterion("datum_lastdate <>", value, "datumLastdate");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateGreaterThan(Date value) {
            addCriterion("datum_lastdate >", value, "datumLastdate");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateGreaterThanOrEqualTo(Date value) {
            addCriterion("datum_lastdate >=", value, "datumLastdate");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateLessThan(Date value) {
            addCriterion("datum_lastdate <", value, "datumLastdate");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateLessThanOrEqualTo(Date value) {
            addCriterion("datum_lastdate <=", value, "datumLastdate");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateIn(List<Date> values) {
            addCriterion("datum_lastdate in", values, "datumLastdate");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateNotIn(List<Date> values) {
            addCriterion("datum_lastdate not in", values, "datumLastdate");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateBetween(Date value1, Date value2) {
            addCriterion("datum_lastdate between", value1, value2, "datumLastdate");
            return (Criteria) this;
        }

        public Criteria andDatumLastdateNotBetween(Date value1, Date value2) {
            addCriterion("datum_lastdate not between", value1, value2, "datumLastdate");
            return (Criteria) this;
        }

        public Criteria andDatumUserIsNull() {
            addCriterion("datum_user is null");
            return (Criteria) this;
        }

        public Criteria andDatumUserIsNotNull() {
            addCriterion("datum_user is not null");
            return (Criteria) this;
        }

        public Criteria andDatumUserEqualTo(String value) {
            addCriterion("datum_user =", value, "datumUser");
            return (Criteria) this;
        }

        public Criteria andDatumUserNotEqualTo(String value) {
            addCriterion("datum_user <>", value, "datumUser");
            return (Criteria) this;
        }

        public Criteria andDatumUserGreaterThan(String value) {
            addCriterion("datum_user >", value, "datumUser");
            return (Criteria) this;
        }

        public Criteria andDatumUserGreaterThanOrEqualTo(String value) {
            addCriterion("datum_user >=", value, "datumUser");
            return (Criteria) this;
        }

        public Criteria andDatumUserLessThan(String value) {
            addCriterion("datum_user <", value, "datumUser");
            return (Criteria) this;
        }

        public Criteria andDatumUserLessThanOrEqualTo(String value) {
            addCriterion("datum_user <=", value, "datumUser");
            return (Criteria) this;
        }

        public Criteria andDatumUserLike(String value) {
            addCriterion("datum_user like", value, "datumUser");
            return (Criteria) this;
        }

        public Criteria andDatumUserNotLike(String value) {
            addCriterion("datum_user not like", value, "datumUser");
            return (Criteria) this;
        }

        public Criteria andDatumUserIn(List<String> values) {
            addCriterion("datum_user in", values, "datumUser");
            return (Criteria) this;
        }

        public Criteria andDatumUserNotIn(List<String> values) {
            addCriterion("datum_user not in", values, "datumUser");
            return (Criteria) this;
        }

        public Criteria andDatumUserBetween(String value1, String value2) {
            addCriterion("datum_user between", value1, value2, "datumUser");
            return (Criteria) this;
        }

        public Criteria andDatumUserNotBetween(String value1, String value2) {
            addCriterion("datum_user not between", value1, value2, "datumUser");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
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