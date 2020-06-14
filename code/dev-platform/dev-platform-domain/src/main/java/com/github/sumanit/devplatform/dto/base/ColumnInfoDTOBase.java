package com.github.sumanit.devplatform.dto.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.sumanit.base.DTOInterface;
import com.github.sumanit.devplatform.model.ColumnInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import java.util.Date;
import java.util.List;

@ApiModel(value="ColumnInfoDTO-")
public class ColumnInfoDTOBase extends ColumnInfo implements DTOInterface<ColumnInfo> {
    private ColumnInfo columnInfo;

    @JsonIgnore
    @ApiParam(value = "自增主键(id) 在该数组中")
    private List<Long> id_arr;

    @JsonIgnore
    @ApiParam(value = "自增主键(id) 小于 该门限")
    private Long id_lt;

    @JsonIgnore
    @ApiParam(value = "自增主键(id) 小于等于 该门限")
    private Long id_lte;

    @JsonIgnore
    @ApiParam(value = "自增主键(id) 大于 该门限")
    private Long id_gt;

    @JsonIgnore
    @ApiParam(value = "自增主键(id) 大于等于 该门限")
    private Long id_gte;

    @JsonIgnore
    @ApiParam(value = "(dbId) 在该数组中")
    private List<Long> dbId_arr;

    @JsonIgnore
    @ApiParam(value = "(dbId) 小于 该门限")
    private Long dbId_lt;

    @JsonIgnore
    @ApiParam(value = "(dbId) 小于等于 该门限")
    private Long dbId_lte;

    @JsonIgnore
    @ApiParam(value = "(dbId) 大于 该门限")
    private Long dbId_gt;

    @JsonIgnore
    @ApiParam(value = "(dbId) 大于等于 该门限")
    private Long dbId_gte;

    @JsonIgnore
    @ApiParam(value = "(tableName) 在该数组中")
    private List<String> tableName_arr;

    @JsonIgnore
    @ApiParam(value = "(tableName) like 该值(需自己在前后加%)")
    private String tableName_like;

    @JsonIgnore
    @ApiParam(value = "(type) 在该数组中")
    private List<String> type_arr;

    @JsonIgnore
    @ApiParam(value = "(type) like 该值(需自己在前后加%)")
    private String type_like;

    @JsonIgnore
    @ApiParam(value = "(javaType) 在该数组中")
    private List<String> javaType_arr;

    @JsonIgnore
    @ApiParam(value = "(javaType) like 该值(需自己在前后加%)")
    private String javaType_like;

    @JsonIgnore
    @ApiParam(value = "(isNull) 在该数组中")
    private List<String> isNull_arr;

    @JsonIgnore
    @ApiParam(value = "(isNull) like 该值(需自己在前后加%)")
    private String isNull_like;

    @JsonIgnore
    @ApiParam(value = "(defaultValue) 在该数组中")
    private List<String> defaultValue_arr;

    @JsonIgnore
    @ApiParam(value = "(defaultValue) like 该值(需自己在前后加%)")
    private String defaultValue_like;

    @JsonIgnore
    @ApiParam(value = "(createTime) 在该数组中")
    private List<Date> createTime_arr;

    @JsonIgnore
    @ApiParam(value = "(createTime) 小于 该门限")
    private Date createTime_lt;

    @JsonIgnore
    @ApiParam(value = "(createTime) 小于等于 该门限")
    private Date createTime_lte;

    @JsonIgnore
    @ApiParam(value = "(createTime) 大于 该门限")
    private Date createTime_gt;

    @JsonIgnore
    @ApiParam(value = "(createTime) 大于等于 该门限")
    private Date createTime_gte;

    @JsonIgnore
    @ApiParam(value = "(modifyTime) 在该数组中")
    private List<Date> modifyTime_arr;

    @JsonIgnore
    @ApiParam(value = "(modifyTime) 小于 该门限")
    private Date modifyTime_lt;

    @JsonIgnore
    @ApiParam(value = "(modifyTime) 小于等于 该门限")
    private Date modifyTime_lte;

    @JsonIgnore
    @ApiParam(value = "(modifyTime) 大于 该门限")
    private Date modifyTime_gt;

    @JsonIgnore
    @ApiParam(value = "(modifyTime) 大于等于 该门限")
    private Date modifyTime_gte;

    @JsonIgnore
    @ApiParam(value = "(createUser) 在该数组中")
    private List<String> createUser_arr;

    @JsonIgnore
    @ApiParam(value = "(createUser) like 该值(需自己在前后加%)")
    private String createUser_like;

    @JsonIgnore
    @ApiParam(value = "(modifyUser) 在该数组中")
    private List<String> modifyUser_arr;

    @JsonIgnore
    @ApiParam(value = "(modifyUser) like 该值(需自己在前后加%)")
    private String modifyUser_like;

