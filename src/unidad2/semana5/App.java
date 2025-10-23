package unidad2.semana5;
import unidad2.semana5.clases.Employee;
import unidad2.semana5.clases.Producto1;

public class App {
    public static void main(String[] args) {
        java.util.ArrayList<Producto1> productos = new java.util.ArrayList<>();
        productos.add(new Producto1("Manzana", 1200));
        productos.add(new Producto1("Banano", 2000));
        productos.add(new Producto1("Leche", 2500));
        productos.add(new Producto1("Pan", 1000));
        productos.add(new Producto1("Queso", 3400));
        productos.add(new Producto1("Jugo", 2000));

        System.out.println("Lista de productos:");
        for (Producto1 p : productos) {
            p.showInfo();

        }


        // ----- EMPLOYEES -----
        Employee e1 = new Employee("manager");
        Employee e2 = new Employee("developer");
        Employee e3 = new Employee("designer");
        Employee e4 = new Employee("tester");

        System.out.print("Manager: ");
        e1.showResponsibilities();

        System.out.print("Developer: ");
        e2.showResponsibilities();

        System.out.print("Designer: ");
        e3.showResponsibilities();

        System.out.print("Tester: ");
        e4.showResponsibilities(); // este entra en "Role not recognized"
    }
    
}
