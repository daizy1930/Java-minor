<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<div class="container mt-5">
<form method="POST" action="j_security_check">
<table border="0">
<tr>
<td>Login</td>
<td><input type="text" name="j_username" class="form-control"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="j_password" class="form-control"></td>
</tr>
</table>
<input type="submit" value="Login!" class="btn btn-primary text-cenetr" class="form-control">
</form>
</div>

</body>
</html>