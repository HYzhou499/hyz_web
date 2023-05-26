<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/4/17
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css" />
  <%-- <link href="../css/select.css" rel="stylesheet" type="text/css" />--%>
</head>

<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">文献管理</a></li>
        <li><a href="#">查询文献</a></li>
    </ul>
</div>
<div class="rightinfo">
    <form action="../biblManager.do" method="post">
        <input type="hidden" name="flag" value="findBibl"/>
        <ul class="prosearch">
            <li>
                <label>查询：</label>
                <i>题目</i>
                <a>
                    <input name="biblName" type="text" class="scinput" />
                </a>
            </li>
            <li>
                <label>主题：</label>
                <select name="biblTheme" class="scinput">
                    <option value="">/下拉选项</option>
                    <option value="学术期刊">学术期刊</option>
                    <option value="学位论文">学位论文</option>
                    <option value="会议">会议</option>
                    <option value="报纸">报纸</option>
                    <option value="图书">图书</option>
                </select>
            </li>
            <li>
                <label>作者：</label>
                <a>
                    <input name="author" type="text" class="scinput" />
                </a>
            </li>



            <li>
                <label>关键词：</label>
                <input name="keywords" type="text" class="scinput" />
            </li>
            <a>
                <input type="submit" class="sure" value="查询"/>
            </a>
        </ul>
    </form>
</div>
</body></html>

