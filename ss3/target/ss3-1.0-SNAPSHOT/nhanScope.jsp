<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 07/05/2025
  Time: 4:36 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>kết quả</h4>
<%
    String name = (String) request.getAttribute("name");
%>
<%= name %>
<%
    application.setAttribute("message", "Xin chào tất cả người dùng!");
%>
</body>
</html>
