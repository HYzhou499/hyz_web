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

</head>

<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">文献上传管理</a></li>
        <li><a href="#">查询文献</a></li>
    </ul>
</div>

<div class="rightinfo">
    <form action="../upManager.do" method="post">
        <input type="hidden" name="flag" value="findUp"/>
        <ul class="prosearch">
<%--            <li>
                <label>申请日期：</label>
                <a>
                    <input type="date" id="start1" name="applicationdate" value="today" min="2000-01-01" max="2023-12-31" class="scinput">
                </a>
            </li>--%>
            <li>
                <label>用户名：</label>
                <a>
                    <input name="username" type="text" class="scinput" />
                </a>
            </li>
            <li>
                <label>性别：</label>
                <input name="usersex" type="radio" value="1"  />&nbsp;男&nbsp;&nbsp;
                <input name="usersex" type="radio" value="0" />&nbsp;女
            </li>
            <li>
                <label>手机号：</label>
                <a>
                    <input name="phonenumber" type="text" class="scinput" />
                </a>
            </li>
            <li>
                <label>邮箱：</label>
                <a>
                    <input name="email" type="text" class="scinput" />
                </a>
            </li>
            <li>
                <label>文献题目：</label>
                <input name="biblName" class="scinput" type="text"/>
            </li>
            <li>
                <label>文献主题：</label>
                <a>
                    <select name="biblTheme" class="scinput">
                        <option value="">/下拉选项</option>
                        <option value="学术期刊">学术期刊</option>
                        <option value="学位论文">学位论文</option>
                        <option value="会议">会议</option>
                        <option value="报纸">报纸</option>
                        <option value="图书">图书</option>
                    </select>
                </a>
            </li><li>
            <label>作者：</label>
            <a>
                <input name="author" type="text" class="scinput" />
            </a>
        </li><%--<li>
            <label>发表日期：</label>
            <a>
                <input type="date" id="start" name="postTime" value="2015-01-01" min="2000-01-01" max="2023-12-31" class="scinput">
            </a>
        </li--%>><li>
            <label>关键词：</label>
            <a>
                <input name="keywords" type="text" class="scinput" />
            </a>
        </li><li>
            <label>摘要：</label>
            <a>
                <input name="abstracts" type="text" class="scinput" />
            </a>
        </li>
            <li>
            <label>备注：</label>
            <a>
                <input name="remarks" type="text" class="scinput" />
            </a>
        </li>
            <a>
                <input type="submit" class="sure" value="查询"/>
            </a>
        </ul>
    </form>
</div></body>
</html>
