package com.bjsxt.dao.impl;

import com.bjsxt.commons.JdbcUtils;
import com.bjsxt.dao.SociManagerDao;
import com.bjsxt.pojo.Socisciinnov;
import com.bjsxt.pojo.Techinnov;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/23 14:14
 * @Version 1.0
 */
public class SociManagerDaoImpl implements SociManagerDao {
    @Override
    public void insertTech(Socisciinnov socisciinnov) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("insert into socisciinnov values(default,?,?,?,?,?,?)");
            ps.setString(1,socisciinnov.getBiblName());
            ps.setString(2,socisciinnov.getBiblTheme());
            ps.setString(3,socisciinnov.getAuthor());
            ps.setString(4,socisciinnov.getPostTime());
            ps.setString(5,socisciinnov.getPriSearch());
            ps.setString(6,socisciinnov.getTwoSearch());
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
    public String createSQL(Socisciinnov socisciinnov) {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM socisciinnov WHERE 1=1");

        if (socisciinnov.getBiblName() != null && socisciinnov.getBiblName().length() > 0) {
            stringBuilder.append(" AND biblName = '" + socisciinnov.getBiblName() + "'");
        }
        if (socisciinnov.getBiblTheme() != null && socisciinnov.getBiblTheme().length() > 0) {
            stringBuilder.append(" AND biblTheme = '" +socisciinnov.getBiblTheme() + "'");
        }
        if (socisciinnov.getAuthor() != null &&socisciinnov.getAuthor().length() > 0) {
            stringBuilder.append(" AND author = '" +socisciinnov.getAuthor() + "'");
        }
        if (socisciinnov.getPostTime() != null) {
            stringBuilder.append(" AND postTime = '" +socisciinnov.getPostTime() + "'");
        }
        if (socisciinnov.getPriSearch() != null &&socisciinnov.getPriSearch().length() > 0) {
            stringBuilder.append(" AND priSearch = '" + socisciinnov.getPriSearch() + "'");
        }
        if (socisciinnov.getTwoSearch() != null && socisciinnov.getTwoSearch().length() > 0) {
            stringBuilder.append(" AND twoSearch = '" + socisciinnov.getTwoSearch()+ "'");
        }

        return stringBuilder.toString();
    }

    @Override
    public List<Socisciinnov> selectTechByProperty(Socisciinnov socisciinnov) {
        Connection conn = null;
        List<Socisciinnov> list = new ArrayList<>();
        try{
            conn = JdbcUtils.getConnection();
            String sql = this.createSQL(socisciinnov);
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Socisciinnov socisciinnov1 = new Socisciinnov();
                socisciinnov1.setId(resultSet.getInt("id"));
                socisciinnov1.setBiblName(resultSet.getString("biblName"));
                socisciinnov1.setBiblTheme(resultSet.getString("biblTheme"));
                socisciinnov1.setAuthor(resultSet.getString("author"));
                socisciinnov1.setPostTime(resultSet.getString("postTime"));
                socisciinnov1.setPriSearch(resultSet.getString("priSearch"));
                socisciinnov1.setTwoSearch(resultSet.getString("twoSearch"));
                list.add(socisciinnov1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeConnection(conn);
        }
        return list;
    }

    @Override
    public Socisciinnov selectTechById(int id) {
        Connection conn = null;
        Socisciinnov socisciinnov= null;
        try{
            conn = JdbcUtils.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement("select * from socisciinnov where id = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                socisciinnov=new Socisciinnov();
                socisciinnov.setId(resultSet.getInt("id"));
                socisciinnov.setBiblName(resultSet.getString("biblName"));
                socisciinnov.setBiblTheme(resultSet.getString("biblTheme"));
                socisciinnov.setAuthor(resultSet.getString("author"));
                socisciinnov.setPostTime(resultSet.getString("postTime"));
                socisciinnov.setPriSearch(resultSet.getString("priSearch"));
                socisciinnov.setTwoSearch(resultSet.getString("twoSearch"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeConnection(conn);
        }
        return socisciinnov;
    }

    @Override
    public void updateTechById(Socisciinnov socisciinnov) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement preparedStatement = conn.prepareStatement("update socisciinnov set biblName=? ,biblTheme = ?,author=?,postTime = ? ,priSearch=?,twoSearch =? where id = ? ");
            preparedStatement.setString(1,socisciinnov.getBiblName());
            preparedStatement.setString(2,socisciinnov.getBiblTheme());
            preparedStatement.setString(3,socisciinnov.getAuthor());
            preparedStatement.setString(4,socisciinnov.getPostTime());
            preparedStatement.setString(5,socisciinnov.getPriSearch());
            preparedStatement.setString(6,socisciinnov.getTwoSearch());
            preparedStatement.setInt(7,socisciinnov.getId());
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
            PreparedStatement ps = conn.prepareStatement("delete from socisciinnov where id = ?");
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
}
