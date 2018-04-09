package com.sdu.mobilesale.service;

import com.sdu.mobilesale.mapper.SellerStaffMapper;
import com.sdu.mobilesale.model.SellerStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service(value = "verifyService")
@CacheConfig(cacheNames = {"SaleCache"})
public class SellerStaffServiceImpl implements SellerStaffService {

    @Autowired
    private SellerStaffMapper sellerStaffMapper;

    @Override
    @Cacheable(key = "#account")
    public String verifyPassword(String account) {
        return sellerStaffMapper.loginAuthentication(account);
    }

    @Override
    @Cacheable(key = "#account")
    public HashMap getSellerMessage(String account) {
        return sellerStaffMapper.selectByAccount(account);
    }

    @Override
    public int updateSellerMessage(SellerStaff sellerStaff) {
        return 0;
    }
}
