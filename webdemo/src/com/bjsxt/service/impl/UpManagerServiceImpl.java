package com.bjsxt.service.impl;

import com.bjsxt.dao.UpManagerDao;
import com.bjsxt.dao.impl.UpManagerDaoImpl;
import com.bjsxt.pojo.Upbibl;
import com.bjsxt.service.UpManagerService;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/23 19:52
 * @Version 1.0
 */
public class UpManagerServiceImpl implements UpManagerService {
    @Override
    public void addUp(Upbibl upbibl) {
        UpManagerDao upManagerDao=new UpManagerDaoImpl();
        upManagerDao.insertUp(upbibl);
    }

    @Override
    public List<Upbibl> findUp(Upbibl upbibl) {
        UpManagerDao upManagerDao=new UpManagerDaoImpl();
        return upManagerDao.selectUpByProperty(upbibl);
    }

    @Override
    public Upbibl findUpById(int id) {
        UpManagerDao upManagerDao=new UpManagerDaoImpl();
        return upManagerDao.selectUpById(id);
    }

    @Override
    public void modifyUp(Upbibl upbibl) {
        UpManagerDao upManagerDao=new UpManagerDaoImpl();
        upManagerDao.updateUpById(upbibl);
    }

    @Override
    public void dropUp(int id) {
        UpManagerDao upManagerDao=new UpManagerDaoImpl();
        upManagerDao.deleteUpById(id);
    }
}
