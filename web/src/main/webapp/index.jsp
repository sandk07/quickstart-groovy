<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login App</title>

<style type="text/css">
#login-frm {
	background-color: #efefef;
	padding: 20px;
}

.container {
	width: 500px;
	margin-left: auto;
	margin-right: auto;
}

.container table td {
	padding: 10px;
}

</style>

</head>
<body>
<div class="container">
<form action = "InvokerServlet" id="login-frm">
			<table>

				<tr>
					<td>First Name:</td>
					<td><input type="text" name="fname"></td>
				</tr>

				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lname"></td>
				</tr>

				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" id="submit" value="submit" /></td>
				</tr>

			</table>
</div>
</body>
</html>
