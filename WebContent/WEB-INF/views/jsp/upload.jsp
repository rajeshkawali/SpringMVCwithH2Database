<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<body>
<h1>Spring MVC multiple files upload</h1>

<h1>Upload Status</h1>
<h2>Message : ${message}</h2>

<form:form method="POST" action="${pageContext.request.contextPath}/file/uploadMulti"
           modelAttribute="uploadForm" enctype="multipart/form-data">

    <input type="file" name="files" /><br/>
    <input type="file" name="files" /><br/>
    <input type="file" name="files" /><br/><br/>
    <input type="submit" value="Submit" />

</form:form>
<a href="<c:url value='/' />">Home</a> 
</body>
</html>