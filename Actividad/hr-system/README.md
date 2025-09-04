# hr-system

This project is a simple Human Resources system that demonstrates the functionality of an `Employee` class. The system allows for the management of employee information, including their names, roles, and salaries.

## Project Structure

```
hr-system
├── src
│   └── company
│       ├── hr
│       │   └── Employee.java
│       └── main
│           └── Main.java
└── README.md
```

## Classes

### Employee

The `Employee` class is located in the `company.hr` package and contains the following attributes and methods:

- **Attributes:**
  - `public String name`: The name of the employee.
  - `private double salary`: The salary of the employee.
  - `protected String role`: The role of the employee.

- **Methods:**
  - `public String getName()`: Returns the name of the employee.
  - `public double getSalary()`: Returns the salary of the employee.
  - `public void setSalary(double salary)`: Sets the salary of the employee with validation to ensure it is greater than 0.
  - `public String getRole()`: Returns the role of the employee.
  - `public void setRole(String role)`: Sets the role of the employee.
  - `public void increaseSalary(double amount)`: Increases the salary by the specified amount only if the amount is positive.

### Main

The `Main` class is located in the `company.main` package and demonstrates the functionality of the `Employee` class. It includes a `main` method that:
- Creates two `Employee` objects.
- Sets their names, roles, and salaries using the setters.
- Displays their information using the getters.

## How to Run

1. Ensure you have Java installed on your machine.
2. Navigate to the project directory.
3. Compile the Java files using the command:
   ```
   javac src/company/hr/Employee.java src/company/main/Main.java
   ```
4. Run the `Main` class using the command:
   ```
   java -cp src company.main.Main
   ```

This will execute the program and demonstrate the functionality of the `Employee` class.