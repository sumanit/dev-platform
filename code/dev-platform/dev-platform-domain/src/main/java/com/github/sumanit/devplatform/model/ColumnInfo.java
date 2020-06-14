package com.github.sumanit.devplatform.model;

import com.github.sumanit.base.Model;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import java.util.Date;

public class ColumnInfo implements Model {
    @ApiParam(value = "自增主键(id) 等于该值")
    @ApiModelProperty(value="自增主键" ,required = true)
    private Long id;

    @ApiParam(value = "(dbId) 等于该值")
    @ApiModelProperty(value="" ,required = true)
    private Long dbId;

    @ApiParam(value = "(tableName) 等于该值")
    @ApiModelProperty(value="" ,required = true)
    private String tableName;

    @ApiParam(value = "(type) 等于该值")
    @ApiModelProperty(value="" ,required = true)
    private String type;

    @ApiParam(value = "(javaType) 等于该值")
    @ApiModelProperty(value="" ,required = true)
    private String javaType;

    @ApiParam(value = "(isNull) 等于该值")
    @ApiModelProperty(value="" ,required = true)
    private String isNull;

    @ApiParam(value = "(defaultValue) 等于该值")
    @ApiModelProperty(value="" ,required = true)
    private String defaultValue;

    @ApiParam(value = "(createTime) 等于该值")
    @ApiModelProperty(value="" )
    private Date createTime;

    @ApiParam(value = "(modifyTime) 等于该值")
    @ApiModelProperty(value="" )
    private Date modifyTime;

    @ApiParam(value = "(createUser) 等于该值")
    @ApiModelProperty(value="" ,required = true)
    private String createUser;

    @ApiParam(value = "(modifyUser) 等于该值")
    @ApiModelProperty(value="" ,required = true)
    private String modifyUser;

    @ApiParam(value = "(yn) 等于该值")
    @ApiModelProperty(value="" ,required = true)
    private Integer yn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDbId() {
        return dbId;
    }

    public void setDbId(Long dbId) {
        this.dbId = dbId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType == null ? null : javaType.trim();
    }

    public String getIsNull() {
        return isNull;
    }

    public void setIsNull(String isNull) {
        this.isNull = isNull == null ? null : isNull.trim();
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }
}