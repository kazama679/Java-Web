<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 10:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.data.ss3.User" %>
<%@ page import="com.data.ss3.UserManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Đăng ký người dùng</title>
</head>
<body>
<h2>Đăng ký người dùng</h2>
<form method="post">
  Tên: <input type="text" name="name" required> <br>
  Email: <input type="email" name="email" required> <br>
  <button type="submit">Đăng ký</button>
</form>

<%
  if(request.getMethod().equalsIgnoreCase("POST")){
    String name = request.getParameter("name");
    String email = request.getParameter("email");

    if(name != null && email != null) {
      User user = new User();
      user.setName(name);
      user.setEmail(email);
      UserManager.addUser(user);
      response.sendRedirect("listUser.jsp");
    }
  }
%>
</body>
</html>