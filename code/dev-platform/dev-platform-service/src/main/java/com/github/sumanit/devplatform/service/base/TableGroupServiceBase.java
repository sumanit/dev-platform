package com.github.sumanit.devplatform.service.base;

import com.github.sumanit.base.BaseServiceImpl;
import com.github.sumanit.base.Mapper;
import com.github.sumanit.base.QueryModel;
import com.github.sumanit.devplatform.dto.TableGroupDTO;
import com.github.sumanit.devplatform.mapper.TableGroupMapper;
import com.github.sumanit.devplatform.model.TableGroup;
import com.github.sumanit.devplatform.model.TableGroupExample;
import com.github.sumanit.devplatform.service.adapter.TableGroupService;
import java.util.List;
import javax.annotation.Resource;

public abstract class TableGroupServiceBase extends BaseServiceImpl<TableGroup, TableGroupDTO, TableGroupExample> implements TableGroupService {
    @Resource
    private TableGroupMapper tableGroupMapper;

    @Override
    public Mapper<TableGroup, TableGroupExample> getMapper() {
        return tableGroupMapper;
    }

    @Override
    public TableGroupExample buildExample(TableGroupDTO tableGroupDTO, QueryModel queryModel) {
        TableGroupExample tableGroupExample = new TableGroupExample();
        TableGroupExample.Criteria criteria = tableGroupExample.createCriteria();
        if(tableGroupDTO.getId() != null) {
            criteria.andIdEqualTo(tableGroupDTO.getId());
        }
        if(tableGroupDTO.getId_arr() != null) {
            criteria.andIdIn(tableGroupDTO.getId_arr());
        }
        if(tableGroupDTO.getId_gt() != null) {
            criteria.andIdGreaterThan(tableGroupDTO.getId_gt());
        }
        if(tableGroupDTO.getId_lt() != null) {
            criteria.andIdLessThan(tableGroupDTO.getId_lt());
        }
        if(tableGroupDTO.getId_gte() != null) {
            criteria.andIdGreaterThanOrEqualTo(tableGroupDTO.getId_gte());
        }
        if(tableGroupDTO.getId_lte() != null) {
            criteria.andIdLessThanOrEqualTo(tableGroupDTO.getId_lte());
        }
        if(tableGroupDTO.getPid() != null) {
            criteria.andPidEqualTo(tableGroupDTO.getPid());
        }
        if(tableGroupDTO.getPid_arr() != null) {
            criteria.andPidIn(tableGroupDTO.getPid_arr());
        }
        if(tableGroupDTO.getPid_gt() != null) {
            criteria.andPidGreaterThan(tableGroupDTO.getPid_gt());
        }
        if(tableGroupDTO.getPid_lt() != null) {
            criteria.andPidLessThan(tableGroupDTO.getPid_lt());
        }
        if(tableGroupDTO.getPid_gte() != null) {
            criteria.andPidGreaterThanOrEqualTo(tableGroupDTO.getPid_gte());
        }
        if(tableGroupDTO.getPid_lte() != null) {
            criteria.andPidLessThanOrEqualTo(tableGroupDTO.getPid_lte());
        }
        if(tableGroupDTO.getName() != null) {
            criteria.andNameEqualTo(tableGroupDTO.getName());
        }
        if(tableGroupDTO.getName_arr() != null) {
            criteria.andNameIn(tableGroupDTO.getName_arr());
        }
        if(tableGroupDTO.getName_like() != null) {
            criteria.andNameLike(tableGroupDTO.getName_like());
        }
        if(tableGroupDTO.getCreateTime() != null) {
            criteria.andCreateTimeEqualTo(tableGroupDTO.getCreateTime());
        }
        if(tableGroupDTO.getCreateTime_arr() != null) {
            criteria.andCreateTimeIn(tableGroupDTO.getCreateTime_arr());
        }
        if(tableGroupDTO.getCreateTime_gt() != null) {
            criteria.andCreateTimeGreaterThan(tableGroupDTO.getCreateTime_gt());
        }
        if(tableGroupDTO.getCreateTime_lt() != null) {
            criteria.andCreateTimeLessThan(tableGroupDTO.getCreateTime_lt());
        }
        if(tableGroupDTO.getCreateTime_gte() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(tableGroupDTO.getCreateTime_gte());
        }
        if(tableGroupDTO.getCreateTime_lte() != null) {
            criteria.andCreateTimeLessThanOrEqualTo(tableGroupDTO.getCreateTime_lte());
        }
        if(tableGroupDTO.getModifyTime() != null) {
            criteria.andModifyTimeEqualTo(tableGroupDTO.getModifyTime());
        }
        if(tableGroupDTO.getModifyTime_arr() != null) {
            criteria.andModifyTimeIn(tableGroupDTO.getModifyTime_arr());
        }
        if(tableGroupDTO.getModifyTime_gt() != null) {
            criteria.andModifyTimeGreaterThan(tableGroupDTO.getModifyTime_gt());
        }
        if(tableGroupDTO.getModifyTime_lt() != null) {
            criteria.andModifyTimeLessThan(tableGroupDTO.getModifyTime_lt());
        }
        if(tableGroupDTO.getModifyTime_gte() != null) {
            criteria.andModifyTimeGreaterThanOrEqualTo(tableGroupDTO.getModifyTime_gte());
        }
        if(tableGroupDTO.getModifyTime_lte() != null) {
            criteria.andModifyTimeLessThanOrEqualTo(tableGroupDTO.getModifyTime_lte());
        }
        if(tableGroupDTO.getCreateUser() != null) {
            criteria.andCreateUserEqualTo(tableGroupDTO.getCreateUser());
        }
        if(tableGroupDTO.getCreateUser_arr() != null) {
            criteria.andCreateUserIn(tableGroupDTO.getCreateUser_arr());
        }
        if(tableGroupDTO.getCreateUser_like() != null) {
            criteria.andCreateUserLike(tableGroupDTO.getCreateUser_like());
        }
        if(tableGroupDTO.getModifyUser() != null) {
            criteria.andModifyUserEqualTo(tableGroupDTO.getModifyUser());
        }
        if(tableGroupDTO.getModifyUser_arr() != null) {
            criteria.andModifyUserIn(tableGroupDTO.getModifyUser_arr());
        }
        if(tableGroupDTO.getModifyUser_like() != null) {
            criteria.andModifyUserLike(tableGroupDTO.getModifyUser_like());
        }
        if(tableGroupDTO.getYn() != null) {
            criteria.andYnEqualTo(tableGroupDTO.getYn());
        }
        if(tableGroupDTO.getYn_arr() != null) {
            criteria.andYnIn(tableGroupDTO.getYn_arr());
        }
        if(tableGroupDTO.getYn_gt() != null) {
            criteria.andYnGreaterThan(tableGroupDTO.getYn_gt());
        }
        if(tableGroupDTO.getYn_lt() != null) {
            criteria.andYnLessThan(tableGroupDTO.getYn_lt());
        }
        if(tableGroupDTO.getYn_gte() != null) {
            criteria.andYnGreaterThanOrEqualTo(tableGroupDTO.getYn_gte());
        }
        if(tableGroupDTO.getYn_lte() != null) {
            criteria.andYnLessThanOrEqualTo(tableGroupDTO.getYn_lte());
        }
        return tableGroupExample;
    }

    public void buildComplexProperty(TableGroupExample tableGroupExample, List<TableGroup> tableGroups) {
    }
}