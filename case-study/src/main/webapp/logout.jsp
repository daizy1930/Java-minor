<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% session.invalidate(); %>
	<h3>Logout thay gayu.....</h3>
	<jsp:include page="/index.jsp"></jsp:include>
</body>
</html>