<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int k = 10;
	%>
	<%=k%>

	<%
		if (k % 2 == 0) {
	%>

	EVEN
	<%
		}
	%>

	<Br>
	<hr>

	<c:set var="p" value="100"></c:set>
	<c:out value="${p}"></c:out>
	<%-- <c:remove var="p"/>
<c:out value="${p}"></c:out>
 --%>
	<c:if test="${p % 2 == 0 }">
		EVEN
	</c:if>
	<br> 
	
	<c:choose>
		<c:when test="${p == 2 }">
			TWO 
		</c:when>
		<c:when test="${p == 5 }">
			FIVE
		</c:when>
		<c:when test="${p == 10 }">
			TEN 
		</c:when>
		<c:otherwise>
			NONE
		</c:otherwise>
	</c:choose>
<Br> 
Loop<BR>
<c:forEach var="i" begin="1" end="10" step="2">
	${i}<br>
</c:forEach>
<br>
<c:forEach  items="${users}" var="user">
	${user.firstName}
</c:forEach>
<br>
<c:forTokens items="mon,tue,wed,thus" delims=","  var="x">
	${x }<br>
</c:forTokens>


<c:if test="${p == 200 }">
	<c:redirect url="login"></c:redirect>
</c:if>



</body>
</html>