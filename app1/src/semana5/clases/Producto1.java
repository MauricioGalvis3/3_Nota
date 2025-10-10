package semana5.clases;

public class Producto1 {
	private String name;
	private double precio;

	public Producto1(String name, double precio) {
		this.name = name;
		this.precio = precio;
	}

	public void showInfo() {
		System.out.println("Producto: " + name + ", Precio: $" + precio);
	}

	public String getName() {
		return name;
	}

	public double getPrecio() {
		return precio;
	}
}
