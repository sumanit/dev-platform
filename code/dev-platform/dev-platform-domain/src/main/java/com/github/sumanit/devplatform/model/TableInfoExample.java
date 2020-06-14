package com.github.sumanit.devplatform.model;

import com.github.sumanit.base.BaseExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TableInfoExample extends BaseExample<TableInfoExample.Criteria> {
    public static final String COLUMN_ID = "id";

    public static final String FIELD_ID = "id";

    public static final String COLUMN_NAME = "name";

    public static final String FIELD_NAME = "name";

    public static final String COLUMN_SCHEMA = "schema";

    public static final String FIELD_SCHEMA = "schema";

    public static final String COLUMN_CATALOG = "catalog";

    public static final String FIELD_CATALOG = "catalog";

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

    public TableInfoExample() {
        oredCriteria = new ArrayList<>();
        tableName = "table_info";
        tableAlias = "tableInfo";
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
            addColumnStr("tableInfo.id as tableInfo_id ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasNameColumn() {
            addColumnStr("tableInfo.\"name\" as \"tableInfo_name\" ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasSchemaColumn() {
            addColumnStr("tableInfo.\"schema\" as \"tableInfo_schema\" ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasCatalogColumn() {
            addColumnStr("tableInfo.\"catalog\" as \"tableInfo_catalog\" ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasCreateTimeColumn() {
            addColumnStr("tableInfo.create_time as tableInfo_create_time ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasModifyTimeColumn() {
            addColumnStr("tableInfo.modify_time as tableInfo_modify_time ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasCreateUserColumn() {
            addColumnStr("tableInfo.create_user as tableInfo_create_user ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasModifyUserColumn() {
            addColumnStr("tableInfo.modify_user as tableInfo_modify_user ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasYnColumn() {
            addColumnStr("tableInfo.yn as tableInfo_yn ");
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
            addCriterion("tableInfo.id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("tableInfo.id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("tableInfo.id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("tableInfo.id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("tableInfo.id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tableInfo.id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("tableInfo.id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("tableInfo.id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("tableInfo.id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("tableInfo.id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("tableInfo.id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("tableInfo.id not between", value1, value2, "id");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("tableInfo.\"name\" is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("tableInfo.\"name\" is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("tableInfo.\"name\" =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("tableInfo.\"name\" <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("tableInfo.\"name\" >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("tableInfo.\"name\" >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("tableInfo.\"name\" <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("tableInfo.\"name\" <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("tableInfo.\"name\" like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("tableInfo.\"name\" not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("tableInfo.\"name\" in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("tableInfo.\"name\" not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("tableInfo.\"name\" between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("tableInfo.\"name\" not between", value1, value2, "name");
            return this;
        }

        public Criteria andSchemaIsNull() {
            addCriterion("tableInfo.\"schema\" is null");
            return this;
        }

        public Criteria andSchemaIsNotNull() {
            addCriterion("tableInfo.\"schema\" is not null");
            return this;
        }

        public Criteria andSchemaEqualTo(String value) {
            addCriterion("tableInfo.\"schema\" =", value, "schema");
            return this;
        }

        public Criteria andSchemaNotEqualTo(String value) {
            addCriterion("tableInfo.\"schema\" <>", value, "schema");
            return this;
        }

        public Criteria andSchemaGreaterThan(String value) {
            addCriterion("tableInfo.\"schema\" >", value, "schema");
            return this;
        }

        public Criteria andSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("tableInfo.\"schema\" >=", value, "schema");
            return this;
        }

        public Criteria andSchemaLessThan(String value) {
            addCriterion("tableInfo.\"schema\" <", value, "schema");
            return this;
        }

        public Criteria andSchemaLessThanOrEqualTo(String value) {
            addCriterion("tableInfo.\"schema\" <=", value, "schema");
            return this;
        }

        public Criteria andSchemaLike(String value) {
            addCriterion("tableInfo.\"schema\" like", value, "schema");
            return this;
        }

        public Criteria andSchemaNotLike(String value) {
            addCriterion("tableInfo.\"schema\" not like", value, "schema");
            return this;
        }

        public Criteria andSchemaIn(List<String> values) {
            addCriterion("tableInfo.\"schema\" in", values, "schema");
            return this;
        }

        public Criteria andSchemaNotIn(List<String> values) {
            addCriterion("tableInfo.\"schema\" not in", values, "schema");
            return this;
        }

        public Criteria andSchemaBetween(String value1, String value2) {
            addCriterion("tableInfo.\"schema\" between", value1, value2, "schema");
            return this;
        }

        public Criteria andSchemaNotBetween(String value1, String value2) {
            addCriterion("tableInfo.\"schema\" not between", value1, value2, "schema");
            return this;
        }

        public Criteria andCatalogIsNull() {
            addCriterion("tableInfo.\"catalog\" is null");
            return this;
        }

        public Criteria andCatalogIsNotNull() {
            addCriterion("tableInfo.\"catalog\" is not null");
            return this;
        }

        public Criteria andCatalogEqualTo(String value) {
            addCriterion("tableInfo.\"catalog\" =", value, "catalog");
            return this;
        }

        public Criteria andCatalogNotEqualTo(String value) {
            addCriterion("tableInfo.\"catalog\" <>", value, "catalog");
            return this;
        }

        public Criteria andCatalogGreaterThan(String value) {
            addCriterion("tableInfo.\"catalog\" >", value, "catalog");
            return this;
        }

        public Criteria andCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("tableInfo.\"catalog\" >=", value, "catalog");
            return this;
        }

        public Criteria andCatalogLessThan(String value) {
            addCriterion("tableInfo.\"catalog\" <", value, "catalog");
            return this;
        }

        public Criteria andCatalogLessThanOrEqualTo(String value) {
            addCriterion("tableInfo.\"catalog\" <=", value, "catalog");
            return this;
        }

        public Criteria andCatalogLike(String value) {
            addCriterion("tableInfo.\"catalog\" like", value, "catalog");
            return this;
        }

        public Criteria andCatalogNotLike(String value) {
            addCriterion("tableInfo.\"catalog\" not like", value, "catalog");
            return this;
        }

        public Criteria andCatalogIn(List<String> values) {
            addCriterion("tableInfo.\"catalog\" in", values, "catalog");
            return this;
        }

        public Criteria andCatalogNotIn(List<String> values) {
            addCriterion("tableInfo.\"catalog\" not in", values, "catalog");
            return this;
        }

        public Criteria andCatalogBetween(String value1, String value2) {
            addCriterion("tableInfo.\"catalog\" between", value1, value2, "catalog");
            return this;
        }

        public Criteria andCatalogNotBetween(String value1, String value2) {
            addCriterion("tableInfo.\"catalog\" not between", value1, value2, "catalog");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("tableInfo.create_time is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("tableInfo.create_time is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("tableInfo.create_time =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("tableInfo.create_time <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("tableInfo.create_time >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tableInfo.create_time >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("tableInfo.create_time <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tableInfo.create_time <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("tableInfo.create_time in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("tableInfo.create_time not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("tableInfo.create_time between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tableInfo.create_time not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("tableInfo.modify_time is null");
            return this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("tableInfo.modify_time is not null");
            return this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("tableInfo.modify_time =", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("tableInfo.modify_time <>", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("tableInfo.modify_time >", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tableInfo.modify_time >=", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("tableInfo.modify_time <", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("tableInfo.modify_time <=", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("tableInfo.modify_time in", values, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("tableInfo.modify_time not in", values, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("tableInfo.modify_time between", value1, value2, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("tableInfo.modify_time not between", value1, value2, "modifyTime");
            return this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("tableInfo.create_user is null");
            return this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("tableInfo.create_user is not null");
            return this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("tableInfo.create_user =", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("tableInfo.create_user <>", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("tableInfo.create_user >", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("tableInfo.create_user >=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("tableInfo.create_user <", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("tableInfo.create_user <=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("tableInfo.create_user like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("tableInfo.create_user not like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("tableInfo.create_user in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("tableInfo.create_user not in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("tableInfo.create_user between", value1, value2, "createUser");
            return this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("tableInfo.create_user not between", value1, value2, "createUser");
            return this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("tableInfo.modify_user is null");
            return this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("tableInfo.modify_user is not null");
            return this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("tableInfo.modify_user =", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("tableInfo.modify_user <>", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("tableInfo.modify_user >", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("tableInfo.modify_user >=", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("tableInfo.modify_user <", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("tableInfo.modify_user <=", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("tableInfo.modify_user like", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("tableInfo.modify_user not like", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("tableInfo.modify_user in", values, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("tableInfo.modify_user not in", values, "modifyUser");
            return this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("tableInfo.modify_user between", value1, value2, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("tableInfo.modify_user not between", value1, value2, "modifyUser");
            return this;
        }

        public Criteria andYnIsNull() {
            addCriterion("tableInfo.yn is null");
            return this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("tableInfo.yn is not null");
            return this;
        }

        public Criteria andYnEqualTo(Integer value) {
            addCriterion("tableInfo.yn =", value, "yn");
            return this;
        }

        public Criteria andYnNotEqualTo(Integer value) {
            addCriterion("tableInfo.yn <>", value, "yn");
            return this;
        }

        public Criteria andYnGreaterThan(Integer value) {
            addCriterion("tableInfo.yn >", value, "yn");
            return this;
        }

        public Criteria andYnGreaterThanOrEqualTo(Integer value) {
            addCriterion("tableInfo.yn >=", value, "yn");
            return this;
        }

        public Criteria andYnLessThan(Integer value) {
            addCriterion("tableInfo.yn <", value, "yn");
            return this;
        }

        public Criteria andYnLessThanOrEqualTo(Integer value) {
            addCriterion("tableInfo.yn <=", value, "yn");
            return this;
        }

        public Criteria andYnIn(List<Integer> values) {
            addCriterion("tableInfo.yn in", values, "yn");
            return this;
        }

        public Criteria andYnNotIn(List<Integer> values) {
            addCriterion("tableInfo.yn not in", values, "yn");
            return this;
        }

        public Criteria andYnBetween(Integer value1, Integer value2) {
            addCriterion("tableInfo.yn between", value1, value2, "yn");
            return this;
        }

        public Criteria andYnNotBetween(Integer value1, Integer value2) {
            addCriterion("tableInfo.yn not between", value1, value2, "yn");
            return this;
        }
    }
}