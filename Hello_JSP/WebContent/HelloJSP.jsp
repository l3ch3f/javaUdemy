<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<h1>Hello</h1>
	<%= new Date() %>
	<%! public int x = 22; %>
	<br>
	<%
	int x = 25;
	out.println(x);
	if(x > 25) {
		out.println("X is greater than 25");
	} else {
		out.println("X is not greater than 25");
	}
	%>
	<br>
	<%!  
		String message() {
		return "I love JSP";
	}
	%>
	<%=
	message()
	%>

</body>
</html>