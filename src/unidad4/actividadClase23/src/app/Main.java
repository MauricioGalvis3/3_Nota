
package app;
import models.Carro;
import models.Moto;

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
