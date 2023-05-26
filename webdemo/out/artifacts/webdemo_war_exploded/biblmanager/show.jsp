<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/4/24
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<html>
<head>
    <title>Title</title>
</head>
<body>
<div width="80px" height="80px">
<!-- 在页面上显示饼图的容器 -->
<canvas id="pieChart" ></canvas>


<!-- 解析JSON数据 -->
<script>
    $(function() {
        var data = JSON.parse('${js}');
        var chartData = {
            labels: Object.keys(data),
            datasets: [{
                data: Object.values(data),
                backgroundColor: [
                    '#FF6384',
                    '#36A2EB',
                    '#FFCE56',
                    '#1C1C1C',
                    '#007F00',
                    '#FF00FF',
                    '#0000FF',
                    '#00FF00',
                    '#00FFFF',
                    '#800000',
                    '#FFD700'
                ]
            }]
        };
        var ctx = document.getElementById('pieChart').getContext('2d');
        var myPieChart = new Chart(ctx, {
            type: 'pie',
            data: chartData
        });
    });
</script>

</div></body>
</html>
