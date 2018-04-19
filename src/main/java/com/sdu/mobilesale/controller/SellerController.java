package com.sdu.mobilesale.controller;

import com.sdu.mobilesale.model.SellerStaff;
import com.sdu.mobilesale.service.SellerStaffService;
import org.apache.tomcat.util.buf.UEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/seller")
public class SellerController {

    private Logger log = LoggerFactory.getLogger(SellerController.class);

    @Autowired
    private SellerStaffService sellerStaffService;

    @GetMapping("/Message")
    public SellerStaff sellerMessage(@RequestParam(value = "useraccount") String useraccount) {
        log.warn("useraccount="+useraccount);
        return sellerStaffService.getSellerMessage(useraccount);
    }
}
