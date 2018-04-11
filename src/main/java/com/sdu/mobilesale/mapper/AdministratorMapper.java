package com.sdu.mobilesale.mapper;

import com.sdu.mobilesale.model.Administrator;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component(value = "Administrator")
@Mapper
public interface AdministratorMapper {

    Administrator selectByAccount(String account);
}