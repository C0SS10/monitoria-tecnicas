package com.udea.servlets;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.udea.dao.UsuarioDAO;
import com.udea.model.Usuario;

@WebServlet("/lista-usuarios")
public class ObtenerServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    String cedulaParametro = request.getParameter("cedula");

    if (cedulaParametro != null && !cedulaParametro.isEmpty()) {
      // Si se proporcionó, mostrar solo el usuario con esa cédula
      int cedula = Integer.parseInt(cedulaParametro);
      Usuario usuario = usuarioDAO.seleccionarUsuarioPorCedula(cedula);

      // Pasar el usuario al archivo JSP
      request.setAttribute("usuarios", Collections.singletonList(usuario));
    } else {
      List<Usuario> usuarios = usuarioDAO.seleccionarTodosUsuarios();

      // Imprimir en consola la lista de usuarios, utiliza método toString() implicitamente.
      System.out.println(usuarios);
      System.out.println("\n\n xxxxxxxxxxxxxx \n\n");

      // Pasar la lista de usuarios al archivo JSP
      request.setAttribute("usuarios", usuarios);
    }

    request.getRequestDispatcher("/lista-usuarios.jsp").forward(request, response);
  }

  /* protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String method = request.getParameter("_method");
    if (method != null && method.equalsIgnoreCase("DELETE")) {
      eliminarUsuario(request, response);
    } else {
      // Otras operaciones POST si las hay
    }
  }

  private void eliminarUsuario(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    String cedulaParametro = request.getParameter("cedula");

    if (cedulaParametro != null && !cedulaParametro.isEmpty()) {
      int cedula = Integer.parseInt(cedulaParametro);
      usuarioDAO.eliminarUsuarioPorCedula(cedula);
    }

    // Redirigir a la lista de usuarios después de eliminar
    response.sendRedirect("lista-usuarios");
  } */
}
