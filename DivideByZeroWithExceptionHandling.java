import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueLoop = true;

            while (continueLoop) {
                try {
                    System.out.print("Enter numerator: ");
                    int numerator = scanner.nextInt();

                    System.out.print("Enter denominator: ");
                    int denominator = scanner.nextInt();

                    int result = numerator / denominator;
                    System.out.printf("Result: %d / %d = %d\n\n", numerator, denominator, result);

                    // Set the flag to stop the loop after one division
                    continueLoop = false;
                } catch (ArithmeticException arithmeticException) {
                    System.err.println("Divide by zero error: " + arithmeticException.getMessage());
                    System.out.println("Please enter a non-zero denominator.\n");
                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("Invalid input: " + inputMismatchException.getMessage());
                    System.out.println("Please enter valid integers.\n");
                    scanner.nextLine();
                }
            }
        }
    }
}
