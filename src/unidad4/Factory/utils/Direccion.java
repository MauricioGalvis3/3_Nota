package unidad4.Factory.utils;

public class Direccion {
    private final String ciudad;
    private final String calle;

    public Direccion(String ciudad, String calle) {
        this.ciudad = ciudad;
        this.calle = calle;
    }
    public String getFullAddress(){
        return calle + ", " + ciudad;
    }
}
