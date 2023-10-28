import java.util.Scanner;

class BankAccount {
    protected int accNo;
    protected String name;
    protected int age;
    protected String gender;
    protected String accType;
    protected double totalBalance;

    public BankAccount(int accNo, String name, int age, String gender, String accType, double totalBalance) {
        this.accNo = accNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.accType = accType;
        this.totalBalance = totalBalance;
    }

    public void displayBalance() {
        System.out.println("Account Balance: $" + totalBalance);
    }

    public void withdraw(double amount) {
        if (totalBalance >= amount) {
            totalBalance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: $" + totalBalance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public void deposit(double amount) {
        totalBalance += amount;
        System.out.println("Deposit successful. New Balance: $" + totalBalance);
    }

    public void calculateInterest(double rate) {
        double interest = totalBalance * rate / 100;
        System.out.println("Annual Interest: $" + interest);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accNo, String name, int age, String gender, double totalBalance) {
        super(accNo, name, age, gender, "Savings", totalBalance);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int accNo, String name, int age, String gender, double totalBalance) {
        super(accNo, name, age, gender, "Current", totalBalance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter Initial Balance: $");
        double initialBalance = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(accNo, name, age, gender, initialBalance);
        CurrentAccount currentAccount = new CurrentAccount(accNo, name, age, gender, initialBalance);

        savingsAccount.displayBalance();
        savingsAccount.withdraw(50);
        savingsAccount.deposit(100);
        savingsAccount.calculateInterest(5);

        currentAccount.displayBalance();
        currentAccount.withdraw(150);
        currentAccount.deposit(200);
        currentAccount.calculateInterest(2);

        scanner.close();
    }
}