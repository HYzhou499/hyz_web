package com.bjsxt.service;

import com.bjsxt.pojo.Biblinfor_cn;

import java.util.List;
import java.util.Map;

/**
 * @Author: 韩yz
 * @Date: 2023/4/17 14:55
 * @Version 1.0
 */
public interface BiblManagerService {
    void addBibl(Biblinfor_cn biblinfor_cn);
    List<Biblinfor_cn> findBibl(Biblinfor_cn biblinfor_cn);
    Biblinfor_cn findBiblById(int id);
    void modifyBibl(Biblinfor_cn biblinfor_cn);
    void dropBibl(int id);
    String visBibl();
}
