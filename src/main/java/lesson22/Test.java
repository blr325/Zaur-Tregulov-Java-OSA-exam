package lesson22;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Джек");
        System.out.println("Количество лап " + dog.paw);
        cat.sleep();
    }
}
