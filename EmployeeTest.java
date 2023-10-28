public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("John Doe", 1);
        Employee e2 = new Employee("Jane Doe", 2);
        Employee e3 = new Employee("Jim Doe", 3);

        System.out.println("Employee 1: " + e1.getName() + ", ID: " + e1.getId());
        System.out.println("Employee 2: " + e2.getName() + ", ID: " + e2.getId());
        System.out.println("Employee 3: " + e3.getName() + ", ID: " + e3.getId());
        System.out.println("Total number of employees: " + Employee.getEmployeeCount());
    }
}