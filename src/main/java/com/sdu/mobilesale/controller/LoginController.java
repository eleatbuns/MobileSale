package com.sdu.mobilesale.controller;

import com.sdu.mobilesale.service.SellerStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    private static final String RETURNKEY = "result";
    //Successful verification
    private static final int VERIFICATIONSUCCESS = 0;
    //account does not exist
    private static final int ACCOUNTISNULL = 1;
    //Incorrect password
    private static final int PASSWORDERROR = 2;
    //Parameter cannot be empty
    private static final int PARAMNULL = 3;

    @Autowired
    private SellerStaffService sellerStaffService;


    @GetMapping("/login")
    public Map<String, Integer> login(@RequestParam(value = "useraccount") String useraccount, @RequestParam(value = "password") String password) {
        Map<String, Integer> result = new HashMap<>();
        if (useraccount.equals("") || password.equals("")) {
            result.put(RETURNKEY, PARAMNULL);
            return result;
        }
        String selectPassword = sellerStaffService.verifyPassword(useraccount);
        if (selectPassword == null || selectPassword.equals("")) {
            result.put(RETURNKEY, ACCOUNTISNULL);
        } else if (!selectPassword.equals("") && selectPassword.equals(password)) {
            result.put(RETURNKEY, VERIFICATIONSUCCESS);
        } else if (!selectPassword.equals("") && !selectPassword.equals(password)) {
            result.put(RETURNKEY, PASSWORDERROR);
        }
        return result;
    }
}
