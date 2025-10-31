package unidad4.ActictividadVirtual;

public class Persona {
    private final String id;
    private final String nombre;

    protected Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

}
