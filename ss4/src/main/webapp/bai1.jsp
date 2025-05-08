<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 4:20 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Product List</h2>
<table border="2">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getProductName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
