package com.springapp.mvc.model;

/**
 * Created by ksb on 2016-02-02.
 */
public class Reply {
    private int idx;
    private String content;
    private String regDate;
    private String modDate;
    private User user;
    private Post belongToPost;

    public int getIdx(){
        return this.idx;
    }
    public void setIdx(int idx) {
        this.idx = idx;
    }
    public String getContent(){
        return this.content;
    }
    public void setContent(String content){
        this.content = content;
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
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Post getBelongToPost() {
        return belongToPost;
    }

    public void setBelongToPost(Post belongToPost) {
        this.belongToPost = belongToPost;
    }
}
