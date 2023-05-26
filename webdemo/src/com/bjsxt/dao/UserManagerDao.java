package com.bjsxt.dao;

import com.bjsxt.pojo.Users;

import java.util.List;


public interface UserManagerDao {
    void insertUser(Users users);
    String createSQL(Users users);
    List<Users> selectUsersByProperty(Users users);
    Users selectUserByUserId(int userid);
    void updateUserByUserId(Users users);
    void deleteUserByUserId(int userid);
    void QRcode(int userid);
}
