package com.github.sumanit.devplatform.dto;

import com.github.sumanit.base.action.CreateAction;
import com.github.sumanit.devplatform.dto.base.TableInfoDTOBase;
import com.github.sumanit.devplatform.model.TableInfo;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class TableInfoDTO extends TableInfoDTOBase {
    public TableInfoDTO() {
        super();
    }

    public TableInfoDTO(TableInfo tableInfo) {
        super(tableInfo);
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    @NotBlank(message="{NotBlank.tableInfoDTO.name}",groups = {CreateAction.class})
    public String getName() {
        return super.getName();
    }

    @Override
    @NotBlank(message="{NotBlank.tableInfoDTO.schema}",groups = {CreateAction.class})
    public String getSchema() {
        return super.getSchema();
    }

    @Override
    @NotBlank(message="{NotBlank.tableInfoDTO.catalog}",groups = {CreateAction.class})
    public String getCatalog() {
        return super.getCatalog();
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
    @NotBlank(message="{NotBlank.tableInfoDTO.createUser}",groups = {CreateAction.class})
    public String getCreateUser() {
        return super.getCreateUser();
    }

    @Override
    @NotBlank(message="{NotBlank.tableInfoDTO.modifyUser}",groups = {CreateAction.class})
    public String getModifyUser() {
        return super.getModifyUser();
    }

    @Override
    @NotNull(message="{NotNull.tableInfoDTO.yn}",groups = {CreateAction.class})
    public Integer getYn() {
        return super.getYn();
    }
}