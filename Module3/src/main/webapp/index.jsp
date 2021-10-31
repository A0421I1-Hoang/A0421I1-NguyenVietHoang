<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/29/21
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Simple Dictionary</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post" action="/display-discount">
  Product Description: <input type="text" name="Product" placeholder="Enter your word: "/> <br>
  List Price: <input type = "number" name="Price" placeholder="Enter price: "/> <br>
  Discount Percent: <input type = "number" name="Discount" placeholder="Enter discount percent: "/> <br>
  <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>