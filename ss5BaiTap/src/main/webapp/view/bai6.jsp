<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/05/2025
  Time: 3:17 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Bai6" method="get">
    Tài khoản <input type="text" name="account"> <br>
    Mật khẩu <input type="password" name="password"> <br>
    <button type="submit">Đăng nhập</button>
</form>
</body>
</html>