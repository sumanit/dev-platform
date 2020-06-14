package com.github.sumanit.devplatform.model;

import com.github.sumanit.base.BaseExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColumnInfoExample extends BaseExample<ColumnInfoExample.Criteria> {
    public static final String COLUMN_ID = "id";

    public static final String FIELD_ID = "id";

    public static final String COLUMN_DBID = "db_id";

    public static final String FIELD_DBID = "dbId";

    public static final String COLUMN_TABLENAME = "table_name";

    public static final String FIELD_TABLENAME = "tableName";

    public static final String COLUMN_TYPE = "type";

    public static final String FIELD_TYPE = "type";

    public static final String COLUMN_JAVATYPE = "java_type";

    public static final String FIELD_JAVATYPE = "javaType";

    public static final String COLUMN_ISNULL = "is_null";

    public static final String FIELD_ISNULL = "isNull";

    public static final String COLUMN_DEFAULTVALUE = "default_value";

    public static final String FIELD_DEFAULTVALUE = "defaultValue";

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

    public ColumnInfoExample() {
        oredCriteria = new ArrayList<>();
        tableName = "column_info";
        tableAlias = "columnInfo";
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
            addColumnStr("columnInfo.id as columnInfo_id ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasDbIdColumn() {
            addColumnStr("columnInfo.db_id as columnInfo_db_id ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasTableNameColumn() {
            addColumnStr("columnInfo.\"table_name\" as \"columnInfo_table_name\" ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasTypeColumn() {
            addColumnStr("columnInfo.\"type\" as \"columnInfo_type\" ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasJavaTypeColumn() {
            addColumnStr("columnInfo.java_type as columnInfo_java_type ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasIsNullColumn() {
            addColumnStr("columnInfo.is_null as columnInfo_is_null ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasDefaultValueColumn() {
            addColumnStr("columnInfo.default_value as columnInfo_default_value ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasCreateTimeColumn() {
            addColumnStr("columnInfo.create_time as columnInfo_create_time ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasModifyTimeColumn() {
            addColumnStr("columnInfo.modify_time as columnInfo_modify_time ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasCreateUserColumn() {
            addColumnStr("columnInfo.create_user as columnInfo_create_user ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasModifyUserColumn() {
            addColumnStr("columnInfo.modify_user as columnInfo_modify_user ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasYnColumn() {
            addColumnStr("columnInfo.yn as columnInfo_yn ");
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
            addCriterion("columnInfo.id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("columnInfo.id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("columnInfo.id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("columnInfo.id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("columnInfo.id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("columnInfo.id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("columnInfo.id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("columnInfo.id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("columnInfo.id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("columnInfo.id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("columnInfo.id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("columnInfo.id not between", value1, value2, "id");
            return this;
        }

        public Criteria andDbIdIsNull() {
            addCriterion("columnInfo.db_id is null");
            return this;
        }

        public Criteria andDbIdIsNotNull() {
            addCriterion("columnInfo.db_id is not null");
            return this;
        }

        public Criteria andDbIdEqualTo(Long value) {
            addCriterion("columnInfo.db_id =", value, "dbId");
            return this;
        }

        public Criteria andDbIdNotEqualTo(Long value) {
            addCriterion("columnInfo.db_id <>", value, "dbId");
            return this;
        }

        public Criteria andDbIdGreaterThan(Long value) {
            addCriterion("columnInfo.db_id >", value, "dbId");
            return this;
        }

        public Criteria andDbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("columnInfo.db_id >=", value, "dbId");
            return this;
        }

        public Criteria andDbIdLessThan(Long value) {
            addCriterion("columnInfo.db_id <", value, "dbId");
            return this;
        }

        public Criteria andDbIdLessThanOrEqualTo(Long value) {
            addCriterion("columnInfo.db_id <=", value, "dbId");
            return this;
        }

        public Criteria andDbIdIn(List<Long> values) {
            addCriterion("columnInfo.db_id in", values, "dbId");
            return this;
        }

        public Criteria andDbIdNotIn(List<Long> values) {
            addCriterion("columnInfo.db_id not in", values, "dbId");
            return this;
        }

        public Criteria andDbIdBetween(Long value1, Long value2) {
            addCriterion("columnInfo.db_id between", value1, value2, "dbId");
            return this;
        }

        public Criteria andDbIdNotBetween(Long value1, Long value2) {
            addCriterion("columnInfo.db_id not between", value1, value2, "dbId");
            return this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("columnInfo.\"table_name\" is null");
            return this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("columnInfo.\"table_name\" is not null");
            return this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("columnInfo.\"table_name\" =", value, "tableName");
            return this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("columnInfo.\"table_name\" <>", value, "tableName");
            return this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("columnInfo.\"table_name\" >", value, "tableName");
            return this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("columnInfo.\"table_name\" >=", value, "tableName");
            return this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("columnInfo.\"table_name\" <", value, "tableName");
            return this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("columnInfo.\"table_name\" <=", value, "tableName");
            return this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("columnInfo.\"table_name\" like", value, "tableName");
            return this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("columnInfo.\"table_name\" not like", value, "tableName");
            return this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("columnInfo.\"table_name\" in", values, "tableName");
            return this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("columnInfo.\"table_name\" not in", values, "tableName");
            return this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("columnInfo.\"table_name\" between", value1, value2, "tableName");
            return this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("columnInfo.\"table_name\" not between", value1, value2, "tableName");
            return this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("columnInfo.\"type\" is null");
            return this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("columnInfo.\"type\" is not null");
            return this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("columnInfo.\"type\" =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("columnInfo.\"type\" <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("columnInfo.\"type\" >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("columnInfo.\"type\" >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("columnInfo.\"type\" <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("columnInfo.\"type\" <=", value, "type");
            return this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("columnInfo.\"type\" like", value, "type");
            return this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("columnInfo.\"type\" not like", value, "type");
            return this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("columnInfo.\"type\" in", values, "type");
            return this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("columnInfo.\"type\" not in", values, "type");
            return this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("columnInfo.\"type\" between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("columnInfo.\"type\" not between", value1, value2, "type");
            return this;
        }

        public Criteria andJavaTypeIsNull() {
            addCriterion("columnInfo.java_type is null");
            return this;
        }

        public Criteria andJavaTypeIsNotNull() {
            addCriterion("columnInfo.java_type is not null");
            return this;
        }

        public Criteria andJavaTypeEqualTo(String value) {
            addCriterion("columnInfo.java_type =", value, "javaType");
            return this;
        }

        public Criteria andJavaTypeNotEqualTo(String value) {
            addCriterion("columnInfo.java_type <>", value, "javaType");
            return this;
        }

        public Criteria andJavaTypeGreaterThan(String value) {
            addCriterion("columnInfo.java_type >", value, "javaType");
            return this;
        }

        public Criteria andJavaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("columnInfo.java_type >=", value, "javaType");
            return this;
        }

        public Criteria andJavaTypeLessThan(String value) {
            addCriterion("columnInfo.java_type <", value, "javaType");
            return this;
        }

        public Criteria andJavaTypeLessThanOrEqualTo(String value) {
            addCriterion("columnInfo.java_type <=", value, "javaType");
            return this;
        }

        public Criteria andJavaTypeLike(String value) {
            addCriterion("columnInfo.java_type like", value, "javaType");
            return this;
        }

        public Criteria andJavaTypeNotLike(String value) {
            addCriterion("columnInfo.java_type not like", value, "javaType");
            return this;
        }

        public Criteria andJavaTypeIn(List<String> values) {
            addCriterion("columnInfo.java_type in", values, "javaType");
            return this;
        }

        public Criteria andJavaTypeNotIn(List<String> values) {
            addCriterion("columnInfo.java_type not in", values, "javaType");
            return this;
        }

        public Criteria andJavaTypeBetween(String value1, String value2) {
            addCriterion("columnInfo.java_type between", value1, value2, "javaType");
            return this;
        }

        public Criteria andJavaTypeNotBetween(String value1, String value2) {
            addCriterion("columnInfo.java_type not between", value1, value2, "javaType");
            return this;
        }

        public Criteria andIsNullIsNull() {
            addCriterion("columnInfo.is_null is null");
            return this;
        }

        public Criteria andIsNullIsNotNull() {
            addCriterion("columnInfo.is_null is not null");
            return this;
        }

        public Criteria andIsNullEqualTo(String value) {
            addCriterion("columnInfo.is_null =", value, "isNull");
            return this;
        }

        public Criteria andIsNullNotEqualTo(String value) {
            addCriterion("columnInfo.is_null <>", value, "isNull");
            return this;
        }

        public Criteria andIsNullGreaterThan(String value) {
            addCriterion("columnInfo.is_null >", value, "isNull");
            return this;
        }

        public Criteria andIsNullGreaterThanOrEqualTo(String value) {
            addCriterion("columnInfo.is_null >=", value, "isNull");
            return this;
        }

        public Criteria andIsNullLessThan(String value) {
            addCriterion("columnInfo.is_null <", value, "isNull");
            return this;
        }

        public Criteria andIsNullLessThanOrEqualTo(String value) {
            addCriterion("columnInfo.is_null <=", value, "isNull");
            return this;
        }

        public Criteria andIsNullLike(String value) {
            addCriterion("columnInfo.is_null like", value, "isNull");
            return this;
        }

        public Criteria andIsNullNotLike(String value) {
            addCriterion("columnInfo.is_null not like", value, "isNull");
            return this;
        }

        public Criteria andIsNullIn(List<String> values) {
            addCriterion("columnInfo.is_null in", values, "isNull");
            return this;
        }

        public Criteria andIsNullNotIn(List<String> values) {
            addCriterion("columnInfo.is_null not in", values, "isNull");
            return this;
        }

        public Criteria andIsNullBetween(String value1, String value2) {
            addCriterion("columnInfo.is_null between", value1, value2, "isNull");
            return this;
        }

        public Criteria andIsNullNotBetween(String value1, String value2) {
            addCriterion("columnInfo.is_null not between", value1, value2, "isNull");
            return this;
        }

        public Criteria andDefaultValueIsNull() {
            addCriterion("columnInfo.default_value is null");
            return this;
        }

        public Criteria andDefaultValueIsNotNull() {
            addCriterion("columnInfo.default_value is not null");
            return this;
        }

        public Criteria andDefaultValueEqualTo(String value) {
            addCriterion("columnInfo.default_value =", value, "defaultValue");
            return this;
        }

        public Criteria andDefaultValueNotEqualTo(String value) {
            addCriterion("columnInfo.default_value <>", value, "defaultValue");
            return this;
        }

        public Criteria andDefaultValueGreaterThan(String value) {
            addCriterion("columnInfo.default_value >", value, "defaultValue");
            return this;
        }

        public Criteria andDefaultValueGreaterThanOrEqualTo(String value) {
            addCriterion("columnInfo.default_value >=", value, "defaultValue");
            return this;
        }

        public Criteria andDefaultValueLessThan(String value) {
            addCriterion("columnInfo.default_value <", value, "defaultValue");
            return this;
        }

        public Criteria andDefaultValueLessThanOrEqualTo(String value) {
            addCriterion("columnInfo.default_value <=", value, "defaultValue");
            return this;
        }

        public Criteria andDefaultValueLike(String value) {
            addCriterion("columnInfo.default_value like", value, "defaultValue");
            return this;
        }

        public Criteria andDefaultValueNotLike(String value) {
            addCriterion("columnInfo.default_value not like", value, "defaultValue");
            return this;
        }

        public Criteria andDefaultValueIn(List<String> values) {
            addCriterion("columnInfo.default_value in", values, "defaultValue");
            return this;
        }

        public Criteria andDefaultValueNotIn(List<String> values) {
            addCriterion("columnInfo.default_value not in", values, "defaultValue");
            return this;
        }

        public Criteria andDefaultValueBetween(String value1, String value2) {
            addCriterion("columnInfo.default_value between", value1, value2, "defaultValue");
            return this;
        }

        public Criteria andDefaultValueNotBetween(String value1, String value2) {
            addCriterion("columnInfo.default_value not between", value1, value2, "defaultValue");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("columnInfo.create_time is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("columnInfo.create_time is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("columnInfo.create_time =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("columnInfo.create_time <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("columnInfo.create_time >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("columnInfo.create_time >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("columnInfo.create_time <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("columnInfo.create_time <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("columnInfo.create_time in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("columnInfo.create_time not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("columnInfo.create_time between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("columnInfo.create_time not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("columnInfo.modify_time is null");
            return this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("columnInfo.modify_time is not null");
            return this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("columnInfo.modify_time =", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("columnInfo.modify_time <>", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("columnInfo.modify_time >", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("columnInfo.modify_time >=", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("columnInfo.modify_time <", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("columnInfo.modify_time <=", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("columnInfo.modify_time in", values, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("columnInfo.modify_time not in", values, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("columnInfo.modify_time between", value1, value2, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("columnInfo.modify_time not between", value1, value2, "modifyTime");
            return this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("columnInfo.create_user is null");
            return this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("columnInfo.create_user is not null");
            return this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("columnInfo.create_user =", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("columnInfo.create_user <>", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("columnInfo.create_user >", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("columnInfo.create_user >=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("columnInfo.create_user <", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("columnInfo.create_user <=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("columnInfo.create_user like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("columnInfo.create_user not like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("columnInfo.create_user in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("columnInfo.create_user not in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("columnInfo.create_user between", value1, value2, "createUser");
            return this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("columnInfo.create_user not between", value1, value2, "createUser");
            return this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("columnInfo.modify_user is null");
            return this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("columnInfo.modify_user is not null");
            return this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("columnInfo.modify_user =", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("columnInfo.modify_user <>", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("columnInfo.modify_user >", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("columnInfo.modify_user >=", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("columnInfo.modify_user <", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("columnInfo.modify_user <=", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("columnInfo.modify_user like", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("columnInfo.modify_user not like", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("columnInfo.modify_user in", values, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("columnInfo.modify_user not in", values, "modifyUser");
            return this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("columnInfo.modify_user between", value1, value2, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("columnInfo.modify_user not between", value1, value2, "modifyUser");
            return this;
        }

        public Criteria andYnIsNull() {
            addCriterion("columnInfo.yn is null");
            return this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("columnInfo.yn is not null");
            return this;
        }

        public Criteria andYnEqualTo(Integer value) {
            addCriterion("columnInfo.yn =", value, "yn");
            return this;
        }

        public Criteria andYnNotEqualTo(Integer value) {
            addCriterion("columnInfo.yn <>", value, "yn");
            return this;
        }

        public Criteria andYnGreaterThan(Integer value) {
            addCriterion("columnInfo.yn >", value, "yn");
            return this;
        }

        public Criteria andYnGreaterThanOrEqualTo(Integer value) {
            addCriterion("columnInfo.yn >=", value, "yn");
            return this;
        }

        public Criteria andYnLessThan(Integer value) {
            addCriterion("columnInfo.yn <", value, "yn");
            return this;
        }

        public Criteria andYnLessThanOrEqualTo(Integer value) {
            addCriterion("columnInfo.yn <=", value, "yn");
            return this;
        }

        public Criteria andYnIn(List<Integer> values) {
            addCriterion("columnInfo.yn in", values, "yn");
            return this;
        }

        public Criteria andYnNotIn(List<Integer> values) {
            addCriterion("columnInfo.yn not in", values, "yn");
            return this;
        }

        public Criteria andYnBetween(Integer value1, Integer value2) {
            addCriterion("columnInfo.yn between", value1, value2, "yn");
            return this;
        }

        public Criteria andYnNotBetween(Integer value1, Integer value2) {
            addCriterion("columnInfo.yn not between", value1, value2, "yn");
            return this;
        }
    }
}