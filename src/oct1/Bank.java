package oct1;

public class Bank {

    int accountNumber;
    String username;
    String firstname;
    String lastname;
    double balance;


    public double getBalance(){
       return 101.11;
    }

    public void withdraw(double amount){
        System.out.println("Amount Withdraw" + amount);
    }

    public void deposit(double amount){
        System.out.println("Deposit Amount is" + amount);
    }






}
