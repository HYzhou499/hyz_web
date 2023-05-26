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
        <li><a href="#">科技文献管理</a></li>
        <li><a href="#">修改科技文献</a></li>
    </ul>
</div>

<div class="formbody">

    <div class="formtitle"><span>基本信息</span></div>
    <form action="sociManager.do" method="post">
        <input type="hidden" name="flag" value="modifyTech"/>
        <input type="hidden" name="id" value="${socisciinnov.id}"/>
        <ul class="forminfo">
            <li><label>题目</label><input name="biblName" type="text" class="dfinput" value="${socisciinnov.biblName}"/> </li>
            <li><label>主题</label><select name="biblTheme" class="dfinput" value="${socisciinnov.biblTheme}">
                <option value="学术期刊">学术期刊</option>
                <option value="学位论文">学位论文</option>
                <option value="会议">会议</option>
                <option value="报纸">报纸</option>
                <option value="图书">图书</option>
            </select></li>
            <li><label>作者</label><input name="author" type="text" class="dfinput" value="${socisciinnov.author}"/></li>
            <li><label>发表日期</label><input name="postTime" type="date" class="dfinput" value="${socisciinnov.postTime}"/></li>
            <li>
                <label>一级索引</label>
                <!第一个下拉框内容>
                <select id="initials" onchange="Change_second_selectwords();" name="priSearch" class="scinput">

                    <option value="">/下拉选项</option>
                    <option value="A">行政</option>
                    <option value="B">法律</option>
                    <option value="C">金融</option>
                    <option value="D">公共文化</option>
                    <option value="E">旅游文博</option>
                </select>
            </li>
            <li>
                <label>二级索引</label>
                <select id="top_domains" name="twoSearch" class="scinput" value="${socisciinnov.twoSearch}"></select>
            </li>
            <li><label>&nbsp;</label><input type="submit" class="btn" value="确认保存"/></li>
        </ul>
    </form>
</div>
<script>
    var first_keywords = {};
    //定义每个字母对应的第二个下拉框
    first_keywords['A'] = ['税务', '海关'];
    first_keywords['B'] = ['司法', '鉴定', '仲裁'];
    first_keywords['C'] = ['电子商务', '对外贸易', '股票'];
    first_keywords['D'] = ['公共图书馆', '美术馆', '体育'];
    first_keywords['E'] = ['考古', '旅游'];
    function Change_second_selectwords() {
        //根据id找到两个下拉框对象
        var target1 = document.getElementById("initials");
        var target2 = document.getElementById("top_domains");
        //得到第一个下拉框的内容
        var selected_initial = target1.options[target1.selectedIndex].value;

        //清空第二个下拉框
        while (target2.options.length) {
            target2.remove(0);
        }
        //根据第一个下拉框的内容找到对应的列表
        var initial_list = first_keywords[selected_initial];
        if (initial_list) {
            for (var i = 0; i < initial_list.length; i++) {
                var item = new Option(initial_list[i], i);
                //将列表中的内容加入到第二个下拉框
                target2.options.add(item);
            }
        }
    }
</script>
</body>
</html>

