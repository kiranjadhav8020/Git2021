<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib uri="http://www.springframework.org/tags" prefix="page" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Record</title>
</head>
<body>

<table  align="center">
<caption align="center">View All Records</caption>
   <tr>
		<td><h5>Go to home page ::</td><td><a href="http://localhost:9090/home">click_here</a></h5></td>
   </tr>
</table>

<div align="center">
        <table border="1" cellpadding="9">
            <caption><h2>List of Employees</h2></caption>
            <tr>
                <th>EMPLOYEE ID</th>
                <th>EMPLOYEE Name</th>
                <th>EMPLOYEE Email</th>
                <th>EMPLOYEE Gender</th>
                <th>EMPLOYEE Job</th>
                <th>EMPLOYEE Salary</th>
                <th>EMPLOYEE HireDate</th>
                <th>EMPLOYEE Commission</th>
                <th>EMPLOYEE Dept_ID</th>
            </tr>
            <c:forEach var="emp" items="${employeeList1}">
                <tr>
                    <td><c:out value="${emp.emp_id}" /></td>
                    <td><c:out value="${emp.emp_name}" /></td>
                    <td><c:out value="${emp.emp_email}" /></td>
                    <td><c:out value="${emp.emp_gender}" /></td>
                    <td><c:out value="${emp.emp_job}" /></td>
                    <td><c:out value="${emp.emp_salary}" /></td>
                    <td><c:out value="${emp.emp_Hiredate}" /></td>
                    <td><c:out value="${emp.emp_commission}" /></td>
                    <td><c:out value="${emp.emp_depId}" /></td>
                    
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>