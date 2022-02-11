package lesson8;

public class Class2 {
    public static void main(String[] args) {
        System.out.println("Перемножили аргументы " + Class1.multiplyNumbers(2, 5, 10));
        System.out.println("Перемножили аргументы " + Class1.multiplyNumbers(4, 6, 5));

        Class1.splitNumbers(5, 3);
        Class1.splitNumbers(4, 5);

        Class1 class1 = new Class1();
        double rad = 5.5;
        class1.countAreaCircle(rad);
        class1.countLengthCircle(rad);
        class1.printInfo(rad);
    }
}
