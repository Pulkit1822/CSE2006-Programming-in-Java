import java.util.Scanner;

// Base class
class Arithmetic {
    protected int operand1;
    protected int operand2;

    public Arithmetic(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int add() {
        return operand1 + operand2;
    }

    public int subtract() {
        return operand1 - operand2;
    }
}

// Subclass inheriting from Arithmetic
class Multiply extends Arithmetic {
    public Multiply(int operand1, int operand2) {
        super(operand1, operand2);
    }

    public int multiply() {
        return operand1 * operand2;
    }
}

// Subclass inheriting from Multiply
class Divide extends Multiply {
    public Divide(int operand1, int operand2) {
        super(operand1, operand2);
    }

    public int divide() {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
}

// Subclass inheriting from Divide
class Modulus extends Divide {
    public Modulus(int operand1, int operand2) {
        super(operand1, operand2);
    }

    public int modulus() {
        if (operand2 != 0) {
            return operand1 % operand2;
        } else {
            System.out.println("Cannot perform modulus operation with zero divisor.");
            return 0;
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operand1: ");
        int operand1 = scanner.nextInt();

        System.out.print("Enter operand2: ");
        int operand2 = scanner.nextInt();

        // Creating objects of each class
        Arithmetic arithmetic = new Arithmetic(operand1, operand2);
        Multiply multiply = new Multiply(operand1, operand2);
        Divide divide = new Divide(operand1, operand2);
        Modulus modulus = new Modulus(operand1, operand2);

        // Performing arithmetic operations
        System.out.println("Addition: " + arithmetic.add());
        System.out.println("Subtraction: " + arithmetic.subtract());
        System.out.println("Multiplication: " + multiply.multiply());
        System.out.println("Division: " + divide.divide());
        System.out.println("Modulus: " + modulus.modulus());

        scanner.close();
    }
}
