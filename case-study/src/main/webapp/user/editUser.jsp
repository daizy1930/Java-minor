<%@include file="header.jsp"%>

<%@ page isELIgnored="false"%>
<div class="container">
	<div class="row">
		<div class="col-lg-3">
			<h1 class="mt-5">Update User</h1>
		</div>
	</div><br>

	<form action="<%=request.getContextPath()%>/UserController/update-user"
		method="post">
		
		<div class="row">
			<div class="col-lg-1">
				<label>Id:</label>
			</div>
			<div class="col-lg-4">
				<input type="text" name="id" class="form-control" readonly="readonly" value="${users.id }">
			</div>
		</div><br>
		
		
		<div class="row">
			<div class="col-lg-1">
				<label>Username:</label>
			</div>
			<div class="col-lg-4">
				<input type="text" name="username" class="form-control" value ="${users.name }">
			</div>
		</div><br>

		<div class="row">
			<div class="col-lg-1">
				<label>Password:</label>
			</div>
			<div class="col-lg-4">
				<input type="password" name="password" class="form-control" value ="${users.password }">
			</div>
		</div><br>

		<div class="row">
			<div class="col-lg-1">
				<label >Address:</label>
			</div>
			<div class="col-lg-4">
				<input type="text" name="address" class="form-control" value="${users.address }">
			</div>
		</div><br>
		
		<div class="row">
			<div class="col-lg-1">
				<label >Role:</label>
			</div>
			<div class="col-lg-4">
				<input type="text" name="role" class="form-control" value="${users.role }">
			</div>
		</div><br>
		
		
		<div class="row">
			<div class="col-lg-1 justify-self-center">
				<input type="submit" name="add" value="Update" class="form-control btn btn-primary">
			</div>
		</div>



	</form>
</div>
<%-- <%@include file="footer.jsp"%>


<%@include file="header.jsp"%>

<%@ page isELIgnored="false"%>
<h1>Add User</h1>
<form action="<%=request.getContextPath()%>/UserController/update-user" method="post">
	User id:<input type ="text" name="id" value="${users.id}" readonly="readonly">
	<br>
	Username: <input type="text" name= "username" value="${users.name }" >
	<br>
	Password: <input type="password" name= "password" value="${users.password }" >
	<br>
	address:	<input type="text" name="address" value="${users.address }">
	<br>
	<input type="submit" name= "add" value="Update">
	
	</form>

<%@include file="footer.jsp"%> --%>