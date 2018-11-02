<%--
  Created by IntelliJ IDEA.
  User: Алексей
  Date: 30.10.2018
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h2>Registration</h2>
<form method='post' class='reg-form'>

    <div class='form-row'>
        <label for='form_login'>Login: </label>
        <input type='text' id='form_login' name='login'>
    </div>


    <div class='form-row'>
        <label for='form_email'>Email: </label>
        <input type='email' id='form_email' name='email'>
    </div>

    <div class='form-row'>
        <label for='form_password'>Password: </label>
        <p><strong>Пароль:</strong>
            <input type="password" id="form_password" maxlength="25" size="40" name="password"></p>
    </div>

    <div class="form-row">
        <input type="submit" value='Go'>
    </div>
</form>

</body>
</html>
