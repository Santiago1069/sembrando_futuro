package almacenamiento;

import modelos.RegistroUsuario;
import modelos.UsuarioLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepositorioUsuario extends Repositorio{

    public void guardar(RegistroUsuario registroUsuario) throws SQLException {

        Connection conexion = obtenerConexion();

        String script = "INSERT INTO USUARIOS(DOC_IDENTIFICACION, NOMBRE, APELLIDO, CORREO, PASSWORD) " +
                "VALUES(?, ?, ?, ?, ?)";

        PreparedStatement sentencia = conexion.prepareStatement(script);
        sentencia.setString(1, registroUsuario.getIdentificacion());
        sentencia.setString(2, registroUsuario.getNombre());
        sentencia.setString(3, registroUsuario.getApellidos());
        sentencia.setString(4, registroUsuario.getCorreo());
        sentencia.setString(5, registroUsuario.getContrasena());

        sentencia.executeUpdate();

    }


    public boolean verificarLogin (UsuarioLogin usuarioLogin) throws SQLException{

        Connection conexion = obtenerConexion();

        String script = "SELECT * FROM USUARIOS WHERE CORREO = ? AND PASSWORD = ?";

        PreparedStatement sentencia = conexion.prepareStatement(script);
        sentencia.setString(1, usuarioLogin.getCorreo());
        sentencia.setString(2, usuarioLogin.getPassword());

        System.out.println(script);
        System.out.println(usuarioLogin.getCorreo());
        System.out.println(usuarioLogin.getPassword());


        ResultSet resultSet = sentencia.executeQuery();

        if (resultSet.next()){
            return true;
        } else{
            return false;
        }

    }



}
