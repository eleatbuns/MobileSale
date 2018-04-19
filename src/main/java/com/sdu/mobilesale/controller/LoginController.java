package com.sdu.mobilesale.controller;

import com.sdu.mobilesale.model.SellerStaff;
import com.sdu.mobilesale.service.SellerStaffService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    Logger log = LoggerFactory.getLogger(LoginController.class);

    private static final String RETURNKEY = "result";
    //Successful verification
    private static final String VERIFICATIONSUCCESS = "0";
    //account does not exist
    private static final String ACCOUNTISNULL = "1";
    //Incorrect password
    private static final String PASSWORDERROR = "2";
    //Parameter cannot be empty
    private static final String PARAMNULL = "3";

    @Autowired
    private SellerStaffService sellerStaffService;

    /**
     * 验证登录
     * @param useraccount
     * @param password
     * @return
     */
    @GetMapping("/login")
    public Map<String, Object> login(@RequestParam(value = "useraccount") String useraccount, @RequestParam(value = "password") String password) {
        Map<String, Object> result = new HashMap<>();
        if (useraccount.equals("") || password.equals("")) {
            result.put(RETURNKEY, PARAMNULL);
            return result;
        }
        String selectPassword = sellerStaffService.verifyPassword(useraccount);
        if (selectPassword == null || selectPassword.equals("")) {
            result.put(RETURNKEY, ACCOUNTISNULL);
        } else if (!selectPassword.equals("") && selectPassword.equals(password)) {
            result.put(RETURNKEY, VERIFICATIONSUCCESS);
            SellerStaff sellerStaff = sellerStaffService.getSellerMessage(useraccount);
//            log.warn(sellerStaff.getAreas().getArea());
            result.put("sellerMessage",sellerStaff);
//            result.put("areaId",sellerStaff.getAreas().getAreaId());
        } else if (!selectPassword.equals("") && !selectPassword.equals(password)) {
            result.put(RETURNKEY, PASSWORDERROR);
        }
        return result;
    }
}
