package com.sdu.mobilesale.controller;

import com.github.pagehelper.PageInfo;
import com.sdu.mobilesale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/list")
    public PageInfo<HashMap> getCustomerList(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,@RequestParam(value = "areaId") String areaId) {
        return customerService.getCustomerList(pageNum, areaId);
    }
}
