package com.bjsxt.dao;

import com.bjsxt.pojo.Socisciinnov;
import com.bjsxt.pojo.Upbibl;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/23 19:02
 * @Version 1.0
 */
public interface UpManagerDao {
    void insertUp(Upbibl upbibl);
    String createSQL(Upbibl upbibl);
    List<Upbibl> selectUpByProperty(Upbibl upbibl);
    Upbibl  selectUpById(int id);
    void updateUpById(Upbibl upbibl);
    void deleteUpById(int id);

}
