<%--
  Created by IntelliJ IDEA.
  User: Алексей
  Date: 30.10.2018
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form method="post">
    <table>
        <tr>
            <td><label for="loginField">Логин</label></td>
            <td><input id="loginField" type="text" name="login"></td>
        </tr>

        <tr>
            <td><label for="passwordField">Пароль</label></td>
            <td><input id="passwordField" type="text" name="password"></td>
        </tr>
    </table>
    <input type="submit" value='Go'>
</form>
<a href="registration">Registration</a>
</body>
</html>
