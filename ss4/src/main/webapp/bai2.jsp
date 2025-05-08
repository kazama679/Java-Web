<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 09/05/2025
  Time: 4:24 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    username <input type="text" name="username"> <br>
    password <input type="password" name="password"> <br>
    <button type="submit">Đăng nhập</button>
</form>
<%
    String user = request.getParameter("username");
    String pass = request.getParameter("password");
%>
<c:if test="${param.username == 'admin' && param.password == '123456'}">
    <h3>Đăng nhập thành công</h3>
    <div>Xin chào <b>${param.username}</b>!</div>
</c:if>
<c:if test="${param.username != 'admin' || param.password != '123456'}">
    <h3>Đăng nhập thất bại</h3>
</c:if>
</body>
</html>