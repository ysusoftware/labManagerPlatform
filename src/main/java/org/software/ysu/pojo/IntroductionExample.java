package org.software.ysu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntroductionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntroductionExample() {
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

        public Criteria andIntroIdIsNull() {
            addCriterion("intro_id is null");
            return (Criteria) this;
        }

        public Criteria andIntroIdIsNotNull() {
            addCriterion("intro_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntroIdEqualTo(Integer value) {
            addCriterion("intro_id =", value, "introId");
            return (Criteria) this;
        }

        public Criteria andIntroIdNotEqualTo(Integer value) {
            addCriterion("intro_id <>", value, "introId");
            return (Criteria) this;
        }

        public Criteria andIntroIdGreaterThan(Integer value) {
            addCriterion("intro_id >", value, "introId");
            return (Criteria) this;
        }

        public Criteria andIntroIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("intro_id >=", value, "introId");
            return (Criteria) this;
        }

        public Criteria andIntroIdLessThan(Integer value) {
            addCriterion("intro_id <", value, "introId");
            return (Criteria) this;
        }

        public Criteria andIntroIdLessThanOrEqualTo(Integer value) {
            addCriterion("intro_id <=", value, "introId");
            return (Criteria) this;
        }

        public Criteria andIntroIdIn(List<Integer> values) {
            addCriterion("intro_id in", values, "introId");
            return (Criteria) this;
        }

        public Criteria andIntroIdNotIn(List<Integer> values) {
            addCriterion("intro_id not in", values, "introId");
            return (Criteria) this;
        }

        public Criteria andIntroIdBetween(Integer value1, Integer value2) {
            addCriterion("intro_id between", value1, value2, "introId");
            return (Criteria) this;
        }

        public Criteria andIntroIdNotBetween(Integer value1, Integer value2) {
            addCriterion("intro_id not between", value1, value2, "introId");
            return (Criteria) this;
        }

        public Criteria andIntroTitleIsNull() {
            addCriterion("intro_title is null");
            return (Criteria) this;
        }

        public Criteria andIntroTitleIsNotNull() {
            addCriterion("intro_title is not null");
            return (Criteria) this;
        }

        public Criteria andIntroTitleEqualTo(String value) {
            addCriterion("intro_title =", value, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroTitleNotEqualTo(String value) {
            addCriterion("intro_title <>", value, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroTitleGreaterThan(String value) {
            addCriterion("intro_title >", value, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroTitleGreaterThanOrEqualTo(String value) {
            addCriterion("intro_title >=", value, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroTitleLessThan(String value) {
            addCriterion("intro_title <", value, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroTitleLessThanOrEqualTo(String value) {
            addCriterion("intro_title <=", value, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroTitleLike(String value) {
            addCriterion("intro_title like", value, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroTitleNotLike(String value) {
            addCriterion("intro_title not like", value, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroTitleIn(List<String> values) {
            addCriterion("intro_title in", values, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroTitleNotIn(List<String> values) {
            addCriterion("intro_title not in", values, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroTitleBetween(String value1, String value2) {
            addCriterion("intro_title between", value1, value2, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroTitleNotBetween(String value1, String value2) {
            addCriterion("intro_title not between", value1, value2, "introTitle");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeIsNull() {
            addCriterion("intro_createTime is null");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeIsNotNull() {
            addCriterion("intro_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeEqualTo(Date value) {
            addCriterion("intro_createTime =", value, "introCreatetime");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeNotEqualTo(Date value) {
            addCriterion("intro_createTime <>", value, "introCreatetime");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeGreaterThan(Date value) {
            addCriterion("intro_createTime >", value, "introCreatetime");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("intro_createTime >=", value, "introCreatetime");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeLessThan(Date value) {
            addCriterion("intro_createTime <", value, "introCreatetime");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("intro_createTime <=", value, "introCreatetime");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeIn(List<Date> values) {
            addCriterion("intro_createTime in", values, "introCreatetime");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeNotIn(List<Date> values) {
            addCriterion("intro_createTime not in", values, "introCreatetime");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeBetween(Date value1, Date value2) {
            addCriterion("intro_createTime between", value1, value2, "introCreatetime");
            return (Criteria) this;
        }

        public Criteria andIntroCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("intro_createTime not between", value1, value2, "introCreatetime");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeIsNull() {
            addCriterion("intro_updateTime is null");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeIsNotNull() {
            addCriterion("intro_updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeEqualTo(Date value) {
            addCriterion("intro_updateTime =", value, "introUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeNotEqualTo(Date value) {
            addCriterion("intro_updateTime <>", value, "introUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeGreaterThan(Date value) {
            addCriterion("intro_updateTime >", value, "introUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("intro_updateTime >=", value, "introUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeLessThan(Date value) {
            addCriterion("intro_updateTime <", value, "introUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("intro_updateTime <=", value, "introUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeIn(List<Date> values) {
            addCriterion("intro_updateTime in", values, "introUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeNotIn(List<Date> values) {
            addCriterion("intro_updateTime not in", values, "introUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("intro_updateTime between", value1, value2, "introUpdatetime");
            return (Criteria) this;
        }

        public Criteria andIntroUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("intro_updateTime not between", value1, value2, "introUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameIsNull() {
            addCriterion("intro_relname is null");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameIsNotNull() {
            addCriterion("intro_relname is not null");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameEqualTo(String value) {
            addCriterion("intro_relname =", value, "introRelname");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameNotEqualTo(String value) {
            addCriterion("intro_relname <>", value, "introRelname");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameGreaterThan(String value) {
            addCriterion("intro_relname >", value, "introRelname");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameGreaterThanOrEqualTo(String value) {
            addCriterion("intro_relname >=", value, "introRelname");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameLessThan(String value) {
            addCriterion("intro_relname <", value, "introRelname");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameLessThanOrEqualTo(String value) {
            addCriterion("intro_relname <=", value, "introRelname");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameLike(String value) {
            addCriterion("intro_relname like", value, "introRelname");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameNotLike(String value) {
            addCriterion("intro_relname not like", value, "introRelname");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameIn(List<String> values) {
            addCriterion("intro_relname in", values, "introRelname");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameNotIn(List<String> values) {
            addCriterion("intro_relname not in", values, "introRelname");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameBetween(String value1, String value2) {
            addCriterion("intro_relname between", value1, value2, "introRelname");
            return (Criteria) this;
        }

        public Criteria andIntroRelnameNotBetween(String value1, String value2) {
            addCriterion("intro_relname not between", value1, value2, "introRelname");
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

        public Criteria andIntroUrlIsNull() {
            addCriterion("intro_url is null");
            return (Criteria) this;
        }

        public Criteria andIntroUrlIsNotNull() {
            addCriterion("intro_url is not null");
            return (Criteria) this;
        }

        public Criteria andIntroUrlEqualTo(String value) {
            addCriterion("intro_url =", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlNotEqualTo(String value) {
            addCriterion("intro_url <>", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlGreaterThan(String value) {
            addCriterion("intro_url >", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlGreaterThanOrEqualTo(String value) {
            addCriterion("intro_url >=", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlLessThan(String value) {
            addCriterion("intro_url <", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlLessThanOrEqualTo(String value) {
            addCriterion("intro_url <=", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlLike(String value) {
            addCriterion("intro_url like", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlNotLike(String value) {
            addCriterion("intro_url not like", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlIn(List<String> values) {
            addCriterion("intro_url in", values, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlNotIn(List<String> values) {
            addCriterion("intro_url not in", values, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlBetween(String value1, String value2) {
            addCriterion("intro_url between", value1, value2, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlNotBetween(String value1, String value2) {
            addCriterion("intro_url not between", value1, value2, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultIsNull() {
            addCriterion("intro_picdefault is null");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultIsNotNull() {
            addCriterion("intro_picdefault is not null");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultEqualTo(String value) {
            addCriterion("intro_picdefault =", value, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultNotEqualTo(String value) {
            addCriterion("intro_picdefault <>", value, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultGreaterThan(String value) {
            addCriterion("intro_picdefault >", value, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultGreaterThanOrEqualTo(String value) {
            addCriterion("intro_picdefault >=", value, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultLessThan(String value) {
            addCriterion("intro_picdefault <", value, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultLessThanOrEqualTo(String value) {
            addCriterion("intro_picdefault <=", value, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultLike(String value) {
            addCriterion("intro_picdefault like", value, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultNotLike(String value) {
            addCriterion("intro_picdefault not like", value, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultIn(List<String> values) {
            addCriterion("intro_picdefault in", values, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultNotIn(List<String> values) {
            addCriterion("intro_picdefault not in", values, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultBetween(String value1, String value2) {
            addCriterion("intro_picdefault between", value1, value2, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicdefaultNotBetween(String value1, String value2) {
            addCriterion("intro_picdefault not between", value1, value2, "introPicdefault");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigIsNull() {
            addCriterion("intro_picbig is null");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigIsNotNull() {
            addCriterion("intro_picbig is not null");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigEqualTo(String value) {
            addCriterion("intro_picbig =", value, "introPicbig");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigNotEqualTo(String value) {
            addCriterion("intro_picbig <>", value, "introPicbig");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigGreaterThan(String value) {
            addCriterion("intro_picbig >", value, "introPicbig");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigGreaterThanOrEqualTo(String value) {
            addCriterion("intro_picbig >=", value, "introPicbig");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigLessThan(String value) {
            addCriterion("intro_picbig <", value, "introPicbig");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigLessThanOrEqualTo(String value) {
            addCriterion("intro_picbig <=", value, "introPicbig");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigLike(String value) {
            addCriterion("intro_picbig like", value, "introPicbig");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigNotLike(String value) {
            addCriterion("intro_picbig not like", value, "introPicbig");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigIn(List<String> values) {
            addCriterion("intro_picbig in", values, "introPicbig");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigNotIn(List<String> values) {
            addCriterion("intro_picbig not in", values, "introPicbig");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigBetween(String value1, String value2) {
            addCriterion("intro_picbig between", value1, value2, "introPicbig");
            return (Criteria) this;
        }

        public Criteria andIntroPicbigNotBetween(String value1, String value2) {
            addCriterion("intro_picbig not between", value1, value2, "introPicbig");
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