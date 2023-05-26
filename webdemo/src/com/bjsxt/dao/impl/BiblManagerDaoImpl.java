package com.bjsxt.dao.impl;

import com.bjsxt.commons.JdbcUtils;
import com.bjsxt.dao.BiblManagerDao;
import com.bjsxt.pojo.Biblinfor_cn;
import com.google.gson.Gson;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 韩yz
 * @Date: 2023/4/17 14:22
 * @Version 1.0
 */
public class BiblManagerDaoImpl implements BiblManagerDao {
    @Override
    public void insertBibl(Biblinfor_cn biblinfor_cn) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("insert into biblinfor_cn values(default,?,?,?,?,?,?)");
            ps.setString(1,biblinfor_cn.getBiblName());
            ps.setString(2,biblinfor_cn.getBiblTheme());
            ps.setString(3,biblinfor_cn.getAuthor());
            ps.setString(4, biblinfor_cn.getPostTime());
            ps.setString(5,biblinfor_cn.getKeywords());
            ps.setString(6,biblinfor_cn.getAbstracts());
            ps.execute();
            conn.commit();
        }catch(Exception e){
            e.printStackTrace();
            JdbcUtils.rollbackConnection(conn);
        }finally{
            JdbcUtils.closeConnection(conn);
        }
    }



    @Override
    public List<Biblinfor_cn> selectBiblByProperty(Biblinfor_cn biblinfor_cn) {
        Connection conn = null;
        List<Biblinfor_cn> list = new ArrayList<>();
        try{
            conn = JdbcUtils.getConnection();
            String sql = this.createSQL(biblinfor_cn);
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Biblinfor_cn cn = new Biblinfor_cn();
                cn.setId(resultSet.getInt("id"));
                cn.setBiblName(resultSet.getString("biblName"));
                cn.setBiblTheme(resultSet.getString("biblTheme"));
                cn.setAuthor(resultSet.getString("author"));
                cn.setPostTime(resultSet.getString("postTime"));
               cn.setKeywords(resultSet.getString("keywords"));
                cn.setAbstracts(resultSet.getString("abstracts"));
                list.add(cn);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeConnection(conn);
        }
        return list;
    }

    @Override
    public Biblinfor_cn selectBiblById(int id) {
        Connection conn = null;
        Biblinfor_cn biblinfor= null;
        try{
            conn = JdbcUtils.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement("select * from biblinfor_cn where id = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                biblinfor=new Biblinfor_cn();
                biblinfor.setId(resultSet.getInt("id"));
                biblinfor.setBiblName(resultSet.getString("biblName"));
                biblinfor.setBiblTheme(resultSet.getString("biblTheme"));
                biblinfor.setAuthor(resultSet.getString("author"));
                biblinfor.setPostTime(resultSet.getString("postTime"));
                biblinfor.setKeywords(resultSet.getString("keywords"));
                biblinfor.setAbstracts(resultSet.getString("abstracts"));
                int queryCount= biblinfor.setQuery_count(resultSet.getInt("query_count")+1);
                PreparedStatement updateStmt = conn.prepareStatement("UPDATE biblinfor_cn SET query_count=?");
                updateStmt.setInt(1, queryCount);
                updateStmt.executeUpdate();

            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeConnection(conn);
        }
        return biblinfor;
    }

    @Override
    public void updateBiblById(Biblinfor_cn biblinfor_cn) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement preparedStatement = conn.prepareStatement("update biblinfor_cn set biblName=? ,biblTheme = ?,author=?,postTime = ? ,keywords=?,abstracts =? where id = ? ");
            preparedStatement.setString(1,biblinfor_cn.getBiblName());
            preparedStatement.setString(2,biblinfor_cn.getBiblTheme());
            preparedStatement.setString(3,biblinfor_cn.getAuthor());
            preparedStatement.setString(4,biblinfor_cn.getPostTime());
            preparedStatement.setString(5,biblinfor_cn.getKeywords());
            preparedStatement.setString(6,biblinfor_cn.getAbstracts());
            preparedStatement.setInt(7,biblinfor_cn.getId());
            preparedStatement.execute();
            conn.commit();
        }catch(Exception e){
            e.printStackTrace();
            JdbcUtils.rollbackConnection(conn);
        }finally {
            JdbcUtils.closeConnection(conn);
        }
    }

    @Override
    public void deleteBiblById(int id) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("delete from biblinfor_cn where id = ?");
            ps.setInt(1,id);
            ps.execute();
            conn.commit();
        }catch(Exception e){
            e.printStackTrace();
            JdbcUtils.rollbackConnection(conn);
        }finally{
            JdbcUtils.closeConnection(conn);
        }

    }

    @Override
    public String lookBibl() {
        Connection conn = null;
        Map<String, Integer> map=null;
        String jsonString=null;
        try{
            conn = JdbcUtils.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT biblTheme, COUNT(*) AS count FROM biblinfor_cn GROUP BY biblTheme");
            ResultSet resultSet = preparedStatement.executeQuery();
            map = new HashMap<String, Integer>();
            while(resultSet.next()){
                map.put(resultSet.getString("biblTheme"), resultSet.getInt("count"));

        }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeConnection(conn);
        }


        return jsonString= new Gson().toJson(map);
    }

    @Override
    public String createSQL(Biblinfor_cn biblinfor_cn) {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM biblinfor_cn WHERE 1=1");

        if (biblinfor_cn.getBiblName() != null && biblinfor_cn.getBiblName().length() > 0) {
            stringBuilder.append(" AND biblName = '" + biblinfor_cn.getBiblName() + "'");
        }
        if (biblinfor_cn.getBiblTheme() != null && biblinfor_cn.getBiblTheme().length() > 0) {
            stringBuilder.append(" AND biblTheme = '" + biblinfor_cn.getBiblTheme() + "'");
        }
        if (biblinfor_cn.getAuthor() != null && biblinfor_cn.getAuthor().length() > 0) {
            stringBuilder.append(" AND author = '" + biblinfor_cn.getAuthor() + "'");
        }
        if (biblinfor_cn.getPostTime() != null) {
            stringBuilder.append(" AND postTime = '" + biblinfor_cn.getPostTime() + "'");
        }
        if (biblinfor_cn.getKeywords() != null && biblinfor_cn.getKeywords().length() > 0) {
            stringBuilder.append(" AND keywords = '" + biblinfor_cn.getKeywords() + "'");
        }
        if (biblinfor_cn.getAbstracts() != null && biblinfor_cn.getAbstracts().length() > 0) {
            stringBuilder.append(" AND abstracts = '" + biblinfor_cn.getAbstracts() + "'");
        }

        return stringBuilder.toString();
    }


}
