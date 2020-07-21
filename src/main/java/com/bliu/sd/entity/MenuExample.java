package com.bliu.sd.entity;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public MenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public MenuExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public MenuExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setPageInfo(Integer currentPage, Integer pageSize) {
        if(pageSize<1) throw new IllegalArgumentException("页大小不能小于1！");
        this.limit=pageSize;
        if(currentPage<1) throw new IllegalArgumentException("页数不能小于1！");
        this.offset=(currentPage-1)*pageSize;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
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

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andIdEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andIdNotEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andIdGreaterThanColumn(Menu.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andIdGreaterThanOrEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andIdLessThanColumn(Menu.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andIdLessThanOrEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
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

        public Criteria andParent_idIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParent_idIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParent_idEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parent_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andParent_idEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("parent_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParent_idNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parent_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andParent_idNotEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("parent_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParent_idGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parent_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andParent_idGreaterThanColumn(Menu.Column column) {
            addCriterion(new StringBuilder("parent_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParent_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parent_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andParent_idGreaterThanOrEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("parent_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParent_idLessThan(Integer value) {
            addCriterion("parent_id <", value, "parent_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andParent_idLessThanColumn(Menu.Column column) {
            addCriterion(new StringBuilder("parent_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParent_idLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parent_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andParent_idLessThanOrEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("parent_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParent_idIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parent_id");
            return (Criteria) this;
        }

        public Criteria andMenu_nameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenu_nameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_nameEqualTo(String value) {
            addCriterion("menu_name =", value, "menu_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andMenu_nameEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("menu_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenu_nameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menu_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andMenu_nameNotEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("menu_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenu_nameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menu_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andMenu_nameGreaterThanColumn(Menu.Column column) {
            addCriterion(new StringBuilder("menu_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenu_nameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menu_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andMenu_nameGreaterThanOrEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("menu_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenu_nameLessThan(String value) {
            addCriterion("menu_name <", value, "menu_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andMenu_nameLessThanColumn(Menu.Column column) {
            addCriterion(new StringBuilder("menu_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenu_nameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menu_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andMenu_nameLessThanOrEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("menu_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenu_nameLike(String value) {
            addCriterion("menu_name like", value, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameNotLike(String value) {
            addCriterion("menu_name not like", value, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameIn(List<String> values) {
            addCriterion("menu_name in", values, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menu_name");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andUrlEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andUrlNotEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andUrlGreaterThanColumn(Menu.Column column) {
            addCriterion(new StringBuilder("url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andUrlGreaterThanOrEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andUrlLessThanColumn(Menu.Column column) {
            addCriterion(new StringBuilder("url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andUrlLessThanOrEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("permission is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("permission is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(String value) {
            addCriterion("permission =", value, "permission");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andPermissionEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("permission = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(String value) {
            addCriterion("permission <>", value, "permission");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andPermissionNotEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("permission <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(String value) {
            addCriterion("permission >", value, "permission");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andPermissionGreaterThanColumn(Menu.Column column) {
            addCriterion(new StringBuilder("permission > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("permission >=", value, "permission");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andPermissionGreaterThanOrEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("permission >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(String value) {
            addCriterion("permission <", value, "permission");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andPermissionLessThanColumn(Menu.Column column) {
            addCriterion(new StringBuilder("permission < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(String value) {
            addCriterion("permission <=", value, "permission");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andPermissionLessThanOrEqualToColumn(Menu.Column column) {
            addCriterion(new StringBuilder("permission <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionLike(String value) {
            addCriterion("permission like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotLike(String value) {
            addCriterion("permission not like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<String> values) {
            addCriterion("permission in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<String> values) {
            addCriterion("permission not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(String value1, String value2) {
            addCriterion("permission between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(String value1, String value2) {
            addCriterion("permission not between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andMenu_nameLikeInsensitive(String value) {
            addCriterion("upper(menu_name) like", value.toUpperCase(), "menu_name");
            return (Criteria) this;
        }

        public Criteria andUrlLikeInsensitive(String value) {
            addCriterion("upper(url) like", value.toUpperCase(), "url");
            return (Criteria) this;
        }

        public Criteria andPermissionLikeInsensitive(String value) {
            addCriterion("upper(permission) like", value.toUpperCase(), "permission");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 20 17:17:28 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        private MenuExample example;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        protected Criteria(MenuExample example) {
            super();
            this.example = example;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public MenuExample example() {
            return this.example;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public interface ICriteriaAdd {
            /**
             *
             * @mbg.generated Mon Jul 20 17:17:28 CST 2020
             */
            Criteria add(Criteria add);
        }
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
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