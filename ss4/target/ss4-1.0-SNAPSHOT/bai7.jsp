<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 09/05/2025
  Time: 6:02 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h2>Lọc Sản Phẩm Theo Giá</h2>

<form action="Bai7" method="get">
  Giá tối thiểu: <input type="number" name="minPrice" value="${minPrice}" step="0.01">
  Giá tối đa: <input type="number" name="maxPrice" value="${maxPrice}" step="0.01">
  <button type="submit">Lọc</button>
</form>

<h3>Danh Sách Sản Phẩm</h3>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Tên Sản Phẩm</th>
    <th>Giá</th>
    <th>Mô Tả</th>
  </tr>
  <c:forEach items="${filteredProducts}" var="product">
    <tr>
      <td>${product.id}</td>
      <td>${product.name}</td>
      <td>${product.price}</td>
      <td>${product.description}</td>
    </tr>
  </c:forEach>
</table>

<c:if test="${empty filteredProducts}">
  <p>Không có sản phẩm nào trong khoảng giá này</p>
</c:if>
</body>
</html>