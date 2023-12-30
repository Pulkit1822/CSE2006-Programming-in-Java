import java.util.Scanner;

public class IntegerStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public IntegerStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if(top == maxSize - 1) {
            System.out.println("Stack is full. Can't push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to stack");
        }
    }

    public void pop() {
        if(top == -1) {
            System.out.println("Stack is empty. Can't pop");
        } else {
            System.out.println("Popped " + stackArray[top--] + " from stack");
        }
    }

    public void display() {
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack contents: ");
            for(int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int size = scanner.nextInt();
        IntegerStack stack = new IntegerStack(size);

        while (true) {
            System.out.println("Enter 1 to push, 2 to pop, 3 to display stack, 4 to exit:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number to push:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}