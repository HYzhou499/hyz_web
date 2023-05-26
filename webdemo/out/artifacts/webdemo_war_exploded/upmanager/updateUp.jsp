<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/4/23
  Time: 18:57
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
    <form action="upManager.do" method="post">
        <input type="hidden" name="flag" value="modifyUp"/>
        <input type="hidden" name="id" value="${upbibl.id}"/>
        <ul class="forminfo">
            <li><label>申请日期</label><input name="applicationdate" type="text" class="dfinput" value="${upbibl.applicationdate }"/></li>
            <li><label>用户名</label><input name="username" type="text" class="dfinput" value="${upbibl.username}"/> </li>
            <li>
                <label>性别</label><cite>
                <c:choose>
                <c:when test="${upbibl.usersex == 1}">
                <input name="usersex" type="radio" value="1" checked="checked" />男&nbsp;&nbsp;&nbsp;&nbsp;
                <input name="usersex" type="radio" value="0" />女
                </c:when>
                <c:otherwise>
                <input name="usersex" type="radio" value="1" />男&nbsp;&nbsp;&nbsp;&nbsp;
                <input name="usersex" type="radio" value="0" checked="checked" />女
                </c:otherwise>
                </c:choose>

            </li>
            <li><label>手机号</label><input name="phonenumber" type="text" class="dfinput" value="${upbibl.phonenumber}"/></li>
            <li><label>邮箱</label><input name="email" type="text" class="dfinput" value="${upbibl.email}"/></li>
            <li><label>文献题目</label><input name="biblName" type="text" class="dfinput" value="${upbibl.biblName}"/></li>
            <li><label>文献主题</label><input name="biblTheme" type="text" class="dfinput" value="${upbibl.biblTheme}"/></li>
            <li><label>作者</label><input name="author" type="text" class="dfinput" value="${upbibl.author}"/></li>
            <li><label>发表日期</label><input name="postTime" type="text" class="dfinput" value="${upbibl.postTime}"/></li>
            <li><label>关键词</label><input name="keywords" type="text" class="dfinput" value="${upbibl.keywords}"/></li>
            <li><label>摘要</label><input name="abstracts" type="text" class="dfinput" value="${upbibl.abstracts}"/></li>
            <li><label>备注</label><input name="remarks" type="text" class="dfinput" value="${upbibl.remarks}"/></li>

            <li><label>&nbsp;</label><input type="submit" class="btn" value="确认保存"/></li>
        </ul>
    </form>
</div>
</body>
</html>
