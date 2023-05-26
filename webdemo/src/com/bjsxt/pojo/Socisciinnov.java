package com.bjsxt.pojo;

/**
 * @Author: 韩yz
 * @Date: 2023/4/17 11:13
 * @Version 1.0
 */
public class Socisciinnov {
    private int id;
    private String biblName;
    private String biblTheme;
    private String author;
    private String postTime;
    private String priSearch;
    private String twoSearch;

    public Socisciinnov() {
    }

    public Socisciinnov(int id, String biblName, String biblTheme, String author, String postTime, String priSearch, String twoSearch) {
        this.id = id;
        this.biblName = biblName;
        this.biblTheme = biblTheme;
        this.author = author;
        this.postTime = postTime;
        this.priSearch = priSearch;
        this.twoSearch = twoSearch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPriSearch() {
        return priSearch;
    }

    public void setPriSearch(String priSearch) {
        this.priSearch = priSearch;
    }

    public String getTwoSearch() {
        return twoSearch;
    }

    public void setTwoSearch(String twoSearch) {
        this.twoSearch = twoSearch;
    }

    @Override
    public String toString() {
        return "Socisciinnov{" +
                "id=" + id +
                ", biblName='" + biblName + '\'' +
                ", biblTheme='" + biblTheme + '\'' +
                ", author='" + author + '\'' +
                ", postTime='" + postTime + '\'' +
                ", priSearch='" + priSearch + '\'' +
                ", twoSearch='" + twoSearch + '\'' +
                '}';
    }
}
