package com.bjsxt.service.impl;

import com.bjsxt.dao.NoticeManagerDao;
import com.bjsxt.dao.impl.NoticeManagerDaoImpl;
import com.bjsxt.pojo.Notices;
import com.bjsxt.service.NoticeManagerService;
import com.mysql.cj.protocol.x.Notice;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/24 13:39
 * @Version 1.0
 */
public class NoticeManagerServiceImpl implements NoticeManagerService {

    @Override
    public void addNo(Notices notices) {
        NoticeManagerDao noticeManagerDao=new NoticeManagerDaoImpl();
        noticeManagerDao.insertNo(notices);
    }

    @Override
    public List<Notices> findNo(Notices notices) {
        NoticeManagerDao noticeManagerDao=new NoticeManagerDaoImpl();
        return noticeManagerDao.selectNoByProperty(notices);
    }

    @Override
    public Notices findNoById(int userid) {
        NoticeManagerDao noticeManagerDao=new NoticeManagerDaoImpl();
        return noticeManagerDao.selectNoById(userid);
    }

    @Override
    public void modifyNo(Notices notices) {
        NoticeManagerDao noticeManagerDao=new NoticeManagerDaoImpl();
        noticeManagerDao.updateNoById(notices);
    }

    @Override
    public void dropNo(int userid) {
        NoticeManagerDao noticeManagerDao=new NoticeManagerDaoImpl();
        noticeManagerDao.deleteNoById(userid);
    }
}
