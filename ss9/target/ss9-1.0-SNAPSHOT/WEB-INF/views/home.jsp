<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 16/05/2025
  Time: 7:41 SA
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
        <td>Tiêu đề</td>
        <td>Đạo diễn</td>
        <td>Thể loại</td>
        <td>action</td>
    </tr>
    <c:forEach var="movie" items="${movies}">
        <tr>
            <td>${movie.title}</td>
            <td>${movie.director}</td>
            <td>${movie.genre}</td>
            <td>
                <a href="/movie/${movie.id}">Chi tiết</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>