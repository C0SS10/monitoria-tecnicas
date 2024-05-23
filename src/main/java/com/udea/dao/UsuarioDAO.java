package com.udea.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.udea.model.Usuario;

public class UsuarioDAO {
  private String URL_DB = "jdbc:mariadb://localhost:3306/tecnicas";
  private String USER_DB = "root";
  private String PASSWORD_DB = "root";

  // Métodos para hacer un CRUD (Create, Read, Update, Delete) de un usuario
  private static final String INSERTAR_USUARIO = "INSERT INTO usuarios (nombre, cedula, ciudad, contraseña_encriptada, email) VALUES (?, ?, ?, ?, ?)";
  private static final String SELECCIONAR_USUARIO_CEDULA = "SELECT * FROM usuarios WHERE cedula = ?";
  private static final String SELECCIONAR_TODOS = "SELECT * FROM usuarios";
  private static final String ELIMINAR_USUARIO = "DELETE FROM usuarios WHERE cedula = ?";
  private static final String ACTUALIZAR_USUARIO = "UPDATE usuarios SET nombre = ?, ciudad = ?, email = ?, contraseña_encriptada = ? WHERE cedula = ?";

  private static final String FILTRAR_CUENTA = "SELECT * FROM usuarios WHERE consecutivo = ?";

  // Conexión a la base de datos
  protected Connection getConnection() {
    Connection conexion = null;
    System.out.println("Conectando a la base de datos...");
    try {
      // Le pasamos la URL de la base de datos, el usuario y la contraseña para conectarnos a la base de datos
      conexion = DriverManager.getConnection(URL_DB, USER_DB, PASSWORD_DB);
      System.out.println(conexion);
    } catch (SQLException e) {
      System.out.println("Error al conectar a la base de datos: " + e.getMessage());
    }
    return conexion;
  }

  // Crear un usuario
  public void insertarUsuario(Usuario nuevoUsuario){
    try(
      Connection conexion = getConnection(); 
      PreparedStatement preparedStatement = conexion.prepareStatement(INSERTAR_USUARIO)
    ){
      preparedStatement.setString(1, nuevoUsuario.getNombre());
      preparedStatement.setInt(2, nuevoUsuario.getCedula());
      preparedStatement.setString(3, nuevoUsuario.getCiudad());
      preparedStatement.setString(4, nuevoUsuario.getContraseña_encriptada());
      preparedStatement.setString(5, nuevoUsuario.getEmail());
      preparedStatement.executeUpdate();
    } catch(SQLException e){
      System.out.println("Error al insertar un usuario: " + e.getMessage());
    }
  }
}
