<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 07/05/2025
  Time: 5:20 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Giới Thiệu Về Bản Thân</h1>
<%
    String name = "Quang";
    int age = 20;
    String occupation = "Lập trình viên Java";
%>
<p>Xin chào! Tôi tên là <span class="highlight"><%= name %></span>.</p>
<p>Năm nay tôi <span class="highlight"><%= age %></span> tuổi và tôi hiện đang học như một <span class="highlight"><%= occupation %></span>.</p>
</body>
</html>