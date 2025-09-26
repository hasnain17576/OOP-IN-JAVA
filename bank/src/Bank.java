public class Bank {
    private double balance;
       public Bank(double initialBalance){
        if (initialBalance>0) {
            balance=initialBalance;   
        }

    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;

        }else{
            System.out.println("invalid deposit!");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
        balance-=amount;

    }else{
        System.out.println("invalid withdrwal");
    }
    }
    public double getbalance(){
        return balance;

    }
    
}

