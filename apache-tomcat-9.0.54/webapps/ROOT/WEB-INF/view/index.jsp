<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/05/21
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>convert</title>
</head>
<body>
<h1>Convert money</h1>
<form method="post" action="/usd">
    <label>USD: </label>
    <input type="number" id="usd" placeholder="USD" >
    <label>Rate: </label>
    <input type="number" id="rate" value="23000">
    <input type="button" id="calculate">
</form>
</body>
</html>
