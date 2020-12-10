package modelos;

public class UsuarioLogin {

    private String correo;
    private String password;

    public UsuarioLogin(String correo, String password) {
        setCorreo(correo);
        setPassword(password);

    }

    public String getCorreo() {
        return correo;
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


    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {

        if(password == null || password.isEmpty()){
            throw new IllegalArgumentException("La contraseña del registro es requerido");
        }

        this.password = password;
    }

}
