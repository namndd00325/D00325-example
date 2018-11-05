<%-- 
    Document   : index
    Created on : Nov 5, 2018, 11:32:38 AM
    Author     : Nam Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
    </head>
    <body>
        <h1>Form Login</h1>
        <form action="LoginServlet" method="POST">
            UserName: <input type="text" name="username" /> <br>
            Password: <input type="password" name="password" /> <br>
            <input type="submit" value="Login" /> 
            <input type="reset" value="Reset" /> 
        </form>
    </body>
</html>
