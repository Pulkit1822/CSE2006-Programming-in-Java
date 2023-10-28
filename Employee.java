public class Employee {
    private String name;
    private int id;
    private static int employeeCount = 0;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
}