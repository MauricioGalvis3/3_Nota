package unidad4.Factory;
import unidad4.Factory.utils.Direccion;
import unidad4.Factory.utils.Gerente;
import unidad4.Factory.utils.Vendedor;
public class App {
    public static void main(String[] args) {
        Direccion d1 = new Direccion("Bogota", "Calle 80");
        Direccion d2 = new Direccion("Medellin", "Carrera 50");

        Gerente g1 = new Gerente("Carlos Perez", 5000, 1500, d1);
        Vendedor v1 = new Vendedor("Ana Gomez", 3000, 0.10, d2, 20000);

        System.out.println("==empleados==");
        g1.mostrarInfo();
        v1.mostrarInfo();
    }
}
