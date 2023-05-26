<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/2 0002
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>

    <script type="text/javascript">
        $(function(){
            //导航切换
            $(".menuson .header").click(function(){
                var $parent = $(this).parent();
                $(".menuson>li.active").not($parent).removeClass("active open").find('.sub-menus').hide();

                $parent.addClass("active");
                if(!!$(this).next('.sub-menus').size()){
                    if($parent.hasClass("open")){
                        $parent.removeClass("open").find('.sub-menus').hide();
                    }else{
                        $parent.addClass("open").find('.sub-menus').show();
                    }


                }
            });

            // 三级菜单点击
            $('.sub-menus li').click(function(e) {
                $(".sub-menus li.active").removeClass("active")
                $(this).addClass("active");
            });

            $('.title').click(function(){
                var $ul = $(this).next('ul');
                $('dd').find('.menuson').slideUp();
                if($ul.is(':visible')){
                    $(this).next('.menuson').slideUp();
                }else{
                    $(this).next('.menuson').slideDown();
                }
            });
        })
    </script>

</head>

<body style="background:#f0f9fd;">
<div class="lefttop"><span></span>导航菜单</div>

<dl class="leftmenu">
    <dd>
        <div class="title"><span><img src="images/leftico03.png" /></span>用户管理</div>
        <ul class="menuson">
            <li><cite></cite><a href="usermanager/addUser.jsp" target="rightFrame">添加用户</a><i></i></li>
            <li><cite></cite><a href="usermanager/findUser.jsp" target="rightFrame">查询用户</a><i></i></li>
            <li><cite></cite><a href="logout.do" target="rightFrame">退出登录</a><i></i></li>
        </ul>
        <div class="title"><span><img src="images/leftico03.png" /></span>文献管理</div>
        <ul class="menuson">
            <li><cite></cite><a href="biblmanager/addBibl.jsp" target="rightFrame">添加文献</a><i></i></li>
            <li><cite></cite><a href="biblmanager/findBibl.jsp" target="rightFrame">查询文献</a><i></i></li>
            <li><cite></cite><a href="techmanager/addTech.jsp" target="rightFrame">添加科技文献</a><i></i></li>
            <li><cite></cite><a href="techmanager/findTech.jsp" target="rightFrame">查询科技文献</a><i></i></li>
            <li><cite></cite><a href="socimanager/addSoci.jsp" target="rightFrame">添加社科文献</a><i></i></li>
            <li><cite></cite><a href="socimanager/findSoci.jsp" target="rightFrame">查询社科文献</a><i></i></li>
        </ul>
        <div class="title"><span><img src="images/leftico03.png" /></span>文献上传管理</div>
        <ul class="menuson">
            <li><cite></cite><a href="upmanager/addUp.jsp" target="rightFrame">添加文献上传详情</a><i></i></li>
            <li><cite></cite><a href="upmanager/findUp.jsp" target="rightFrame">文献上传详情</a><i></i></li>
        </ul>
        <div class="title"><span><img src="images/leftico03.png" /></span>通知管理</div>
        <ul class="menuson">
            <li><cite></cite><a href="nomanager/addNo.jsp" target="rightFrame">添加通知</a><i></i></li>
            <li><cite></cite><a href="nomanager/findNo.jsp" target="rightFrame">查看所有通知</a><i></i></li>
            <li><cite></cite><a href="commonpage/contactus.jsp" target="rightFrame">联系我们</a><i></i></li>
        </ul>
        <div class="title"><span><img src="images/leftico03.png" /></span>系统管理</div>
        <ul class="menuson">
            <li><cite></cite><a href="biblmanager/visBibl.jsp" target="rightFrame">文献信息统计图</a><i></i></li>
            <li><cite></cite><a href="commonpage/toolBibl.jsp" target="rightFrame">文献工具链接</a><i></i></li>
            <li><cite></cite><a href="commonpage/contactus.jsp" target="rightFrame">联系我们</a><i></i></li>
        </ul>
        <div class="title"><span><img src="images/leftico03.png" /></span>智能管理</div>
        <ul class="menuson">

            <li><cite></cite><a href="intermanager/geiinfor.jsp" target="rightFrame">文献推荐</a><i></i></li>
            <li><cite></cite><a href="commonpage/contactus.jsp" target="rightFrame">文献二维码</a><i></i></li>
            <li><cite></cite><a href="intermanager/helper.jsp" target="rightFrame">AI助手</a><i></i></li>
        </ul>

    </dd>
</dl>

</body>
</html>
