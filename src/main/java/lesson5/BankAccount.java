package lesson5;

public class BankAccount {
    private int id;
    private double balance ;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void popolnenieScheta (double summa){
        System.out.println("Баланс до увеличения = " + balance);
        balance += summa;
        System.out.println("Баланс увеличили на " + summa + " теперь он равен " + balance);
    }
    public void snyatieSoScheta (double summa){
        System.out.println("Баланс до снятия = " + balance);
        balance -= summa;
        System.out.println("Баланс уменьшили на " + summa + " теперь он равен " + balance);
    }
}
