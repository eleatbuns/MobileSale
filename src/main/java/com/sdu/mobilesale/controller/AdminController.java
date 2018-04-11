package com.sdu.mobilesale.controller;

import com.sdu.mobilesale.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @ResponseBody
    @GetMapping(value = "/login")
    public Integer hello(@RequestParam(value = "account")String account,@RequestParam(value = "password")String password) {

        return adminService.selectByAccount(account,password);
    }
}
