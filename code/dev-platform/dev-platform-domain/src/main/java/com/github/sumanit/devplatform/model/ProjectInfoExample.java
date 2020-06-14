package com.github.sumanit.devplatform.model;

import com.github.sumanit.base.BaseExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectInfoExample extends BaseExample<ProjectInfoExample.Criteria> {
    public static final String COLUMN_ID = "id";

    public static final String FIELD_ID = "id";

    public static final String COLUMN_NAME = "name";

    public static final String FIELD_NAME = "name";

    public static final String COLUMN_CREATETIME = "create_time";

    public static final String FIELD_CREATETIME = "createTime";

    public static final String COLUMN_MODIFYTIME = "modify_time";

    public static final String FIELD_MODIFYTIME = "modifyTime";

    public static final String COLUMN_CREATEUSER = "create_user";

    public static final String FIELD_CREATEUSER = "createUser";

    public static final String COLUMN_MODIFYUSER = "modify_user";

    public static final String FIELD_MODIFYUSER = "modifyUser";

    public static final String COLUMN_YN = "yn";

    public static final String FIELD_YN = "yn";

    public ProjectInfoExample() {
        oredCriteria = new ArrayList<>();
        tableName = "project_info";
        tableAlias = "projectInfo";
    }

    @Override
    public void setComplexProperty(String property, List values) {
    }

    public ColumnContainer createColumns() {
        ColumnContainer columnContainer = (ColumnContainer) columnContainerMap.get(this.tableName);
        if(columnContainer == null){
            columnContainer = new ColumnContainer(this.tableName);
            columnContainerMap.put(this.tableName,columnContainer);
        }
        return (ColumnContainer)columnContainer;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this.tableName,this.ignoreCase);
        return criteria;
    }

    public static class ColumnContainer extends ColumnContainerBase {
        protected ColumnContainer(String tableName) {
            super(tableName);
        }

        public ColumnContainer hasIdColumn() {
            addColumnStr("projectInfo.id as projectInfo_id ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasNameColumn() {
            addColumnStr("projectInfo.\"name\" as \"projectInfo_name\" ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasCreateTimeColumn() {
            addColumnStr("projectInfo.create_time as projectInfo_create_time ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasModifyTimeColumn() {
            addColumnStr("projectInfo.modify_time as projectInfo_modify_time ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasCreateUserColumn() {
            addColumnStr("projectInfo.create_user as projectInfo_create_user ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasModifyUserColumn() {
            addColumnStr("projectInfo.modify_user as projectInfo_modify_user ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasYnColumn() {
            addColumnStr("projectInfo.yn as projectInfo_yn ");
            return (ColumnContainer) this;
        }
    }

    public static class Criteria extends BaseExample.GeneratedCriteria {
        protected Criteria(String tableName) {
            super(tableName);
            criteria = new ArrayList<>();
        }

        protected Criteria(String tableName, boolean ignoreCase) {
            this(tableName);
            this.ignoreCase = ignoreCase;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public Criteria andIdIsNull() {
            addCriterion("projectInfo.id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("projectInfo.id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("projectInfo.id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("projectInfo.id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("projectInfo.id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("projectInfo.id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("projectInfo.id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("projectInfo.id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("projectInfo.id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("projectInfo.id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("projectInfo.id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("projectInfo.id not between", value1, value2, "id");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("projectInfo.\"name\" is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("projectInfo.\"name\" is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("projectInfo.\"name\" =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("projectInfo.\"name\" <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("projectInfo.\"name\" >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("projectInfo.\"name\" >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("projectInfo.\"name\" <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("projectInfo.\"name\" <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("projectInfo.\"name\" like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("projectInfo.\"name\" not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("projectInfo.\"name\" in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("projectInfo.\"name\" not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("projectInfo.\"name\" between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("projectInfo.\"name\" not between", value1, value2, "name");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("projectInfo.create_time is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("projectInfo.create_time is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("projectInfo.create_time =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("projectInfo.create_time <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("projectInfo.create_time >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("projectInfo.create_time >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("projectInfo.create_time <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("projectInfo.create_time <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("projectInfo.create_time in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("projectInfo.create_time not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("projectInfo.create_time between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("projectInfo.create_time not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("projectInfo.modify_time is null");
            return this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("projectInfo.modify_time is not null");
            return this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("projectInfo.modify_time =", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("projectInfo.modify_time <>", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("projectInfo.modify_time >", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("projectInfo.modify_time >=", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("projectInfo.modify_time <", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("projectInfo.modify_time <=", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("projectInfo.modify_time in", values, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("projectInfo.modify_time not in", values, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("projectInfo.modify_time between", value1, value2, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("projectInfo.modify_time not between", value1, value2, "modifyTime");
            return this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("projectInfo.create_user is null");
            return this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("projectInfo.create_user is not null");
            return this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("projectInfo.create_user =", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("projectInfo.create_user <>", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("projectInfo.create_user >", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("projectInfo.create_user >=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("projectInfo.create_user <", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("projectInfo.create_user <=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("projectInfo.create_user like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("projectInfo.create_user not like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("projectInfo.create_user in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("projectInfo.create_user not in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("projectInfo.create_user between", value1, value2, "createUser");
            return this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("projectInfo.create_user not between", value1, value2, "createUser");
            return this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("projectInfo.modify_user is null");
            return this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("projectInfo.modify_user is not null");
            return this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("projectInfo.modify_user =", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("projectInfo.modify_user <>", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("projectInfo.modify_user >", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("projectInfo.modify_user >=", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("projectInfo.modify_user <", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("projectInfo.modify_user <=", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("projectInfo.modify_user like", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("projectInfo.modify_user not like", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("projectInfo.modify_user in", values, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("projectInfo.modify_user not in", values, "modifyUser");
            return this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("projectInfo.modify_user between", value1, value2, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("projectInfo.modify_user not between", value1, value2, "modifyUser");
            return this;
        }

        public Criteria andYnIsNull() {
            addCriterion("projectInfo.yn is null");
            return this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("projectInfo.yn is not null");
            return this;
        }

        public Criteria andYnEqualTo(Integer value) {
            addCriterion("projectInfo.yn =", value, "yn");
            return this;
        }

        public Criteria andYnNotEqualTo(Integer value) {
            addCriterion("projectInfo.yn <>", value, "yn");
            return this;
        }

        public Criteria andYnGreaterThan(Integer value) {
            addCriterion("projectInfo.yn >", value, "yn");
            return this;
        }

        public Criteria andYnGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectInfo.yn >=", value, "yn");
            return this;
        }

        public Criteria andYnLessThan(Integer value) {
            addCriterion("projectInfo.yn <", value, "yn");
            return this;
        }

        public Criteria andYnLessThanOrEqualTo(Integer value) {
            addCriterion("projectInfo.yn <=", value, "yn");
            return this;
        }

        public Criteria andYnIn(List<Integer> values) {
            addCriterion("projectInfo.yn in", values, "yn");
            return this;
        }

        public Criteria andYnNotIn(List<Integer> values) {
            addCriterion("projectInfo.yn not in", values, "yn");
            return this;
        }

        public Criteria andYnBetween(Integer value1, Integer value2) {
            addCriterion("projectInfo.yn between", value1, value2, "yn");
            return this;
        }

        public Criteria andYnNotBetween(Integer value1, Integer value2) {
            addCriterion("projectInfo.yn not between", value1, value2, "yn");
            return this;
        }
    }
}