package com.github.sumanit.devplatform.dto.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.sumanit.base.DTOInterface;
import com.github.sumanit.devplatform.model.ProjectInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import java.util.Date;
import java.util.List;

@ApiModel(value="ProjectInfoDTO-")
public class ProjectInfoDTOBase extends ProjectInfo implements DTOInterface<ProjectInfo> {
    private ProjectInfo projectInfo;

    @JsonIgnore
    @ApiParam(value = "(id) 在该数组中")
    private List<Long> id_arr;

    @JsonIgnore
    @ApiParam(value = "(id) 小于 该门限")
    private Long id_lt;

    @JsonIgnore
    @ApiParam(value = "(id) 小于等于 该门限")
    private Long id_lte;

    @JsonIgnore
    @ApiParam(value = "(id) 大于 该门限")
    private Long id_gt;

    @JsonIgnore
    @ApiParam(value = "(id) 大于等于 该门限")
    private Long id_gte;

    @JsonIgnore
    @ApiParam(value = "(name) 在该数组中")
    private List<String> name_arr;

    @JsonIgnore
    @ApiParam(value = "(name) like 该值(需自己在前后加%)")
    private String name_like;

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

    public ProjectInfoDTOBase() {
        this(null);
    }

    public ProjectInfoDTOBase(ProjectInfo projectInfo) {
        if(projectInfo == null) {
            projectInfo = new ProjectInfo();
        }
        this.projectInfo = projectInfo;
    }

    @JsonIgnore
    public ProjectInfo getModel() {
        return projectInfo;
    }

    public void setModel(ProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
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