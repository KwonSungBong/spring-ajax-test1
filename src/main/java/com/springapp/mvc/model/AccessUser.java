package com.springapp.mvc.model;

public class AccessUser extends User{
    private String accessToken;

    public String getAccessToken(){
        return this.accessToken;
    }

    public void setAccessToekn(String accessToken){
        this.accessToken = accessToken;
    }
}
