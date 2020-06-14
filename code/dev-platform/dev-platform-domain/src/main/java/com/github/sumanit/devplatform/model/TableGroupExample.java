package com.github.sumanit.devplatform.model;

import com.github.sumanit.base.BaseExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TableGroupExample extends BaseExample<TableGroupExample.Criteria> {
    public static final String COLUMN_ID = "id";

    public static final String FIELD_ID = "id";

    public static final String COLUMN_PID = "pid";

    public static final String FIELD_PID = "pid";

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

    public TableGroupExample() {
        oredCriteria = new ArrayList<>();
        tableName = "table_group";
        tableAlias = "table_group";
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
            addColumnStr("table_group.id as table_group_id ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasPidColumn() {
            addColumnStr("table_group.pid as table_group_pid ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasNameColumn() {
            addColumnStr("table_group.\"name\" as \"table_group_name\" ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasCreateTimeColumn() {
            addColumnStr("table_group.create_time as table_group_create_time ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasModifyTimeColumn() {
            addColumnStr("table_group.modify_time as table_group_modify_time ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasCreateUserColumn() {
            addColumnStr("table_group.create_user as table_group_create_user ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasModifyUserColumn() {
            addColumnStr("table_group.modify_user as table_group_modify_user ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasYnColumn() {
            addColumnStr("table_group.yn as table_group_yn ");
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
            addCriterion("table_group.id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("table_group.id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("table_group.id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("table_group.id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("table_group.id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("table_group.id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("table_group.id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("table_group.id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("table_group.id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("table_group.id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("table_group.id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("table_group.id not between", value1, value2, "id");
            return this;
        }

        public Criteria andPidIsNull() {
            addCriterion("table_group.pid is null");
            return this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("table_group.pid is not null");
            return this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("table_group.pid =", value, "pid");
            return this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("table_group.pid <>", value, "pid");
            return this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("table_group.pid >", value, "pid");
            return this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("table_group.pid >=", value, "pid");
            return this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("table_group.pid <", value, "pid");
            return this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("table_group.pid <=", value, "pid");
            return this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("table_group.pid in", values, "pid");
            return this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("table_group.pid not in", values, "pid");
            return this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("table_group.pid between", value1, value2, "pid");
            return this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("table_group.pid not between", value1, value2, "pid");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("table_group.\"name\" is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("table_group.\"name\" is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("table_group.\"name\" =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("table_group.\"name\" <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("table_group.\"name\" >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_group.\"name\" >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("table_group.\"name\" <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("table_group.\"name\" <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("table_group.\"name\" like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("table_group.\"name\" not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("table_group.\"name\" in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("table_group.\"name\" not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("table_group.\"name\" between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("table_group.\"name\" not between", value1, value2, "name");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("table_group.create_time is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("table_group.create_time is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("table_group.create_time =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("table_group.create_time <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("table_group.create_time >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("table_group.create_time >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("table_group.create_time <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("table_group.create_time <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("table_group.create_time in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("table_group.create_time not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("table_group.create_time between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("table_group.create_time not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("table_group.modify_time is null");
            return this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("table_group.modify_time is not null");
            return this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("table_group.modify_time =", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("table_group.modify_time <>", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("table_group.modify_time >", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("table_group.modify_time >=", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("table_group.modify_time <", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("table_group.modify_time <=", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("table_group.modify_time in", values, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("table_group.modify_time not in", values, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("table_group.modify_time between", value1, value2, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("table_group.modify_time not between", value1, value2, "modifyTime");
            return this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("table_group.create_user is null");
            return this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("table_group.create_user is not null");
            return this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("table_group.create_user =", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("table_group.create_user <>", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("table_group.create_user >", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("table_group.create_user >=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("table_group.create_user <", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("table_group.create_user <=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("table_group.create_user like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("table_group.create_user not like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("table_group.create_user in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("table_group.create_user not in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("table_group.create_user between", value1, value2, "createUser");
            return this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("table_group.create_user not between", value1, value2, "createUser");
            return this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("table_group.modify_user is null");
            return this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("table_group.modify_user is not null");
            return this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("table_group.modify_user =", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("table_group.modify_user <>", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("table_group.modify_user >", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("table_group.modify_user >=", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("table_group.modify_user <", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("table_group.modify_user <=", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("table_group.modify_user like", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("table_group.modify_user not like", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("table_group.modify_user in", values, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("table_group.modify_user not in", values, "modifyUser");
            return this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("table_group.modify_user between", value1, value2, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("table_group.modify_user not between", value1, value2, "modifyUser");
            return this;
        }

        public Criteria andYnIsNull() {
            addCriterion("table_group.yn is null");
            return this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("table_group.yn is not null");
            return this;
        }

        public Criteria andYnEqualTo(Integer value) {
            addCriterion("table_group.yn =", value, "yn");
            return this;
        }

        public Criteria andYnNotEqualTo(Integer value) {
            addCriterion("table_group.yn <>", value, "yn");
            return this;
        }

        public Criteria andYnGreaterThan(Integer value) {
            addCriterion("table_group.yn >", value, "yn");
            return this;
        }

        public Criteria andYnGreaterThanOrEqualTo(Integer value) {
            addCriterion("table_group.yn >=", value, "yn");
            return this;
        }

        public Criteria andYnLessThan(Integer value) {
            addCriterion("table_group.yn <", value, "yn");
            return this;
        }

        public Criteria andYnLessThanOrEqualTo(Integer value) {
            addCriterion("table_group.yn <=", value, "yn");
            return this;
        }

        public Criteria andYnIn(List<Integer> values) {
            addCriterion("table_group.yn in", values, "yn");
            return this;
        }

        public Criteria andYnNotIn(List<Integer> values) {
            addCriterion("table_group.yn not in", values, "yn");
            return this;
        }

        public Criteria andYnBetween(Integer value1, Integer value2) {
            addCriterion("table_group.yn between", value1, value2, "yn");
            return this;
        }

        public Criteria andYnNotBetween(Integer value1, Integer value2) {
            addCriterion("table_group.yn not between", value1, value2, "yn");
            return this;
        }
    }
}