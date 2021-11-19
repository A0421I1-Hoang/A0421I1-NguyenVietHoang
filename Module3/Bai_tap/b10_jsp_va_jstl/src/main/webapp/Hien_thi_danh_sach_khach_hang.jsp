<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/08/21
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>ShowCustomer</title>
</head>
<body>
<h1 align="center">Welcome</h1>
<div>
  <br>
  <ul class="list-group">
    <li class="list-group-item active">
      <p>Tên</p>
      <p>Ngày sinh</p>
      <p>Địa chỉ</p>
      <p>Ảnh đại diện</p>
    </li>
    <c:forEach items="${customers}" var="customer">
      <li class='list-group-item'>
        <p><c:out value="${customer.getName()}"></c:out></p>
        <p><c:out value="${customer.getBirthday()}"></c:out></p>
        <p><c:out value="${customer.getAddress()}"></c:out></p>
        <p class='avatar'>
          <img src="<c:out value="${customer.getPictureLink()}"></c:out>">
        </p>
      </li>
    </c:forEach>
  </ul>
</div>


</body>
</html>