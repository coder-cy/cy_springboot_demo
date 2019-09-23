package com.example.demo.models.javaBean.reqParam;

public class ModifyPasswordParam {
    private Integer userId;
    private String userPwd;

    @Override
    public String toString() {
        return "ModifyPasswordParam{" +
                "userId=" + userId +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
