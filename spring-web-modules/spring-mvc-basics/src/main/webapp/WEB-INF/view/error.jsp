<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body>
    <h2>Error</h2>
    <p>Se ha producido un error inesperado. Por favor, inténtalo de nuevo más tarde.</p>

    <%-- Muestra el mensaje de error si está disponible --%>
    <% if (request.getAttribute("errorMessage") != null) { %>
        <p>Error Message: <%= request.getAttribute("errorMessage") %></p>
    <% } %>
</body>
</html>