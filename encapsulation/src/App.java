public class App {
    public static void main(String[] args) throws Exception {
          Account acc1 = new Account(500);
        Account acc2 = new Account(acc1.getBalance());
        acc1.deposit(200); 
        acc1.withdraw(100); 
        acc2.withdraw(50);  
        System.out.println("Account 1 Balance: " + acc1.getBalance());
        System.out.println("Account 2 Balance: " + acc2.getBalance());       
    }
}


