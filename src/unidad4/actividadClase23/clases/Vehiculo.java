package unidad4.actividadClase23.clases;

public class Vehiculo {
    private String marca;
    private int velocidad;

    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar() {
        velocidad += 10;
        System.out.println(marca + " está acelerando. Velocidad: " + velocidad + " km/h");
    }

    public void frenar() {
        if (velocidad > 0) {
            velocidad -= 10;
            if (velocidad < 0) velocidad = 0;
        }
        System.out.println(marca + " frenó. Velocidad actual: " + velocidad + " km/h");
    }
}
