<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 07/05/2025
  Time: 4:34 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>Scope</h4>
<%
    request.setAttribute("name", "Quang tèo");
    // chuyển biến name
    // dùng forward
    request.getRequestDispatcher("nhanScope.jsp").forward(request, response);
%>
</body>
</html>
