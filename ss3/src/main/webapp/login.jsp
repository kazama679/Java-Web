<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 07/05/2025
  Time: 4:48 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="result.jsp" method="post">
    username <input type="text" name="username"><br><br>
    password <input type="password" name="password"><br><br>
    age <input type="number" name="age"><br><br>
    <input type="submit" value="Gửi">
</form>

<%
    String err = request.getParameter("err");
    if(err != null && err.equals("info_incorrect")){
        out.print("Đăng nhập không thành công!");
    }
%>
</body>
</html>
