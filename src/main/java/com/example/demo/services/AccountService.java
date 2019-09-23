package com.example.demo.services;

import com.example.demo.dao.AccountDao;
import com.example.demo.models.javaBean.reqParam.CancParam;
import com.example.demo.models.javaBean.reqParam.ModifyPasswordParam;
import com.example.demo.models.javaBean.reqParam.RegisterParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

interface IAccountService {
    void doRegister(RegisterParam registerParam) throws Exception;
    void doCancAccount(CancParam cancParam) throws Exception;
    void doModifyPassword(ModifyPasswordParam modifyPasswordParam) throws Exception;
}

@Service
public class AccountService implements IAccountService{
    @Autowired
    AccountDao accountDao;

    public void doRegister(RegisterParam registerParam) throws Exception {
        int result = this.accountDao.addAccount(registerParam);
        if(result == 0) {
            throw new Exception("添加账户失败");
        }
    }

    public void doCancAccount(CancParam cancParam) throws Exception {
        int result = this.accountDao.removeAccount(cancParam);
        if(result == 0) {
            throw new Exception("删除账户失败");
        }
    }

    public void doModifyPassword(ModifyPasswordParam modifyPasswordParam) throws Exception {
        int result = this.accountDao.modifyAccountPassword(modifyPasswordParam);
        if(result == 0) {
            throw new Exception("修改密码失败");
        }
    }
}
