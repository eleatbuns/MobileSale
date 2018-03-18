package com.sdu.mobilesale.mapper;

import com.sdu.mobilesale.model.salerStaff;

public interface salerStaffMapper {
    int deleteByPrimaryKey(Integer salerId);

    int insert(salerStaff record);

    int insertSelective(salerStaff record);

    salerStaff selectByPrimaryKey(Integer salerId);

    int updateByPrimaryKeySelective(salerStaff record);

    int updateByPrimaryKey(salerStaff record);
}