public class Main {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        // Set names, roles, and salaries
        employee1.setName("Alice");
        employee1.setRole("Developer");
        employee1.setSalary(70000);

        employee2.setName("Bob");
        employee2.setRole("Manager");
        employee2.setSalary(90000);

        // Display their information
        System.out.println("Employee 1: ");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Role: " + employee1.getRole());
        System.out.println("Salary: " + employee1.getSalary());

        System.out.println("\nEmployee 2: ");
        System.out.println("Name: " + employee2.getName());
        System.out.println("Role: " + employee2.getRole());
        System.out.println("Salary: " + employee2.getSalary());
    }
}