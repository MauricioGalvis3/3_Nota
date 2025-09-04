package Semana3.companny.hr;

package company.hr;

public class Employee {
    public String name;
    private double salary;
    protected String role;

    public Employee() {}

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary must be greater than 0.");
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Bonus
    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }
}
    
