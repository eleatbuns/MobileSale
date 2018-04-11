package com.sdu.mobilesale.service;

import com.sdu.mobilesale.mapper.AdministratorMapper;
import com.sdu.mobilesale.model.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {

    //Successful verification
    private static final int VERIFICATIONSUCCESS = 0;
    //account does not exist
    private static final int ACCOUNTISNULL = 1;
    //Incorrect password
    private static final int PASSWORDERROR = 2;


    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public int selectByAccount(String account, String password) {
        Administrator administrator = administratorMapper.selectByAccount(account);
        if (administrator == null) {
            return ACCOUNTISNULL;
        } else if (administrator.getAdminPassword().equals(password)) {
            return VERIFICATIONSUCCESS;
        } else {
            return PASSWORDERROR;
        }
    }
}
