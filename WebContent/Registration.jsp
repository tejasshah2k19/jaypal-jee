<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<%
		String error = (String) request.getAttribute("error");
	 	String emailError = (String) request.getAttribute("emailError");
		String passwordError = (String) request.getAttribute("passwordError");

		String firstNameValue = (String) request.getAttribute("firstNameValue");
	%>

	<form action="RegistrationServlet" method="post">

		FirstName : <input type="text" name="firstName"
			value="<%=firstNameValue == null ? "" : firstNameValue%>">

	 	${firstNameError }
		<br> <br> Email : <input type="text" name="email">
		<%=emailError == null ? "" : emailError%>
		<br> <br> Password : <input type="text" name="password">
		<%=passwordError == null ? "" : passwordError%>
		<br> <br> <input type="submit" value="Signup" />
	</form>
	<%=error == null ? "" : error%>

</body>
</html>