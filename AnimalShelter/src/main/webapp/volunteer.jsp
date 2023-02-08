<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Volunteer Form</title>
</head>
<body>
	<h1>Volunteer</h1>
	<h3>Enter volunteer information and submit form</h3>
	
	<div><a href="index.jsp">Home</a></div>
	<div><a href="adoptions.jsp">Adopt a pet</a></div><br/>
	
	<form action="volunteerServlet" method="post">
		<div>
			<label>Enter your first and last name: </label>
			<input type="text" name="volunteerName" size="20" />
		</div><br/>
		<div>
			<label>Total hours each week you can volunteer: </label>
			<input type="number" name="totalHours" size="20" />
		</div><br/>
		<div>
			<label>When are you available to volunteer?</label><br/>
			<label>Weekdays only:</label>
			<input type="radio" name="volunteerDays" value="weekdays" /><br/>
			<label>Weekend only:</label>
			<input type="radio" name="volunteerDays" value="weekend" /><br/>
			<label>Weekdays and weekend:</label>
			<input type="radio" name="volunteerDays" value="full week" />
		</div><br/>
		<div>
			<input type="submit" value="Volunteer" />
		</div>
	</form>
</body>
</html>