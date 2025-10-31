
package unidad4.actividadClase23;

import unidad4.actividadClase23.clases.Carro;
import unidad4.actividadClase23.clases.Moto;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 4);
        Moto moto = new Moto("Yamaha", true);

        carro.acelerar();
        carro.frenar();

        moto.acelerar();
        moto.frenar();
    }
}
