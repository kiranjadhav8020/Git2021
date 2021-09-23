<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags" prefix="page" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<table border="1" align="center">
   <tr>
		<td><h1 align="center">This is Home Page </h1></td>
   </tr>
	<tr>
		<td><h5 align="center">Add New Employee ::<a href="http://localhost:9090/addEmployeePage">click_here</a></h5></td>
	</tr>
	<tr>
		<td><h5 align="center">Update Employee Details ::<a href="http://localhost:9090/updateEmployee">click_here</a></h5></td>
	</tr>
	<tr>
		<td><h5 align="center">Get All Employees ::<a href="http://localhost:9090/allEmployees">click_here</a></h5><td>
    </td>
</table>
</body>
</html>