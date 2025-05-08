<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 09/05/2025
  Time: 5:30 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="Bai5" method="get">
    <input type="text" name="id">
    <button type="submit">Tìm</button>
</form>

<c:choose>
    <c:when test="${not empty product}">
        Id: ${product.id}<br>
        Tên: ${product.name}<br>
        Price: ${product.price}<br>
    </c:when>
    <c:otherwise>K tìm thấy sản phẩm</c:otherwise>
</c:choose>
</body>
</html>
