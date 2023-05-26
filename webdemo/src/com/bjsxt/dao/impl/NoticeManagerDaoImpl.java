package com.bjsxt.dao.impl;

import com.bjsxt.commons.JdbcUtils;
import com.bjsxt.dao.NoticeManagerDao;
import com.bjsxt.pojo.Notices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 韩yz
 * @Date: 2023/4/24 9:19
 * @Version 1.0
 */
public class NoticeManagerDaoImpl implements NoticeManagerDao {


    @Override
    public void insertNo(Notices notices) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("insert into notice values(default,?,?,?)");
            ps.setString(1, notices.getUpdateTime());
            ps.setString(2, notices.getUpdateAdmin());
            ps.setString(3, notices.getRemarks());
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
    public String createSQL(Notices notices) {
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM notice WHERE 1=1");

        if ( notices.getUpdateTime()!= null && notices.getUpdateTime() .length() > 0) {
            stringBuilder.append(" AND updateTime = '" + notices.getUpdateTime()+ "'");
        }
        if (notices.getUpdateAdmin() != null && notices.getUpdateAdmin() .length() > 0) {
            stringBuilder.append(" AND updateAdmin = '" + notices.getUpdateAdmin()+ "'");
        }
        if ( notices.getRemarks()!= null && notices.getRemarks() .length() > 0) {
            stringBuilder.append(" AND remarks = '" + notices.getRemarks()+ "'");
        }


        return stringBuilder.toString();

    }

    @Override
    public List<Notices> selectNoByProperty(Notices notices) {
        Connection conn = null;
        List<Notices> list = new ArrayList<>();
        try{
            conn = JdbcUtils.getConnection();
            String sql = this.createSQL(notices);
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Notices notices1 = new Notices();
                notices1.setUserid(resultSet.getInt("userid"));
                notices1.setUpdateTime(resultSet.getString("updateTime"));
                notices1.setUpdateAdmin(resultSet.getString("updateAdmin"));
                notices1.setRemarks(resultSet.getString("remarks"));

                list.add(notices1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeConnection(conn);
        }
        return list;
    }

    @Override
    public Notices selectNoById(int userid) {
        Connection conn = null;
        Notices notices = null;
        try{
            conn = JdbcUtils.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement("select * from biblinfor_cn where userid = ?");
            preparedStatement.setInt(1,userid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                notices =new Notices();
                notices.setUserid(resultSet.getInt("userid"));
                notices.setUpdateTime(resultSet.getString("updateTime"));
                notices.setUpdateAdmin(resultSet.getString("updateAdmin"));
                notices.setRemarks(resultSet.getString("remarks"));

            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeConnection(conn);
        }
        return notices;
    }

    @Override
    public void updateNoById(Notices notices) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement preparedStatement = conn.prepareStatement("update notice set updateTime=? ,updateAdmin = ?,remarks=? where userid = ? ");
            preparedStatement.setString(1, notices.getUpdateTime());
            preparedStatement.setString(2, notices.getUpdateAdmin());
            preparedStatement.setString(3, notices.getRemarks());
            preparedStatement.setInt(4, notices.getUserid());
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
    public void deleteNoById(int userid) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("delete from notice where userid = ?");
            ps.setInt(1,userid);
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
