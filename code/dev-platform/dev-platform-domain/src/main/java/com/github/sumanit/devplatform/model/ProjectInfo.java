package com.github.sumanit.devplatform.model;

import com.github.sumanit.base.Model;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import java.util.Date;

public class ProjectInfo implements Model {
    @ApiParam(value = "(id) 等于该值")
    @ApiModelProperty(value="" ,required = true)
    private Long id;

    @ApiParam(value = "(name) 等于该值")
    @ApiModelProperty(value="" ,required = true)
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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