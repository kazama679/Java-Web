<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 12/05/2025
  Time: 3:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Task Management</title>
</head>
<body>
<h1>Task List</h1>
<a href="tasks?action=add">Add New Task</a>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Description</th>
    <th>Due Date</th>
    <th>Completed</th>
    <th>Actions</th>
  </tr>
  <c:forEach var="task" items="${tasks}">
    <tr>
      <td>${task.id}</td>
      <td>${task.description}</td>
      <td>${task.dueDate}</td>
      <td>${task.completed ? "Yes" : "No"}</td>
      <td>
        <a href="tasks?action=edit&id=${task.id}">Edit</a>
        <form action="tasks?action=delete" method="post" style="display:inline;">
          <input type="hidden" name="id" value="${task.id}" />
          <input type="submit" value="Delete" />
        </form>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>