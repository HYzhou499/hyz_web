package com.bjsxt.pojo;

public class Users {
    private int userid;
    private String username;
    private String userpwd;
    private String usersex;
    private String phonenumber;
    private String qqnumber;
    private String typeInfo;

    public Users() {
    }

    public Users(int userid, String username, String userpwd, String usersex, String phonenumber, String qqnumber, String typeInfo) {
        this.userid = userid;
        this.username = username;
        this.userpwd = userpwd;
        this.usersex = usersex;
        this.phonenumber = phonenumber;
        this.qqnumber = qqnumber;
        this.typeInfo = typeInfo;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
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

    public String getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(String qqnumber) {
        this.qqnumber = qqnumber;
    }

    public String getTypeInfo() {
        return typeInfo;
    }

    public void setTypeInfo(String typeInfo) {
        this.typeInfo = typeInfo;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", usersex='" + usersex + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", qqnumber='" + qqnumber + '\'' +
                ", typeInfo='" + typeInfo + '\'' +
                '}';
    }
}
