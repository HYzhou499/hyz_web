package com.bjsxt.pojo;

/**
 * @Author: 韩yz
 * @Date: 2023/4/17 11:18
 * @Version 1.0
 */
public class Notices {
    private int  userid;
    private String updateTime;
    private String updateAdmin;
    private String remarks;

    public Notices() {
    }

    public Notices(int userid, String updateTime, String updateAdmin, String remarks) {
        this.userid = userid;
        this.updateTime = updateTime;
        this.updateAdmin = updateAdmin;
        this.remarks = remarks;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateAdmin() {
        return updateAdmin;
    }

    public void setUpdateAdmin(String updateAdmin) {
        this.updateAdmin = updateAdmin;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "userid=" + userid +
                ", updateTime='" + updateTime + '\'' +
                ", updateAdmin='" + updateAdmin + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
