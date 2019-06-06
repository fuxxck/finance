package com.newer.finance.mapper;

import com.newer.finance.domain.FundType;
import com.newer.finance.domain.FundTypeExample;
import java.util.List;

public interface FundTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FundType record);

    int insertSelective(FundType record);

    List<FundType> selectByExample(FundTypeExample example);

    FundType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FundType record);

    int updateByPrimaryKey(FundType record);
}