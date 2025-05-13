<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 13/05/2025
  Time: 9:33 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/BooksController?id=7&action=findAll" method="get">
    tài khoản <input type="text" name="username"> <br>
    mật khẩu <input type="password" name="password"> <br>
    <a href="<%= request.getContextPath() %>/BooksController?id=7&action=findAll">Đăng nhập</a>
</form>
<a href="register.jsp">Chưa có tài khoản?</a>
</body>
</html>