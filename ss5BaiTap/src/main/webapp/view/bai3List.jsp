<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/05/2025
  Time: 2:03 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Danh sách sinh viên</title>
</head>
<body>
<table border="1">
  <tr>
    <td>ID</td>
    <td>Tên</td>
    <td>Tuổi</td>
    <td>Địa chỉ</td>
    <td>Hành động</td>
  </tr>
  <c:forEach var="student" items="${students}" varStatus="status">
    <tr>
      <td>${status.index}</td>
      <td>${student.name}</td>
      <td>${student.age}</td>
      <td>${student.address}</td>
      <td>
        <form action="Bai3" method="get" style="display:inline">
          <input type="hidden" name="action" value="edit">
          <input type="hidden" name="index" value="${status.index}">
          <button type="submit">Sửa</button>
        </form>
        <form action="Bai3" method="get" style="display:inline">
          <input type="hidden" name="action" value="delete">
          <input type="hidden" name="index" value="${status.index}">
          <button type="submit">Xóa</button>
        </form>
      </td>
    </tr>
  </c:forEach>
</table>
<a href="view/bai3.jsp">Quay lại thêm</a>
</body>
</html>