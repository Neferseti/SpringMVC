<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admission Form</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h1>Student Admission Form</h1>
	<form:errors path="student1.*" />
	<form action="/springmvcpractice/submitAdmissionForm.html" method="post">
		<table>
			<tr>
				<td>Student's Name:</td><td><input type="text" name="studentName"/></td>
			</tr>
			<tr>
				<td>Student's Hobby:</td><td><input type="text" name="studentHobby"/></td>
			</tr>
			<tr>
				<td>Student's Mobile Number:</td><td><input type="text" name="studentMobileNumber"/></td>
			</tr>
			<tr>
				<td>Student's DOB:</td><td><input type="text" name="studentDOB"/></td>
			</tr>
			<tr>
				<td>Student's Skills:</td><td><select name="studentSkills" multiple>
												<option value="Java Core">Java Core</option>
												<option value="Spring Core">Spring Core</option>
												<option value="Spring MVC">Spring MVC</option>	
											</select></td>
			</tr>
		</table>
		<table>
			<tr><td>Student's Address</td></tr>
			<tr><td>country <input type="text" name="studentAddress.country" /></td></tr>
			<tr><td>city <input type="text" name="studentAddress.city" /></td></tr>
			<tr><td>street <input type="text" name="studentAddress.street" /></td></tr>
			<tr><td>pincode <input type="text" name="studentAddress.pincode" /></td></tr>
		</table>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>