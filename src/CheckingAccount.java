import java.util.*;

public class CheckingAccount {

    String accountName;
    double balance;

    public void bankAccount(){
        balance = 0;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double whithdraw(double amount){
        balance -= amount;
        return balance;
    }
}
