import java.util.Scanner;

public class GenericPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intInput = scanner.nextInt();

        System.out.print("Enter a double: ");
        double doubleInput = scanner.nextDouble();

        System.out.print("Enter a character array (separated by spaces): ");
        scanner.nextLine();
        String charArrayInput = scanner.nextLine();

        char[] charArray = charArrayInput.toCharArray();

        printGeneric(intInput);
        printGeneric(doubleInput);
        printGeneric(charArray);

        scanner.close();
    }

    public static <T> void printGeneric(T input) {
        System.out.println("Generic Print: " + input);
    }
}
