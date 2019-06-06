package com.newer.finance.mapper;

import com.newer.finance.domain.BankCard;
import com.newer.finance.domain.BankCardExample;
import java.util.List;

public interface BankCardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BankCard record);

    int insertSelective(BankCard record);

    List<BankCard> selectByExample(BankCardExample example);

    BankCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BankCard record);

    int updateByPrimaryKey(BankCard record);
}