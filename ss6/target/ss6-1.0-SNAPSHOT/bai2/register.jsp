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
<form action="<%=request.getContextPath()%>/UsersController" method="post">
    username <input type="text" name="username"> <br>
    password <input type="text" name="password"> <br>
    email <input type="text" name="email"> <br>
    phone <input type="text" name="phone"> <br>
    <button type="submit">Thêm</button>
</form>
<a href="login.jsp">Đã có tài khoản?</a>
</body>
</html>
