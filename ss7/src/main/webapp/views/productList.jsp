<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Product List</title></head>
<body>
<h2>Danh sách sản phẩm theo category: ${category}</h2>
<p>Màu: ${color}, Kích thước: ${size}</p>

<ul>
  <c:forEach var="product" items="${products}">
    <li>${product}</li>
  </c:forEach>
</ul>
</body>
</html>