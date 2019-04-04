<%--
  Created by IntelliJ IDEA.
  User: ${USER}
  Date: ${DATE}
  Time: ${TIME}
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
    <h1>Witam na liscie</h1>


    <table style="border: 1px solid">
        <tr>
            <td>email</td>
            <td>name</td>
            <td>lastName</td>
            <td>password</td>
        </tr>

        <c:forEach var="user" items="${users}">
            <tr>
                <%--<td>${user.id}</td>--%>
                <td>${user.email}</td>
                <td>${user.name}</td>
                <td>${user.lastName}</td>
                <td>${user.password}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
