<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
<h1>
${headerMessage}
</h1>
<form:errors path="student.*" />
<form method="post" action="/FirstSpringMVC/submitform">
<p>
 Student's Name: <input type="text" name="studentName"/>
</p>
<p>
 Student's Hobby: <input type="text" name="studentHobby"/>
</p>

<p>
 Student's Mobile: <input type="text" name="studentMobile"/>
</p>
<p>
 Student's DOB: <input type="text" name="studentDOB"/>
</p>
<p>
 Student's Skills: 
 <select multiple name="studentSkills">
 <option value="football">football</option>
					  <option value="baseball">baseball</option>
					   <option value="basketball">basketball</option>
 					</select>
</p>
<p>

<p>
 Student's Country: <input type="text" name="studentAddress.studentCountry"/>
</p>

<p>
 Student's City: <input type="text" name="studentAddress.studentCity"/>
</p>
<p>
 Student's Street: <input type="text" name="studentAddress.studentStreet"/>
</p>
<p>
 Student's Pincode: <input type="text" name="studentAddress.studentPincode"/>
</p>
<p><input type="submit" value="SUBMIT"/></p>

</form>
</body>
</html>