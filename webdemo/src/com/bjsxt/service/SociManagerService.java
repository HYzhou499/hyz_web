package com.bjsxt.service;

import com.bjsxt.pojo.Socisciinnov;
import com.bjsxt.pojo.Techinnov;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/23 14:39
 * @Version 1.0
 */
public interface SociManagerService{
    void addTech(Socisciinnov socisciinnov);
    List<Socisciinnov> findTech(Socisciinnov socisciinnov);
    Socisciinnov findTechById(int id);
    void modifyTech(Socisciinnov socisciinnov);
    void dropTech(int id);
}
