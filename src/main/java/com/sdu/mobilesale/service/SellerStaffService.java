package com.sdu.mobilesale.service;

import com.sdu.mobilesale.model.SellerStaff;

import java.util.HashMap;

public interface SellerStaffService {
    String verifyPassword(String account);
    HashMap getSellerMessage(String account);
    int updateSellerMessage(SellerStaff sellerStaff);
}
