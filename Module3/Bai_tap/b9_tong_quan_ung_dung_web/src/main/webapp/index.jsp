<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/31/21
  Time: 8:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Discount</h2>
  <form method="post" action="/display-discount">
    Product Description: <input type="text" name="Product" placeholder="Enter your word: "> <br>
    List Price: <input type="number" name="Price" placeholder="Enter price: "> <br>
    Discount Percent: <input type="number" name="Discount" placeholder="Enter discount percent: "> <br>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  <div id="shimai-world" style="position: fixed; top: 0px; left: 0px; width: 100%; height: 100%; z-index: 2147483647; pointer-events: none; background: transparent;"></div>  </body>
</html>
