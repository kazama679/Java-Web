<%@ page import="com.data.ss3.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 9:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Product> products = (List<Product>) session.getAttribute("products");
    if (products == null) {
        products = new ArrayList<>();
        session.setAttribute("products", products);
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
Thêm sản phẩm <br>
<form method="post">
    Id <input type="text" name="id"> <br>
    Tên sp <input type="text" name="name"> <br>
    Giá <input type="number" name="price"> <br>
    Mô tả <input type="text" name="desc"> <br>
    Số lượng <input type="number" name="quantity"> <br>
    <button type="submit">Thêm</button>
</form>

<%
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String price = request.getParameter("price");
    String desc = request.getParameter("desc");
    String quantity = request.getParameter("quantity");
    Product product = new Product();
    product.setId(id);
    product.setName(name);
    product.setPrice(price);
    product.setDescription(desc);
    product.setQuantity(quantity);
    products.add(product);
%>

<table border="2">
    <tr>
        <td>ID</td>
        <td>Teen</td>
        <td>gia</td>
        <td>so luong</td>
        <td>mo ta</td>
    </tr>
    <% for(Product p: products){
    %><tr>
                <td><%= p.getId()%></td>
                <td><%= p.getName() %></td>
                <td><%= p.getPrice() %></td>
                <td><%= p.getQuantity() %></td>
                <td><%= p.getDescription() %></td>
                </tr><%
    } %>
</table>
</body>
</html>
