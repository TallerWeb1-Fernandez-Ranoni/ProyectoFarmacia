<%@page import="org.apache.taglibs.standard.tag.common.core.ForEachSupport"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    
    <title>Home Page</title>
</head>

<body>

<h2>Listado de Farmacias</h2>
<hr />
<br />
<table class="table table-striped">
	<th>Nombre</th>
	<th>Telefono</th>
	<th>Dia de Turno</th>
	
	<c:forEach items="${keymodel}" var="farmacia">
		<tr>
			<td>${farmacia.nombre}</td>
			<td>${farmacia.telefono}</td>
			<td>${farmacia.diaDeTurno}</td>
		</tr>
	</c:forEach>

</table>






<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>

</body>

</html>