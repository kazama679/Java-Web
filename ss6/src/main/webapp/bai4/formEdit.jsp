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
    <title>Sửa nhân viên</title>
</head>
<body>
<h3>Sửa nhân viên</h3>
<form action="<%=request.getContextPath()%>/EmployeesController?action=Update" method="post">
    <label for="id">ID</label>
    <input readonly type="text" id="id" name="id" value="${employee.id}"/><br>
    <label for="name">Họ tên</label>
    <input type="text" id="name" name="name" value="${employee.name}"/><br>
    <label for="birthday">Ngày sinh</label>
    <input type="text" id="birthday" name="birthday" value="${employee.birthday}"/><br>
    <label for="phone">Số điện thoại</label>
    <input type="text" id="phone" name="phone" value="${employee.phone}"/><br>
    <label for="email">Email</label>
    <input type="text" id="email" name="email" value="${employee.email}"/><br>
    <label for="salary">Lương</label>
    <input type="text" id="salary" name="salary" value="${employee.salary}"/><br>
    <label for="position">Chức vụ</label>
    <input type="text" id="position" name="position" value="${employee.position}"/><br>
    <input type="submit" value="Update"/>
</form>
</body>
</html>