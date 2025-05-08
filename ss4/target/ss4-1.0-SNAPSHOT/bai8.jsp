<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 09/05/2025
  Time: 6:05 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h2>Thống Kê Doanh Thu Theo Tháng</h2>
<table border="1">
  <tr>
    <th>Tháng</th>
    <th>Doanh Thu</th>
  </tr>
  <c:set var="totalRevenue" value="0" />
  <c:forEach items="${revenues}" var="entry">
    <tr>
      <td>${entry.key}</td>
      <td>${entry.value}</td>
    </tr>
    <c:set var="totalRevenue" value="${totalRevenue + entry.value}" />
  </c:forEach>
</table>

<h3>Tổng Doanh Thu: ${totalRevenue}</h3>

<c:choose>
  <c:when test="${totalRevenue > 10000}">
    <p style="color:green;">Tổng doanh thu lớn hơn 10,000 - Kinh doanh okla!</p>
  </c:when>
  <c:otherwise>
    <p style="color:red;">Tổng doanh thu dưới 10,000 - Kinh doanh non.</p>
  </c:otherwise>
</c:choose>
</body>
</html>