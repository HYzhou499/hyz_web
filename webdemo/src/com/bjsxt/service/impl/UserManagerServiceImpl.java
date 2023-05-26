package com.bjsxt.service.impl;

import com.bjsxt.dao.UserManagerDao;
import com.bjsxt.dao.impl.UserManagerDaoImpl;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UserManagerService;

import java.util.List;


/**
 * 用户管理业务层
 */
public class UserManagerServiceImpl implements UserManagerService {
    /**
     * 添加用户
     * @param users
     */
    @Override
    public void addUser(Users users) {
        UserManagerDao userManagerDao = new UserManagerDaoImpl();
        userManagerDao.insertUser(users);
    }

    /**
     * 查询用户
     * @param users
     * @return
     */
    @Override
    public List<Users> findUser(Users users) {
        UserManagerDao userManagerDao = new UserManagerDaoImpl();
        return userManagerDao.selectUsersByProperty(users);
    }

    /**
     * 预更新用户的查询
     * @param userid
     * @return
     */
    @Override
    public Users findUserByUserId(int userid) {
        UserManagerDao userManagerDao = new UserManagerDaoImpl();
        return userManagerDao.selectUserByUserId(userid);
    }

    /**
     * 修改用户
     * @param users
     */
    @Override
    public void modifyUser(Users users) {
        UserManagerDao userManagerDao  = new UserManagerDaoImpl();
        userManagerDao.updateUserByUserId(users);
    }

    /**
     * 删除用户
     * @param userid
     */
    @Override
    public void dropUser(int userid) {
        UserManagerDao userManagerDao = new UserManagerDaoImpl();
        userManagerDao.deleteUserByUserId(userid);
    }
}
