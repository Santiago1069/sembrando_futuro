package modelos;



import javax.swing.*;
import java.util.Date;

public class Proyecto  {

    String nombre_proyecto;
    String nombre_creador;
    String cosechas;
    Date fecha;

    public Proyecto(String nombre_proyecto, String nombre_creador, String cosechas, Date fecha) {
        this.nombre_proyecto = nombre_proyecto;
        this.nombre_creador = nombre_creador;
        this.cosechas = cosechas;
        this.fecha = fecha;
    }
}
