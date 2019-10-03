<html xmlns:th="http://www.thymeleaf.org">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>首页</title>
</head>
<body>
<h2>首页</h2>
<a href="#">上传</a>
<a href="/user/login.jsp">登录</a>
<a href="/logout">注销</a>
<form>
    <table>
        <tr>
            <th>文件名</th>
            <th>上传者</th>
            <th>上传时间</th>
            <th>更新者</th>
            <th>更新时间</th>
            <th>操作</th>
        </tr>
        <tr th:each="file:${fileDTO.files}">
            <td th:text="${file.fName}"></td>
            <td th:text="${file.creator}"></td>
            <td th:text="${file.createDate}"></td>
            <td th:text="${file.modifier}"></td>
            <td th:text="${file.modifiedDate}"></td>
            <td><a href="#">下载</a></td>
        </tr>
    </table>
</form>
</body>
</html>
