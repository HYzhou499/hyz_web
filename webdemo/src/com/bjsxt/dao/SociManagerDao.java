package com.bjsxt.dao;

import com.bjsxt.pojo.Socisciinnov;
import com.bjsxt.pojo.Techinnov;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/23 14:13
 * @Version 1.0
 */
public interface SociManagerDao {
    void insertTech(Socisciinnov socisciinnov);
    String createSQL(Socisciinnov socisciinnov);
    List<Socisciinnov> selectTechByProperty(Socisciinnov socisciinnov);
    Socisciinnov selectTechById(int id);
    void updateTechById(Socisciinnov socisciinnov);
    void deleteTechById(int id);
}
