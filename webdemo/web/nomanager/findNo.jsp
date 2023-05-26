<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/4/23
  Time: 21:12
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
    <form action="../noManager.do" method="post">
        <input type="hidden" name="flag" value="findNo"/>
        <ul class="prosearch">
            <a>
                <input type="submit" class="sure" value="显示全部通知"/>
            </a>
        </ul>
    </form>
</div>
</body></html>
