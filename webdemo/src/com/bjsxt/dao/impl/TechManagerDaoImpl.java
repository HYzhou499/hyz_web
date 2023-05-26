package com.bjsxt.dao.impl;

import com.bjsxt.commons.JdbcUtils;
import com.bjsxt.dao.TechManagerDao;
import com.bjsxt.pojo.Biblinfor_cn;
import com.bjsxt.pojo.Techinnov;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/21 12:59
 * @Version 1.0
 */
public class TechManagerDaoImpl implements TechManagerDao {
    @Override
    public void insertTech(Techinnov techinnov) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("insert into techinnov values(default,?,?,?,?,?,?)");
            ps.setString(1,techinnov.getBiblName());
            ps.setString(2,techinnov.getBiblTheme());
            ps.setString(3,techinnov.getAuthor());
            ps.setString(4, techinnov.getPostTime());
            ps.setString(5,techinnov.getPriSearch());
            ps.setString(6,techinnov.getTwoSearch());
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
    public List<Techinnov> selectTechByProperty(Techinnov techinnov) {
        Connection conn = null;
        List<Techinnov> list = new ArrayList<>();
        try{
            conn = JdbcUtils.getConnection();
            String sql = this.createSQL(techinnov);
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Techinnov techinnov1 = new Techinnov();
                techinnov1.setId(resultSet.getInt("id"));
                techinnov1.setBiblName(resultSet.getString("biblName"));
                techinnov1.setBiblTheme(resultSet.getString("biblTheme"));
                techinnov1.setAuthor(resultSet.getString("author"));
                techinnov1.setPostTime(resultSet.getString("postTime"));
                techinnov1.setPriSearch(resultSet.getString("priSearch"));
                techinnov1.setTwoSearch(resultSet.getString("twoSearch"));
                list.add(techinnov1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeConnection(conn);
        }
        return list;
    }

    @Override
    public Techinnov selectTechById(int id) {
        Connection conn = null;
        Techinnov techinnov= null;
        try{
            conn = JdbcUtils.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement("select * from techinnov where id = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                techinnov=new Techinnov();
                techinnov.setId(resultSet.getInt("id"));
                techinnov.setBiblName(resultSet.getString("biblName"));
                techinnov.setBiblTheme(resultSet.getString("biblTheme"));
                techinnov.setAuthor(resultSet.getString("author"));
                techinnov.setPostTime(resultSet.getString("postTime"));
                techinnov.setPriSearch(resultSet.getString("priSearch"));
                techinnov.setTwoSearch(resultSet.getString("twoSearch"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeConnection(conn);
        }
        return techinnov;
    }

    @Override
    public void updateTechById(Techinnov techinnov) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement preparedStatement = conn.prepareStatement("update techinnov set biblName=? ,biblTheme = ?,author=?,postTime = ? ,priSearch=?,twoSearch =? where id = ? ");
            preparedStatement.setString(1,techinnov.getBiblName());
            preparedStatement.setString(2,techinnov.getBiblTheme());
            preparedStatement.setString(3,techinnov.getAuthor());
            preparedStatement.setString(4,techinnov.getPostTime());
            preparedStatement.setString(5,techinnov.getPriSearch());
            preparedStatement.setString(6,techinnov.getTwoSearch());
            preparedStatement.setInt(7,techinnov.getId());
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
    public void deleteTechById(int id) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("delete from techinnov where id = ?");
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
    public String createSQL(Techinnov techinnov) {
            StringBuilder stringBuilder = new StringBuilder("SELECT * FROM techinnov WHERE 1=1");

            if (techinnov.getBiblName() != null && techinnov.getBiblName().length() > 0) {
                stringBuilder.append(" AND biblName = '" + techinnov.getBiblName() + "'");
            }
            if (techinnov.getBiblTheme() != null && techinnov.getBiblTheme().length() > 0) {
                stringBuilder.append(" AND biblTheme = '" + techinnov.getBiblTheme() + "'");
            }
            if (techinnov.getAuthor() != null && techinnov.getAuthor().length() > 0) {
                stringBuilder.append(" AND author = '" + techinnov.getAuthor() + "'");
            }
            if (techinnov.getPostTime() != null) {
                stringBuilder.append(" AND postTime = '" + techinnov.getPostTime() + "'");
            }
            if (techinnov.getPriSearch() != null && techinnov.getPriSearch().length() > 0) {
                stringBuilder.append(" AND priSearch = '" + techinnov.getPriSearch() + "'");
            }
            if (techinnov.getTwoSearch() != null && techinnov.getTwoSearch().length() > 0) {
                stringBuilder.append(" AND twoSearch = '" + techinnov.getTwoSearch()+ "'");
            }

            return stringBuilder.toString();
        }



}
