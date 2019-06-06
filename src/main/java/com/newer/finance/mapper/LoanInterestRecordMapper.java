package com.newer.finance.mapper;

import com.newer.finance.domain.LoanInterestRecord;
import com.newer.finance.domain.LoanInterestRecordExample;
import java.util.List;

public interface LoanInterestRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoanInterestRecord record);

    int insertSelective(LoanInterestRecord record);

    List<LoanInterestRecord> selectByExample(LoanInterestRecordExample example);

    LoanInterestRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoanInterestRecord record);

    int updateByPrimaryKey(LoanInterestRecord record);
}