import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.printf("Sum is %d%n", sum);
        input.close();
    }
}