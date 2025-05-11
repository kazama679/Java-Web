<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/05/2025
  Time: 1:29 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ra.com.model.B2 student = (ra.com.model.B2) request.getAttribute("student");
    if (student != null) {
%>
<h2>Thông tin sinh viên đã được thêm thành công!</h2>
<p>Tên: <%= student.getName() %></p>
<p>Tuổi: <%= student.getAge() %></p>
<p>Địa chỉ: <%= student.getAddress() %></p>
<%
} else {
%>
<h2>Không có thông tin sinh viên được gửi.</h2>
<%
    }
%>
</body>
</html>
