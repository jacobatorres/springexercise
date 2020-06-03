<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Customer</title>
</head>
<body>
	
	
	<form:form action = "saveCustomer" modelAttribute="customer" method="POST">
		
		<table>
			
			<tbody>
				<tbody>
					<tr>
						<td><label>Name: </label></td>
						<td><form:input path="name"></form:input></td>
						
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type = "submit" value = "Save"/></td>
					</tr>
				</tbody>
			</tbody>
		
		</table>
		
	</form:form>	

		<p>
			<a href = "${pageContext.request.contextPath }/customer/list">Back to list</a>
		</p>
	
	
</body>
</html>