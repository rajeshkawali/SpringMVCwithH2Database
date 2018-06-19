<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Diebold</title>
</head>
<body>
	<h2>Welcome to Diebold</h2>
	<a href="<c:url value='/file/uploadform' />">File Upload Page</a>
	<h3>Add Name</h3>

	<form:form method="POST" action="add" modelAttribute="diebold">
		<table>
			<tr>
				<td><label for="name">Name: </label></td>
				<td><form:input path="name" id="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="add" /></td>
			</tr>
		</table>
	</form:form>

	<fieldset>
		<legend>Users List</legend>
		<table class="resltTable">
			<tr>
				<th>Id</th>
				<th>Name</th>
			</tr>
			<c:forEach items="${diebolds}" var="dm">
				<tr>
					<td>${dm.id}</td>
					<td>${dm.name}</td>
				</tr>
			</c:forEach>
		</table>
	</fieldset>

</body>
</html>