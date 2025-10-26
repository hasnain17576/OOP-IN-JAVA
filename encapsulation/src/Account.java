public class Account {

    private double balance;
    public Account() {
        this.balance = 0.0; 
    }
    public Account(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance=amount+balance;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance=balance-amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount!");
        }
    }
}


