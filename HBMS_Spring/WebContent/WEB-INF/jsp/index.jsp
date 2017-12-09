<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<div align="center">
		<H1>Login Page</H1>
			<form:form modelAttribute="user" action="login.html" method="post">
				
					<table border="1">
						<tr><td>User Id:</td><td><form:input path="userId" name="userId"/></td></tr>
						<tr><td>Password:</td><td><form:input path="password" name="password" type="password"/></td></tr>
						<tr><td colspan="4"><input type="submit" value="Login"/></td></tr>
						<tr><td colspan="4"><a href="register.html">Register</a></td></tr>
					</table>
					${ msg }
			</form:form>
	</div>
</body>
</html>