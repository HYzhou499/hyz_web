package com.bjsxt.service;

import com.bjsxt.pojo.Biblinfor_cn;
import com.bjsxt.pojo.Notices;
import com.mysql.cj.protocol.x.Notice;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/24 13:39
 * @Version 1.0
 */
public interface NoticeManagerService {
    void addNo(Notices notices);
    List<Notices> findNo(Notices notices);
    Notices findNoById(int userid);
    void modifyNo(Notices notices);
    void dropNo(int userid);

}
