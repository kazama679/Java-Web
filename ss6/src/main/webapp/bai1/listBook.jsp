<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/05/2025
  Time: 5:16 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Danh sách Books</h3>
<table border="1">
    <thead>
    <th>Stt</th>
    <th>Id</th>
    <th>Tên sách</th>
    <th>Tác giả</th>
    <th>Loại</th>
    <th>Số lượng</th>
    <th>Actions</th>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book" varStatus="loop">
        <tr>
            <td>${loop.index+1}</td>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.category}</td>
            <td>${book.quantity}</td>
            <td>
                <a href="<%=request.getContextPath()%>/BooksController?id=${book.id}&action=update">Update</a>
                <a href="<%=request.getContextPath()%>/BooksController?id=${book.id}&action=delete">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="bai1/formAdd.jsp">Tạo mới sách</a>
</body>
</html>