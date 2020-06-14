package com.github.sumanit.devplatform.dto;

import com.github.sumanit.base.action.CreateAction;
import com.github.sumanit.devplatform.dto.base.TableGroupDTOBase;
import com.github.sumanit.devplatform.model.TableGroup;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class TableGroupDTO extends TableGroupDTOBase {
    public TableGroupDTO() {
        super();
    }

    public TableGroupDTO(TableGroup tableGroup) {
        super(tableGroup);
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    @NotNull(message="{NotNull.tableGroupDTO.pid}",groups = {CreateAction.class})
    public Long getPid() {
        return super.getPid();
    }

    @Override
    @NotBlank(message="{NotBlank.tableGroupDTO.name}",groups = {CreateAction.class})
    public String getName() {
        return super.getName();
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
    @NotBlank(message="{NotBlank.tableGroupDTO.createUser}",groups = {CreateAction.class})
    public String getCreateUser() {
        return super.getCreateUser();
    }

    @Override
    @NotBlank(message="{NotBlank.tableGroupDTO.modifyUser}",groups = {CreateAction.class})
    public String getModifyUser() {
        return super.getModifyUser();
    }

    @Override
    @NotNull(message="{NotNull.tableGroupDTO.yn}",groups = {CreateAction.class})
    public Integer getYn() {
        return super.getYn();
    }
}