<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 08/05/2025
  Time: 10:20 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    Tên sp <input type="text" name="name"> <br>
    Số lượng <input type="number" name="quantity"> <br>
    Giá <input type="number" name="price"> <br>
    <button type="submit">Thêm</button>
</form>

<%
    String q = request.getParameter("quantity");
    String p = request.getParameter("price");
    if(q != null && p != null && !q.isEmpty() && !p.isEmpty()){
        try {
            int quantity = Integer.parseInt(q);
            double price = Double.parseDouble(p);
            %> <h3>Tổng giá trị đơn hàng: <%= quantity*price %></h3> <%
        } catch (NumberFormatException e) {
            %> <h3>Không phải số!</h3> <%
        }
    }else if(request.getMethod().equalsIgnoreCase("POST")){
        %> <h3>Không để trống!</h3> <%
    }
%>
</body>
</html>
