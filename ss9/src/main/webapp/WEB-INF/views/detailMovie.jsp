<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 16/05/2025
  Time: 8:09 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail Movie</title>
</head>
<body>
<p>Id: ${movie.id}</p>
<p>Tên phim: ${movie.title}</p>
<p>Tác giả: ${movie.director}</p>
<p>Thể loại: ${movie.genre}</p>
<p>Mô tả: ${movie.description}</p>
<p>Giờ: ${movie.duration}</p>
<p>Ngôn ngữ: ${movie.language}</p> <br>
<br>
Danh sách lịch chiếu
<table border="1">
    <tr>
        <th>id</th>
        <th>id movie</th>
        <th>showTime</th>
        <th>Id phòng</th>
        <th>số ghế còn</th>
        <th>format</th>
    </tr>

    <c:choose>
        <c:when test="${not empty schedules}">
            <c:forEach var="s" items="${schedules}">
                <c:if test="${s.movieId == movie.id}">
                    <tr>
                        <td>${s.id}</td>
                        <td>${s.movieId}</td>
                        <td>${s.showTime}</td>
                        <td>${s.screenRoomId}</td>
                        <td>${s.availableSeats}</td>
                        <td>${s.format}</td>
                    </tr>
                </c:if>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td colspan="6" style="text-align:center;">Không có lịch chiếu cho phim này.</td>
            </tr>
        </c:otherwise>
    </c:choose>
</table>
</body>
</html>
