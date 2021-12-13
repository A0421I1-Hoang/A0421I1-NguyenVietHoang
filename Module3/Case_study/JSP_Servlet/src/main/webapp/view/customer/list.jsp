<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/20/21
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Management Application</title>
</head>
<body>
<center>
    <h1>Customer Management</h1>
    <h2>
        <a href="/customer?action=create">Add New Customer</a>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Customer</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Phone Number</th>
            <th>CMND</th>
            <th>Email</th>
            <th>Sex</th>
            <th>Type Customer</th>
            <th>Address</th>
        </tr>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td><c:out value="${customer.id}"/></td>
                <td><c:out value="${customer.name}"/></td>
                <td><c:out value="${customer.age}"/></td>
                <td><c:out value="${customer.phoneNumber}"/></td>
                <td><c:out value="${customer.CMND}"/></td>
                <td><c:out value="${customer.email}"/></td>
                <td><c:out value="${customer.sex}"/></td>
                <td><c:out value="${customer.idLoaiKhach}"/></td>
                <td><c:out value="${customer.address}"/></td>
                <td>
                    <a href="/customer?action=edit&id=${customer.id}">Edit</a>
                    <a href="/customer?action=delete&id=${customer.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>