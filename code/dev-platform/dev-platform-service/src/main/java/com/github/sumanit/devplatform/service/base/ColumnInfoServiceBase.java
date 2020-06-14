package com.github.sumanit.devplatform.service.base;

import com.github.sumanit.base.BaseServiceImpl;
import com.github.sumanit.base.Mapper;
import com.github.sumanit.base.QueryModel;
import com.github.sumanit.devplatform.dto.ColumnInfoDTO;
import com.github.sumanit.devplatform.mapper.ColumnInfoMapper;
import com.github.sumanit.devplatform.model.ColumnInfo;
import com.github.sumanit.devplatform.model.ColumnInfoExample;
import com.github.sumanit.devplatform.service.adapter.ColumnInfoService;
import java.util.List;
import javax.annotation.Resource;

public abstract class ColumnInfoServiceBase extends BaseServiceImpl<ColumnInfo, ColumnInfoDTO, ColumnInfoExample> implements ColumnInfoService {
    @Resource
    private ColumnInfoMapper columnInfoMapper;

    @Override
    public Mapper<ColumnInfo, ColumnInfoExample> getMapper() {
        return columnInfoMapper;
    }

    @Override
    public ColumnInfoExample buildExample(ColumnInfoDTO columnInfoDTO, QueryModel queryModel) {
        ColumnInfoExample columnInfoExample = new ColumnInfoExample();
        ColumnInfoExample.Criteria criteria = columnInfoExample.createCriteria();
        if(columnInfoDTO.getId() != null) {
            criteria.andIdEqualTo(columnInfoDTO.getId());
        }
        if(columnInfoDTO.getId_arr() != null) {
            criteria.andIdIn(columnInfoDTO.getId_arr());
        }
        if(columnInfoDTO.getId_gt() != null) {
            criteria.andIdGreaterThan(columnInfoDTO.getId_gt());
        }
        if(columnInfoDTO.getId_lt() != null) {
            criteria.andIdLessThan(columnInfoDTO.getId_lt());
        }
        if(columnInfoDTO.getId_gte() != null) {
            criteria.andIdGreaterThanOrEqualTo(columnInfoDTO.getId_gte());
        }
        if(columnInfoDTO.getId_lte() != null) {
            criteria.andIdLessThanOrEqualTo(columnInfoDTO.getId_lte());
        }
        if(columnInfoDTO.getDbId() != null) {
            criteria.andDbIdEqualTo(columnInfoDTO.getDbId());
        }
        if(columnInfoDTO.getDbId_arr() != null) {
            criteria.andDbIdIn(columnInfoDTO.getDbId_arr());
        }
        if(columnInfoDTO.getDbId_gt() != null) {
            criteria.andDbIdGreaterThan(columnInfoDTO.getDbId_gt());
        }
        if(columnInfoDTO.getDbId_lt() != null) {
            criteria.andDbIdLessThan(columnInfoDTO.getDbId_lt());
        }
        if(columnInfoDTO.getDbId_gte() != null) {
            criteria.andDbIdGreaterThanOrEqualTo(columnInfoDTO.getDbId_gte());
        }
        if(columnInfoDTO.getDbId_lte() != null) {
            criteria.andDbIdLessThanOrEqualTo(columnInfoDTO.getDbId_lte());
        }
        if(columnInfoDTO.getTableName() != null) {
            criteria.andTableNameEqualTo(columnInfoDTO.getTableName());
        }
        if(columnInfoDTO.getTableName_arr() != null) {
            criteria.andTableNameIn(columnInfoDTO.getTableName_arr());
        }
        if(columnInfoDTO.getTableName_like() != null) {
            criteria.andTableNameLike(columnInfoDTO.getTableName_like());
        }
        if(columnInfoDTO.getType() != null) {
            criteria.andTypeEqualTo(columnInfoDTO.getType());
        }
        if(columnInfoDTO.getType_arr() != null) {
            criteria.andTypeIn(columnInfoDTO.getType_arr());
        }
        if(columnInfoDTO.getType_like() != null) {
            criteria.andTypeLike(columnInfoDTO.getType_like());
        }
        if(columnInfoDTO.getJavaType() != null) {
            criteria.andJavaTypeEqualTo(columnInfoDTO.getJavaType());
        }
        if(columnInfoDTO.getJavaType_arr() != null) {
            criteria.andJavaTypeIn(columnInfoDTO.getJavaType_arr());
        }
        if(columnInfoDTO.getJavaType_like() != null) {
            criteria.andJavaTypeLike(columnInfoDTO.getJavaType_like());
        }
        if(columnInfoDTO.getIsNull() != null) {
            criteria.andIsNullEqualTo(columnInfoDTO.getIsNull());
        }
        if(columnInfoDTO.getIsNull_arr() != null) {
            criteria.andIsNullIn(columnInfoDTO.getIsNull_arr());
        }
        if(columnInfoDTO.getIsNull_like() != null) {
            criteria.andIsNullLike(columnInfoDTO.getIsNull_like());
        }
        if(columnInfoDTO.getDefaultValue() != null) {
            criteria.andDefaultValueEqualTo(columnInfoDTO.getDefaultValue());
        }
        if(columnInfoDTO.getDefaultValue_arr() != null) {
            criteria.andDefaultValueIn(columnInfoDTO.getDefaultValue_arr());
        }
        if(columnInfoDTO.getDefaultValue_like() != null) {
            criteria.andDefaultValueLike(columnInfoDTO.getDefaultValue_like());
        }
        if(columnInfoDTO.getCreateTime() != null) {
            criteria.andCreateTimeEqualTo(columnInfoDTO.getCreateTime());
        }
        if(columnInfoDTO.getCreateTime_arr() != null) {
            criteria.andCreateTimeIn(columnInfoDTO.getCreateTime_arr());
        }
        if(columnInfoDTO.getCreateTime_gt() != null) {
            criteria.andCreateTimeGreaterThan(columnInfoDTO.getCreateTime_gt());
        }
        if(columnInfoDTO.getCreateTime_lt() != null) {
            criteria.andCreateTimeLessThan(columnInfoDTO.getCreateTime_lt());
        }
        if(columnInfoDTO.getCreateTime_gte() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(columnInfoDTO.getCreateTime_gte());
        }
        if(columnInfoDTO.getCreateTime_lte() != null) {
            criteria.andCreateTimeLessThanOrEqualTo(columnInfoDTO.getCreateTime_lte());
        }
        if(columnInfoDTO.getModifyTime() != null) {
            criteria.andModifyTimeEqualTo(columnInfoDTO.getModifyTime());
        }
        if(columnInfoDTO.getModifyTime_arr() != null) {
            criteria.andModifyTimeIn(columnInfoDTO.getModifyTime_arr());
        }
        if(columnInfoDTO.getModifyTime_gt() != null) {
            criteria.andModifyTimeGreaterThan(columnInfoDTO.getModifyTime_gt());
        }
        if(columnInfoDTO.getModifyTime_lt() != null) {
            criteria.andModifyTimeLessThan(columnInfoDTO.getModifyTime_lt());
        }
        if(columnInfoDTO.getModifyTime_gte() != null) {
            criteria.andModifyTimeGreaterThanOrEqualTo(columnInfoDTO.getModifyTime_gte());
        }
        if(columnInfoDTO.getModifyTime_lte() != null) {
            criteria.andModifyTimeLessThanOrEqualTo(columnInfoDTO.getModifyTime_lte());
        }
        if(columnInfoDTO.getCreateUser() != null) {
            criteria.andCreateUserEqualTo(columnInfoDTO.getCreateUser());
        }
        if(columnInfoDTO.getCreateUser_arr() != null) {
            criteria.andCreateUserIn(columnInfoDTO.getCreateUser_arr());
        }
        if(columnInfoDTO.getCreateUser_like() != null) {
            criteria.andCreateUserLike(columnInfoDTO.getCreateUser_like());
        }
        if(columnInfoDTO.getModifyUser() != null) {
            criteria.andModifyUserEqualTo(columnInfoDTO.getModifyUser());
        }
        if(columnInfoDTO.getModifyUser_arr() != null) {
            criteria.andModifyUserIn(columnInfoDTO.getModifyUser_arr());
        }
        if(columnInfoDTO.getModifyUser_like() != null) {
            criteria.andModifyUserLike(columnInfoDTO.getModifyUser_like());
        }
        if(columnInfoDTO.getYn() != null) {
            criteria.andYnEqualTo(columnInfoDTO.getYn());
        }
        if(columnInfoDTO.getYn_arr() != null) {
            criteria.andYnIn(columnInfoDTO.getYn_arr());
        }
        if(columnInfoDTO.getYn_gt() != null) {
            criteria.andYnGreaterThan(columnInfoDTO.getYn_gt());
        }
        if(columnInfoDTO.getYn_lt() != null) {
            criteria.andYnLessThan(columnInfoDTO.getYn_lt());
        }
        if(columnInfoDTO.getYn_gte() != null) {
            criteria.andYnGreaterThanOrEqualTo(columnInfoDTO.getYn_gte());
        }
        if(columnInfoDTO.getYn_lte() != null) {
            criteria.andYnLessThanOrEqualTo(columnInfoDTO.getYn_lte());
        }
        return columnInfoExample;
    }

    public void buildComplexProperty(ColumnInfoExample columnInfoExample, List<ColumnInfo> columnInfos) {
    }
}