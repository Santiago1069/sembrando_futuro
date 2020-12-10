package almacenamiento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Repositorio {

    public Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(AlmacenamientoConstantes.RUTA_BD);
    }

}
