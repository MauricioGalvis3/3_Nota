
public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Se vendieron " + amount + " unidades de " + name + ".");
        } else {
            System.out.println("No hay suficiente stock para vender " + amount + " unidades.");
        }
    }

    public void restock(int amount) {
        quantity += amount;
        System.out.println("Se repusieron " + amount + " unidades de " + name + ".");
    }

    public void showProduct() {
        System.out.println("Producto: " + name);
        System.out.println("Precio: $" + price);
        System.out.println("Stock disponible: " + quantity);
        System.out.println("---------------------------");
    }
}
