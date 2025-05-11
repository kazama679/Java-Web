<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/05/2025
  Time: 2:40 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sửa sinh viên</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Bai3?action=update" method="post">
  <input type="hidden" name="index" value="${index}">
  Tên <input type="text" name="name" value="${student.name}"> <br>
  Tuổi <input type="number" name="age" value="${student.age}"> <br>
  Địa chỉ <input type="text" name="address" value="${student.address}"> <br>
  <button type="submit">Cập nhật</button>
</form>
</body>
</html>