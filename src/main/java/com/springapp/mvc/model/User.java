package com.springapp.mvc.model;

public class User {
    private int idx;
    private String email;
    private String name;
    private String regDate;
    private String modDate;

    public int getIdx(){
        return this.idx;
    }
    public void setIdx(int idx){
        this.idx = idx;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getRegDate(){
        return this.regDate;
    }
    public void setRegDate(String regDate){
        this.regDate = regDate;
    }
    public String getModDate(){
        return this.modDate;
    }
    public void setModDate(String modDate){
        this.modDate = modDate;
    }
}
