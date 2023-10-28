public class AccountTest {
    public static void main(String[] args) {
        // Create an Account object
        Account myAccount = new Account("John Doe", 1000.0);

        // Access public methods of the Account class
        System.out.println("Account Name: " + myAccount.getAccountName());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Modify the account using public methods
        myAccount.setAccountName("Jane Doe");
        myAccount.setBalance(2000.0);

        System.out.println("Updated Account Name: " + myAccount.getAccountName());
        System.out.println("Updated Balance: " + myAccount.getBalance());
    }
}