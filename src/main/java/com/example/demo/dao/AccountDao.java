package com.example.demo.dao;

import com.example.demo.models.javaBean.reqParam.CancParam;
import com.example.demo.models.javaBean.reqParam.ModifyPasswordParam;
import com.example.demo.models.javaBean.reqParam.RegisterParam;
import org.springframework.stereotype.Repository;

import java.sql.Date;

interface IAccountDao {
    int addAccount(RegisterParam registerParam);
    int removeAccount(CancParam cancParam);
    int modifyAccountPassword(ModifyPasswordParam modifyPasswordParam);
}

@Repository
public class AccountDao extends SuperDao implements IAccountDao {
    public int addAccount(RegisterParam registerParam) {
        String userName = registerParam.getUserName();
        String userPwd = registerParam.getUserPwd();
        String userGender = registerParam.getUserGender();
        Date userRegisterDateTime = registerParam.getUserRegisterDateTime();
        String sql = "insert into t_users(userName, userPwd, userGender, userRegisterDateTime) values(?, ?, ?, ?)";
        return this.jdbc.update(sql, userName, userPwd, userGender, userRegisterDateTime);
    }
    public int removeAccount(CancParam cancParam) {
        Integer userId = cancParam.getUserId();
        String sql = "delete from t_users where userId = ?";
        return this.jdbc.update(sql, userId);
    }
    public int modifyAccountPassword(ModifyPasswordParam modifyPasswordParam) {
        Integer userId = modifyPasswordParam.getUserId();
        String userPwd = modifyPasswordParam.getUserPwd();
        String sql = "update t_users set userPwd = ? where userId = ?";
        return this.jdbc.update(sql, userPwd, userId);
    }
}
