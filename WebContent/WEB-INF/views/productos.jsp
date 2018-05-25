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
	<c:forEach items="${productos}" var="p">
		<h3>Nombre de Item: </h3><p><c:out value="${p.nomProducto}"></c:out></p><br>
		<h3>Descripcion: </h3><p><c:out value="${p.descProducto}"></c:out></p><br>
		<h3>Precio: </h3><p><c:out value="${p.precioProducto}"></c:out></p><br>
		<img alt="Image" src="<c:url value="/resources/images/${p.image}"></c:url>" width="350"><br>
		<form action="${pageContext.request.contextPath}/compras" method="post">
		<input type="text" value="${p.precioProducto}" name="product" readonly>
		<input type="submit">
		</form>
	</c:forEach>
	<br><br><br>
	<h2>Total de compra: </h2><h3><c:out value="${total}"></c:out></h3>
</body>
</html>