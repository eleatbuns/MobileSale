package com.sdu.mobilesale.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @PostMapping("/login")
    public Map<String, String> test(@RequestParam(value = "useraccount") String useraccount,@RequestParam(value = "password") String password){
        Map<String,String> returnMap = new HashMap<>();
        return returnMap;
    }
}
