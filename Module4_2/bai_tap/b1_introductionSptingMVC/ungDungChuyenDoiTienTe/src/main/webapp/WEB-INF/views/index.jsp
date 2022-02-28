<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 02/16/22
  Time: 6:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>convert</title>
  </head>
  <body>
  <form method="post" action="/usd">
    <label>USD: </label>
    <input type="number" placeholder="USD" name="usd">
    <label>Rate: </label>
    <input name="rate" type="number" value="23000">
    <button id="convert" name="Convert">Convert</button>
  </form>
  </body>
</html>
