<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.cybage.model.User"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>
<%@ page isELIgnored="false"%>



<div class="container">
	<div class="row">
	<div class="col-lg-3">
		<a href="<%=request.getContextPath()%>/user/addUser.jsp"
			class="float-right btn btn-info text-white my-5">Add User</a>
	</div>
	</div>

	<div class="row">
		<table border="1" class="table">
			<thead class="bg-info text-white">
				<tr>
					<td>No.</td>
					<td>User id</td>
					<td>Username</td>
					<td>Address</td>
					<td>Role</td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="u" items="${users}">
					<tr>
						<td>sr no</td>
						<td><c:out value="${u.id }"></c:out></td>
						<td><c:out value="${u.name}"></c:out></td>
						<td><c:out value="${u.address }"></c:out></td>
						 <td><c:out value="${u.role }"></c:out></td> 
						<td><a
							href="<%=request.getContextPath() %>/UserController/edit?id=${u.id}"
							class="btn btn-primary">Edit</a></td>
						<td><a
							href="<%=request.getContextPath() %>/UserController/delete?id=${u.id}"
							class="btn btn-danger">Delete</a></td>
					<tr>
				</c:forEach>
			</tbody>

		</table>
	</div>
</div>

<%@include file="footer.jsp"%>