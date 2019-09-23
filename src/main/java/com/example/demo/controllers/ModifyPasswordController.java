package com.example.demo.controllers;

import com.example.demo.models.javaBean.reqParam.ModifyPasswordParam;
import com.example.demo.services.AccountService;
import com.example.demo.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@CrossOrigin
@RestController
public class ModifyPasswordController {
    @Autowired
    AccountService accountService;

    @PostMapping(value = "/modifyPassword")
    public HashMap<String, Object> modifyPassword(@RequestBody ModifyPasswordParam modifyPasswordParam) throws Exception {
        HashMap resultMap = Tool.getResultMap();
        this.accountService.doModifyPassword(modifyPasswordParam);
        return resultMap;
    }
}
