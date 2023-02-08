<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adoption Form</title>
</head>
<body>
	<h1>Adoptions</h1>
	<h3>Enter pet info and submit adoption form</h3>
	
	<div><a href="index.jsp">Home</a></div>
	<div><a href="volunteer.jsp">Volunteer at shelter</a></div><br/>
	
	<form action="adoptionsServlet" method="post">
		<div>
			<label>Pet Name: </label>
			<input type="text" name="petName" size="20" />
		</div><br/>
		<div>
			<label>Pet Species: </label><br/>
			<label>Dog: </label>
			<input type="radio" name=petSpecies value="dog"><label>$200</label><br/>
			<label>Cat: </label>
			<input type="radio" name=petSpecies value="cat"><label>$100</label><br/>
			<label>Snake: </label>
			<input type="radio" name=petSpecies value="snake"><label>$50</label><br/>
		</div>
		<br/>
		<div>
			<label>Would you like to purchase starter kit of supplies and toys?</label><br/>
			<label>Yes: </label>
			<input type="radio" name=supplies value="yes"><br/>
			<label>No: </label>
			<input type="radio" name=supplies value="no"><br/>
		</div>
		<div>
			<br/>
			<input type="submit" value="Adopt" />
		</div>
	</form>
</body>
</html>