package com.bjsxt.service;

import com.bjsxt.pojo.Biblinfor_cn;
import com.bjsxt.pojo.Techinnov;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/21 13:22
 * @Version 1.0
 */
public interface TechManagerService {
    void addTech(Techinnov techinnov);
    List<Techinnov> findTech(Techinnov techinnov);
    Techinnov findTechById(int id);
    void modifyTech(Techinnov techinnov);
    void dropTech(int id);
}
