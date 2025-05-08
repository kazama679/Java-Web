<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 09/05/2025
  Time: 4:44 SA
  To change this template use File | Settings | File Templates.
--%>
<!-- main.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main - Ứng Dụng</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Hello World!</h1>
<p><a href="#">Bài tập 1</a> | <a href="#">Bài tập 2</a></p>

<div style="margin-top: 20px; text-align: center;">
    <fieldset style="width: 300px; margin: auto;">
        <legend>Đăng Nhập</legend>
        <form action="login.jsp" method="post">
            <label>Username: </label><input type="text" name="username"><br>
            <label>Password: </label><input type="password" name="password"><br>
            <button type="submit">Đăng Nhập</button>
        </form>
    </fieldset>
</div>

</body>
</html>