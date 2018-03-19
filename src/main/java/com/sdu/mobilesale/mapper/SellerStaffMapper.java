package com.sdu.mobilesale.mapper;

import com.sdu.mobilesale.model.SellerStaff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component(value = "SellerStaff")
@Mapper
public interface SellerStaffMapper {
    int deleteByPrimaryKey(Integer sellerId);

    int insert(SellerStaff record);

    int insertSelective(SellerStaff record);

//    SellerStaff selectByPrimaryKey(Integer sellerId);
    String loginAuthentication(@Param("useraccount")String useraccount);

    int updateByPrimaryKeySelective(SellerStaff record);

    int updateByPrimaryKey(SellerStaff record);
}