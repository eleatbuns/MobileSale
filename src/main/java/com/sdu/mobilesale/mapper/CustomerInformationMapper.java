package com.sdu.mobilesale.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
@Component(value = "Customer")
@Mapper
public interface CustomerInformationMapper {

    List<HashMap> customerList(String areaId);
}