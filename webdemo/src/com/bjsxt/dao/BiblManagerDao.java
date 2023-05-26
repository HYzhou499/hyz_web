package com.bjsxt.dao;

import com.bjsxt.pojo.Biblinfor_cn;

import java.util.List;
import java.util.Map;

/**
 * @Author: 韩yz
 * @Date: 2023/4/17 14:19
 * @Version 1.0
 */
public interface BiblManagerDao {
    void insertBibl(Biblinfor_cn biblinfor_cn);
    String createSQL(Biblinfor_cn biblinfor_cn);
    List<Biblinfor_cn> selectBiblByProperty(Biblinfor_cn biblinfor_cn);
    Biblinfor_cn selectBiblById(int id);
    void updateBiblById(Biblinfor_cn biblinfor_cn);
    void deleteBiblById(int id);
    String lookBibl();
}
