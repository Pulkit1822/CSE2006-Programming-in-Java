public class Account {
    // Private variables can only be accessed within the same class
    private String accountName;
    private double balance;

    // Public methods can be accessed from any class
    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    // Getter for accountName
    public String getAccountName() {
        return accountName;
    }

    // Setter for accountName
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}