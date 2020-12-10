package modelos;

public enum TipoCosecha {
    YUCA(1), MAIZ(2);

    private int id;

    TipoCosecha(int id) {
        this.id = id;
    }

    public static TipoCosecha obtenerPorId(int id) {
        for (TipoCosecha t: values()){
            if(t.id == id){
                return t;
            }
        }

        return null;
    }

    public static TipoCosecha obtenerPorNombre(String nombre){
        for (TipoCosecha t: values()){
            if(t.name().equals(nombre)){
                return t;
            }
        }

        return null;

    }

    public int getId() {
        return id;
    }
}
