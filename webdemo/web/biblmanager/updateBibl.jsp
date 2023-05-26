<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/4/17
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/2 0002
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">用户管理</a></li>
        <li><a href="#">修改用户</a></li>
    </ul>
</div>

<div class="formbody">

    <div class="formtitle"><span>基本信息</span></div>
    <form action="biblManager.do" method="post">
        <input type="hidden" name="flag" value="modifyBibl"/>
        <input type="hidden" name="id" value="${biblinfor_cn.id}"/>
        <ul class="forminfo">
            <li><label>题目</label><input name="biblName" type="text" class="dfinput" value="${biblinfor_cn.biblName}"/> </li>
            <li><label>主题</label><select name="biblTheme" class="dfinput" value="${biblinfor_cn.biblTheme}">
                <option value="学术期刊">学术期刊</option>
                <option value="学位论文">学位论文</option>
                <option value="会议">会议</option>
                <option value="报纸">报纸</option>
                <option value="图书">图书</option>
            </select></li>
            <li><label>作者</label><input name="author" type="text" class="dfinput" value="${biblinfor_cn.author}"/></li>
            <li><label>发表日期</label><input name="postTime" type="date" class="dfinput" value="${biblinfor_cn.postTime}"/></li>
            <li><label>关键词</label><input name="keywords" type="text" class="dfinput" value="${biblinfor_cn.keywords}"/></li>
            <li><label>摘要</label><input name="abstracts" type="text" class="dfinput" value="${biblinfor_cn.abstracts}"/></li>
            <li><label>&nbsp;</label><input type="submit" class="btn" value="确认保存"/></li>
        </ul>
    </form>
</div>
</body>
</html>
