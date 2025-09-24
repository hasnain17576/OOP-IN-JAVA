public class App {
    public static void main(String[] args) throws Exception {
        // Using different constructors (Overloading in action)
        BankAccount acc1 = new BankAccount();  // No-arg constructor
        BankAccount acc2 = new BankAccount("Hasnain"); // 1-arg constructor
        BankAccount acc3 = new BankAccount("Ali", "Current"); // 2-arg constructor
        BankAccount acc4 = new BankAccount("Sara", "Business", 50000.0); // 3-arg constructor

        // Display account details
        acc1.showAccountDetails();
        acc2.showAccountDetails();
        acc3.showAccountDetails();
        acc4.showAccountDetails();
    }
}
