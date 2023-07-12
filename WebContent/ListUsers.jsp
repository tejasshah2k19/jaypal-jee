<%@page import="java.sql.ResultSet"%>
<%@page
	import="javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ResultSet rs = (ResultSet) request.getAttribute("rs");
	%>
	
	<br>
	<a href="Registration.jsp">New User</a>
<br><Br>
	<table border="1">
	  	<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
		</tr>

		<%
			while (rs.next()) {
		%>
		<tr>
			<Td><%=rs.getInt("userId")%></Td>
			<Td><%=rs.getString("firstName")%></Td>
			<Td><%=rs.getString("email")%></Td>
			<Td><%=rs.getString("password")%></Td>
			<td><a href="DeleteUserServlet?userId=<%=rs.getInt("userId")%>">Delete</a></td>
		</tr>
		<%
			}
		%>

	</table>
	<br>
</body>
</html>