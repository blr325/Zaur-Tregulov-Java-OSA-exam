package lesson22;

public class Pet extends Animal {
    protected String name;
    protected int tail = 1;
    protected int paw = 4;

    public Pet() {
        eyes = 2;
        System.out.println("I am pet");
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}
