<%--
  Created by IntelliJ IDEA.
  User: Jhly
  Date: 2019/10/2
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="/register" method="post">
    用户名：
    <input type="text" id="uName" name="uName"/><br>
    密码：
    <input type="text" id="uPassword" name="uPassword"/><br>
    个人简介：
    <input type="text" id="bio" name="bio"/><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
