<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<a href="<%= request.getContextPath() %>/BooksController?id=7&action=findAll">Bài 1</a>
<a href="bai2/login.jsp">Bài 2</a>
<a href="<%= request.getContextPath() %>/EmployeesController?id=7&action=findAll">Bài 4</a>
</body>
</html>