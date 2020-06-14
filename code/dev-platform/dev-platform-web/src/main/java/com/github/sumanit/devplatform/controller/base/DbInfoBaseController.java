package com.github.sumanit.devplatform.controller.base;

import com.github.sumanit.base.BaseController;
import com.github.sumanit.base.QueryModel;
import com.github.sumanit.devplatform.dto.DbInfoDTO;
import com.github.sumanit.devplatform.model.DbInfo;
import com.github.sumanit.devplatform.model.DbInfoExample;
import com.github.sumanit.devplatform.service.adapter.DbInfoService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;

@Api(tags="DbInfoBaseController")
public abstract class DbInfoBaseController extends BaseController<DbInfo, DbInfoDTO, DbInfoExample> {
    @Resource
    protected DbInfoService dbInfoService;

    @Override
    protected DbInfoExample getExample(DbInfoDTO dbInfoDTO, QueryModel queryModel) {
        DbInfoExample dbInfoExample = super.getExample(dbInfoDTO,queryModel);
        return dbInfoExample;
    }

    @Override
    protected void setPrimaryKey(DbInfoDTO dbInfoDTO, String primaryKey) {
    }

    @Override
    protected DbInfoService getService() {
        return dbInfoService;
    }
}