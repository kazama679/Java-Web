<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 09/05/2025
  Time: 4:46 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<table border="1">
  <tr>
    <td>Id</td>
    <td>Product name</td>
    <td>Price</td>
    <td>Desc</td>
  </tr>
  <c:forEach var="p" items="${products}">
    <tr>
      <td>${p.id}</td>
      <td>
        <c:choose>
          <c:when test="${p.name == ''}"> Sản phẩm chưa có tên </c:when>
          <c:otherwise> ${p.name} </c:otherwise>
        </c:choose>
      </td>
      <td>
        <c:choose>
          <c:when test="${p.price == 0}"> Sản phẩm chưa có giá </c:when>
          <c:otherwise> ${p.price} </c:otherwise>
        </c:choose>
      </td>
      <td>
        <c:choose>
          <c:when test="${p.description == ''}"> Sản phẩm chưa có mô tả </c:when>
          <c:otherwise> ${p.description} </c:otherwise>
        </c:choose>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
