<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 10:58 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.data.ss3.CartManager" %>
<%@ page import="com.data.ss3.ProductBai10" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Giỏ hàng</title>
  <script>
    function confirmDelete(id) {
      if(confirm("Bạn có chắc muốn xóa sản phẩm này?")) {
        window.location.href = "cart.jsp?action=delete&id=" + id;
      }
    }
  </script>
</head>
<body>
<h2>Giỏ hàng của bạn</h2>
<table border="2">
  <tr>
    <th>ID</th>
    <th>Tên sản phẩm</th>
    <th>Giá</th>
    <th>Thao tác</th>
  </tr>
  <%
    for (ProductBai10 p : CartManager.getCart()) {
  %>
  <tr>
    <td><%= p.getId() %></td>
    <td><%= p.getName() %></td>
    <td><%= p.getPrice() %></td>
    <td>
      <button onclick="confirmDelete(<%= p.getId() %>)">Xóa</button>
    </td>
  </tr>
  <% } %>
</table>
<h3>Tổng giá trị: <%= CartManager.getTotalPrice() %> VND</h3>
<br>
<a href="products.jsp">Tiếp tục mua hàng</a>

<%
  if ("delete".equals(request.getParameter("action"))) {
    int id = Integer.parseInt(request.getParameter("id"));
    CartManager.removeProduct(id);
    response.sendRedirect("cart.jsp");
  }
%>
</body>
</html>