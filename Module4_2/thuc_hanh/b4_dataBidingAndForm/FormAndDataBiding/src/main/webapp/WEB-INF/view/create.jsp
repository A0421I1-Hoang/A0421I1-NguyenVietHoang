<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/17/21
  Time: 7:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Create a new employee</title>
</head>
<body>
<form method="post" action="addEmployee" modelAttribute="employee">
    <table>
        <tr>
            <td><form:label path="id">ID: </form:label> </td>
            <td><form:input path="id"> </form:input></td>
        </tr>
        <tr>
            <td><form:label path="name">Name: </form:label> </td>
            <td><form:input path="name"> </form:input></td>
        </tr>
        <tr>
            <td><form:label path="contractNumber">Contract Number: </form:label> </td>
            <td><form:input path="contractNumber"> </form:input></td>
        </tr>
        <tr>
            <td><input type="submit">Submit</td>
        </tr>
    </table>
</form>
</body>
</html>
