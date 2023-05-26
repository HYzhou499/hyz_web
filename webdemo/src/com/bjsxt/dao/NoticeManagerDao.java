package com.bjsxt.dao;

import com.bjsxt.pojo.Notices;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/23 21:11
 * @Version 1.0
 */
public interface NoticeManagerDao {
    void insertNo(Notices notices);
    String createSQL(Notices notices);
    List<Notices> selectNoByProperty(Notices notices);
    Notices selectNoById(int userid);
    void updateNoById(Notices notices);
    void deleteNoById(int userid);
}
