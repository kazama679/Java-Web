<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/05/2025
  Time: 5:16 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Thêm mới sách</h3>
<form action="<%=request.getContextPath()%>/BooksController?action=Update" method="post">
    <label for="id">Id sách</label>
    <input readonly type="text" id="id" name="id" value="${book.id}"/><br>
    <label for="title">Tên sách</label>
    <input type="text" id="title" name="title" value="${book.title}"/><br>
    <label for="author">Tác giả</label>
    <input type="text" id="author" name="author" value="${book.author}"/><br>
    <label for="category">Loại</label>
    <input type="text" id="category" name="category" value="${book.category}"/><br>
    <label for="quantity">Số lượng</label>
    <input type="text" id="quantity" name="quantity" value="${book.quantity}"/><br>
    <input type="submit" value="Update"/>
</form>
</body>
</html>
