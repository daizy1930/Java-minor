<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@page import="com.cybage.model.Category"%>
	<%@page import="java.util.List"%>
	<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="<%= request.getContextPath()%>/AdminController/Add-category">Add Category</a>

	<table border="1">
		<tr>
			<td>Sr no.</td>
			<td>Category id</td>
			<td>Category Name</td>
			<td>Category Url</td>
		</tr>
		<c:forEach var ="cat" items="${categories }">
			<tr>
				<td>Sr no.</td>
				<td><c:out value ="${cat.id }"></c:out></td>
				<td><c:out value ="${cat.name }"></c:out></td>
				<td><c:out value ="${cat.category_url }"></c:out></td>
			</tr>
			
			
		</c:forEach>
	</table>
</body>
</html>