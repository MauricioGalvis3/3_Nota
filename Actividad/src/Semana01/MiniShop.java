/* */
import java.util.ArrayList;
import java.util.Scanner;

public class MiniShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> productos = new ArrayList<>();
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("------ MENÚ DE TIENDA ------");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Reponer producto");
            System.out.println("4. Mostrar información de productos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Precio del producto: ");
                    double precio = scanner.nextDouble();

                    System.out.print("Cantidad inicial: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); 

                    Product nuevoProducto = new Product(nombre, precio, cantidad);
                    productos.add(nuevoProducto);
                    System.out.println("Producto agregado correctamente.\n");
                    break;

                case 2:
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.\n");
                        break;
                    }

                    mostrarProductos(productos);
                    System.out.print("Ingrese el número del producto a vender: ");
                    int indiceVenta = scanner.nextInt();
                    scanner.nextLine();

                    if (indiceVenta >= 1 && indiceVenta <= productos.size()) {
                        Product productoSeleccionado = productos.get(indiceVenta - 1);
                        productoSeleccionado.showProduct(); // Mostrar info del producto antes de vender

                        System.out.print("¿Cuántas unidades desea vender? ");
                        int unidadesVenta = scanner.nextInt();
                        scanner.nextLine();

                        productoSeleccionado.sell(unidadesVenta);
                    } else {
                        System.out.println("Índice inválido.\n");
                    }
                    break;

                case 3:
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.\n");
                        break;
                    }

                    mostrarProductos(productos);
                    System.out.print("Ingrese el número del producto a reponer: ");
                    int indiceReponer = scanner.nextInt();
                    scanner.nextLine();

                    if (indiceReponer >= 1 && indiceReponer <= productos.size()) {
                        Product productoSeleccionado = productos.get(indiceReponer - 1);
                        productoSeleccionado.showProduct(); // Mostrar info antes de reponer

                        System.out.print("¿Cuántas unidades desea añadir? ");
                        int unidadesReponer = scanner.nextInt();
                        scanner.nextLine();

                        productoSeleccionado.restock(unidadesReponer);
                    } else {
                        System.out.println("Índice inválido.\n");
                    }
                    break;

                case 4:
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.\n");
                    } else {
                        System.out.println("-----Informacion de los productos -----");
                        for (int i =0; i< productos.size(); i++){
                            System.out.println("producto #"+(i + 1));
                            productos.get(i).showProduct();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.\n");
            }

        } while (opcion != 5);

        scanner.close();
    }

   
    public static void mostrarProductos(ArrayList<Product> productos) {
        System.out.println("Lista de productos:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i).name);
        }
        System.out.println();
    }
}

// Clase Product
// class Product {
//     String name;
//     double price;
//     int quantity;

//     public Product(String name, double price, int quantity) {
//         this.name = name;
//         this.price = price;
//         this.quantity = quantity;
//     }

//     public void sell(int amount) {
//         if (amount <= quantity) {
//             quantity -= amount;
//             System.out.println("Se vendieron " + amount + " unidades de " + name + ".");
//         } else {
//             System.out.println("No hay suficiente stock para vender " + amount + " unidades.");
//         }
//     }

//     public void restock(int amount) {
//         quantity += amount;
//         System.out.println("Se repusieron " + amount + " unidades de " + name + ".");
//     }

//     public void showProduct() {
//         System.out.println("Producto: " + name);
//         System.out.println("Precio: $" + price);
//         System.out.println("Stock disponible: " + quantity);
//         System.out.println("---------------------------");
//     }
// }
