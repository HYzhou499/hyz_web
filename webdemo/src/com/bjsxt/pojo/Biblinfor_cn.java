package com.bjsxt.pojo;

/**
 * @Author: 韩yz
 * @Date: 2023/4/17 11:03
 * @Version 1.0
 */
public class Biblinfor_cn {
    private int id;
    private String biblName;
    private String biblTheme;
    private String author;
    private String postTime;
    private String keywords;
    private String abstracts;
    private int query_count;

    public Biblinfor_cn() {
    }

    public Biblinfor_cn(int id, String biblName, String biblTheme, String author, String postTime, String keywords, String abstracts, int query_count) {
        this.id = id;
        this.biblName = biblName;
        this.biblTheme = biblTheme;
        this.author = author;
        this.postTime = postTime;
        this.keywords = keywords;
        this.abstracts = abstracts;
        this.query_count = query_count;
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

    public int getQuery_count() {
        return query_count;
    }

    public int setQuery_count(int query_count) {
        this.query_count = query_count;
        return query_count;
    }

    @Override
    public String toString() {
        return "Biblinfor_cn{" +
                "id=" + id +
                ", biblName='" + biblName + '\'' +
                ", biblTheme='" + biblTheme + '\'' +
                ", author='" + author + '\'' +
                ", postTime='" + postTime + '\'' +
                ", keywords='" + keywords + '\'' +
                ", abstracts='" + abstracts + '\'' +
                ", query_count=" + query_count +
                '}';
    }
}
