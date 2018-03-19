package com.sdu.mobilesale.service;

import com.sdu.mobilesale.mapper.SellerStaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "verifyService")
public class SellerStaffServiceImpl implements SellerStaffService {

    @Autowired
    private SellerStaffMapper sellerStaffMapper;

    @Override
    public String verifyPassword(String account) {
        return sellerStaffMapper.loginAuthentication(account);
    }
}
