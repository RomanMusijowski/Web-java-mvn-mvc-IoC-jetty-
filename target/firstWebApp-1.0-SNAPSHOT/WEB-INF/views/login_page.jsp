<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Roman Local
  Date: 2/19/2019
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<spring:form modelAttribute="userFromServer" method="get"  action="/user_system/users/admin" >
    <spring:input path="email"/>
    <spring:input path="password"/>
    <spring:button>Check user</spring:button>
</spring:form>

<a href="/user_system/users/addUser">Create user</a>

</body>
</html>
