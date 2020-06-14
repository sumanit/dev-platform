package com.github.sumanit.devplatform.service.base;

import com.github.sumanit.base.BaseServiceImpl;
import com.github.sumanit.base.Mapper;
import com.github.sumanit.base.QueryModel;
import com.github.sumanit.devplatform.dto.DbInfoDTO;
import com.github.sumanit.devplatform.mapper.DbInfoMapper;
import com.github.sumanit.devplatform.model.DbInfo;
import com.github.sumanit.devplatform.model.DbInfoExample;
import com.github.sumanit.devplatform.service.adapter.DbInfoService;
import java.util.List;
import javax.annotation.Resource;

public abstract class DbInfoServiceBase extends BaseServiceImpl<DbInfo, DbInfoDTO, DbInfoExample> implements DbInfoService {
    @Resource
    private DbInfoMapper dbInfoMapper;

    @Override
    public Mapper<DbInfo, DbInfoExample> getMapper() {
        return dbInfoMapper;
    }

    @Override
    public DbInfoExample buildExample(DbInfoDTO dbInfoDTO, QueryModel queryModel) {
        DbInfoExample dbInfoExample = new DbInfoExample();
        DbInfoExample.Criteria criteria = dbInfoExample.createCriteria();
        if(dbInfoDTO.getId() != null) {
            criteria.andIdEqualTo(dbInfoDTO.getId());
        }
        if(dbInfoDTO.getId_arr() != null) {
            criteria.andIdIn(dbInfoDTO.getId_arr());
        }
        if(dbInfoDTO.getId_gt() != null) {
            criteria.andIdGreaterThan(dbInfoDTO.getId_gt());
        }
        if(dbInfoDTO.getId_lt() != null) {
            criteria.andIdLessThan(dbInfoDTO.getId_lt());
        }
        if(dbInfoDTO.getId_gte() != null) {
            criteria.andIdGreaterThanOrEqualTo(dbInfoDTO.getId_gte());
        }
        if(dbInfoDTO.getId_lte() != null) {
            criteria.andIdLessThanOrEqualTo(dbInfoDTO.getId_lte());
        }
        if(dbInfoDTO.getName() != null) {
            criteria.andNameEqualTo(dbInfoDTO.getName());
        }
        if(dbInfoDTO.getName_arr() != null) {
            criteria.andNameIn(dbInfoDTO.getName_arr());
        }
        if(dbInfoDTO.getName_like() != null) {
            criteria.andNameLike(dbInfoDTO.getName_like());
        }
        if(dbInfoDTO.getType() != null) {
            criteria.andTypeEqualTo(dbInfoDTO.getType());
        }
        if(dbInfoDTO.getType_arr() != null) {
            criteria.andTypeIn(dbInfoDTO.getType_arr());
        }
        if(dbInfoDTO.getType_gt() != null) {
            criteria.andTypeGreaterThan(dbInfoDTO.getType_gt());
        }
        if(dbInfoDTO.getType_lt() != null) {
            criteria.andTypeLessThan(dbInfoDTO.getType_lt());
        }
        if(dbInfoDTO.getType_gte() != null) {
            criteria.andTypeGreaterThanOrEqualTo(dbInfoDTO.getType_gte());
        }
        if(dbInfoDTO.getType_lte() != null) {
            criteria.andTypeLessThanOrEqualTo(dbInfoDTO.getType_lte());
        }
        if(dbInfoDTO.getHost() != null) {
            criteria.andHostEqualTo(dbInfoDTO.getHost());
        }
        if(dbInfoDTO.getHost_arr() != null) {
            criteria.andHostIn(dbInfoDTO.getHost_arr());
        }
        if(dbInfoDTO.getHost_like() != null) {
            criteria.andHostLike(dbInfoDTO.getHost_like());
        }
        if(dbInfoDTO.getPort() != null) {
            criteria.andPortEqualTo(dbInfoDTO.getPort());
        }
        if(dbInfoDTO.getPort_arr() != null) {
            criteria.andPortIn(dbInfoDTO.getPort_arr());
        }
        if(dbInfoDTO.getPort_gt() != null) {
            criteria.andPortGreaterThan(dbInfoDTO.getPort_gt());
        }
        if(dbInfoDTO.getPort_lt() != null) {
            criteria.andPortLessThan(dbInfoDTO.getPort_lt());
        }
        if(dbInfoDTO.getPort_gte() != null) {
            criteria.andPortGreaterThanOrEqualTo(dbInfoDTO.getPort_gte());
        }
        if(dbInfoDTO.getPort_lte() != null) {
            criteria.andPortLessThanOrEqualTo(dbInfoDTO.getPort_lte());
        }
        if(dbInfoDTO.getUserName() != null) {
            criteria.andUserNameEqualTo(dbInfoDTO.getUserName());
        }
        if(dbInfoDTO.getUserName_arr() != null) {
            criteria.andUserNameIn(dbInfoDTO.getUserName_arr());
        }
        if(dbInfoDTO.getUserName_like() != null) {
            criteria.andUserNameLike(dbInfoDTO.getUserName_like());
        }
        if(dbInfoDTO.getPassword() != null) {
            criteria.andPasswordEqualTo(dbInfoDTO.getPassword());
        }
        if(dbInfoDTO.getPassword_arr() != null) {
            criteria.andPasswordIn(dbInfoDTO.getPassword_arr());
        }
        if(dbInfoDTO.getPassword_like() != null) {
            criteria.andPasswordLike(dbInfoDTO.getPassword_like());
        }
        if(dbInfoDTO.getCreateTime() != null) {
            criteria.andCreateTimeEqualTo(dbInfoDTO.getCreateTime());
        }
        if(dbInfoDTO.getCreateTime_arr() != null) {
            criteria.andCreateTimeIn(dbInfoDTO.getCreateTime_arr());
        }
        if(dbInfoDTO.getCreateTime_gt() != null) {
            criteria.andCreateTimeGreaterThan(dbInfoDTO.getCreateTime_gt());
        }
        if(dbInfoDTO.getCreateTime_lt() != null) {
            criteria.andCreateTimeLessThan(dbInfoDTO.getCreateTime_lt());
        }
        if(dbInfoDTO.getCreateTime_gte() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(dbInfoDTO.getCreateTime_gte());
        }
        if(dbInfoDTO.getCreateTime_lte() != null) {
            criteria.andCreateTimeLessThanOrEqualTo(dbInfoDTO.getCreateTime_lte());
        }
        if(dbInfoDTO.getModifyTime() != null) {
            criteria.andModifyTimeEqualTo(dbInfoDTO.getModifyTime());
        }
        if(dbInfoDTO.getModifyTime_arr() != null) {
            criteria.andModifyTimeIn(dbInfoDTO.getModifyTime_arr());
        }
        if(dbInfoDTO.getModifyTime_gt() != null) {
            criteria.andModifyTimeGreaterThan(dbInfoDTO.getModifyTime_gt());
        }
        if(dbInfoDTO.getModifyTime_lt() != null) {
            criteria.andModifyTimeLessThan(dbInfoDTO.getModifyTime_lt());
        }
        if(dbInfoDTO.getModifyTime_gte() != null) {
            criteria.andModifyTimeGreaterThanOrEqualTo(dbInfoDTO.getModifyTime_gte());
        }
        if(dbInfoDTO.getModifyTime_lte() != null) {
            criteria.andModifyTimeLessThanOrEqualTo(dbInfoDTO.getModifyTime_lte());
        }
        if(dbInfoDTO.getCreateUser() != null) {
            criteria.andCreateUserEqualTo(dbInfoDTO.getCreateUser());
        }
        if(dbInfoDTO.getCreateUser_arr() != null) {
            criteria.andCreateUserIn(dbInfoDTO.getCreateUser_arr());
        }
        if(dbInfoDTO.getCreateUser_like() != null) {
            criteria.andCreateUserLike(dbInfoDTO.getCreateUser_like());
        }
        if(dbInfoDTO.getModifyUser() != null) {
            criteria.andModifyUserEqualTo(dbInfoDTO.getModifyUser());
        }
        if(dbInfoDTO.getModifyUser_arr() != null) {
            criteria.andModifyUserIn(dbInfoDTO.getModifyUser_arr());
        }
        if(dbInfoDTO.getModifyUser_like() != null) {
            criteria.andModifyUserLike(dbInfoDTO.getModifyUser_like());
        }
        if(dbInfoDTO.getYn() != null) {
            criteria.andYnEqualTo(dbInfoDTO.getYn());
        }
        if(dbInfoDTO.getYn_arr() != null) {
            criteria.andYnIn(dbInfoDTO.getYn_arr());
        }
        if(dbInfoDTO.getYn_gt() != null) {
            criteria.andYnGreaterThan(dbInfoDTO.getYn_gt());
        }
        if(dbInfoDTO.getYn_lt() != null) {
            criteria.andYnLessThan(dbInfoDTO.getYn_lt());
        }
        if(dbInfoDTO.getYn_gte() != null) {
            criteria.andYnGreaterThanOrEqualTo(dbInfoDTO.getYn_gte());
        }
        if(dbInfoDTO.getYn_lte() != null) {
            criteria.andYnLessThanOrEqualTo(dbInfoDTO.getYn_lte());
        }
        return dbInfoExample;
    }

    public void buildComplexProperty(DbInfoExample dbInfoExample, List<DbInfo> dbInfos) {
    }
}