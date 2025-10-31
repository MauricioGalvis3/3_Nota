package unidad4.Factory.utils;

public class Vendedor extends Empleado {
    private final double comision;
    private final double ventas;

    public Vendedor(String nombre, double salarioBase, double comision, Direccion direccion, double ventas) {
        super(nombre, salarioBase, direccion);
        this.comision = comision;
        this.ventas= ventas;
    }

    @Override
    public double calcularPago() {
        return salarioBase +(ventas * comision);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vendedor: " + nombre + " --direccion:" + direccion.getFullAddress() + "-- Salario:$"  + calcularPago() );
    }
    
}
