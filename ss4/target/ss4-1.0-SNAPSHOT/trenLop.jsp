<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 4:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="css/style.css">
<script src="js/data.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- in ra giá trị--%>
<c:out value="Xuan Quang"/>

<%-- c if: kiểm tra điều kiện rồi in ra --%>
<c:set var="diem" value="80"/>
<c:if test="${diem>80}">
    Kết quả: Giỏi
</c:if>
<c:if test="${diem<=80}">
    Kết quả: Khá
</c:if>

<%-- c choose when giống như if, else if, else --%>
<c:set var="level" value="5"/>
<c:choose>
    <c:when test="${level>7}">
        Level Cao
    </c:when>
    <c:when test="${level>5}">
        Level Thường
    </c:when>
    <c:otherwise>
        Level Thấp
    </c:otherwise>
</c:choose>
<h4>Quang tèo</h4>
</body>
</html>
