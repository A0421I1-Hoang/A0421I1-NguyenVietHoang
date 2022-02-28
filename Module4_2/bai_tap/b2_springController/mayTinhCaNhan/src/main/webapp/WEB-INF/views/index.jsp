<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 02/18/22
  Time: 5:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="post" action="/calculator">
    <label>Number 1: </label>
    <input name="num1" type="number" >
    <label>Number 2: </label>
    <input name="num2" type="number" ><br><br>
    <button name="add" type="submit" value="add">Addition(+)</button>
    <button name="add" type="submit" value="sub">Subtraction(-)</button>
    <button name="add" type="submit" value="mul">Multiplication(x)</button>
    <button name="add" type="submit" value="div">Division(/)</button>
</form>
</body>
</html>
