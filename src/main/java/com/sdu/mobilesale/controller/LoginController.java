package com.sdu.mobilesale.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @PostMapping("/login")
    public Map<String, String> test(@RequestParam(value = "name") String name){
        Map<String,String> returnMap = new HashMap<>();
        returnMap.put("name","get Your Name is "+name);
        return returnMap;
    }
}
