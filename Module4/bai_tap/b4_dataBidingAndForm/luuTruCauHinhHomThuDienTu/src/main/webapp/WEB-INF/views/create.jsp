<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 02/21/22
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Create Mail</h1>
<form:form method="post" action="/create" modelAttribute="mail">
    <div>
        <label>ID</label>
        <form:input path="id"></form:input>
    </div>
    <div>
        <label>Languages</label>
        <form:input path="languages"/>
    </div>
    <div>
        <label>Page Size</label>
        <form:input path="pageSize"/>
    </div>
    <div>
        <label>Spams Filler</label>
        <form:input path="spamsFiller"/>
    </div>
    <div>
        <label>Signature</label>
        <form:input path="signature"/>
    </div>
    <div>
        <label>Content</label>
        <form:input path="content"/>
    </div>
    <div>
        <form:button value="Create">Create</form:button>
    </div>
</form:form>
</body>
</html>
