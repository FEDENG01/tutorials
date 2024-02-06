<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Detalle de la factura</h2>
	<h3>${msg}</h3>
	<table>
		<tr>
			<td>Concepto :</td>
			<td>${Concepto}</td>
		</tr>
		<tr>
			<td>Cantidad :</td>
			<td>${Cantidad}</td>
		</tr>
		<tr>
			<td>Porcentaje de retencion :</td>
			<td>${PorcentajeRetencion}</td>
		</tr>
		<tr>
            <td>Cantidad despues de retencion:</td>
            <td>${CantidadDespuesRetencion}</td>
        </tr>
	</table>
</body>
</html>