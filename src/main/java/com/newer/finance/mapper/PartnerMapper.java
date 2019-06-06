package com.newer.finance.mapper;

import com.newer.finance.domain.Partner;
import com.newer.finance.domain.PartnerExample;
import java.util.List;

public interface PartnerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Partner record);

    int insertSelective(Partner record);

    List<Partner> selectByExample(PartnerExample example);

    Partner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Partner record);

    int updateByPrimaryKey(Partner record);
}