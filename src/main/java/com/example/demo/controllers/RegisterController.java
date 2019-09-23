package com.example.demo.controllers;

import com.example.demo.models.javaBean.reqParam.RegisterParam;
import com.example.demo.services.AccountService;
import com.example.demo.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class RegisterController {
    @Autowired
    AccountService accountService;

    @PostMapping(value = "/register")
    public HashMap<String, Object> register(@RequestBody RegisterParam registerParam) {
        HashMap resultMap = Tool.getResultMap();
        try {
            this.accountService.doRegister(registerParam);
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("errorMsg", e.toString());
        } finally {
            return resultMap;
        }

    }
}
