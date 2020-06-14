package com.github.sumanit.devplatform.dto;

import com.github.sumanit.base.action.CreateAction;
import com.github.sumanit.devplatform.dto.base.ProjectInfoDTOBase;
import com.github.sumanit.devplatform.model.ProjectInfo;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProjectInfoDTO extends ProjectInfoDTOBase {
    public ProjectInfoDTO() {
        super();
    }

    public ProjectInfoDTO(ProjectInfo projectInfo) {
        super(projectInfo);
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    @NotBlank(message="{NotBlank.projectInfoDTO.name}",groups = {CreateAction.class})
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
    @NotBlank(message="{NotBlank.projectInfoDTO.createUser}",groups = {CreateAction.class})
    public String getCreateUser() {
        return super.getCreateUser();
    }

    @Override
    @NotBlank(message="{NotBlank.projectInfoDTO.modifyUser}",groups = {CreateAction.class})
    public String getModifyUser() {
        return super.getModifyUser();
    }

    @Override
    @NotNull(message="{NotNull.projectInfoDTO.yn}",groups = {CreateAction.class})
    public Integer getYn() {
        return super.getYn();
    }
}