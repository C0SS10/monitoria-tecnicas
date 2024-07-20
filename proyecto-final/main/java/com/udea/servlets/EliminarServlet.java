package com.udea.servlets;

import java.io.IOException;

import com.udea.dao.UsuarioDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/eliminar-usuario")
public class EliminarServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cedulaParametro = request.getParameter("cedula");

        if (cedulaParametro != null && !cedulaParametro.isEmpty()) {
            int cedula = Integer.parseInt(cedulaParametro);
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.eliminarUsuarioPorCedula(cedula);
        }

        // Redirigir a la lista de usuarios después de eliminar
        response.sendRedirect("lista-usuarios");
    }
}
