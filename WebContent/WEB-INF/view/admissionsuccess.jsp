<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Success Page</title>
</head>
<body>
<h1>
${headerMessage}
</h1>
<p>
${students.studentName}
</p>
<p>
${students.studentHobby}
</p>
<p>
${students.studentMobile}
</p>
<p>
${students.studentDOB}
</p>
<p>
${students.studentSkills}
</p>
<p>
${students.studentAddress.studentCountry}
</p>
<p>
${students.studentAddress.studentCity}
</p>
<p>
${students.studentAddress.studentStreet}
</p>
<p>
${students.studentAddress.studentPincode}
</p>
</body>
</html>