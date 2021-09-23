<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Employee</title>
</head>
<body>
<table  border="1"  align="center">
 <caption>Add New Employee</caption>
<form action="addEmployee" method="Post" modelAttribute="employeeDTO">  
	<tr>
			<td>Employee Id ::</td><td><input type="text" name="emp_id"  /></td>
	</tr>	
	<tr>  
			<td>Employee Name ::</td><td><input type="text" name="emp_name" /></td>
	</tr>
	<tr>		 
			<td>Employee Gender ::</td><td> Male<input type="radio" name="emp_gender" value="male" checked/> Female<input type="radio" name="emp_gender" value="female" /></td> 
	</tr>
	<tr>
			<td>Employee Job ::</td><td><input type="text" name="emp_job" /></td>
	</tr>
	<tr>
			<td>Employee HireDate ::</td><td><input type="date" name="emp_hiredate" /></td>
	</tr>
	<tr>		     
			<td>Employee Email ::</td><td><input type="email" name="emp_email" /></td>
	</tr>		
	<tr>
			<td>Employee Salary ::</td><td><input type="text" name="emp_salary" /></td>
	</tr>
	<tr>
			<td>Employee commission ::</td><td><input type="text" name="emp_commission" /></td>
	</tr>
	<tr>		
			<td>Employee Department Id ::</td><td><input type="text" name="emp_depId" /></td>

	</tr>
	<tr>
			<td><input type="submit" value="Add"/></td>
	</tr>		
</form>  
</table>
</body>
</html>