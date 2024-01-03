import java.util.Scanner;

interface BasicAccount {
    void setBasicDetails(int accno, String name, int age, char gender);
}

interface AccountType {
    void setAccountType(String acctype);
}

interface BankOperations {
    void displayBalance();
    void withdraw(double amount);
    void deposit(double amount);
    void calculateAnnualInterest(double rate);
}

class BankDetails implements BasicAccount, AccountType, BankOperations {
    private int accno;
    private String name;
    private int age;
    private char gender;
    private String acctype;
    private double total;

    public void setBasicDetails(int accno, String name, int age, char gender) {
        this.accno = accno;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setAccountType(String acctype) {
        this.acctype = acctype;
    }

    public void displayBalance() {
        System.out.println("Balance: $" + total);
    }

    public void withdraw(double amount) {
        if (amount > total) {
            System.out.println("Insufficient funds!");
        } else {
            total -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + total);
        }
    }

    public void deposit(double amount) {
        total += amount;
        System.out.println("Deposit successful. New balance: $" + total);
    }

    public void calculateAnnualInterest(double rate) {
        double interest = total * (rate / 100);
        total += interest;
        System.out.println("Annual interest added. New balance: $" + total);
    }
}

public class BankProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankDetails bankAccount = new BankDetails();

        System.out.print("Enter Account Number: ");
        int accno = scanner.nextInt();
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Enter Account Type: ");
        String acctype = scanner.next();

        bankAccount.setBasicDetails(accno, name, age, gender);
        bankAccount.setAccountType(acctype);

        System.out.print("Enter Initial Balance: ");
        double total = scanner.nextDouble();
        bankAccount.displayBalance();

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawAmount = scanner.nextDouble();
        bankAccount.withdraw(withdrawAmount);

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = scanner.nextDouble();
        bankAccount.deposit(depositAmount);

        System.out.print("Enter Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();
        bankAccount.calculateAnnualInterest(annualInterestRate);

        scanner.close();
    }
}
