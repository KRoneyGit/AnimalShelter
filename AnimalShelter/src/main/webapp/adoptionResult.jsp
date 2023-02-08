<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Thank you for adopting!</h1>
	<p>Your adoption application for ${pet.getPetName()} has been received and is being processed.</p>
	<p>The total amount owed for the adoption will be $${pet.getTotalCost()}.</p>
<a href="index.jsp">Go Home</a>
<a href="volunteer.jsp">Volunteer</a>
</body>
</html>