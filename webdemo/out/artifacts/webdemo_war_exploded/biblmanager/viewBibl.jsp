<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/4/17
  Time: 18:08
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
        <li><a href="#">文献管理</a></li>
        <li><a href="#">查询文献</a></li>
        <li><a href="#">查询结果</a></li>
    </ul>
</div>

<div class="rightinfo">


    <div class="formtitle1"><span>用户列表</span></div>

    <table class="tablelist" >
        <thead>
        <tr>
            <th>序号</th>
            <th>题目</th>
            <th>主题</th>
            <th>作者</th>
            <th>发表日期</th>
            <th>关键字</th>
            <th>摘要</th>
            <th>操作</th>

        </tr>
        </thead>

        <tbody>
        <c:forEach items="${list}" var="bibl" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${bibl.biblName}</td>
                <td>${bibl.biblTheme}</td>
                <td>${bibl.author}</td>
                <td>${bibl.postTime}</td>
                <td>${bibl.keywords}</td>
                <td>${bibl.abstracts}</td>
                <td><a href="biblManager.do?flag=preUpdate&id=${bibl.id}" class="tablelink">修改</a> &nbsp;
                     <a href="biblManager.do?id=${bibl.id}" class="tablelink click"> 删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>



    <div class="tip">
        <div class="tiptop"><span>提示信息</span><a></a></div>

        <div class="tipinfo">
            <span><img src="images/ticon.png" /></span>
            <div class="tipright">
                <p>是否确认对信息的修改 ？</p>
                <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
            </div>
        </div>

        <div class="tipbtn">
            <input name="" type="button"  class="sure" value="确定" />&nbsp;
            <input name="" type="button"  class="cancel" value="取消" />
        </div>

    </div>




</div>
</body>
</html>

