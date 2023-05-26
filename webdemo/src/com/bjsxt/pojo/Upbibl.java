package com.bjsxt.pojo;

/**
 * @Author: 韩yz
 * @Date: 2023/4/17 11:15
 * @Version 1.0
 */
public class Upbibl {
    private int id;
    private String username;
    private String usersex;
    private String phonenumber;
    private String email;
    private String biblName;
    private String biblTheme;
    private String author;
    private String postTime;
    private String applicationdate;
    private String keywords;
    private String abstracts;
    private String remarks;

    public Upbibl() {
    }

    public Upbibl(int id, String username, String usersex, String phonenumber, String email, String biblName, String biblTheme, String author, String postTime, String applicationdate, String keywords, String abstracts, String remarks) {
        this.id = id;
        this.username = username;
        this.usersex = usersex;
        this.phonenumber = phonenumber;
        this.email = email;
        this.biblName = biblName;
        this.biblTheme = biblTheme;
        this.author = author;
        this.postTime = postTime;
        this.applicationdate = applicationdate;
        this.keywords = keywords;
        this.abstracts = abstracts;
        this.remarks = remarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBiblName() {
        return biblName;
    }

    public void setBiblName(String biblName) {
        this.biblName = biblName;
    }

    public String getBiblTheme() {
        return biblTheme;
    }

    public void setBiblTheme(String biblTheme) {
        this.biblTheme = biblTheme;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public String getApplicationdate() {
        return applicationdate;
    }

    public void setApplicationdate(String applicationdate) {
        this.applicationdate = applicationdate;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Upbibl{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", usersex='" + usersex + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                ", biblName='" + biblName + '\'' +
                ", biblTheme='" + biblTheme + '\'' +
                ", author='" + author + '\'' +
                ", postTime='" + postTime + '\'' +
                ", applicationdate='" + applicationdate + '\'' +
                ", keywords='" + keywords + '\'' +
                ", abstracts='" + abstracts + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
