package org.software.ysu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogNameIsNull() {
            addCriterion("blog_name is null");
            return (Criteria) this;
        }

        public Criteria andBlogNameIsNotNull() {
            addCriterion("blog_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlogNameEqualTo(String value) {
            addCriterion("blog_name =", value, "blogName");
            return (Criteria) this;
        }

        public Criteria andBlogNameNotEqualTo(String value) {
            addCriterion("blog_name <>", value, "blogName");
            return (Criteria) this;
        }

        public Criteria andBlogNameGreaterThan(String value) {
            addCriterion("blog_name >", value, "blogName");
            return (Criteria) this;
        }

        public Criteria andBlogNameGreaterThanOrEqualTo(String value) {
            addCriterion("blog_name >=", value, "blogName");
            return (Criteria) this;
        }

        public Criteria andBlogNameLessThan(String value) {
            addCriterion("blog_name <", value, "blogName");
            return (Criteria) this;
        }

        public Criteria andBlogNameLessThanOrEqualTo(String value) {
            addCriterion("blog_name <=", value, "blogName");
            return (Criteria) this;
        }

        public Criteria andBlogNameLike(String value) {
            addCriterion("blog_name like", value, "blogName");
            return (Criteria) this;
        }

        public Criteria andBlogNameNotLike(String value) {
            addCriterion("blog_name not like", value, "blogName");
            return (Criteria) this;
        }

        public Criteria andBlogNameIn(List<String> values) {
            addCriterion("blog_name in", values, "blogName");
            return (Criteria) this;
        }

        public Criteria andBlogNameNotIn(List<String> values) {
            addCriterion("blog_name not in", values, "blogName");
            return (Criteria) this;
        }

        public Criteria andBlogNameBetween(String value1, String value2) {
            addCriterion("blog_name between", value1, value2, "blogName");
            return (Criteria) this;
        }

        public Criteria andBlogNameNotBetween(String value1, String value2) {
            addCriterion("blog_name not between", value1, value2, "blogName");
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenIsNull() {
            addCriterion("blog_hidden is null");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenIsNotNull() {
            addCriterion("blog_hidden is not null");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenEqualTo(Integer value) {
            addCriterion("blog_hidden =", value, "blogHidden");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenNotEqualTo(Integer value) {
            addCriterion("blog_hidden <>", value, "blogHidden");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenGreaterThan(Integer value) {
            addCriterion("blog_hidden >", value, "blogHidden");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_hidden >=", value, "blogHidden");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenLessThan(Integer value) {
            addCriterion("blog_hidden <", value, "blogHidden");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenLessThanOrEqualTo(Integer value) {
            addCriterion("blog_hidden <=", value, "blogHidden");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenIn(List<Integer> values) {
            addCriterion("blog_hidden in", values, "blogHidden");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenNotIn(List<Integer> values) {
            addCriterion("blog_hidden not in", values, "blogHidden");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenBetween(Integer value1, Integer value2) {
            addCriterion("blog_hidden between", value1, value2, "blogHidden");
            return (Criteria) this;
        }

        public Criteria andBlogHiddenNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_hidden not between", value1, value2, "blogHidden");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeIsNull() {
            addCriterion("blog_createTime is null");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeIsNotNull() {
            addCriterion("blog_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeEqualTo(Date value) {
            addCriterion("blog_createTime =", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeNotEqualTo(Date value) {
            addCriterion("blog_createTime <>", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeGreaterThan(Date value) {
            addCriterion("blog_createTime >", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_createTime >=", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeLessThan(Date value) {
            addCriterion("blog_createTime <", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("blog_createTime <=", value, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeIn(List<Date> values) {
            addCriterion("blog_createTime in", values, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeNotIn(List<Date> values) {
            addCriterion("blog_createTime not in", values, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeBetween(Date value1, Date value2) {
            addCriterion("blog_createTime between", value1, value2, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("blog_createTime not between", value1, value2, "blogCreatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeIsNull() {
            addCriterion("blog_updateTime is null");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeIsNotNull() {
            addCriterion("blog_updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeEqualTo(Date value) {
            addCriterion("blog_updateTime =", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeNotEqualTo(Date value) {
            addCriterion("blog_updateTime <>", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeGreaterThan(Date value) {
            addCriterion("blog_updateTime >", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_updateTime >=", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeLessThan(Date value) {
            addCriterion("blog_updateTime <", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("blog_updateTime <=", value, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeIn(List<Date> values) {
            addCriterion("blog_updateTime in", values, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeNotIn(List<Date> values) {
            addCriterion("blog_updateTime not in", values, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("blog_updateTime between", value1, value2, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("blog_updateTime not between", value1, value2, "blogUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultIsNull() {
            addCriterion("blog_picdefault is null");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultIsNotNull() {
            addCriterion("blog_picdefault is not null");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultEqualTo(String value) {
            addCriterion("blog_picdefault =", value, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultNotEqualTo(String value) {
            addCriterion("blog_picdefault <>", value, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultGreaterThan(String value) {
            addCriterion("blog_picdefault >", value, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultGreaterThanOrEqualTo(String value) {
            addCriterion("blog_picdefault >=", value, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultLessThan(String value) {
            addCriterion("blog_picdefault <", value, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultLessThanOrEqualTo(String value) {
            addCriterion("blog_picdefault <=", value, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultLike(String value) {
            addCriterion("blog_picdefault like", value, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultNotLike(String value) {
            addCriterion("blog_picdefault not like", value, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultIn(List<String> values) {
            addCriterion("blog_picdefault in", values, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultNotIn(List<String> values) {
            addCriterion("blog_picdefault not in", values, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultBetween(String value1, String value2) {
            addCriterion("blog_picdefault between", value1, value2, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicdefaultNotBetween(String value1, String value2) {
            addCriterion("blog_picdefault not between", value1, value2, "blogPicdefault");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigIsNull() {
            addCriterion("blog_picbig is null");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigIsNotNull() {
            addCriterion("blog_picbig is not null");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigEqualTo(String value) {
            addCriterion("blog_picbig =", value, "blogPicbig");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigNotEqualTo(String value) {
            addCriterion("blog_picbig <>", value, "blogPicbig");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigGreaterThan(String value) {
            addCriterion("blog_picbig >", value, "blogPicbig");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigGreaterThanOrEqualTo(String value) {
            addCriterion("blog_picbig >=", value, "blogPicbig");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigLessThan(String value) {
            addCriterion("blog_picbig <", value, "blogPicbig");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigLessThanOrEqualTo(String value) {
            addCriterion("blog_picbig <=", value, "blogPicbig");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigLike(String value) {
            addCriterion("blog_picbig like", value, "blogPicbig");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigNotLike(String value) {
            addCriterion("blog_picbig not like", value, "blogPicbig");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigIn(List<String> values) {
            addCriterion("blog_picbig in", values, "blogPicbig");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigNotIn(List<String> values) {
            addCriterion("blog_picbig not in", values, "blogPicbig");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigBetween(String value1, String value2) {
            addCriterion("blog_picbig between", value1, value2, "blogPicbig");
            return (Criteria) this;
        }

        public Criteria andBlogPicbigNotBetween(String value1, String value2) {
            addCriterion("blog_picbig not between", value1, value2, "blogPicbig");
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