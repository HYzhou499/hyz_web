<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/4/23
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css" />
    <link href="../css/style.css" rel="stylesheet" type="text/css" />
    <link href="../css/select.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">上传文献管理</a></li>
        <li><a href="#">添加上传文献</a></li>
    </ul>
</div>

<div class="formbody">

    <div class="formtitle"><span>基本信息</span></div>
    <form action="../upManager.do" method="post">
        <input type="hidden"  name="flag" value="addUp"/>
        <ul class="forminfo">
            <li>
                <label>申请日期</label>
                <input type="date" id="start1" name="applicationdate" value="today" min="2000-01-01" max="2023-12-31" class="scinput">
            <li>
            <li>
                <label>用户名</label>
                <input name="username" type="text" class="dfinput" /><i></i></li>
            <li>
                <label>性别</label><cite>
                <input name="usersex" type="radio" value="1" checked="checked" />男&nbsp;&nbsp;&nbsp;&nbsp;
                <input name="usersex" type="radio" value="0" />女

            </cite></li>
            <li>
                <label>联系方式</label>
                <input name="phonenumber" type="text" class="dfinput" />
            </li>
            <li>
                <label>邮箱</label>
                <input name="email" type="text" class="dfinput" />
            </li>
            <li>
                <label>文献题目</label>
                <input name="biblName" type="text" class="dfinput" />
            </li>
            <li>
                <label>文献主题</label>
                <select name="biblTheme" class="dfinput">
                    <option value="学术期刊">学术期刊</option>
                    <option value="学位论文">学位论文</option>
                    <option value="会议">会议</option>
                    <option value="报纸">报纸</option>
                    <option value="图书">图书</option>
                </select>
            </li>
            <li>
            <label>作者</label>
            <input name="author" type="text" class="dfinput" />
        </li>
            <li>
            <label>发表日期</label>
                <input type="date" id="start" name="postTime" value="2015-01-01" min="2000-01-01" max="2023-12-31" class="scinput">
        </li>
            <li>
            <label>关键词</label>
            <input name="keywords" type="text" class="dfinput" />
        </li>
            <li>
            <label>摘要</label>
            <input name="abstracts" type="text" class="dfinput" />
        </li>
            <li>
                <label>备注</label>
                <input name="remarks" type="text" class="dfinput" />
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
