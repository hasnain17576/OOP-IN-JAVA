public class BankAccount {
    // Attributes
    String accountHolder;
    String accountType;
    double balance;

    // Constructor 1: No-argument (default values)
    BankAccount() {
        accountHolder = "Unknown";
        accountType = "Savings";
        balance = 0.0;
    }

    // Constructor 2: One parameter
    BankAccount(String name) {
        accountHolder = name;
        accountType = "Savings";
        balance = 1000.0; // minimum balance
    }

    // Constructor 3: Two parameters
    BankAccount(String name, String type) {
        accountHolder = name;
        accountType = type;
        balance = 1000.0; // default balance
    }

    // Constructor 4: Three parameters
    BankAccount(String name, String type, double bal) {
        accountHolder = name;
        accountType = type;
        balance = bal;
    }

    // Behavior (method)
    void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("-----------------------------");
    }
}
    
