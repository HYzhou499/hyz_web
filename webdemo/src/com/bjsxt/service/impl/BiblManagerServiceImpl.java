package com.bjsxt.service.impl;

import com.bjsxt.dao.BiblManagerDao;
import com.bjsxt.dao.impl.BiblManagerDaoImpl;
import com.bjsxt.pojo.Biblinfor_cn;
import com.bjsxt.service.BiblManagerService;

import java.util.List;
import java.util.Map;

/**
 * @Author: 韩yz
 * @Date: 2023/4/17 14:57
 * @Version 1.0
 */
public class BiblManagerServiceImpl implements BiblManagerService {
    @Override
    public void addBibl(Biblinfor_cn biblinfor_cn) {
        BiblManagerDao biblManagerDao=new BiblManagerDaoImpl();
        biblManagerDao.insertBibl(biblinfor_cn);
    }

    @Override
    public List<Biblinfor_cn> findBibl(Biblinfor_cn biblinfor_cn) {
        BiblManagerDao biblManagerDao=new BiblManagerDaoImpl();
      return biblManagerDao.selectBiblByProperty(biblinfor_cn);
    }

    @Override
    public Biblinfor_cn findBiblById(int id) {
        BiblManagerDao biblManagerDao=new BiblManagerDaoImpl();
       return biblManagerDao.selectBiblById(id);
    }

    @Override
    public void modifyBibl(Biblinfor_cn biblinfor_cn) {
        BiblManagerDao biblManagerDao=new BiblManagerDaoImpl();
        biblManagerDao.updateBiblById(biblinfor_cn);
    }

    @Override
    public void dropBibl(int id) {
        BiblManagerDao biblManagerDao=new BiblManagerDaoImpl();
        biblManagerDao.deleteBiblById(id);
    }

    @Override
    public String visBibl() {
        BiblManagerDao biblManagerDao=new BiblManagerDaoImpl();
       return biblManagerDao.lookBibl();
    }
}
