package com.github.sumanit.devplatform.service.base;

import com.github.sumanit.base.BaseServiceImpl;
import com.github.sumanit.base.Mapper;
import com.github.sumanit.base.QueryModel;
import com.github.sumanit.devplatform.dto.ProjectInfoDTO;
import com.github.sumanit.devplatform.mapper.ProjectInfoMapper;
import com.github.sumanit.devplatform.model.ProjectInfo;
import com.github.sumanit.devplatform.model.ProjectInfoExample;
import com.github.sumanit.devplatform.service.adapter.ProjectInfoService;
import java.util.List;
import javax.annotation.Resource;

public abstract class ProjectInfoServiceBase extends BaseServiceImpl<ProjectInfo, ProjectInfoDTO, ProjectInfoExample> implements ProjectInfoService {
    @Resource
    private ProjectInfoMapper projectInfoMapper;

    @Override
    public Mapper<ProjectInfo, ProjectInfoExample> getMapper() {
        return projectInfoMapper;
    }

    @Override
    public ProjectInfoExample buildExample(ProjectInfoDTO projectInfoDTO, QueryModel queryModel) {
        ProjectInfoExample projectInfoExample = new ProjectInfoExample();
        ProjectInfoExample.Criteria criteria = projectInfoExample.createCriteria();
        if(projectInfoDTO.getId() != null) {
            criteria.andIdEqualTo(projectInfoDTO.getId());
        }
        if(projectInfoDTO.getId_arr() != null) {
            criteria.andIdIn(projectInfoDTO.getId_arr());
        }
        if(projectInfoDTO.getId_gt() != null) {
            criteria.andIdGreaterThan(projectInfoDTO.getId_gt());
        }
        if(projectInfoDTO.getId_lt() != null) {
            criteria.andIdLessThan(projectInfoDTO.getId_lt());
        }
        if(projectInfoDTO.getId_gte() != null) {
            criteria.andIdGreaterThanOrEqualTo(projectInfoDTO.getId_gte());
        }
        if(projectInfoDTO.getId_lte() != null) {
            criteria.andIdLessThanOrEqualTo(projectInfoDTO.getId_lte());
        }
        if(projectInfoDTO.getName() != null) {
            criteria.andNameEqualTo(projectInfoDTO.getName());
        }
        if(projectInfoDTO.getName_arr() != null) {
            criteria.andNameIn(projectInfoDTO.getName_arr());
        }
        if(projectInfoDTO.getName_like() != null) {
            criteria.andNameLike(projectInfoDTO.getName_like());
        }
        if(projectInfoDTO.getCreateTime() != null) {
            criteria.andCreateTimeEqualTo(projectInfoDTO.getCreateTime());
        }
        if(projectInfoDTO.getCreateTime_arr() != null) {
            criteria.andCreateTimeIn(projectInfoDTO.getCreateTime_arr());
        }
        if(projectInfoDTO.getCreateTime_gt() != null) {
            criteria.andCreateTimeGreaterThan(projectInfoDTO.getCreateTime_gt());
        }
        if(projectInfoDTO.getCreateTime_lt() != null) {
            criteria.andCreateTimeLessThan(projectInfoDTO.getCreateTime_lt());
        }
        if(projectInfoDTO.getCreateTime_gte() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(projectInfoDTO.getCreateTime_gte());
        }
        if(projectInfoDTO.getCreateTime_lte() != null) {
            criteria.andCreateTimeLessThanOrEqualTo(projectInfoDTO.getCreateTime_lte());
        }
        if(projectInfoDTO.getModifyTime() != null) {
            criteria.andModifyTimeEqualTo(projectInfoDTO.getModifyTime());
        }
        if(projectInfoDTO.getModifyTime_arr() != null) {
            criteria.andModifyTimeIn(projectInfoDTO.getModifyTime_arr());
        }
        if(projectInfoDTO.getModifyTime_gt() != null) {
            criteria.andModifyTimeGreaterThan(projectInfoDTO.getModifyTime_gt());
        }
        if(projectInfoDTO.getModifyTime_lt() != null) {
            criteria.andModifyTimeLessThan(projectInfoDTO.getModifyTime_lt());
        }
        if(projectInfoDTO.getModifyTime_gte() != null) {
            criteria.andModifyTimeGreaterThanOrEqualTo(projectInfoDTO.getModifyTime_gte());
        }
        if(projectInfoDTO.getModifyTime_lte() != null) {
            criteria.andModifyTimeLessThanOrEqualTo(projectInfoDTO.getModifyTime_lte());
        }
        if(projectInfoDTO.getCreateUser() != null) {
            criteria.andCreateUserEqualTo(projectInfoDTO.getCreateUser());
        }
        if(projectInfoDTO.getCreateUser_arr() != null) {
            criteria.andCreateUserIn(projectInfoDTO.getCreateUser_arr());
        }
        if(projectInfoDTO.getCreateUser_like() != null) {
            criteria.andCreateUserLike(projectInfoDTO.getCreateUser_like());
        }
        if(projectInfoDTO.getModifyUser() != null) {
            criteria.andModifyUserEqualTo(projectInfoDTO.getModifyUser());
        }
        if(projectInfoDTO.getModifyUser_arr() != null) {
            criteria.andModifyUserIn(projectInfoDTO.getModifyUser_arr());
        }
        if(projectInfoDTO.getModifyUser_like() != null) {
            criteria.andModifyUserLike(projectInfoDTO.getModifyUser_like());
        }
        if(projectInfoDTO.getYn() != null) {
            criteria.andYnEqualTo(projectInfoDTO.getYn());
        }
        if(projectInfoDTO.getYn_arr() != null) {
            criteria.andYnIn(projectInfoDTO.getYn_arr());
        }
        if(projectInfoDTO.getYn_gt() != null) {
            criteria.andYnGreaterThan(projectInfoDTO.getYn_gt());
        }
        if(projectInfoDTO.getYn_lt() != null) {
            criteria.andYnLessThan(projectInfoDTO.getYn_lt());
        }
        if(projectInfoDTO.getYn_gte() != null) {
            criteria.andYnGreaterThanOrEqualTo(projectInfoDTO.getYn_gte());
        }
        if(projectInfoDTO.getYn_lte() != null) {
            criteria.andYnLessThanOrEqualTo(projectInfoDTO.getYn_lte());
        }
        return projectInfoExample;
    }

    public void buildComplexProperty(ProjectInfoExample projectInfoExample, List<ProjectInfo> projectInfos) {
    }
}