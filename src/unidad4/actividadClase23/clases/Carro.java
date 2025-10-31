package unidad4.actividadClase23.clases;

public class Carro extends Vehiculo {
    private int puertas;

    public Carro(String marca, int puertas) {
        super(marca);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public void acelerar() {
        setVelocidad(getVelocidad() + 15);
        System.out.println(getMarca() + " (Carro) acelera con fuerza. Velocidad: " + getVelocidad() + " km/h");
    }
}
