public class App {
    public static void main(String[] args) throws Exception {
        Bank acc=new Bank(50000);
        acc.deposit(500);
        acc.withdraw(50000);
        System.out.println("balance"+acc.getbalance());
    }
}