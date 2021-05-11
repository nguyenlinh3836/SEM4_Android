<%--
  Created by IntelliJ IDEA.
  User: LEGION
  Date: 5/11/2021
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Phone</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<form>
    <div class="form-group">
        <label for="name">Name</label>
        <input type="text" class="form-control" id="name" name="name">
    </div>
    <div class="form-group">
        <label for="price">Price</label>
        <input type="text" class="form-control" id="price" name="price">
    </div>
    <div class="form-group">
        <label for="des">Description</label>
        <input type="text" class="form-control" id="des" name="des">
    </div>
    <div class="form-group">
        <label for="brand">Example select</label>
        <select class="form-control" id="brand" name="brand">
            <option>Nokia</option>
            <option>Samsung</option>
            <option>Apple</option>
            <option>Sony</option>
            <option>Xiaomi</option>
        </select>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="submit" class="btn btn-primary">Reset</button>
</form>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
</body>
</html>
