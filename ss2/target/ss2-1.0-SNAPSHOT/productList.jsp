<%@ page import="model.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Danh Sách Sản Phẩm</title>
</head>
<body>
<h1 style="text-align:center;">Danh Sách Sản Phẩm</h1>
<%
  if (request.getAttribute("editProduct") != null) {
    Product productToEdit = (Product) request.getAttribute("editProduct");
%>
<div style="width:400px; margin:auto; border:1px solid black; padding:20px;">
  <h2 style="text-align:center;">Sửa Sản Phẩm</h2>
  <form action="products" method="post">
    <input type="hidden" name="updateId" value="<%= productToEdit.getId() %>">
    Tên: <input type="text" name="name" value="<%= productToEdit.getName() %>" required><br><br>
    Giá: <input type="number" step="0.01" name="price" value="<%= productToEdit.getPrice() %>" required><br><br>
    <input type="submit" value="Cập nhật">
  </form>
</div>
<%
  }
%>
<div style="width:400px; margin:auto; border:1px solid black; padding:20px;">
  <h2 style="text-align:center;">Thêm Sản Phẩm</h2>
  <form action="products" method="post">
    Tên: <input type="text" name="name" required><br><br>
    Giá: <input type="number" step="0.01" name="price" required><br><br>
    <input type="submit" value="Thêm">
  </form>
</div>
<br><br>
<table border="1" style="margin:auto; text-align:center;">
  <tr>
    <th>ID</th>
    <th>Tên Sản Phẩm</th>
    <th>Giá</th>
    <th>Hành động</th>
  </tr>
  <%
    List<Product> list = (List<Product>) request.getAttribute("products");
    if (list != null) {
      for (Product p : list) {
  %>
  <tr>
    <td><%= p.getId() %></td>
    <td><%= p.getName() %></td>
    <td><%= p.getPrice() %></td>
    <td>
      <form action="products" method="post" style="display:inline;">
        <input type="hidden" name="updateId" value="<%= p.getId() %>">
        <input type="submit" value="Sửa">
      </form>
    </td>
    <td>
      <form action="products" method="post" style="display:inline;">
        <input type="hidden" name="deleteId" value="<%= p.getId() %>">
        <input type="submit" value="Xóa">
      </form>
    </td>
  </tr>
  <%
      }
    }
  %>
</table>
</body>
</html>