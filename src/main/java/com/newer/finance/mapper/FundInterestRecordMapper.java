package com.newer.finance.mapper;

import com.newer.finance.domain.FundInterestRecord;
import com.newer.finance.domain.FundInterestRecordExample;
import java.util.List;

public interface FundInterestRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FundInterestRecord record);

    int insertSelective(FundInterestRecord record);

    List<FundInterestRecord> selectByExample(FundInterestRecordExample example);

    FundInterestRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FundInterestRecord record);

    int updateByPrimaryKey(FundInterestRecord record);
}