<%--
  Created by IntelliJ IDEA.
  User: LEGION
  Date: 5/11/2021
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Phone</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<table class="table table-striped table-hover">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Image</th>
        <th>Price</th>
        <th>Brand</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="p" items="${requestScope.phones}">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td>${p.des}</td>
            <td>${p.brand}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
