<%@ page contentType="text/html; charset=UTF-8" language="java" %> <%@ taglib
prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Lista de Usuarios</title>
  </head>
  <body>
    <h1>Lista de Usuarios</h1>

    <section>
      <table border="1">
        <tr>
          <th>Nombre</th>
          <th>Cédula</th>
          <th>Ciudad</th>
          <th>Email</th>
        </tr>
        <tbody>
          <c:forEach items="${usuarios}" var="usuario">
            <tr>
              <td><c:out value="${usuario.nombre}" /></td>
              <td><c:out value="${usuario.cedula}" /></td>
              <td><c:out value="${usuario.ciudad}" /></td>
              <td><c:out value="${usuario.email}" /></td>
              <td>
                <!-- Si quiero eliminar un usuario por su cédula 'action=eliminar-usuario' me envia a la ruta de /eliminar-usuario y por tanto debería de tener un servlet encargado de esa ruta -->
                <form action="eliminar-usuario" method="post">
                  <input
                    type="hidden"
                    name="cedula"
                    value="${usuario.cedula}"
                  />
                  <input type="submit" value="Eliminar" />
                </form>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </section>

    <section class="opciones">
      <form action="lista-usuarios" method="get">
        <input
          type="number"
          name="cedula"
          placeholder="Cédula"
          class="input-cajon"
        />
        <input type="submit" value="Buscar" class="button" />
      </form>

      <form action="lista-usuarios" method="get">
        <input type="hidden" name="orden" value="alfabetico" />
        <input type="submit" value="Ordenar Alfabéticamente" class="button" />
      </form>
    </section>
  </body>

  <style>
    body {
      display: flex;
      flex-direction: column;
      gap: 1rem;
      text-align: center;
      margin-top: 2rem;
      font-family: "Courier New", Courier, monospace;
      background-color: #171717;
    }

    h1 {
      font-weight: 800;
      font-size: 2rem;
      color: #8c8c8c;
    }

    section:first-of-type {
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
    }

    .opciones {
      margin-top: 2rem;
      display: flex;
      flex-direction: row;
      gap: 4.5rem;
      justify-content: center;
    }

    table {
      border-collapse: collapse;
      width: 60%;
    }

    th {
      border: 1px solid #dddddd;
      padding: 8px;
      text-align: center;
      font-size: 1.5rem;
      background-color: #4caf50;
      color: white;
      border: none;
    }

    td {
      font-size: 1.2rem;
      font-weight: 600;
      color: #8c8c8c;
    }

    form {
      display: flex;
      flex-direction: column;
      align-items: center;
      gap: 1rem;
    }

    .input-cajon {
      width: 150px;
      height: 25px;
      border-radius: 5px;
      border: 2px solid #000;
      background-color: #fff;
      box-shadow: 4px 4px #000000;
      font-size: 1rem;
      font-weight: 600;
      color: #2a2a2a;
      padding: 5px 10px;
      outline: none;
      text-align: center;
    }

    .button {
      background: #4caf50;
      font-family: inherit;
      padding: 0.5em 1em;
      font-weight: 900;
      font-size: 18px;
      border: 2px solid black;
      border-radius: 0.4em;
      box-shadow: 0.1em 0.1em;
      cursor: pointer;
    }

    .button:hover {
      transform: translate(-0.05em, -0.05em);
      box-shadow: 0.15em 0.15em;
    }

    .button:active {
      transform: translate(0.05em, 0.05em);
      box-shadow: 0.05em 0.05em;
    }

    input[type="number"]::-webkit-inner-spin-button,
    input[type="number"]::-webkit-outer-spin-button {
      -webkit-appearance: none;
      -moz-appearance: none;
      appearance: none;
      margin: 0;
    }
  </style>
</html>
