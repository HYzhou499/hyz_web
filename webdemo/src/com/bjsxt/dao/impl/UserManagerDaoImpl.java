package com.bjsxt.dao.impl;

import com.bjsxt.commons.JdbcUtils;
import com.bjsxt.dao.UserManagerDao;
import com.bjsxt.pojo.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户管理持久层
 */
public class UserManagerDaoImpl implements UserManagerDao {

    @Override
    public void insertUser(Users users) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("insert into users values(default,?,?,?,?,?,?)");
            ps.setString(1,users.getUsername());
            ps.setString(2,users.getUserpwd());
            ps.setString(3,users.getUsersex());
            ps.setString(4,users.getPhonenumber());
            ps.setString(5,users.getQqnumber());
            ps.setString(6,users.getTypeInfo());
            ps.execute();
            conn.commit();
        }catch(Exception e){
            e.printStackTrace();
            JdbcUtils.rollbackConnection(conn);
        }finally{
            JdbcUtils.closeConnection(conn);
        }
    }

    /**
     * 查询用户
     * @param users
     * @return
     */
    @Override
    public List<Users> selectUsersByProperty(Users users) {
        Connection conn = null;
        List<Users> list = new ArrayList<>();
        try{
            conn = JdbcUtils.getConnection();
            String sql = this.createSQL(users);
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Users user = new Users();
                user.setUserid(resultSet.getInt("userid"));
                user.setPhonenumber(resultSet.getString("phonenumber"));
                user.setQqnumber(resultSet.getString("qqnumber"));
                user.setUserpwd(resultSet.getString("userpwd"));
                user.setUsername(resultSet.getString("username"));
                user.setUsersex(resultSet.getString("usersex"));
                user.setTypeInfo(resultSet.getString("typeInfo"));
                list.add(user);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeConnection(conn);
        }
        return list;
    }

    /**
     * 根据用户ID查询用户
     * @param userid
     * @return
     */
    @Override
    public Users selectUserByUserId(int userid) {
        Connection conn = null;
        Users user = null;
        try{
            conn = JdbcUtils.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement("select * from users where userid = ?");
            preparedStatement.setInt(1,userid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                user = new Users();
                user.setUserid(resultSet.getInt("userid"));
                user.setPhonenumber(resultSet.getString("phonenumber"));
                user.setQqnumber(resultSet.getString("qqnumber"));
                user.setUserpwd(resultSet.getString("userpwd"));
                user.setUsername(resultSet.getString("username"));
                user.setUsersex(resultSet.getString("usersex"));
                user.setTypeInfo(resultSet.getString("typeInfo"));

            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeConnection(conn);
        }
        return user;
    }

    /**
     * 更新用户
     * @param users
     */
    @Override
    public void updateUserByUserId(Users users) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement preparedStatement = conn.prepareStatement("update users set username=? ,usersex = ?,phonenumber=?,qqnumber = ? ,typeInfo=? where userid = ? ");
            preparedStatement.setString(1,users.getUsername());
            preparedStatement.setString(2,users.getUsersex());
            preparedStatement.setString(3,users.getPhonenumber());
            preparedStatement.setString(4,users.getQqnumber());
            preparedStatement.setString(5,users.getTypeInfo());
            preparedStatement.setInt(6,users.getUserid());
            preparedStatement.execute();
            conn.commit();
        }catch(Exception e){
            e.printStackTrace();
            JdbcUtils.rollbackConnection(conn);
        }finally {
            JdbcUtils.closeConnection(conn);
        }
    }

    /**
     * 根据用户ID删除用户
     * @param userid
     */
    @Override
    public void deleteUserByUserId(int userid) {
        Connection conn = null;
        try{
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("delete from users where userid = ?");
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


    //拼接查询的SQL语句
    public String createSQL(Users users){
        StringBuffer stringBuffer = new StringBuffer("select * from users where 1=1 ");
        if(users.getUsersex() != null && users.getUsersex().length() > 0){
            stringBuffer.append(" and usersex = "+users.getUsersex());
        }
        if(users.getQqnumber() != null && users.getQqnumber().length() > 0){
            stringBuffer.append(" and qqnumber = "+users.getQqnumber());
        }
        if(users.getUsername() != null && users.getUsername().length() > 0){
            stringBuffer.append(" and username = "+users.getUsername());
        }
        if(users.getPhonenumber() != null &&users.getPhonenumber().length() > 0){
            stringBuffer.append(" and phonenumber = "+users.getPhonenumber());
        }
        if (users.getTypeInfo()!=null&&users.getTypeInfo().length()>0){
            stringBuffer.append("and typeInfo = "+users.getTypeInfo());
        }
        return stringBuffer.toString();
    }
    @Override
    public void QRcode(int userid) {

    }

}
