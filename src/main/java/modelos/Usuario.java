package modelos;

public class Usuario {

    String nombre;
    String apellidos;
    String identificacion;
    String correo;
    String contrasena;

    public Usuario(String nombre, String apellidos, String identificacion, String correo, String contrasena) {

        setNombre(nombre);
        setApellido(apellidos);
        setIdenticacion(identificacion);
        setCorreo(correo);
        setContrasena(contrasena);
    }

    private void setContrasena(String contrasena) {
        if(contrasena == null || contrasena.isEmpty()){
            throw new IllegalArgumentException("La contraseña del registro es requerido");
        }

        this.contrasena = contrasena;
    }

    private void setCorreo(String correo) {

        if(correo == null || correo.isEmpty()){
            throw new IllegalArgumentException("El correo del registro es requerido");
        }

        if(!esUnCorreo(correo)){
            throw new IllegalArgumentException("El correo parece que no tiene una estructura de válida");
        }

        this.correo = correo;
    }

    private boolean esUnCorreo(String correo) {
        boolean esUnCorreo = true;

        if(!correo.contains("@")){
            esUnCorreo = false;
        }

        if(!correo.contains(".")){
            esUnCorreo = false;
        }

        return esUnCorreo;

    }

    private void setNombre(String nombre) {

        if(nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre del registro es requerido");
        }

        this.nombre = nombre;

    }

    private void setApellido(String apellido) {
        if(apellido == null || apellido.isEmpty()) {
            throw new IllegalArgumentException("El apellido del registro es requerido");
        }

        this.apellidos = apellido;
    }

    private void setIdenticacion(String identificacion) {

        if(identificacion == null || identificacion.isEmpty()) {
            throw new IllegalArgumentException("La identificación del registro es requerido");
        }

        this.identificacion = identificacion;

    }

}
