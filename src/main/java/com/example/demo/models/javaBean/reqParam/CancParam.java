package com.example.demo.models.javaBean.reqParam;

public class CancParam {
    private Integer userId;

    @Override
    public String toString() {
        return "CancParam{" +
                "userId=" + userId +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
