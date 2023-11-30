import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements:");
            int n = scanner.nextInt();
            int[] numbers = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }
            System.out.println("The average is " + average(numbers));
        }
    }

    public static double average(int... numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}