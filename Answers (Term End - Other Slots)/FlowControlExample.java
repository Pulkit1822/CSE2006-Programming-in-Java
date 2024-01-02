import java.util.Scanner;

public class FlowControlExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count for Fibonacci series: ");
        int count = scanner.nextInt();
        System.out.println("Fibonacci Series:");
        printFibonacciSeries(count);

        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();
        double squareRoot = calculateSquareRoot(number);
        System.out.println("Square root of " + number + " is: " + squareRoot);

        scanner.close();
    }

    private static void printFibonacciSeries(int count) {
        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < count; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
    }

    private static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }
}
