package com.example.demo.controllers;

import com.example.demo.models.javaBean.reqParam.CancParam;
import com.example.demo.services.AccountService;
import com.example.demo.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class CancController {
    @Autowired
    AccountService accountService;

    @PostMapping(value = "/cancAccount")
    public HashMap<String, Object> cancAccount(@RequestBody CancParam cancParam) {
        HashMap resultMap = Tool.getResultMap();
        try {
            this.accountService.doCancAccount(cancParam);
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("errorMsg", e.toString());
        } finally {
            return resultMap;
        }

    }


}
