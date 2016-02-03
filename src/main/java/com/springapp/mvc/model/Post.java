package com.springapp.mvc.model;

import java.util.List;

public class Post {
    private int idx;
    private String subject;
    private String content;
    private String regDate;
    private String modDate;
    private User user;
    private Board belongToBoard;
    private List<Reply> Replies;
    private Pagination pagination;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getModDate() {
        return modDate;
    }

    public void setModDate(String modDate) {
        this.modDate = modDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Board getBelongToBoard() {
        return belongToBoard;
    }

    public void setBelongToBoard(Board belongToBoard) {
        this.belongToBoard = belongToBoard;
    }

    public List<Reply> getReplies() {
        return Replies;
    }

    public void setReplies(List<Reply> replies) {
        Replies = replies;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
