<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="MyError.jsp"
	import="java.util.Scanner,java.util.Date"%>

<%@page import="java.io.File" import="java.io.FileWriter"
	info="this is demo jsp for error handeling" buffer="8kb"
	autoFlush="true"%>
	
<%@page isELIgnored="false"  session="true"  isThreadSafe="true"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Date d = null;

		Scanner scr = null;
		int a = 10;
		int b = 2;
		int c = a / b;
	%>

	<%=c%>
	
	${request.getAttribute("name")}
</body>
</html>