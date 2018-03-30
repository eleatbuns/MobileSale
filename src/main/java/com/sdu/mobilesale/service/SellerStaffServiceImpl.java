package com.sdu.mobilesale.service;

import com.sdu.mobilesale.mapper.SellerStaffMapper;
import com.sdu.mobilesale.model.SellerStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service(value = "verifyService")
public class SellerStaffServiceImpl implements SellerStaffService {

    @Autowired
    private SellerStaffMapper sellerStaffMapper;

    @Override
    public String verifyPassword(String account) {
        return sellerStaffMapper.loginAuthentication(account);
    }

    @Override
    public HashMap getSellerMessage(String account) {
        return sellerStaffMapper.selectByAccount(account);
    }

    @Override
    public int updateSellerMessage(SellerStaff sellerStaff) {
        return 0;
    }
}
