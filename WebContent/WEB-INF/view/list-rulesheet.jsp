<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  

<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>  
  
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Spring Exercise</title>
</head>
<body>

testing 1234 RULESHEETS!


			<!-- button for add customer -->
			<input type = "button" value = "Add Rulesheet" 
				onclick="window.location.href='showFormForAdd'; return false"
				
			/>
			
			<br  >
			<table>
				<tr>
					<th>id</th>
					<th>type</th>
					<th>filecontent</th>
				</tr>
				
				<c:forEach var = "var" items="${rulesheet}">
					<tr>
						<td> ${var.id } </td>
						<td> ${var.type } </td>
						<td> ${var.filecontent } </td>
						
					</tr>
				</c:forEach>
				
			</table>


</body>
</html>