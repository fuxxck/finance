package com.newer.finance.mapper;

import com.newer.finance.domain.LoanRecord;
import com.newer.finance.domain.LoanRecordExample;
import java.util.List;

public interface LoanRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoanRecord record);

    int insertSelective(LoanRecord record);

    List<LoanRecord> selectByExample(LoanRecordExample example);

    LoanRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoanRecord record);

    int updateByPrimaryKey(LoanRecord record);
}