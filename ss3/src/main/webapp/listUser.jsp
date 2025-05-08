<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 10:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.data.ss3.User" %>
<%@ page import="com.data.ss3.UserManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách người dùng</title>
    <script>
        function confirmDelete(id) {
            if(confirm("Bạn có chắc muốn xóa người dùng này?")) {
                window.location.href = "listUser.jsp?action=delete&id=" + id;
            }
        }
    </script>
</head>
<body>
<h2>Danh sách người dùng</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Tên</th>
        <th>Email</th>
        <th>Hành động</th>
    </tr>
    <%
        for(User user : UserManager.getUsers()) {
    %>
    <tr>
        <td><%= user.getId() %></td>
        <td><%= user.getName() %></td>
        <td><%= user.getEmail() %></td>
        <td>
            <button onclick="confirmDelete(<%= user.getId() %>)">Xóa</button>
        </td>
    </tr>
    <% } %>
</table>
<br>
<a href="input.jsp">Thêm người dùng mới</a>

<%
    String action = request.getParameter("action");
    String idStr = request.getParameter("id");

    if("delete".equals(action) && idStr != null) {
        try {
            int id = Integer.parseInt(idStr);
            UserManager.removeUser(id);
            response.sendRedirect("listUser.jsp");
        } catch (NumberFormatException e) {
            out.println("<h3 style='color:red;'>ID không hợp lệ!</h3>");
        }
    }
%>
</body>
</html>