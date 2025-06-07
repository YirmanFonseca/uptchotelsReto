<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de Hoteles</title>
    <style>
        body {
            font-family: Arial;
            margin: 40px;
        }
        table {
            border-collapse: collapse;
            width: 100%;
        }
        table, th, td {
            border: 1px solid #666;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        .activo { color: green; }
        .inactivo { color: red; }
    </style>
</head>
<body>
    <h2>Lista de Hoteles</h2>

    <table>
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Ciudad</th>
                <th>Dirección</th>
                <th>Teléfono</th>
                <th>Email</th>
                <th>Capacidad</th>
                <th>Estado</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="hotel" items="${listaHoteles}">
                <tr>
                    <td>${hotel.nombre}</td>
                    <td>${hotel.ciudad}</td>
                    <td>${hotel.direccion}</td>
                    <td>${hotel.telefono}</td>
                    <td>${hotel.email}</td>
                    <td>${hotel.capacidad}</td>
                    <td>
                        <span class="${hotel.activo ? 'activo' : 'inactivo'}">
                            ${hotel.activo ? 'Activo' : 'Inactivo'}
                        </span>
                    </td>
                    <td>
                        <a href="/hoteles/editar/${hotel.id}">Editar</a> |
                        <a href="/hoteles/cambiar-estado/${hotel.id}">
                            ${hotel.activo ? 'Desactivar' : 'Activar'}
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <br>
    <a href="/index">Volver al menú</a>
</body>
</html>
