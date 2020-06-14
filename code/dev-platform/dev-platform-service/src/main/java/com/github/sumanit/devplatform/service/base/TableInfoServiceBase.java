package com.github.sumanit.devplatform.service.base;

import com.github.sumanit.base.BaseServiceImpl;
import com.github.sumanit.base.Mapper;
import com.github.sumanit.base.QueryModel;
import com.github.sumanit.devplatform.dto.TableInfoDTO;
import com.github.sumanit.devplatform.mapper.TableInfoMapper;
import com.github.sumanit.devplatform.model.TableInfo;
import com.github.sumanit.devplatform.model.TableInfoExample;
import com.github.sumanit.devplatform.service.adapter.TableInfoService;
import java.util.List;
import javax.annotation.Resource;

public abstract class TableInfoServiceBase extends BaseServiceImpl<TableInfo, TableInfoDTO, TableInfoExample> implements TableInfoService {
    @Resource
    private TableInfoMapper tableInfoMapper;

    @Override
    public Mapper<TableInfo, TableInfoExample> getMapper() {
        return tableInfoMapper;
    }

    @Override
    public TableInfoExample buildExample(TableInfoDTO tableInfoDTO, QueryModel queryModel) {
        TableInfoExample tableInfoExample = new TableInfoExample();
        TableInfoExample.Criteria criteria = tableInfoExample.createCriteria();
        if(tableInfoDTO.getId() != null) {
            criteria.andIdEqualTo(tableInfoDTO.getId());
        }
        if(tableInfoDTO.getId_arr() != null) {
            criteria.andIdIn(tableInfoDTO.getId_arr());
        }
        if(tableInfoDTO.getId_gt() != null) {
            criteria.andIdGreaterThan(tableInfoDTO.getId_gt());
        }
        if(tableInfoDTO.getId_lt() != null) {
            criteria.andIdLessThan(tableInfoDTO.getId_lt());
        }
        if(tableInfoDTO.getId_gte() != null) {
            criteria.andIdGreaterThanOrEqualTo(tableInfoDTO.getId_gte());
        }
        if(tableInfoDTO.getId_lte() != null) {
            criteria.andIdLessThanOrEqualTo(tableInfoDTO.getId_lte());
        }
        if(tableInfoDTO.getName() != null) {
            criteria.andNameEqualTo(tableInfoDTO.getName());
        }
        if(tableInfoDTO.getName_arr() != null) {
            criteria.andNameIn(tableInfoDTO.getName_arr());
        }
        if(tableInfoDTO.getName_like() != null) {
            criteria.andNameLike(tableInfoDTO.getName_like());
        }
        if(tableInfoDTO.getSchema() != null) {
            criteria.andSchemaEqualTo(tableInfoDTO.getSchema());
        }
        if(tableInfoDTO.getSchema_arr() != null) {
            criteria.andSchemaIn(tableInfoDTO.getSchema_arr());
        }
        if(tableInfoDTO.getSchema_like() != null) {
            criteria.andSchemaLike(tableInfoDTO.getSchema_like());
        }
        if(tableInfoDTO.getCatalog() != null) {
            criteria.andCatalogEqualTo(tableInfoDTO.getCatalog());
        }
        if(tableInfoDTO.getCatalog_arr() != null) {
            criteria.andCatalogIn(tableInfoDTO.getCatalog_arr());
        }
        if(tableInfoDTO.getCatalog_like() != null) {
            criteria.andCatalogLike(tableInfoDTO.getCatalog_like());
        }
        if(tableInfoDTO.getCreateTime() != null) {
            criteria.andCreateTimeEqualTo(tableInfoDTO.getCreateTime());
        }
        if(tableInfoDTO.getCreateTime_arr() != null) {
            criteria.andCreateTimeIn(tableInfoDTO.getCreateTime_arr());
        }
        if(tableInfoDTO.getCreateTime_gt() != null) {
            criteria.andCreateTimeGreaterThan(tableInfoDTO.getCreateTime_gt());
        }
        if(tableInfoDTO.getCreateTime_lt() != null) {
            criteria.andCreateTimeLessThan(tableInfoDTO.getCreateTime_lt());
        }
        if(tableInfoDTO.getCreateTime_gte() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(tableInfoDTO.getCreateTime_gte());
        }
        if(tableInfoDTO.getCreateTime_lte() != null) {
            criteria.andCreateTimeLessThanOrEqualTo(tableInfoDTO.getCreateTime_lte());
        }
        if(tableInfoDTO.getModifyTime() != null) {
            criteria.andModifyTimeEqualTo(tableInfoDTO.getModifyTime());
        }
        if(tableInfoDTO.getModifyTime_arr() != null) {
            criteria.andModifyTimeIn(tableInfoDTO.getModifyTime_arr());
        }
        if(tableInfoDTO.getModifyTime_gt() != null) {
            criteria.andModifyTimeGreaterThan(tableInfoDTO.getModifyTime_gt());
        }
        if(tableInfoDTO.getModifyTime_lt() != null) {
            criteria.andModifyTimeLessThan(tableInfoDTO.getModifyTime_lt());
        }
        if(tableInfoDTO.getModifyTime_gte() != null) {
            criteria.andModifyTimeGreaterThanOrEqualTo(tableInfoDTO.getModifyTime_gte());
        }
        if(tableInfoDTO.getModifyTime_lte() != null) {
            criteria.andModifyTimeLessThanOrEqualTo(tableInfoDTO.getModifyTime_lte());
        }
        if(tableInfoDTO.getCreateUser() != null) {
            criteria.andCreateUserEqualTo(tableInfoDTO.getCreateUser());
        }
        if(tableInfoDTO.getCreateUser_arr() != null) {
            criteria.andCreateUserIn(tableInfoDTO.getCreateUser_arr());
        }
        if(tableInfoDTO.getCreateUser_like() != null) {
            criteria.andCreateUserLike(tableInfoDTO.getCreateUser_like());
        }
        if(tableInfoDTO.getModifyUser() != null) {
            criteria.andModifyUserEqualTo(tableInfoDTO.getModifyUser());
        }
        if(tableInfoDTO.getModifyUser_arr() != null) {
            criteria.andModifyUserIn(tableInfoDTO.getModifyUser_arr());
        }
        if(tableInfoDTO.getModifyUser_like() != null) {
            criteria.andModifyUserLike(tableInfoDTO.getModifyUser_like());
        }
        if(tableInfoDTO.getYn() != null) {
            criteria.andYnEqualTo(tableInfoDTO.getYn());
        }
        if(tableInfoDTO.getYn_arr() != null) {
            criteria.andYnIn(tableInfoDTO.getYn_arr());
        }
        if(tableInfoDTO.getYn_gt() != null) {
            criteria.andYnGreaterThan(tableInfoDTO.getYn_gt());
        }
        if(tableInfoDTO.getYn_lt() != null) {
            criteria.andYnLessThan(tableInfoDTO.getYn_lt());
        }
        if(tableInfoDTO.getYn_gte() != null) {
            criteria.andYnGreaterThanOrEqualTo(tableInfoDTO.getYn_gte());
        }
        if(tableInfoDTO.getYn_lte() != null) {
            criteria.andYnLessThanOrEqualTo(tableInfoDTO.getYn_lte());
        }
        return tableInfoExample;
    }

    public void buildComplexProperty(TableInfoExample tableInfoExample, List<TableInfo> tableInfos) {
    }
}