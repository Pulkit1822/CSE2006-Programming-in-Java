import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Cone");
        System.out.println("5. Triangle");

        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateCircleArea();
                break;
            case 2:
                calculateSquareArea();
                break;
            case 3:
                calculateRectangleArea();
                break;
            case 4:
                calculateConeArea();
                break;
            case 5:
                calculateTriangleArea();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }

        scanner.close();
    }

    private static void calculateCircleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);
    }

    private static void calculateSquareArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double area = Math.pow(side, 2);
        System.out.println("Area of the square: " + area);
    }

    private static void calculateRectangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    private static void calculateConeArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cone: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the slant height of the cone: ");
        double slantHeight = scanner.nextDouble();
        double area = Math.PI * radius * (radius + slantHeight);
        System.out.println("Surface area of the cone: " + area);
    }

    private static void calculateTriangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base length of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }
}
