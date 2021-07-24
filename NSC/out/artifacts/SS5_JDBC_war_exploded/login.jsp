<%--
  Created by IntelliJ IDEA.
  User: LEGION
  Date: 7/24/2021
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Employee Login Form</h1>
<form action="/login" method="post">
    <table style="with: 100%">
        <tr>
            <td>UserName</td>
            <td><input type="text" name="username" /></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" /></td>
        </tr>

    </table>
    <input type="submit" value="Submit" />
</form>
</body>
</html>
