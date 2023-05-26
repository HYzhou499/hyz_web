<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2023/4/24
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="../biblManager.do" method="post">
    <input type="hidden"  name="flag" value="visBibl"/>
    <ul class="forminfo">

        <li>
            <label>&nbsp;</label>
            <input  type="submit"  class="btn" value="展示保存" />
        </li>
    </ul>
</form>
</body>
</html>
