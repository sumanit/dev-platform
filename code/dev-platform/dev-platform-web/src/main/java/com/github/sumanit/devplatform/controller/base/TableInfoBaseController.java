package com.github.sumanit.devplatform.controller.base;

import com.github.sumanit.base.BaseController;
import com.github.sumanit.base.QueryModel;
import com.github.sumanit.devplatform.dto.TableInfoDTO;
import com.github.sumanit.devplatform.model.TableInfo;
import com.github.sumanit.devplatform.model.TableInfoExample;
import com.github.sumanit.devplatform.service.adapter.TableInfoService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

@Api(tags="TableInfoBaseController")
public abstract class TableInfoBaseController extends BaseController<TableInfo, TableInfoDTO, TableInfoExample> {
    @Resource
    protected TableInfoService tableInfoService;

    @Override
    protected TableInfoExample getExample(TableInfoDTO tableInfoDTO, QueryModel queryModel) {
        TableInfoExample tableInfoExample = super.getExample(tableInfoDTO,queryModel);
        return tableInfoExample;
    }

    @Override
    protected void setPrimaryKey(TableInfoDTO tableInfoDTO, String primaryKey) {
    }

    @Override
    protected TableInfoService getService() {
        return tableInfoService;
    }
}