<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro de Usuario</title>
</head>
<body>
    <h2>Registro de Usuario</h2>
    <form action="registro" method="post">
        Nombre: <input type="text" name="nombre"><br>
        Cédula: <input type="text" name="cedula"><br>
        Ciudad: <input type="text" name="ciudad"><br>
        Contraseña: <input type="password" name="contraseña"><br>
        Email: <input type="email" name="email"><br>
        <input type="submit" value="Registrar">
    </form>
</body>
</html>
