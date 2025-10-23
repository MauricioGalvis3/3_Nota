package unidad2.semana5.clases;

public class Employee {
    private String role;

    // 🔹 Constructor que recibe un String
    public Employee(String role) {
        this.role = role;
    }

    // 🔹 Método NO estático (se usa con objetos)
    public void showResponsibilities() {
        switch (role) {
            case "manager":
                System.out.println("Manage team and projects.");
                break;
            case "developer":
                System.out.println("Write and maintain code.");
                break;
            case "designer":
                System.out.println("Design user interfaces and experiences.");
                break;
            default:
                System.out.println("Role not recognized.");
        }
    }
}