<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${error}</h1>
	<form action="${pageContext.request.contextPath}/products" method="post">
		<label>Ingrese un usuario: </label><input type="text" name="user"><br>
		<label>Ingrese contraseña: </label><input type="password" name="pass"><br>
		<input type="submit">
	</form>
</body>
</html>