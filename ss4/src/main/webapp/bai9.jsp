<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 09/05/2025
  Time: 6:10 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Integer> list = null;
    List<Integer> list2 = null;
%>
<c:forEach var="i" begin="1" end="10">
   ${i}<input <c:if test="${i == 3}">checked</c:if> style="margin-right: 20px" type="radio" name="${i}">
</c:forEach>
</body>
</html>