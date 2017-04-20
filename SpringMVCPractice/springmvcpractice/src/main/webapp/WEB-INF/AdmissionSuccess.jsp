<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success Page</title>
</head>
<body>
	<h1>Congratulations</h1>
	<h2>${headerMessage}</h2>
	
	<table>
		<tr>
			<td>Student Name:</td>
			<td>${student1.studentName}</td>
		</tr>
		<tr>
			<td>Student Name:</td>
			<td>${student1.studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile Number:</td>
			<td>${student1.studentMobileNumber}</td>
		</tr>
		<tr>
			<td>Student DOB:</td>
			<td>${student1.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Skills:</td>
			<td>${student1.studentSkills}</td>
		</tr>
		<tr>
			<td>Student Country:</td>
			<td>${student1.studentAddress.country}</td>
		</tr>
		<tr>
			<td>Student City:</td>
			<td>${student1.studentAddress.city}</td>
		</tr>
		<tr>
			<td>Student Street:</td>
			<td>${student1.studentAddress.street}</td>
		</tr>
		<tr>
			<td>Student Pin code:</td>
			<td>${student1.studentAddress.pincode}</td>
		</tr>
	</table>
</body>
</html>