package almacenamiento;

import modelos.Proyecto;
import modelos.TipoCosecha;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepositorioProyecto extends Repositorio{

    public void guardar(Proyecto proyecto) throws SQLException {

        Connection conexion = obtenerConexion();
        String script = "INSERT INTO PROYECTOS(NOMBRE, FECHA, TIPO_COSECHA, DOC_IDENTIFICACION) " +
                "VALUES(?, ?, ?, ?)";

        PreparedStatement sentencia = conexion.prepareStatement(script);

        sentencia.setString(1, proyecto.getNombre_proyecto());
        sentencia.setDate(2, Date.valueOf(proyecto.getFecha()));
        sentencia.setString(3, String.valueOf(proyecto.getTipoCosecha().getId()) );
        sentencia.setString(4, proyecto.getIdentificacionUsuario());

        sentencia.executeUpdate();

    }

    public List<Proyecto> obtenerProyectosPorUsuario(String identificadorUsuario) throws SQLException {

        Connection conexion = obtenerConexion();
        String script = "SELECT * FROM PROYECTOS WHERE DOC_IDENTIFICACION = ?";
        PreparedStatement sentencia = conexion.prepareStatement(script);

        sentencia.setString(1, identificadorUsuario);

        ResultSet resultSet = sentencia.executeQuery();
        List<Proyecto> proyectos = new ArrayList<>();

        while(resultSet.next()){

            Proyecto proyecto = new Proyecto(
                resultSet.getString("NOMBRE"),
                resultSet.getString("DOC_IDENTIFICACION"),
                TipoCosecha.obtenerPorId(
                    resultSet.getInt("TIPO_COSECHA")
                ),
                resultSet.getDate("FECHA").toLocalDate()
            );

            proyectos.add(proyecto);

        }


        return proyectos;
    }


}
