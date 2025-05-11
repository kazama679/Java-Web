<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/05/2025
  Time: 2:02 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Bai3" method="post">
  Tên <input type="text" name="name"> <br>
  Tuổi <input type="number" name="age"> <br>
  Địa chỉ <input type="text" name="address"> <br>
  <button type="submit">Thêm</button>
</form>
</body>
</html>