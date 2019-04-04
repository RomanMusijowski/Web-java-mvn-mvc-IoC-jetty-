<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Roman Local
  Date: 2/19/2019
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <spring:form modelAttribute="userRegistracja" action="/user_system/users/saveUser" method="get">
        name
        <input title="name" type="text" path="name">
        lastName
        <input title="last name" type="text" path="lastName">
        email
        <input title="email" type="text" path="email">
        password
        <input title="password" type="text" name="password">
        <spring:button>Check user</spring:button>
    </spring:form>
</body>
</html>
