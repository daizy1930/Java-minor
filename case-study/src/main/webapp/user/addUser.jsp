<%@include file="header.jsp"%>





<div class="container">
	<div class="row">
		<div class="col-lg-3">
			<h1 class="mt-5">Add User</h1>
		</div>
	</div><br>

	<form action="<%=request.getContextPath()%>/UserController/add"
		method="post">
		<div class="row">
			<div class="col-lg-1">
				<label>Username:</label>
			</div>
			<div class="col-lg-4">
				<input type="text" name="username" class="form-control">
			</div>
		</div><br>

		<div class="row">
			<div class="col-lg-1">
				<label>Password:</label>
			</div>
			<div class="col-lg-4">
				<input type="password" name="password" class="form-control">
			</div>
		</div><br>

		<div class="row">
			<div class="col-lg-1">
				<label >Address:</label>
			</div>
			<div class="col-lg-4">
				<input type="text" name="address" class="form-control">
			</div>
		</div><br>
		<div class="row">
			<div class="col-lg-1 justify-self-center">
				<input type="submit" name="add" value="Add" class="form-control btn btn-primary">
			</div>
		</div>



	</form>
</div>
<%@include file="footer.jsp"%>