package modelos;

import java.time.LocalDate;

public class Proyecto  {

    private String nombre_proyecto;
    private String identificacionUsuario;
    private TipoCosecha tipoCosecha;
    private LocalDate fecha;

    public Proyecto(String nombre_proyecto, String identificacionUsuario, TipoCosecha tipoCosecha, LocalDate fecha) {
        setNombreProyecto(nombre_proyecto);
        setIdentificacionUsuario(identificacionUsuario);
        setTipoCosecha(tipoCosecha);
        setFecha(fecha);
    
    }

    private void setFecha( LocalDate fecha) {

        if(fecha == null){

            throw new IllegalArgumentException("La fecha de la creacion del proyecto es requerido");

        }

        this.fecha = fecha;

    }

    private void setTipoCosecha(TipoCosecha tipoCosecha) {

        if (tipoCosecha == null){

            throw new IllegalArgumentException("El tipo de cosecha del proyecto es requerido");

        }

        this.tipoCosecha = tipoCosecha;

    }

    private void setIdentificacionUsuario(String nombre_creador) {

        if(nombre_creador == null || nombre_creador.isEmpty()){
            throw new IllegalArgumentException("El nombre del creador del proyecto es requerido");

        }

        this.identificacionUsuario = nombre_creador;

    }

    private void setNombreProyecto(String nombre_proyecto) {

        if(nombre_proyecto == null || nombre_proyecto.isEmpty()){
            throw new IllegalArgumentException("El nombre del proyecto es requerido");

        }

        this.nombre_proyecto = nombre_proyecto;

    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public TipoCosecha getTipoCosecha() {
        return tipoCosecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int obtenerDiasPasados() {
        return 1;
    }
}
