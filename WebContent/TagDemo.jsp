<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="www.google.com/emp/123/stag" prefix="s" %>
<%@taglib uri="www.google.com/emp/123" prefix="e" %>
<%@taglib uri="www.google.com/emp/123/ctag" prefix="c" %>

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
<Br>
<c:greet/>
<BR>
<c:max n2="220" n1="220"/>
<br>
<c:print count="3">Royal</c:print>
<br>
<c:mark>ROYAL</c:mark>
<br>
THE END 
</body>
</html>