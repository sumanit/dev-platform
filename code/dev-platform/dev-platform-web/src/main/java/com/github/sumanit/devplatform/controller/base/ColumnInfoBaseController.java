package com.github.sumanit.devplatform.controller.base;

import com.github.sumanit.base.BaseController;
import com.github.sumanit.base.QueryModel;
import com.github.sumanit.devplatform.dto.ColumnInfoDTO;
import com.github.sumanit.devplatform.model.ColumnInfo;
import com.github.sumanit.devplatform.model.ColumnInfoExample;
import com.github.sumanit.devplatform.service.adapter.ColumnInfoService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

@Api(tags="ColumnInfoBaseController")
public abstract class ColumnInfoBaseController extends BaseController<ColumnInfo, ColumnInfoDTO, ColumnInfoExample> {
    @Resource
    protected ColumnInfoService columnInfoService;

    @Override
    protected ColumnInfoExample getExample(ColumnInfoDTO columnInfoDTO, QueryModel queryModel) {
        ColumnInfoExample columnInfoExample = super.getExample(columnInfoDTO,queryModel);
        return columnInfoExample;
    }

    @Override
    protected void setPrimaryKey(ColumnInfoDTO columnInfoDTO, String primaryKey) {
    }

    @Override
    protected ColumnInfoService getService() {
        return columnInfoService;
    }
}