<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>UPTCHotels - Inicio</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f3f3f3;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #004080;
            color: white;
            padding: 20px;
            text-align: center;
        }
        main {
            padding: 40px;
            text-align: center;
        }
        .button {
            display: inline-block;
            padding: 12px 24px;
            margin: 10px;
            background-color: #0074cc;
            color: white;
            border: none;
            border-radius: 8px;
            text-decoration: none;
            font-size: 16px;
        }
        .button:hover {
            background-color: #005fa3;
        }
    </style>
</head>
<body>
<header>
    <h1>Bienvenido a UPTCHotels</h1>
</header>
<main>
    <h2>Menú Principal</h2>
<a href="/listar" class="button">Ver Hoteles</a>
    <a href="/hoteles/registrar" class="button">Registrar Hotel</a>
</main>
</body>
</html>
