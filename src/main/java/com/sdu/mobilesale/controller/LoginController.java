package com.sdu.mobilesale.controller;

import com.sdu.mobilesale.service.SellerStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    private final String RETURNKEY = "result";
    //Successful verification
    private final int VERIFICATIONSUCCESS = 0;
    //account does not exist
    private final int ACCOUNTISNULL = 1;
    //Incorrect password
    private final int PASSWORDERROR = 2;

    @Autowired
    private SellerStaffService sellerStaffService;


    @PostMapping("/login")
    public Map<String, Integer> test(@RequestParam(value = "useraccount") String useraccount, @RequestParam(value = "password") String password) {
        Map<String, Integer> result = new HashMap<>();
        String selectPassword = sellerStaffService.verifyPassword(useraccount);
        if (selectPassword == null || selectPassword.equals("")) {
            result.put(RETURNKEY, ACCOUNTISNULL);
        } else if (!selectPassword.equals("") && selectPassword.equals(password)) {
            result.put(RETURNKEY, VERIFICATIONSUCCESS);
        } else if (!selectPassword.equals("") && !selectPassword.equals(password)){
            result.put(RETURNKEY,PASSWORDERROR);
        }
        return result;
    }
}
