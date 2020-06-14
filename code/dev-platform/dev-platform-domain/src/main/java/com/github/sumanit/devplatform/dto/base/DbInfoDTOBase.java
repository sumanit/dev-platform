package com.github.sumanit.devplatform.dto.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.sumanit.base.DTOInterface;
import com.github.sumanit.devplatform.model.DbInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import java.util.Date;
import java.util.List;

@ApiModel(value="DbInfoDTO-")
public class DbInfoDTOBase extends DbInfo implements DTOInterface<DbInfo> {
    private DbInfo dbInfo;

    @JsonIgnore
    @ApiParam(value = "自增id(id) 在该数组中")
    private List<Long> id_arr;

    @JsonIgnore
    @ApiParam(value = "自增id(id) 小于 该门限")
    private Long id_lt;

    @JsonIgnore
    @ApiParam(value = "自增id(id) 小于等于 该门限")
    private Long id_lte;

    @JsonIgnore
    @ApiParam(value = "自增id(id) 大于 该门限")
    private Long id_gt;

    @JsonIgnore
    @ApiParam(value = "自增id(id) 大于等于 该门限")
    private Long id_gte;

    @JsonIgnore
    @ApiParam(value = "(name) 在该数组中")
    private List<String> name_arr;

    @JsonIgnore
    @ApiParam(value = "(name) like 该值(需自己在前后加%)")
    private String name_like;

    @JsonIgnore
    @ApiParam(value = "(type) 在该数组中")
    private List<Integer> type_arr;

    @JsonIgnore
    @ApiParam(value = "(type) 小于 该门限")
    private Integer type_lt;

    @JsonIgnore
    @ApiParam(value = "(type) 小于等于 该门限")
    private Integer type_lte;

    @JsonIgnore
    @ApiParam(value = "(type) 大于 该门限")
    private Integer type_gt;

    @JsonIgnore
    @ApiParam(value = "(type) 大于等于 该门限")
    private Integer type_gte;

    @JsonIgnore
    @ApiParam(value = "(host) 在该数组中")
    private List<String> host_arr;

    @JsonIgnore
    @ApiParam(value = "(host) like 该值(需自己在前后加%)")
    private String host_like;

    @JsonIgnore
    @ApiParam(value = "(port) 在该数组中")
    private List<Integer> port_arr;

    @JsonIgnore
    @ApiParam(value = "(port) 小于 该门限")
    private Integer port_lt;

    @JsonIgnore
    @ApiParam(value = "(port) 小于等于 该门限")
    private Integer port_lte;

    @JsonIgnore
    @ApiParam(value = "(port) 大于 该门限")
    private Integer port_gt;

    @JsonIgnore
    @ApiParam(value = "(port) 大于等于 该门限")
    private Integer port_gte;

    @JsonIgnore
    @ApiParam(value = "(userName) 在该数组中")
    private List<String> userName_arr;

    @JsonIgnore
    @ApiParam(value = "(userName) like 该值(需自己在前后加%)")
    private String userName_like;

    @JsonIgnore
    @ApiParam(value = "(password) 在该数组中")
    private List<String> password_arr;

    @JsonIgnore
    @ApiParam(value = "(password) like 该值(需自己在前后加%)")
    private String password_like;

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

    public DbInfoDTOBase() {
        this(null);
    }

    public DbInfoDTOBase(DbInfo dbInfo) {
        if(dbInfo == null) {
            dbInfo = new DbInfo();
        }
        this.dbInfo = dbInfo;
    }

    @JsonIgnore
    public DbInfo getModel() {
        return dbInfo;
    }

    public void setModel(DbInfo dbInfo) {
        this.dbInfo = dbInfo;
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

    public String getName() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getName();
    }

    public void setName(String name) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setName(name);
    }

    public Integer getType() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getType();
    }

    public void setType(Integer type) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setType(type);
    }

    public String getHost() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getHost();
    }

    public void setHost(String host) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setHost(host);
    }

    public Integer getPort() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getPort();
    }

    public void setPort(Integer port) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setPort(port);
    }

    public String getUserName() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getUserName();
    }

    public void setUserName(String userName) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setUserName(userName);
    }

    public String getPassword() {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        return this.getModel().getPassword();
    }

    public void setPassword(String password) {
        if(getModel() == null ){
            throw new RuntimeException("model is null");
        }
        this.getModel().setPassword(password);
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

    public List<String> getName_arr() {
        return name_arr;
    }

    public void setName_arr(List<String> name_arr) {
        this.name_arr = name_arr;
    }

    public String getName_like() {
        return name_like;
    }

    public void setName_like(String name_like) {
        this.name_like = name_like;
    }

    public List<Integer> getType_arr() {
        return type_arr;
    }

    public void setType_arr(List<Integer> type_arr) {
        this.type_arr = type_arr;
    }

    public Integer getType_lt() {
        return type_lt;
    }

    public void setType_lt(Integer type_lt) {
        this.type_lt = type_lt;
    }

    public Integer getType_lte() {
        return type_lte;
    }

    public void setType_lte(Integer type_lte) {
        this.type_lte = type_lte;
    }

    public Integer getType_gt() {
        return type_gt;
    }

    public void setType_gt(Integer type_gt) {
        this.type_gt = type_gt;
    }

    public Integer getType_gte() {
        return type_gte;
    }

    public void setType_gte(Integer type_gte) {
        this.type_gte = type_gte;
    }

    public List<String> getHost_arr() {
        return host_arr;
    }

    public void setHost_arr(List<String> host_arr) {
        this.host_arr = host_arr;
    }

    public String getHost_like() {
        return host_like;
    }

    public void setHost_like(String host_like) {
        this.host_like = host_like;
    }

    public List<Integer> getPort_arr() {
        return port_arr;
    }

    public void setPort_arr(List<Integer> port_arr) {
        this.port_arr = port_arr;
    }

    public Integer getPort_lt() {
        return port_lt;
    }

    public void setPort_lt(Integer port_lt) {
        this.port_lt = port_lt;
    }

    public Integer getPort_lte() {
        return port_lte;
    }

    public void setPort_lte(Integer port_lte) {
        this.port_lte = port_lte;
    }

    public Integer getPort_gt() {
        return port_gt;
    }

    public void setPort_gt(Integer port_gt) {
        this.port_gt = port_gt;
    }

    public Integer getPort_gte() {
        return port_gte;
    }

    public void setPort_gte(Integer port_gte) {
        this.port_gte = port_gte;
    }

    public List<String> getUserName_arr() {
        return userName_arr;
    }

    public void setUserName_arr(List<String> userName_arr) {
        this.userName_arr = userName_arr;
    }

    public String getUserName_like() {
        return userName_like;
    }

    public void setUserName_like(String userName_like) {
        this.userName_like = userName_like;
    }

    public List<String> getPassword_arr() {
        return password_arr;
    }

    public void setPassword_arr(List<String> password_arr) {
        this.password_arr = password_arr;
    }

    public String getPassword_like() {
        return password_like;
    }

    public void setPassword_like(String password_like) {
        this.password_like = password_like;
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