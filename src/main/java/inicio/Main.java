package inicio;

import ventanas.GUI;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import static almacenamiento.AlmacenamientoConstantes.RUTA_BD;

public class Main {


    public static void main(String[] args) {

        Connection conexion = null;

        System.out.println("Conectando a base de datos " + RUTA_BD);

        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(RUTA_BD);
            System.out.println("Base de datos conectada...");

            SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run() {
                    GUI gameFrame = new GUI();
                }
            });


        } catch (Exception throwables) {
           System.out.println("Error conectando a la base datos");
           throwables.printStackTrace();
        }

    }
}
