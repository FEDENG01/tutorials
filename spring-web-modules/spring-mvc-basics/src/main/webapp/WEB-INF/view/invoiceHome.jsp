 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de factura</title>
</head>
<body>
	<h3>Bienvenido, rellene los datos de la factura</h3>

	<form:form method="POST" action="/spring-mvc-basics/addInvoice" modelAttribute="invoice">
		<table>
			<tr>
				<td><form:label path="Concepto">Concepto</form:label></td>
				<td><form:input path="Concepto" /></td>
			</tr>
			<tr>
				<td><form:label path="Cantidad">Cantidad</form:label></td>
				<td><form:input path="Cantidad" /></td>
			</tr>
			<tr>
				<td><form:label path="PorcentajeRetencion">Porcentaje Retencion</form:label></td>
				<td><form:input path="PorcentajeRetencion" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>

</html>