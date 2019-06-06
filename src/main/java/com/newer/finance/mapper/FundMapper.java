package com.newer.finance.mapper;

import com.newer.finance.domain.Fund;
import com.newer.finance.domain.FundExample;
import java.util.List;

public interface FundMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fund record);

    int insertSelective(Fund record);

    List<Fund> selectByExample(FundExample example);

    Fund selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fund record);

    int updateByPrimaryKey(Fund record);
}