<%--
  Created by IntelliJ IDEA.
  User: Jhly
  Date: 2019/10/2
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/login" method="post">
    <input type="text" id="uName" name="uName"/><br>
    <input type="text" id="uPassword" name="uPassword"/><br>
    <input type="submit" value="登录">
</form>
<a href="register.jsp">注册</a>
</body>
</html>
