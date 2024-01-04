import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private double salary;
    private double pf;
    private double hra;

    // Constructor to initialize employee details
    public Employee(int empId, String name, double salary, double pf, double hra) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.pf = pf;
        this.hra = hra;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getPf() {
        return pf;
    }

    public double getHra() {
        return hra;
    }

    // Method to calculate total salary
    public double calculateTotalSalary() {
        return salary + pf + hra;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees (n): ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter PF: ");
            double pf = scanner.nextDouble();
            System.out.print("Enter HRA: ");
            double hra = scanner.nextDouble();

            employees[i] = new Employee(empId, name, salary, pf, hra);
        }

        // Display employee details and total salary
        System.out.println("\nEmployee Details and Total Salary:");
        for (Employee employee : employees) {
            System.out.println("\nEmployee ID: " + employee.getEmpId());
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("PF: " + employee.getPf());
            System.out.println("HRA: " + employee.getHra());
            System.out.println("Total Salary: " + employee.calculateTotalSalary());
        }

        scanner.close();
    }
}
