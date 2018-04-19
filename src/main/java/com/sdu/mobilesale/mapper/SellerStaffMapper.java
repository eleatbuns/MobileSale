package com.sdu.mobilesale.mapper;

import com.sdu.mobilesale.model.SellerStaff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component(value = "SellerStaff")
@Mapper
public interface SellerStaffMapper {
    int deleteByPrimaryKey(Integer sellerId);

    int insert(SellerStaff record);

    int insertSelective(SellerStaff record);

    SellerStaff selectByAccount(@Param("useraccount")String useraccount);
    String loginAuthentication(@Param("useraccount")String useraccount);

    int updateByPrimaryKeySelective(SellerStaff record);

    int updateByPrimaryKey(SellerStaff record);
}