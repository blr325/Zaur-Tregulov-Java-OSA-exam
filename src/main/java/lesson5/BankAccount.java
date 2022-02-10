package lesson5;

public class BankAccount {
    private int id;
    private double balance ;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public double popolnenieScheta (double sum){
        return balance += sum;
    }
    public double snyatieSoScheta (double sum){
        return balance += sum;
    }
}
