public class BanckAccount {
    //Crear una clase BanckAccount con los atribupost:
    //accountName, balance y los metodos:
    //deposit y withdraw.

    private String cuenta;
    double balance;

    public void bankAccount(){
        balance = 0;
    }

    public double deposit(double amount){
        balance += amount;
        //balance = balance + amount;
        return balance;
    }

    public double whithdraw(double amount){
        balance -= amount;
        return balance;
    }

}
