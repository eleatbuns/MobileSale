package com.sdu.mobilesale.controller;

import com.sdu.mobilesale.service.SellerStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/seller")
public class SellerController {

    private final String RETURNKEY = "result";
    //Parameter cannot be empty
    private final int PARAMNULL = 3;

    @Autowired
    private SellerStaffService sellerStaffService;

    @GetMapping("/Message")
    public HashMap login(@RequestParam(value = "useraccount") String useraccount) {
        HashMap sellerStaff  = sellerStaffService.getSellerMessage(useraccount);
//        System.out.println(sellerStaff.toString());
        return sellerStaff;
    }
}
