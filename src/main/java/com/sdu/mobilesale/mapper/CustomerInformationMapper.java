package com.sdu.mobilesale.mapper;

import com.sdu.mobilesale.model.CustomerInformation;

public interface CustomerInformationMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerInformation record);

    int insertSelective(CustomerInformation record);

    CustomerInformation selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(CustomerInformation record);

    int updateByPrimaryKeyWithBLOBs(CustomerInformation record);

    int updateByPrimaryKey(CustomerInformation record);
}