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

testing 1234


			<!-- button for add customer -->
			<input type = "button" value = "Add Customer" 
				onclick="window.location.href='showFormForAdd'; return false"
				
			/>
			
			<br  >
			<table>
				<tr>
					<th>id</th>
					<th> Name</th>
				</tr>
				
				<c:forEach var = "tempCustomer" items="${customers}">
					<tr>
						<td> ${tempCustomer.id } </td>
						<td> ${tempCustomer.name } </td>
					</tr>
				</c:forEach>
				
			</table>
			
		<p>
			<a href = "${pageContext.request.contextPath }/rulesheet/list">Show rulesheet list</a>
		</p>
	

</body>
</html>