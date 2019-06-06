package com.newer.finance.mapper;

import com.newer.finance.domain.Loan;
import com.newer.finance.domain.LoanExample;
import java.util.List;

public interface LoanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Loan record);

    int insertSelective(Loan record);

    List<Loan> selectByExample(LoanExample example);

    Loan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Loan record);

    int updateByPrimaryKey(Loan record);
}