<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ERROR !!!</title>
</head>
<body>
<h2>Something Went Wrong Please Try AfterSomeTime </h2>
<%=exception %>
<br>
	<%=exception.getClass().getCanonicalName()%>
</body>
</html>