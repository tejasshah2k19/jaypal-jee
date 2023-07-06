<%@page import="com.google.listener.UserCounterListener"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

Welcome, 
<br>
Total Online User <%=UserCounterListener.userCounter %>
<br><br>
<a href="LogoutServlet">Logout</a>
</body>
</html>