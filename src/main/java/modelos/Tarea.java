package modelos;

public class Tarea {

     int id_tareas;
     String nombre;
     String descripcion;
     String ruta_Imagen;
     int id_tipo_cosecha;

    public Tarea(int id_tareas, String nombre, String descripcion, String ruta_Imagen, int id_tipo_cosecha) {
        this.id_tareas = id_tareas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ruta_Imagen = ruta_Imagen;
        this.id_tipo_cosecha = id_tipo_cosecha;
    }

    public int getId_tareas() {
        return id_tareas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRuta_Imagen() {
        return ruta_Imagen;
    }

    public int getId_tipo_cosecha() {
        return id_tipo_cosecha;
    }
}
