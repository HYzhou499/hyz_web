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
    <title>通知添加</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css" />
    <link href="../css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">通知管理</a></li>
        <li><a href="#">添加通知</a></li>
    </ul>
</div>

<div class="formbody">

    <div class="formtitle"><span>更新信息</span></div>
    <form action="../noManager.do" method="post">
        <input type="hidden"  name="flag" value="addNo"/>
        <ul class="forminfo">
            <li>
                <label>更新日期</label>
                <input type="date" id="start" name="updateTime" value="2015-01-01" min="2000-01-01" max="2023-12-31" class="scinput">
            <li>
                <label>更新管理员：</label>
                  <input name="updateAdmin"type="text" class="dfinput">&nbsp;
            <li>
                <label>备注</label>
                <input name="remarks"type="text" class="dfinput">&nbsp;

            </li>
            <li>
                <label>&nbsp;</label>
                <input  type="submit"  class="btn" value="确认保存" />
            </li>
        </ul>
    </form>
</div>

</body>

</html>
