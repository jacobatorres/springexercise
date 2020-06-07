<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>  


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Save Customer</title>
	
	<style>
		.error {color: red}
	</style>	



</head>
<body>
	
	
	<form:form action = "processRulesheet" modelAttribute="rulesheet" method="POST">
		
		<table>
			
			<tbody>
				<tbody>
					<tr>
						<td><label>File type: </label></td>
						<td>
							<form:input path="type" />
							<br />
							<form:errors path="type" cssClass="error" />
							<br />
						</td>
						
					</tr>
					
					<tr>
						<td><label>File content: </label></td>
						<td>
							<form:input path="filecontent"/>
							<br />
							<form:errors path="filecontent" cssClass="error" />
						</td>
						
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
			<a href = "${pageContext.request.contextPath }/rulesheet/list">Back to rulesheet list</a>
		</p>
	
	
</body>
</html>