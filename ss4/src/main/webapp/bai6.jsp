<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 09/05/2025
  Time: 5:52 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% int count = 0; %>
<table border="1">
  <tr>
    <td>Id</td>
    <td>Tên</td>
    <td>Tuổi</td>
    <td>Điểm</td>
  </tr>
  <c:forEach items="${students}" var="s">
    <tr>
      <td>${s.id}</td>
      <td>${s.name}</td>
      <td>${s.age}</td>
      <td>${s.avgPoint}</td>
    </tr>
    <c:if test="${s.avgPoint>7}"> <% count++; %> </c:if>
  </c:forEach>
</table>
<br> Số học sinh có điểm trung bình trên 7 là: <%= count %>!
</body>
</html>
