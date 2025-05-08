<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 9:40 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
  username <input type="text" name="name"> <br>
  password <input type="password" name="pass"> <br>
  email <input type="email" name="email"> <br>
  <button type="submit">Thêm</button>
</form>
<%
  String name = request.getParameter("name");
  String password = request.getParameter("pass");
  String email = request.getParameter("email");
  if(request.getMethod().equalsIgnoreCase("POST")){
    if(!name.isEmpty() && !password.isEmpty() && !email.isEmpty()){
      %> <h3>Xác nhận thêm thành công!</h3> <br>
         Tên: <%= name%>
          Mk: <%= password%>
          email: <%= email%>
      <%
    }else{
      %> <h3>Vui lòng điền đầy đủ thông tin!</h3>
      <%
    }
  }
%>
</body>
</html>
