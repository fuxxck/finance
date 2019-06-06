package com.newer.finance.mapper;

import com.newer.finance.domain.FundRecord;
import com.newer.finance.domain.FundRecordExample;
import java.util.List;

public interface FundRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FundRecord record);

    int insertSelective(FundRecord record);

    List<FundRecord> selectByExample(FundRecordExample example);

    FundRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FundRecord record);

    int updateByPrimaryKey(FundRecord record);
}