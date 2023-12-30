import java.util.Scanner;

interface Library {
    void inputDetails();
    void calculateReturnDate();
    void calculateFine();
    void displayDetails();
}

class Book implements Library {
    private String bookName;
    private String bookTitle;
    private String accType;
    private String date;
    private String returnDate;
    private double fineAmount;

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        bookName = scanner.nextLine();
        System.out.print("Enter Book Title: ");
        bookTitle = scanner.nextLine();
        System.out.print("Enter Account Type: ");
        accType = scanner.nextLine();
        System.out.print("Enter Date: ");
        date = scanner.nextLine();
    }

    @Override
    public void calculateReturnDate() {
        returnDate = date + " + 14 days";
    }

    @Override
    public void calculateFine() {
        fineAmount = 1.0;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nLibrary Details:");
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Account Type: " + accType);
        System.out.println("Date: " + date);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Fine Amount: $" + fineAmount);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.inputDetails();
        book.calculateReturnDate();
        book.calculateFine();
        book.displayDetails();
    }
}
