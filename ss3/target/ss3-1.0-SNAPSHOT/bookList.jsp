<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 10:48 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.data.ss3.Book" %>
<%@ page import="com.data.ss3.Bai8" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh Sách Sách</title>
</head>
<body>
<h2>Danh Sách Sách</h2>
<table border="2">
    <tr>
        <th>Tên sách</th>
        <th>Tên tác giả</th>
        <th>Năm sản xuất</th>
    </tr>
    <%
        for(Book b : Bai8.books){
    %>
    <tr>
        <td><%= b.getTitle() %></td>
        <td><%= b.getAuthor() %></td>
        <td><%= b.getYear() %></td>
    </tr>
    <% } %>
</table>

<a href="bai8.jsp">Quay lại trang thêm sách</a>
</body>
</html>