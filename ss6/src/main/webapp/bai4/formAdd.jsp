<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 13/05/2025
  Time: 10:35 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới nhân viên</title>
</head>
<body>
<h3>Thêm mới nhân viên</h3>
<form action="<%=request.getContextPath()%>/EmployeesController?action=Create" method="post">
    <label for="name">Họ tên</label>
    <input type="text" id="name" name="name"/><br>
    <label for="birthday">Ngày sinh</label>
    <input type="text" id="birthday" name="birthday"/><br>
    <label for="phone">Số điện thoại</label>
    <input type="text" id="phone" name="phone"/><br>
    <label for="email">Email</label>
    <input type="text" id="email" name="email"/><br>
    <label for="salary">Lương</label>
    <input type="text" id="salary" name="salary"/><br>
    <label for="position">Chức vụ</label>
    <input type="text" id="position" name="position"/><br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>