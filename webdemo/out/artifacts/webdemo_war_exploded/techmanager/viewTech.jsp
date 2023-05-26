<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/4/22
  Time: 15:07
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
            <th>一级索引</th>
            <th>二级索引</th>
            <th>操作</th>

        </tr>
        </thead>

        <tbody>
        <c:forEach items="${list}" var="tech" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${tech.biblName}</td>
                <td>${tech.biblTheme}</td>
                <td>${tech.author}</td>
                <td>${tech.postTime}</td>
<%--                <td>${tech.priSearch}</td>
                <td>${tech.twoSearch}</td>--%>
                <td>
                    <c:choose>
                    <c:when test="${tech.priSearch=='A'}">
                        医疗卫生
                    </c:when>
                        <c:when test="${tech.priSearch=='B'}">
                         农林食药
                        </c:when>
                        <c:when test="${tech.priSearch=='C'}">
                        资源环境
                    </c:when>
                        <c:when test="${tech.priSearch=='D'}">
                       电子信息
                    </c:when>
                        <c:when test="${tech.priSearch=='E'}">
                       航天航空
                    </c:when>
                    <c:otherwise>
                        出错了
                    </c:otherwise>
                </c:choose>
                </td>
                <td>
                    <c:choose>
                    <c:when test="${tech.priSearch=='A'}">
                       <c:if test="${tech.twoSearch==0}">
                           综合医院
                       </c:if>
                        <c:if test="${tech.twoSearch==1}">
                            公共卫生
                        </c:if>
                    </c:when>
                    <c:when test="${tech.priSearch=='B'}">
                        <c:if test="${tech.twoSearch==0}">
                            农林
                        </c:if>
                        <c:if test="${tech.twoSearch==1}">
                           农业科技
                        </c:if>
                        <c:if test="${tech.twoSearch==2}">
                            农业生物
                        </c:if>
                    </c:when>
                    <c:when test="${tech.priSearch=='C'}">
                        <c:if test="${tech.twoSearch==0}">
                           水利
                        </c:if>
                        <c:if test="${tech.twoSearch==1}">
                            气象
                        </c:if>
                        <c:if test="${tech.twoSearch==1}">
                            矿物
                        </c:if>
                    </c:when>

                    <c:when test="${tech.priSearch=='D'}">
                        <c:if test="${tech.twoSearch==0}">
                           通信
                        </c:if>
                        <c:if test="${tech.twoSearch==1}">
                           集成开发
                        </c:if>
                        <c:if test="${tech.twoSearch==2}">
                           软件开发
                        </c:if>
                    </c:when>
                    <c:when test="${tech.priSearch=='E'}">
                        <c:if test="${tech.twoSearch==0}">
                           航天
                        </c:if>
                        <c:if test="${tech.twoSearch==1}">
                            航空
                        </c:if>
                    </c:when>
                    <c:otherwise>
                        出错了
                    </c:otherwise>
                </c:choose></td>
                <td><a href="techManager.do?flag=preUpdate&id=${tech.id}" class="tablelink">修改</a> &nbsp;
                    <a href="techManager.do?id=${tech.id}" class="tablelink click"> 删除</a></td>
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
