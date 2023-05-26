package com.bjsxt.service.impl;

import com.bjsxt.dao.BiblManagerDao;
import com.bjsxt.dao.TechManagerDao;
import com.bjsxt.dao.impl.BiblManagerDaoImpl;
import com.bjsxt.dao.impl.TechManagerDaoImpl;
import com.bjsxt.pojo.Techinnov;
import com.bjsxt.service.TechManagerService;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/21 13:23
 * @Version 1.0
 */
public class TechManagerServiceImpl implements TechManagerService {
    @Override
    public void addTech(Techinnov techinnov) {
        TechManagerDao techManagerDao=new TechManagerDaoImpl();
        techManagerDao.insertTech(techinnov);
    }

    @Override
    public List<Techinnov> findTech(Techinnov techinnov) {
        TechManagerDao techManagerDao=new TechManagerDaoImpl();
        return  techManagerDao.selectTechByProperty(techinnov);
    }

    @Override
    public Techinnov findTechById(int id) {
        TechManagerDao techManagerDao=new TechManagerDaoImpl();
       return  techManagerDao.selectTechById(id);
    }

    @Override
    public void modifyTech(Techinnov techinnov) {
        TechManagerDao techManagerDao=new TechManagerDaoImpl();
        techManagerDao.updateTechById(techinnov);
    }

    @Override
    public void dropTech(int id) {
        TechManagerDao techManagerDao=new TechManagerDaoImpl();
        techManagerDao.deleteTechById(id);
    }
}
