package com.github.sumanit.devplatform.dto;

import com.github.sumanit.base.action.CreateAction;
import com.github.sumanit.devplatform.dto.base.ColumnInfoDTOBase;
import com.github.sumanit.devplatform.model.ColumnInfo;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ColumnInfoDTO extends ColumnInfoDTOBase {
    public ColumnInfoDTO() {
        super();
    }

    public ColumnInfoDTO(ColumnInfo columnInfo) {
        super(columnInfo);
    }

    @Override
    @NotNull(message="{NotNull.columnInfoDTO.id}",groups = {CreateAction.class})
    public Long getId() {
        return super.getId();
    }

    @Override
    @NotNull(message="{NotNull.columnInfoDTO.dbId}",groups = {CreateAction.class})
    public Long getDbId() {
        return super.getDbId();
    }

    @Override
    @NotBlank(message="{NotBlank.columnInfoDTO.tableName}",groups = {CreateAction.class})
    public String getTableName() {
        return super.getTableName();
    }

    @Override
    @NotBlank(message="{NotBlank.columnInfoDTO.type}",groups = {CreateAction.class})
    public String getType() {
        return super.getType();
    }

    @Override
    @NotBlank(message="{NotBlank.columnInfoDTO.javaType}",groups = {CreateAction.class})
    public String getJavaType() {
        return super.getJavaType();
    }

    @Override
    @NotBlank(message="{NotBlank.columnInfoDTO.isNull}",groups = {CreateAction.class})
    public String getIsNull() {
        return super.getIsNull();
    }

    @Override
    @NotBlank(message="{NotBlank.columnInfoDTO.defaultValue}",groups = {CreateAction.class})
    public String getDefaultValue() {
        return super.getDefaultValue();
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
    @NotBlank(message="{NotBlank.columnInfoDTO.createUser}",groups = {CreateAction.class})
    public String getCreateUser() {
        return super.getCreateUser();
    }

    @Override
    @NotBlank(message="{NotBlank.columnInfoDTO.modifyUser}",groups = {CreateAction.class})
    public String getModifyUser() {
        return super.getModifyUser();
    }

    @Override
    @NotNull(message="{NotNull.columnInfoDTO.yn}",groups = {CreateAction.class})
    public Integer getYn() {
        return super.getYn();
    }
}