<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 8:53 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
  n1 <input type="number" name="n1"> <br>
  n2 <input type="number" name="n2">
  <button type="submit">Tính</button>
</form>

<%
  String n1 = request.getParameter("n1");
  String n2 = request.getParameter("n2");
  if(n1!= null && n2!=null && !n1.isEmpty() && !n2.isEmpty()){
    try {
      int num1 = Integer.parseInt(n1);
      int num2 = Integer.parseInt(n2);
      %> <h3>Kết quả là: <%= num1+num2 %></h3> <%
    } catch (NumberFormatException e) {
      %> <h3>Nhập số đúng</h3> <%
    }
  }else{
    %> <h3>K để trống</h3> <%
  }
%>
</body>
</html>