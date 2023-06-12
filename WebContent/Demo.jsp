<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>
	
		int a=90;
		Hi 
		
		<% 
			int sal = 9000;
			System.out.println("Message From Demo.jsp");
			Date d= new Date();

		%>
	<br>
		<%=sal %>
	<br>
		<%=d %>
	<%! int k=9000; %>
</body>
</html>