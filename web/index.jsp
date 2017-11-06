<%-- 
    Document   : index
    Created on : 05-nov-2017, 20:59:09
    Author     : win7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<h1>Welcome!</h1>
        <form action="login" method="POST">
			<input type="text" name="name">
			<input type="password" name="password">
			<input type="submit" value="Log in">
		</form>
    </body>
</html>
