package com.github.sumanit.devplatform.model;

import com.github.sumanit.base.BaseExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DbInfoExample extends BaseExample<DbInfoExample.Criteria> {
    public static final String COLUMN_ID = "id";

    public static final String FIELD_ID = "id";

    public static final String COLUMN_NAME = "name";

    public static final String FIELD_NAME = "name";

    public static final String COLUMN_TYPE = "type";

    public static final String FIELD_TYPE = "type";

    public static final String COLUMN_HOST = "host";

    public static final String FIELD_HOST = "host";

    public static final String COLUMN_PORT = "port";

    public static final String FIELD_PORT = "port";

    public static final String COLUMN_USERNAME = "user_name";

    public static final String FIELD_USERNAME = "userName";

    public static final String COLUMN_PASSWORD = "password";

    public static final String FIELD_PASSWORD = "password";

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

    public DbInfoExample() {
        oredCriteria = new ArrayList<>();
        tableName = "db_info";
        tableAlias = "dbInfo";
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
            addColumnStr("dbInfo.id as dbInfo_id ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasNameColumn() {
            addColumnStr("dbInfo.\"name\" as \"dbInfo_name\" ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasTypeColumn() {
            addColumnStr("dbInfo.\"type\" as \"dbInfo_type\" ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasHostColumn() {
            addColumnStr("dbInfo.\"host\" as \"dbInfo_host\" ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasPortColumn() {
            addColumnStr("dbInfo.port as dbInfo_port ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasUserNameColumn() {
            addColumnStr("dbInfo.user_name as dbInfo_user_name ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasPasswordColumn() {
            addColumnStr("dbInfo.\"password\" as \"dbInfo_password\" ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasCreateTimeColumn() {
            addColumnStr("dbInfo.create_time as dbInfo_create_time ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasModifyTimeColumn() {
            addColumnStr("dbInfo.modify_time as dbInfo_modify_time ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasCreateUserColumn() {
            addColumnStr("dbInfo.create_user as dbInfo_create_user ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasModifyUserColumn() {
            addColumnStr("dbInfo.modify_user as dbInfo_modify_user ");
            return (ColumnContainer) this;
        }

        public ColumnContainer hasYnColumn() {
            addColumnStr("dbInfo.yn as dbInfo_yn ");
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
            addCriterion("dbInfo.id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("dbInfo.id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("dbInfo.id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("dbInfo.id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("dbInfo.id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dbInfo.id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("dbInfo.id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("dbInfo.id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("dbInfo.id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("dbInfo.id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("dbInfo.id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("dbInfo.id not between", value1, value2, "id");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("dbInfo.\"name\" is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("dbInfo.\"name\" is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("dbInfo.\"name\" =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("dbInfo.\"name\" <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("dbInfo.\"name\" >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("dbInfo.\"name\" >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("dbInfo.\"name\" <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("dbInfo.\"name\" <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("dbInfo.\"name\" like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("dbInfo.\"name\" not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("dbInfo.\"name\" in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("dbInfo.\"name\" not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("dbInfo.\"name\" between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("dbInfo.\"name\" not between", value1, value2, "name");
            return this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("dbInfo.\"type\" is null");
            return this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("dbInfo.\"type\" is not null");
            return this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("dbInfo.\"type\" =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("dbInfo.\"type\" <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("dbInfo.\"type\" >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbInfo.\"type\" >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("dbInfo.\"type\" <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dbInfo.\"type\" <=", value, "type");
            return this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("dbInfo.\"type\" in", values, "type");
            return this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("dbInfo.\"type\" not in", values, "type");
            return this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("dbInfo.\"type\" between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dbInfo.\"type\" not between", value1, value2, "type");
            return this;
        }

        public Criteria andHostIsNull() {
            addCriterion("dbInfo.\"host\" is null");
            return this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("dbInfo.\"host\" is not null");
            return this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("dbInfo.\"host\" =", value, "host");
            return this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("dbInfo.\"host\" <>", value, "host");
            return this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("dbInfo.\"host\" >", value, "host");
            return this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("dbInfo.\"host\" >=", value, "host");
            return this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("dbInfo.\"host\" <", value, "host");
            return this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("dbInfo.\"host\" <=", value, "host");
            return this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("dbInfo.\"host\" like", value, "host");
            return this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("dbInfo.\"host\" not like", value, "host");
            return this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("dbInfo.\"host\" in", values, "host");
            return this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("dbInfo.\"host\" not in", values, "host");
            return this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("dbInfo.\"host\" between", value1, value2, "host");
            return this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("dbInfo.\"host\" not between", value1, value2, "host");
            return this;
        }

        public Criteria andPortIsNull() {
            addCriterion("dbInfo.port is null");
            return this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("dbInfo.port is not null");
            return this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("dbInfo.port =", value, "port");
            return this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("dbInfo.port <>", value, "port");
            return this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("dbInfo.port >", value, "port");
            return this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbInfo.port >=", value, "port");
            return this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("dbInfo.port <", value, "port");
            return this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("dbInfo.port <=", value, "port");
            return this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("dbInfo.port in", values, "port");
            return this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("dbInfo.port not in", values, "port");
            return this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("dbInfo.port between", value1, value2, "port");
            return this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("dbInfo.port not between", value1, value2, "port");
            return this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("dbInfo.user_name is null");
            return this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("dbInfo.user_name is not null");
            return this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("dbInfo.user_name =", value, "userName");
            return this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("dbInfo.user_name <>", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("dbInfo.user_name >", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("dbInfo.user_name >=", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("dbInfo.user_name <", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("dbInfo.user_name <=", value, "userName");
            return this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("dbInfo.user_name like", value, "userName");
            return this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("dbInfo.user_name not like", value, "userName");
            return this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("dbInfo.user_name in", values, "userName");
            return this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("dbInfo.user_name not in", values, "userName");
            return this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("dbInfo.user_name between", value1, value2, "userName");
            return this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("dbInfo.user_name not between", value1, value2, "userName");
            return this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("dbInfo.\"password\" is null");
            return this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("dbInfo.\"password\" is not null");
            return this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("dbInfo.\"password\" =", value, "password");
            return this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("dbInfo.\"password\" <>", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("dbInfo.\"password\" >", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("dbInfo.\"password\" >=", value, "password");
            return this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("dbInfo.\"password\" <", value, "password");
            return this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("dbInfo.\"password\" <=", value, "password");
            return this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("dbInfo.\"password\" like", value, "password");
            return this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("dbInfo.\"password\" not like", value, "password");
            return this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("dbInfo.\"password\" in", values, "password");
            return this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("dbInfo.\"password\" not in", values, "password");
            return this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("dbInfo.\"password\" between", value1, value2, "password");
            return this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("dbInfo.\"password\" not between", value1, value2, "password");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("dbInfo.create_time is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("dbInfo.create_time is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("dbInfo.create_time =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("dbInfo.create_time <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("dbInfo.create_time >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dbInfo.create_time >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("dbInfo.create_time <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dbInfo.create_time <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("dbInfo.create_time in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("dbInfo.create_time not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("dbInfo.create_time between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dbInfo.create_time not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("dbInfo.modify_time is null");
            return this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("dbInfo.modify_time is not null");
            return this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("dbInfo.modify_time =", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("dbInfo.modify_time <>", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("dbInfo.modify_time >", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dbInfo.modify_time >=", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("dbInfo.modify_time <", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("dbInfo.modify_time <=", value, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("dbInfo.modify_time in", values, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("dbInfo.modify_time not in", values, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("dbInfo.modify_time between", value1, value2, "modifyTime");
            return this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("dbInfo.modify_time not between", value1, value2, "modifyTime");
            return this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("dbInfo.create_user is null");
            return this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("dbInfo.create_user is not null");
            return this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("dbInfo.create_user =", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("dbInfo.create_user <>", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("dbInfo.create_user >", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("dbInfo.create_user >=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("dbInfo.create_user <", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("dbInfo.create_user <=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("dbInfo.create_user like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("dbInfo.create_user not like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("dbInfo.create_user in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("dbInfo.create_user not in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("dbInfo.create_user between", value1, value2, "createUser");
            return this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("dbInfo.create_user not between", value1, value2, "createUser");
            return this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("dbInfo.modify_user is null");
            return this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("dbInfo.modify_user is not null");
            return this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("dbInfo.modify_user =", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("dbInfo.modify_user <>", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("dbInfo.modify_user >", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("dbInfo.modify_user >=", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("dbInfo.modify_user <", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("dbInfo.modify_user <=", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("dbInfo.modify_user like", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("dbInfo.modify_user not like", value, "modifyUser");
            return this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("dbInfo.modify_user in", values, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("dbInfo.modify_user not in", values, "modifyUser");
            return this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("dbInfo.modify_user between", value1, value2, "modifyUser");
            return this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("dbInfo.modify_user not between", value1, value2, "modifyUser");
            return this;
        }

        public Criteria andYnIsNull() {
            addCriterion("dbInfo.yn is null");
            return this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("dbInfo.yn is not null");
            return this;
        }

        public Criteria andYnEqualTo(Integer value) {
            addCriterion("dbInfo.yn =", value, "yn");
            return this;
        }

        public Criteria andYnNotEqualTo(Integer value) {
            addCriterion("dbInfo.yn <>", value, "yn");
            return this;
        }

        public Criteria andYnGreaterThan(Integer value) {
            addCriterion("dbInfo.yn >", value, "yn");
            return this;
        }

        public Criteria andYnGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbInfo.yn >=", value, "yn");
            return this;
        }

        public Criteria andYnLessThan(Integer value) {
            addCriterion("dbInfo.yn <", value, "yn");
            return this;
        }

        public Criteria andYnLessThanOrEqualTo(Integer value) {
            addCriterion("dbInfo.yn <=", value, "yn");
            return this;
        }

        public Criteria andYnIn(List<Integer> values) {
            addCriterion("dbInfo.yn in", values, "yn");
            return this;
        }

        public Criteria andYnNotIn(List<Integer> values) {
            addCriterion("dbInfo.yn not in", values, "yn");
            return this;
        }

        public Criteria andYnBetween(Integer value1, Integer value2) {
            addCriterion("dbInfo.yn between", value1, value2, "yn");
            return this;
        }

        public Criteria andYnNotBetween(Integer value1, Integer value2) {
            addCriterion("dbInfo.yn not between", value1, value2, "yn");
            return this;
        }
    }
}