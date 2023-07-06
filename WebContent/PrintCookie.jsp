<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Cookie</title>
</head>
<body>


	<%
		Cookie c[] = (Cookie[]) request.getAttribute("c");
	%>

	<%
		for (Cookie x : c) {
	%>
	<%=x.getName()%>
	::
	<%=x.getValue()%> <br>
	<%
		}
	%>
	
	<br><br>
	<form action="DeleteCookieServlet">
		CookieName:<input type="text" name="cookieName"/><br><BR>
		
		<input type="submit" value="Delete Cookie"/>
	</form>
	
</body>
</html>