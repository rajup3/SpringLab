
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Here</title>
</head>
<body>
	<form id="LoginFormId" action="<c:url value="login" />" method="post" >
		<table>
			<tr>
				<td><h3>Login here</h3></td>
			</tr>
			<tr>
				<td>User Id:</td>
				<td><input type="text" id="userId"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" id="password"></td>
			</tr>
			<tr>
				<td>
					<input id="login" type="submit" name="authenticateUser" value="Login" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>