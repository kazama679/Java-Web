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
  <title>Danh sách sản phẩm</title>
</head>
<body>
<h2>Danh sách sản phẩm</h2>
<table border="2">
  <tr>
    <th>ID</th>
    <th>Tên sản phẩm</th>
    <th>Giá</th>
    <th>Thao tác</th>
  </tr>
  <%
    ProductBai10 p1 = new ProductBai10(1, "Laptop", 15000);
    ProductBai10 p2 = new ProductBai10(2, "Điện thoại", 8000);
    ProductBai10 p3 = new ProductBai10(3, "Tai nghe", 500);
    ProductBai10[] products = {p1, p2, p3};
    for (ProductBai10 p : products) {
  %>
  <tr>
    <td><%= p.getId() %></td>
    <td><%= p.getName() %></td>
    <td><%= p.getPrice() %></td>
    <td>
      <a href="products.jsp?action=add&id=<%= p.getId() %>&name=<%= p.getName() %>&price=<%= p.getPrice() %>">
        Thêm vào giỏ hàng
      </a>
    </td>
  </tr>
  <% } %>
</table>
<br>
<a href="cart.jsp">Xem giỏ hàng</a>

<%
  String action = request.getParameter("action");
  if ("add".equals(action)) {
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    double price = Double.parseDouble(request.getParameter("price"));

    ProductBai10 product = new ProductBai10(id, name, price);
    CartManager.addProduct(product);
    response.sendRedirect("products.jsp");
  }
%>
</body>
</html>
