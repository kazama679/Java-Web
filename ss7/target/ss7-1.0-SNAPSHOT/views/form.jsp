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
    <title>Form góp ý</title>
</head>
<body>
<h2>Form Góp Ý</h2>
<form action="/form/submit" method="post">
    <label>Họ và tên:</label><br>
    <input type="text" name="name" required><br><br>

    <label>Số điện thoại:</label><br>
    <input type="text" name="phone"><br><br>

    <label>Địa chỉ:</label><br>
    <input type="text" name="address"><br><br>

    <label>Nội dung góp ý:</label><br>
    <textarea name="feedback" rows="4" cols="50" required></textarea><br><br>

    <button type="submit">Gửi góp ý</button>
</form>
</body>
</html>