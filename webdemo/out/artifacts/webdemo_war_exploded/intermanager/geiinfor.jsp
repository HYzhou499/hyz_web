<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/5/9
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%
    // 建立数据库连接
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");

    // 使用SQL语句检索计数器大于5的员工信息
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM biblinfor_cn WHERE query_count > 5");

    // 循环遍历检索到的信息，并输出这些信息
%>
<html>
<head>
    <title>Title</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css" />
    <link href="../css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">智能管理</a></li>
        <li><a href="#">文献推荐</a></li>
    </ul>
</div>
<div class="rightinfo">


    <div class="formtitle1"><span>推荐榜</span></div>

    <table class="tablelist" >
        <thead>
        <tr>
            <th>序号</th>
            <th>题目</th>
            <th>主题</th>
            <th>关键字</th>

        </tr>
        <% while (rs.next()) { %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("biblName") %></td>
            <td><%= rs.getString("biblTheme") %></td>
            <td><%= rs.getString("keywords") %></td>
        </tr>
        <% } %>
        </thead>

        <tbody>

    </table>





    </div>




</div>
</body>
</html>
