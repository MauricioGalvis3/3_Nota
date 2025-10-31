package unidad4.actividadClase23.clases;

public class Moto extends Vehiculo {
    private boolean tieneCasco;

    public Moto(String marca, boolean tieneCasco) {
        super(marca);
        this.tieneCasco = tieneCasco;
    }

    public boolean isTieneCasco() {
        return tieneCasco;
    }

    public void setTieneCasco(boolean tieneCasco) {
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void acelerar() {
        setVelocidad(getVelocidad() + 20);
        System.out.println(getMarca() + " (Moto) acelera rápidamente 🏍️. Velocidad: " + getVelocidad() + " km/h");
    }
}
