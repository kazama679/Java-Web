<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 8:31 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    application.setAttribute("name2", name);
    application.setAttribute("email2",email);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
tên: <%= application.getAttribute("name2") %> <br>
email: <%= application.getAttribute("email2") %>
</body>
</html>