package com.github.sumanit.devplatform.controller.base;

import com.github.sumanit.base.BaseController;
import com.github.sumanit.base.QueryModel;
import com.github.sumanit.devplatform.dto.TableGroupDTO;
import com.github.sumanit.devplatform.model.TableGroup;
import com.github.sumanit.devplatform.model.TableGroupExample;
import com.github.sumanit.devplatform.service.adapter.TableGroupService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

@Api(tags="TableGroupBaseController")
public abstract class TableGroupBaseController extends BaseController<TableGroup, TableGroupDTO, TableGroupExample> {
    @Resource
    protected TableGroupService tableGroupService;

    @Override
    protected TableGroupExample getExample(TableGroupDTO tableGroupDTO, QueryModel queryModel) {
        TableGroupExample tableGroupExample = super.getExample(tableGroupDTO,queryModel);
        return tableGroupExample;
    }

    @Override
    protected void setPrimaryKey(TableGroupDTO tableGroupDTO, String primaryKey) {
    }

    @Override
    protected TableGroupService getService() {
        return tableGroupService;
    }
}