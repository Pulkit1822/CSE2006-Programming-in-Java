import java.util.Scanner;

public class AssertTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a num between 0 and 10: ");
            int num = scanner.nextInt();
            assert (num >= 0 && num <= 10) : "bad num: " + num;
            System.out.printf("You entered %d%n", num);
        }
    }
}
