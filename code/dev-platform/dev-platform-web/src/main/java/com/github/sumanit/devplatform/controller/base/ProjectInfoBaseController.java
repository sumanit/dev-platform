package com.github.sumanit.devplatform.controller.base;

import com.github.sumanit.base.BaseController;
import com.github.sumanit.base.QueryModel;
import com.github.sumanit.devplatform.dto.ProjectInfoDTO;
import com.github.sumanit.devplatform.model.ProjectInfo;
import com.github.sumanit.devplatform.model.ProjectInfoExample;
import com.github.sumanit.devplatform.service.adapter.ProjectInfoService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

@Api(tags="ProjectInfoBaseController")
public abstract class ProjectInfoBaseController extends BaseController<ProjectInfo, ProjectInfoDTO, ProjectInfoExample> {
    @Resource
    protected ProjectInfoService projectInfoService;

    @Override
    protected ProjectInfoExample getExample(ProjectInfoDTO projectInfoDTO, QueryModel queryModel) {
        ProjectInfoExample projectInfoExample = super.getExample(projectInfoDTO,queryModel);
        return projectInfoExample;
    }

    @Override
    protected void setPrimaryKey(ProjectInfoDTO projectInfoDTO, String primaryKey) {
    }

    @Override
    protected ProjectInfoService getService() {
        return projectInfoService;
    }
}