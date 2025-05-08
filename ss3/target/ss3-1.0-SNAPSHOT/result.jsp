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
<div>${username}</div>
<div>${password}</div>
<div>${age}</div>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String strAge = (String) request.getParameter("age");
    Integer age = Integer.parseInt(strAge);

    if(username.equals("admin") && password.equals("123")){
        // set username cho appication scope
        application.setAttribute("username", username);
        out.print("Đăng nhập thành công!");
        if(age<18){
            response.sendRedirect("adult.jsp");
        }else{
            response.sendRedirect("teen.jsp");
        }
    }else{
        out.print("Đăng nhập thất bại");
        response.sendRedirect("login.jsp?err=info_incorrect");
    }
%>
</body>
</html>
