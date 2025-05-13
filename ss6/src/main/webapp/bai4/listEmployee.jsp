<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 13/05/2025
  Time: 10:35 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách nhân viên</title>
</head>
<body>

<h3>Danh sách nhân viên</h3>
<table border="1">
    <thead>
    <th>STT</th>
    <th>ID</th>
    <th>Họ tên</th>
    <th>Ngày sinh</th>
    <th>Điện thoại</th>
    <th>Email</th>
    <th>Lương</th>
    <th>Chức vụ</th>
    <th>Hành động</th>
    </thead>
    <tbody>
    <c:forEach items="${employees}" var="employee" varStatus="loop">
        <tr>
            <td>${loop.index + 1}</td>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.birthday}</td>
            <td>${employee.phone}</td>
            <td>${employee.email}</td>
            <td>${employee.salary}</td>
            <td>${employee.position}</td>
            <td>
                <a href="<%=request.getContextPath()%>/EmployeesController?id=${employee.id}&action=update">Update</a>
                <a href="<%=request.getContextPath()%>/EmployeesController?id=${employee.id}&action=delete">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="bai4/formAdd.jsp">Tạo mới nhân viên</a>
</body>
</html>