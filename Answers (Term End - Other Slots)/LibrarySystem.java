import java.util.Scanner;

interface LibrarySystem {
    void issueBook();
    void returnBook();
    void displayBooks();
}

interface SimpleInterestCalculator {
    double calculateSimpleInterest(double principal, double rate, double time);
}

class MyLibrary implements LibrarySystem {
    @Override
    public void issueBook() {
        System.out.println("Book issued successfully.");
    }

    @Override
    public void returnBook() {
        System.out.println("Book returned successfully.");
    }

    @Override
    public void displayBooks() {
        System.out.println("List of available books:\n1. Java Programming\n2. Data Structures\n3. Algorithms");
    }
}

class InterestCalculator implements SimpleInterestCalculator {
    @Override
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Library Management System:");
        LibrarySystem library = new MyLibrary();
        library.displayBooks();
        System.out.println("Choose an option:");
        System.out.println("1. Issue a book");
        System.out.println("2. Return a book");
        int libraryOption = scanner.nextInt();
        switch (libraryOption) {
            case 1:
                library.issueBook();
                break;
            case 2:
                library.returnBook();
                break;
            default:
                System.out.println("Invalid option.");
        }

        System.out.println("\nSimple Interest Calculator:");
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter interest rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();

        SimpleInterestCalculator interestCalculator = new InterestCalculator();
        double simpleInterest = interestCalculator.calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}
