<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 4:51 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>Tên</td>
        <td>Điểm</td>
        <td>Địa chỉ</td>
        <td></td>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.name}</td>
            <td>
                <c:choose>
                    <c:when test="${student.num >= 8}">
                        Giỏi
                    </c:when>
                    <c:when test="${student.num >= 5}">
                        Khá
                    </c:when>
                    <c:otherwise>
                        Yếu
                    </c:otherwise>
                </c:choose>
            </td>
            <td>${student.address}</td>
            <td>Xóa</td>
        </tr>
    </c:forEach>
</table>

<form method="post">
    Tên <input type="text" name="name"> <br>
    Điểm <input type="text" name="num"> <br>
    Địa chỉ <input type="text" name="address"> <br>
    <button type="submit">Thêm</button>
</form>
</body>
</html>
