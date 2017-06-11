<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>test4Mvc Home</title>
</head>
<body>
	<p>
		<h1 style="text-align: center; color: blue;">Hello from Test4MvcApp</h1>
	</p>

	<p>
		<h1 style="text-align: center; color: green;"><c:out value="${msgApp }"/>   </h1>
	</p>
	
	<p>
		<h1 style="text-align: center; color: red;">Son las&nbsp;<c:out value="${sonLas }"/>   </h1>
	</p>
	
	<p>
		<h1 style="text-align: center; color: olive;">No olvides que:<br/>   </h1>
		<h2 style="text-align: center; color: orange;"><c:out value="${citaAzar }"/></h2>
	</p>
	
	<p>
		<h1 style="text-align: center; color: purple;">Estas son todas las citas:<br/>   </h1>
		<h2 style="text-align: center; color: maroon;">
			<c:forEach var="rcita" items="${todasCitas }">
				<b>--></b><c:out value="${rcita }"></c:out><b><--</b><br/>
			</c:forEach>
		</h2>
	</p>
	
</body>
</html>