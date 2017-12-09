<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	
	<div align="center">
			
			<h3>Current List of rooms in Hotel ${ hotelId }:</h3>
				<table border="1">
						<tr>
							<th>Room ID</th>
							<th>Room No</th>
							<th>Room Type</th>
							<th>Tariff Rate Per Night</th>
							<th>Availability</th>
							<th>Action</th>
						</tr>
				<c:forEach items="${roomList.roomDtls}" var="Room">
					<tr>
						<td>${Room.roomId}</td>
						<td>${Room.roomNo}</td>
						<td>${Room.roomType}</td>
						<td>${Room.perNightRate}</td>
						<td>${Room.availability}</td>
						<c:if test="${Room.availability == 'yes'}">
						<td><a href="Booked.html?roomId=${Room.roomId}">Book this Room Now</a></td>
						</c:if>
						<c:if test="${Room.availability == 'no'}">
						<td>Room Booked</td>
						</c:if>
					</tr>
				</c:forEach>
			</table>

	</div>
	
	



</body>
</html>