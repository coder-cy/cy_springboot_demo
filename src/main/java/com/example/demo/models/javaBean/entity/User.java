package com.example.demo.models.javaBean.entity;

import java.sql.Date;

public class User {
    private Integer userId;
    private String userName;
    private String userPwd;
    private String userGender;
    private Date userRegisterDateTime;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userRegisterDateTime=" + userRegisterDateTime +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public Date getUserRegisterDateTime() {
        return userRegisterDateTime;
    }

    public void setUserRegisterDateTime(Date userRegisterDateTime) {
        this.userRegisterDateTime = userRegisterDateTime;
    }
}
