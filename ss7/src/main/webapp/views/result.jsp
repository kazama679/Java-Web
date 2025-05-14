<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 14/05/2025
  Time: 10:21 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kết quả góp ý</title>
</head>
<body>
<h2>Thông tin góp ý của bạn</h2>
<table border="1">
    <tr><th>Họ và tên</th><td>${name}</td></tr>
    <tr><th>Số điện thoại</th><td>${phone}</td></tr>
    <tr><th>Địa chỉ</th><td>${address}</td></tr>
    <tr><th>Nội dung góp ý</th><td>${feedback}</td></tr>
</table>
<a href="/form/list">Xem danh sách góp ý</a>
</body>
</html>