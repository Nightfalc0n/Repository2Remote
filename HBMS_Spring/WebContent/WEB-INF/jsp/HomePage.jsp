<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<div align="center">
		<form:form modelAttribute="Hotel" action="Book.html" method="post">
				<table border="1">
					<tr>
						<td>Enter your Travel Destination:</td>
						<td>
							<form:select path="city" required="true">
								<form:option value="">Please Select City</form:option>
								<form:options items="${City}" />
							</form:select>
						</td>
					</tr>
					<tr>
						<td>Booking From:</td>
						<td><input type="Date" name="bookingFrom"></td>
					</tr>
					<tr>
						<td>Booking To:</td>
						<td><input type="Date" name="bookingTo"></td>
					</tr>
					<tr>
					<td colspan="2"><button type="submit">Submit</button></td>
					</tr>
				</table>
		</form:form>
	</div>
	<div align="center" >
		<c:if test="${msg ne null}">
			<div>
			${msg}
			</div>
		</c:if>
	</div>
	<!-- alert logic -->
	
		<div align="center">
			<c:if test="${hotelList ne null}">
			<h3>Current List of Available Hotels:</h3>
				<table border="1">
						<tr>
							<th>Hotel Name</th>
							<th>Address</th>
							<th>Description</th>
							<th>Average Rate Per Night</th>
							<th>Phone Number(1)</th>
							<th>Phone Number(2)</th>
							<th>Rating</th>
							<th>Email</th>
							<th>Fax</th>
							<th></th>
						</tr>
				<c:forEach items="${hotelList}" var="Hotel">
					<tr>
						<td>${Hotel.hotelName}</td>
						<td>${Hotel.address}</td>
						<td>${Hotel.description}</td>
						<td>${Hotel.avgRatePerNight}</td>
						<td>${Hotel.phoneNo1}</td>
						<td>${Hotel.phoneNo2}</td>
						<td>${Hotel.rating}</td>
						<td>${Hotel.email}</td>
						<td>${Hotel.fax}</td>
						<td><a href="Booking.html?hotelId=${ Hotel.hotelId }">Book</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
</body>
</html>