<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="www.google.com/emp/123/stag" prefix="s" %>
<%@taglib uri="www.google.com/emp/123" prefix="e" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${e:greet() }<br>

<s:date></s:date><br>
<s:today format="mm-dd-yyyy"/>
</body>
</html>