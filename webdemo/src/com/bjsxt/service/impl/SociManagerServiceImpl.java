package com.bjsxt.service.impl;

import com.bjsxt.dao.SociManagerDao;
import com.bjsxt.dao.TechManagerDao;
import com.bjsxt.dao.impl.SociManagerDaoImpl;
import com.bjsxt.dao.impl.TechManagerDaoImpl;
import com.bjsxt.pojo.Socisciinnov;
import com.bjsxt.service.SociManagerService;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/23 14:41
 * @Version 1.0
 */
public class SociManagerServiceImpl implements SociManagerService {
    @Override
    public void addTech(Socisciinnov socisciinnov) {
        SociManagerDao sociManagerDao =new SociManagerDaoImpl();
        sociManagerDao.insertTech(socisciinnov);
    }

    @Override
    public List<Socisciinnov> findTech(Socisciinnov socisciinnov) {
        SociManagerDao sociManagerDao =new SociManagerDaoImpl();
        return  sociManagerDao.selectTechByProperty(socisciinnov);
    }

    @Override
    public Socisciinnov findTechById(int id) {
        SociManagerDao sociManagerDao =new SociManagerDaoImpl();
        return  sociManagerDao.selectTechById(id);
    }

    @Override
    public void modifyTech(Socisciinnov socisciinnov) {
        SociManagerDao sociManagerDao =new SociManagerDaoImpl();
        sociManagerDao.updateTechById(socisciinnov);
    }

    @Override
    public void dropTech(int id) {
        SociManagerDao sociManagerDao =new SociManagerDaoImpl();
        sociManagerDao.deleteTechById(id);
    }
}
