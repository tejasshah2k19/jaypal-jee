<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Cookie</title>
</head>
<body>

	<form action="AddCookieServlet" method="post">
		CookieName : <input type="Text" name="cookieName"/><br><Br>
		CookieValue : <input type="text" name="cookieValue"/><br><br>
		
		<input type="submit" value="AddCookie"/>
	</form>
	<br><br>
	
	<a href="ListCookieServlet">Print Cookies</a>
	
</body>
</html>