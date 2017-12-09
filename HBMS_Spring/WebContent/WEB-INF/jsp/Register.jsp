<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Enter your details to register.</h1>
<table border=1>
<form:form modelAttribute="user" action="save.html" method="post">
<tr><td>User Id</td><td><form:input path="userId" id="uid" required="true" placeholder="Enter User Id" /></td></tr>
<tr><td>User Name</td><td><form:input path="userName" id="uname" required="true" placeholder="Enter User Name" /></td></tr>
<tr><td>Password</td><td><form:input path="password" id="upassword" required="true" placeholder="Enter Password" /></td></tr>
<tr><td>Mobile Number</td><td><form:input path="mobileNo" id="umobile" required="true" placeholder="Enter Mobile Number" /></td></tr>
<tr><td>Phone Number</td><td><form:input path="phone" id="uphone" placeholder="Enter Phone Number" /></td></tr>
<tr><td>Role</td><td><form:select path="role" required="true"><br>
						<form:option value="">Please Select Role</form:option>
						<form:options items="${role}" />
					</form:select><br>
<tr><td>Address</td><td><form:input path="address" id="uaddress" required="true" placeholder="Enter Address" /></td></tr>
<tr><td>Email</td><td><form:input path="Email" id="uemail" required="true" placeholder="Enter Email" /></td></tr>
<tr><td colspan=4><button type="submit">Register</button></td></tr>
</form:form>
</table>
</div>
</body>
</html>