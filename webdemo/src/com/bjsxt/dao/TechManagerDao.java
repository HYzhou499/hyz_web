package com.bjsxt.dao;

import com.bjsxt.pojo.Biblinfor_cn;
import com.bjsxt.pojo.Techinnov;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/21 12:56
 * @Version 1.0
 */
public interface TechManagerDao {
    void insertTech(Techinnov techinnov);
    String createSQL(Techinnov techinnov);
    List<Techinnov > selectTechByProperty(Techinnov techinnov);
    Techinnov selectTechById(int id);
    void updateTechById(Techinnov techinnov);
    void deleteTechById(int id);
}
