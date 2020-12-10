package almacenamiento;

import modelos.Tarea;
import modelos.TipoCosecha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioTareas  extends Repositorio{

    public List<Tarea> obtenerTareas(TipoCosecha tipoCosecha) throws SQLException {

        Connection conexion = obtenerConexion();
        String sql = "SELECT * FROM TAREAS WHERE ID_TIPO_COSECHA = ?";
        PreparedStatement sentencia = conexion.prepareStatement(sql);

        sentencia.setInt(1, tipoCosecha.getId());

        ResultSet resultSet = sentencia.executeQuery();
        List<Tarea> tareas = new ArrayList<>();

        while (resultSet.next()){

            Tarea tarea = new Tarea(resultSet.getInt("ID_TAREAS"),
                    resultSet.getString("NOMBRE"),
                    resultSet.getString("DESCIPCION"),
                    resultSet.getString("RUTA_IMAGEN"),
                    resultSet.getInt("ID_TIPO_COSECHA"));


            tareas.add(tarea);
        }

        return tareas;


    }

}
