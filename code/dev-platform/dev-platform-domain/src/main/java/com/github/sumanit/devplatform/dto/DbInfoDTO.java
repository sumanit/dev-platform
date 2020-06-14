package com.github.sumanit.devplatform.dto;

import com.github.sumanit.base.action.CreateAction;
import com.github.sumanit.devplatform.dto.base.DbInfoDTOBase;
import com.github.sumanit.devplatform.model.DbInfo;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class DbInfoDTO extends DbInfoDTOBase {
    public DbInfoDTO() {
        super();
    }

    public DbInfoDTO(DbInfo dbInfo) {
        super(dbInfo);
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    @NotBlank(message="{NotBlank.dbInfoDTO.name}",groups = {CreateAction.class})
    public String getName() {
        return super.getName();
    }

    @Override
    @NotNull(message="{NotNull.dbInfoDTO.type}",groups = {CreateAction.class})
    public Integer getType() {
        return super.getType();
    }

    @Override
    @NotBlank(message="{NotBlank.dbInfoDTO.host}",groups = {CreateAction.class})
    public String getHost() {
        return super.getHost();
    }

    @Override
    @NotNull(message="{NotNull.dbInfoDTO.port}",groups = {CreateAction.class})
    public Integer getPort() {
        return super.getPort();
    }

    @Override
    @NotBlank(message="{NotBlank.dbInfoDTO.userName}",groups = {CreateAction.class})
    public String getUserName() {
        return super.getUserName();
    }

    @Override
    @NotBlank(message="{NotBlank.dbInfoDTO.password}",groups = {CreateAction.class})
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public java.util.Date getCreateTime() {
        return super.getCreateTime();
    }

    @Override
    public java.util.Date getModifyTime() {
        return super.getModifyTime();
    }

    @Override
    @NotBlank(message="{NotBlank.dbInfoDTO.createUser}",groups = {CreateAction.class})
    public String getCreateUser() {
        return super.getCreateUser();
    }

    @Override
    @NotBlank(message="{NotBlank.dbInfoDTO.modifyUser}",groups = {CreateAction.class})
    public String getModifyUser() {
        return super.getModifyUser();
    }

    @Override
    @NotNull(message="{NotNull.dbInfoDTO.yn}",groups = {CreateAction.class})
    public Integer getYn() {
        return super.getYn();
    }
}