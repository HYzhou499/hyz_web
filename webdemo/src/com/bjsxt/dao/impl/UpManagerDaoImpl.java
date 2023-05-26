package com.bjsxt.dao.impl;

import com.bjsxt.commons.JdbcUtils;
import com.bjsxt.dao.UpManagerDao;
import com.bjsxt.pojo.Socisciinnov;
import com.bjsxt.pojo.Upbibl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/23 19:03
 * @Version 1.0
 */
public class UpManagerDaoImpl implements UpManagerDao {
    @Override
    public void insertUp(Upbibl upbibl) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("insert into upbibl values(default,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,upbibl.getApplicationdate());
            ps.setString(2,upbibl.getUsername());
            ps.setString(3,upbibl.getUsersex());
            ps.setString(4,upbibl.getPhonenumber());
            ps.setString(5,upbibl.getEmail());
            ps.setString(6,upbibl.getBiblName());
            ps.setString(7,upbibl.getBiblTheme());
            ps.setString(8,upbibl.getAuthor());
            ps.setString(9,upbibl.getPostTime());
            ps.setString(10,upbibl.getKeywords());
            ps.setString(11,upbibl.getAbstracts());
            ps.setString(12,upbibl.getRemarks());
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
    public String createSQL(Upbibl upbibl) {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM upbibl WHERE 1=1");

        if (upbibl.getApplicationdate() != null && upbibl.getApplicationdate().length() > 0) {
            stringBuilder.append(" AND applicationdate = '" +upbibl.getApplicationdate() + "'");
        }
        if (upbibl.getUsername()!= null && upbibl.getUsername().length() > 0) {
            stringBuilder.append(" AND username = '" +upbibl.getUsername() + "'");
        }
        if (upbibl.getUsersex()!= null &&upbibl.getUsersex().length()> 0) {
            stringBuilder.append(" AND usersex = '" +upbibl.getUsersex()+ "'");
        }
        if (upbibl.getPhonenumber()!= null &&upbibl.getPhonenumber().length()> 0) {
            stringBuilder.append(" AND phonenumber = '" +upbibl.getPhonenumber()+ "'");
        }
        if (upbibl.getEmail()!= null &&upbibl.getEmail().length()> 0) {
            stringBuilder.append(" AND email = '" +upbibl.getEmail()+ "'");
        }
        if (upbibl.getBiblName()!= null &&upbibl.getBiblName().length()> 0) {
            stringBuilder.append(" AND biblName  = '" +upbibl.getBiblName()+ "'");
        }
        if (upbibl.getBiblTheme()!= null &&upbibl.getBiblTheme().length()> 0) {
            stringBuilder.append(" AND biblTheme= '" +upbibl.getBiblTheme()+ "'");
        }
        if (upbibl.getAuthor()!= null &&upbibl.getAuthor().length()> 0) {
            stringBuilder.append(" AND author = '" +upbibl.getAuthor()+ "'");
        }
        if (upbibl.getPostTime()!= null &&upbibl.getPostTime().length()> 0) {
            stringBuilder.append(" AND postTime = '" +upbibl.getPostTime()+ "'");
        }
        if (upbibl.getKeywords()!= null &&upbibl.getKeywords().length()> 0) {
            stringBuilder.append(" AND keywords = '" +upbibl.getKeywords()+ "'");
        }
        if (upbibl.getAbstracts()!= null &&upbibl.getAbstracts().length()> 0) {
            stringBuilder.append(" AND abstracts = '" +upbibl.getAbstracts()+ "'");
        }
        if (upbibl.getRemarks()!= null &&upbibl.getRemarks().length()> 0) {
            stringBuilder.append(" AND  remarks= '" +upbibl.getRemarks()+ "'");
        }
        return stringBuilder.toString();
    }

    @Override
    public List<Upbibl> selectUpByProperty(Upbibl upbibl) {
        Connection conn = null;
        List<Upbibl> list = new ArrayList<>();
        try {
            conn = JdbcUtils.getConnection();
            String sql = this.createSQL(upbibl);
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Upbibl upbibl1 = new Upbibl();
                upbibl1.setId(resultSet.getInt("id"));
                upbibl1.setApplicationdate(resultSet.getString("applicationdate"));
                upbibl1.setUsername(resultSet.getString("username"));
                upbibl1.setUsersex(resultSet.getString("usersex"));
                upbibl1.setPhonenumber(resultSet.getString("phonenumber"));
                upbibl1.setEmail(resultSet.getString("email"));
                upbibl1.setBiblName(resultSet.getString("biblName"));
                upbibl1.setBiblTheme(resultSet.getString("biblTheme"));
                upbibl1.setAuthor(resultSet.getString("author"));
                upbibl1.setPostTime(resultSet.getString("postTime"));
                upbibl1.setKeywords(resultSet.getString("keywords"));
                upbibl1.setAbstracts(resultSet.getString("abstracts"));
                upbibl1.setRemarks(resultSet.getString("remarks"));
                list.add(upbibl1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeConnection(conn);
        }
        return list;
    }
    @Override
    public Upbibl selectUpById(int id) {
            Connection conn = null;
            Upbibl upbibl1= null;
            try{
                conn = JdbcUtils.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement("select * from upbibl where id = ?");
                preparedStatement.setInt(1,id);
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    upbibl1= new Upbibl();
                    upbibl1.setId(resultSet.getInt("id"));
                    upbibl1.setApplicationdate(resultSet.getString("applicationdate"));
                    upbibl1.setUsername(resultSet.getString("username"));
                    upbibl1.setUsersex(resultSet.getString("usersex"));
                    upbibl1.setPhonenumber(resultSet.getString("phonenumber"));
                    upbibl1.setEmail(resultSet.getString("email"));
                    upbibl1.setBiblName(resultSet.getString("biblName"));
                    upbibl1.setBiblTheme(resultSet.getString("biblTheme"));
                    upbibl1.setAuthor(resultSet.getString("author"));
                    upbibl1.setPostTime(resultSet.getString("postTime"));
                    upbibl1.setKeywords(resultSet.getString("keywords"));
                    upbibl1.setAbstracts(resultSet.getString("abstracts"));
                    upbibl1.setRemarks(resultSet.getString("remarks"));
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                JdbcUtils.closeConnection(conn);
            }
            return upbibl1;
    }

    @Override
    public void updateUpById(Upbibl upbibl) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement preparedStatement = conn.prepareStatement("update upbibl set applicationdate=?,username=?,usersex=?, phonenumber=?, email=?, biblName=?, biblTheme=?, author=?, postTime=?,  keywords=?, abstracts=?, remarks=? where id = ? ");
            preparedStatement.setString(1,upbibl.getApplicationdate());
            preparedStatement.setString(2,upbibl.getUsername());
            preparedStatement.setString(3,upbibl.getUsersex());
            preparedStatement.setString(4,upbibl.getPhonenumber());
            preparedStatement.setString(5,upbibl.getEmail());
            preparedStatement.setString(6,upbibl.getBiblName());
            preparedStatement.setString(7,upbibl.getBiblTheme());
            preparedStatement.setString(8,upbibl.getAuthor());
            preparedStatement.setString(9,upbibl.getPostTime());
            preparedStatement.setString(10,upbibl.getKeywords());
            preparedStatement.setString(11,upbibl.getAbstracts());
            preparedStatement.setString(12,upbibl.getRemarks());

            preparedStatement.setInt(13,upbibl.getId());
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
    public void deleteUpById(int id) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("delete from upbibl where id = ?");
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
