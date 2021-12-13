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
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="customer">List All Users</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Customer
                </h2>
            </caption>
            <c:if test="${user != null}">
                <input type="hidden" name="id" value="<c:out value='${user.id}' />"/>
            </c:if>
            <tr>
                <th>Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${customer.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Age:</th>
                <td>
                    <input type="text" name="age" id="age" size="3"
                                 value="<c:out value='${customer.age}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Phone Number:</th>
                <td>
                    <input type="text" name="phoneNumber" id="phoneNumber" size="11"
                           value="<c:out value='${customer.phoneNumber}' />"/>
                </td>
            </tr>
            <tr>
                <th>CMND:</th>
                <td>
                    <input type="text" name="CMND" id="CMND" size="11"
                           value="<c:out value='${customer.CMND}' />"/>
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="<c:out value='${customer.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Sex:</th>
                <td>
                    <input type="text" name="sex" id="sex" size="45"
                           value="<c:out value='${customer.sex}' />"/>
                </td>
            </tr>
            <tr>
                <th>Type Customer:</th>
                <td>
                    <input type="text" name="typeCustomer" id="typeCustomer" size="45"
                           value="<c:out value='${customer.typeCustomer}' />"/>
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" id="address" size="45"
                           value="<c:out value='${customer.address}' />"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>