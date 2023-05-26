<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/4/17
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>  <%--  <div class="rightinfo">
    <li>
        <label>若发现系统bug，信息错误请及时与我们的工程师取得联系</label>
        <a>联系电话：19819279003</a>
        <a>邮箱：han123yangzhou@gmail.com</a>
        <a>微信：yishijiemowangdaren</a>
    </li>
</div>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>联系我们</title>
    <style>
        #map {
            height: 400px;
            width: 60%;
        }
    </style>
</head>
<body>
<h1>联系我们</h1>
<p>欢迎随时联系我们。我将竭诚为您服务。</p>
<h2>联系人</h2>
<p>韩杨洲</p>

<h2>电话</h2>
<p>19819279003</p>

<h2>电子邮件</h2>
<p><a href="mailto:info@example.com">han123yangzhou@gmail.com</a></p>

<h2>地图</h2>
<div id="map"></div>

<script src="https://api.map.baidu.com/api?v=3.0&ak=1a3c89ddb9bcfaf5b9dc4b62e3f2a05b"></script>
<script>
    // 百度地图API功能
    var map = new BMap.Map("map");
    var point = new BMap.Point(116.404, 39.915);
    map.centerAndZoom(point, 15);

    var marker = new BMap.Marker(point);
    map.addOverlay(marker);
    marker.setAnimation(BMAP_ANIMATION_BOUNCE);

    var infoWindow = new BMap.InfoWindow("<strong>han home</strong><br/>home");
    marker.addEventListener("click", function(){
        this.openInfoWindow(infoWindow);
    });
</script>
</body></html>