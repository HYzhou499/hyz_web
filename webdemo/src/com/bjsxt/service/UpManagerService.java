package com.bjsxt.service;

import com.bjsxt.pojo.Socisciinnov;
import com.bjsxt.pojo.Upbibl;

import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/23 19:50
 * @Version 1.0
 */
public interface UpManagerService {
    void addUp(Upbibl upbibl);
    List<Upbibl> findUp(Upbibl upbibl);
    Upbibl findUpById(int id);
    void modifyUp(Upbibl upbibl);
    void dropUp(int id);
}