    @JsonIgnore
    @ApiParam(value = "(yn) 在该数组中")
    private List<Integer> yn_arr;

    @JsonIgnore
    @ApiParam(value = "(yn) 小于 该门限")
    private Integer yn_lt;

    @JsonIgnore
    @ApiParam(value = "(yn) 小于等于 该门限")
    private Integer yn_lte;

    @JsonIgnore
    @ApiParam(value = "(yn) 大于 该门限")
    private Integer yn_gt;

    @JsonIgnore
    @ApiParam(value = "(yn) 大于等于 该门限")
    private Integer yn_gte;

    public ColumnInfoDTOBase() {
        this(null);
    }

    public ColumnInfoDTOBase(ColumnInfo columnInfo) {
        if(columnInfo == null) {
            columnInfo = new ColumnInfo();
        }
        this.columnInfo = columnInfo;
    }

    @JsonIgnore
    public ColumnInfo getModel() {
        return columnInfo;
    }

    public void setModel(ColumnInfo columnInfo) {
        this.columnInfo = columnInfo;
    }

    public Long getId() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getId();
    }

    public void setId(Long id) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setId(id);
    }

    public Long getDbId() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getDbId();
    }

    public void setDbId(Long dbId) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setDbId(dbId);
    }

    public String getTableName() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getTableName();
    }

    public void setTableName(String tableName) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setTableName(tableName);
    }

    public String getType() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getType();
    }

    public void setType(String type) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setType(type);
    }

    public String getJavaType() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getJavaType();
    }

    public void setJavaType(String javaType) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setJavaType(javaType);
    }

    public String getIsNull() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getIsNull();
    }

    public void setIsNull(String isNull) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setIsNull(isNull);
    }

    public String getDefaultValue() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getDefaultValue();
    }

    public void setDefaultValue(String defaultValue) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setDefaultValue(defaultValue);
    }

    public Date getCreateTime() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getCreateTime();
    }

    public void setCreateTime(Date createTime) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setCreateTime(createTime);
    }

    public Date getModifyTime() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getModifyTime();
    }

    public void setModifyTime(Date modifyTime) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setModifyTime(modifyTime);
    }

    public String getCreateUser() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getCreateUser();
    }

    public void setCreateUser(String createUser) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setCreateUser(createUser);
    }

    public String getModifyUser() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getModifyUser();
    }

    public void setModifyUser(String modifyUser) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setModifyUser(modifyUser);
    }

    public Integer getYn() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getYn();
    }

    public void setYn(Integer yn) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setYn(yn);
    }

    public List<Long> getId_arr() {
        return id_arr;
    }

    public void setId_arr(List<Long> id_arr) {
        this.id_arr = id_arr;
    }

    public Long getId_lt() {
        return id_lt;
    }

    public void setId_lt(Long id_lt) {
        this.id_lt = id_lt;
    }

    public Long getId_lte() {
        return id_lte;
    }

    public void setId_lte(Long id_lte) {
        this.id_lte = id_lte;
    }

    public Long getId_gt() {
        return id_gt;
    }

    public void setId_gt(Long id_gt) {
        this.id_gt = id_gt;
    }

    public Long getId_gte() {
        return id_gte;
    }

    public void setId_gte(Long id_gte) {
        this.id_gte = id_gte;
    }

    public List<Long> getDbId_arr() {
        return dbId_arr;
    }

    public void setDbId_arr(List<Long> dbId_arr) {
        this.dbId_arr = dbId_arr;
    }

    public Long getDbId_lt() {
        return dbId_lt;
    }

    public void setDbId_lt(Long dbId_lt) {
        this.dbId_lt = dbId_lt;
    }

    public Long getDbId_lte() {
        return dbId_lte;
    }

    public void setDbId_lte(Long dbId_lte) {
        this.dbId_lte = dbId_lte;
    }

    public Long getDbId_gt() {
        return dbId_gt;
    }

    public void setDbId_gt(Long dbId_gt) {
        this.dbId_gt = dbId_gt;
    }

    public Long getDbId_gte() {
        return dbId_gte;
    }

    public void setDbId_gte(Long dbId_gte) {
        this.dbId_gte = dbId_gte;
    }

    public List<String> getTableName_arr() {
        return tableName_arr;
    }

    public void setTableName_arr(List<String> tableName_arr) {
        this.tableName_arr = tableName_arr;
    }

    public String getTableName_like() {
        return tableName_like;
    }

    public void setTableName_like(String tableName_like) {
        this.tableName_like = tableName_like;
    }

    public List<String> getType_arr() {
        return type_arr;
    }

    public void setType_arr(List<String> type_arr) {
        this.type_arr = type_arr;
    }

    public String getType_like() {
        return type_like;
    }

    public void setType_like(String type_like) {
        this.type_like = type_like;
    }

    public List<String> getJavaType_arr() {
        return javaType_arr;
    }

    public void setJavaType_arr(List<String> javaType_arr) {
        this.javaType_arr = javaType_arr;
    }

    public String getJavaType_like() {
        return javaType_like;
    }

    public void setJavaType_like(String javaType_like) {
        this.javaType_like = javaType_like;
    }

    public List<String> getIsNull_arr() {
        return isNull_arr;
    }

    public void setIsNull_arr(List<String> isNull_arr) {
        this.isNull_arr = isNull_arr;
    }

    public String getIsNull_like() {
        return isNull_like;
    }

    public void setIsNull_like(String isNull_like) {
        this.isNull_like = isNull_like;
    }

    public List<String> getDefaultValue_arr() {
        return defaultValue_arr;
    }

    public void setDefaultValue_arr(List<String> defaultValue_arr) {
        this.defaultValue_arr = defaultValue_arr;
    }

    public String getDefaultValue_like() {
        return defaultValue_like;
    }

    public void setDefaultValue_like(String defaultValue_like) {
        this.defaultValue_like = defaultValue_like;
    }

    public List<Date> getCreateTime_arr() {
        return createTime_arr;
    }

    public void setCreateTime_arr(List<Date> createTime_arr) {
        this.createTime_arr = createTime_arr;
    }

    public Date getCreateTime_lt() {
        return createTime_lt;
    }

    public void setCreateTime_lt(Date createTime_lt) {
        this.createTime_lt = createTime_lt;
    }

    public Date getCreateTime_lte() {
        return createTime_lte;
    }

    public void setCreateTime_lte(Date createTime_lte) {
        this.createTime_lte = createTime_lte;
    }

    public Date getCreateTime_gt() {
        return createTime_gt;
    }

    public void setCreateTime_gt(Date createTime_gt) {
        this.createTime_gt = createTime_gt;
    }

    public Date getCreateTime_gte() {
        return createTime_gte;
    }

    public void setCreateTime_gte(Date createTime_gte) {
        this.createTime_gte = createTime_gte;
    }

    public List<Date> getModifyTime_arr() {
        return modifyTime_arr;
    }

    public void setModifyTime_arr(List<Date> modifyTime_arr) {
        this.modifyTime_arr = modifyTime_arr;
    }

    public Date getModifyTime_lt() {
        return modifyTime_lt;
    }

    public void setModifyTime_lt(Date modifyTime_lt) {
        this.modifyTime_lt = modifyTime_lt;
    }

    public Date getModifyTime_lte() {
        return modifyTime_lte;
    }

    public void setModifyTime_lte(Date modifyTime_lte) {
        this.modifyTime_lte = modifyTime_lte;
    }

    public Date getModifyTime_gt() {
        return modifyTime_gt;
    }

    public void setModifyTime_gt(Date modifyTime_gt) {
        this.modifyTime_gt = modifyTime_gt;
    }

    public Date getModifyTime_gte() {
        return modifyTime_gte;
    }

    public void setModifyTime_gte(Date modifyTime_gte) {
        this.modifyTime_gte = modifyTime_gte;
    }

    public List<String> getCreateUser_arr() {
        return createUser_arr;
    }

    public void setCreateUser_arr(List<String> createUser_arr) {
        this.createUser_arr = createUser_arr;
    }

    public String getCreateUser_like() {
        return createUser_like;
    }

    public void setCreateUser_like(String createUser_like) {
        this.createUser_like = createUser_like;
    }

    public List<String> getModifyUser_arr() {
        return modifyUser_arr;
    }

    public void setModifyUser_arr(List<String> modifyUser_arr) {
        this.modifyUser_arr = modifyUser_arr;
    }

    public String getModifyUser_like() {
        return modifyUser_like;
    }

    public void setModifyUser_like(String modifyUser_like) {
        this.modifyUser_like = modifyUser_like;
    }

    public List<Integer> getYn_arr() {
        return yn_arr;
    }

    public void setYn_arr(List<Integer> yn_arr) {
        this.yn_arr = yn_arr;
    }

    public Integer getYn_lt() {
        return yn_lt;
    }

    public void setYn_lt(Integer yn_lt) {
        this.yn_lt = yn_lt;
    }

    public Integer getYn_lte() {
        return yn_lte;
    }

    public void setYn_lte(Integer yn_lte) {
        this.yn_lte = yn_lte;
    }

    public Integer getYn_gt() {
        return yn_gt;
    }

    public void setYn_gt(Integer yn_gt) {
        this.yn_gt = yn_gt;
    }

    public Integer getYn_gte() {
        return yn_gte;
    }

    public void setYn_gte(Integer yn_gte) {
        this.yn_gte = yn_gte;
    }
}