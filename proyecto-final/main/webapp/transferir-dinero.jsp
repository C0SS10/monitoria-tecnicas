<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Transferir Dinero</title>
</head>
<body>
    <h1>Transferir Dinero</h1>
    <form action="transferir-dinero" method="post">
        <label for="idCuentaOrigen">ID Cuenta Origen:</label>
        <input type="number" id="idCuentaOrigen" name="idCuentaOrigen" required>
        <br>
        <label for="idCuentaDestino">ID Cuenta Destino:</label>
        <input type="number" id="idCuentaDestino" name="idCuentaDestino" required>
        <br>
        <label for="monto">Monto a Transferir:</label>
        <input type="number" id="monto" name="monto" required>
        <br>
        <input type="submit" value="Transferir">
    </form>
</body>
</html>
