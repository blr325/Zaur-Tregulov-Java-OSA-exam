package lesson6;

public class OverloadedTest {
    public static void main(String[] args) {
        Overloaded overloaded = new Overloaded();
        System.out.println(overloaded.sum());
        System.out.println(overloaded.sum(1));
        System.out.println(overloaded.sum(1, 2));
        System.out.println(overloaded.sum(1, 2, 3));
        System.out.println(overloaded.sum(1, 2, 3, 4));

    }
}

class Overloaded {
    int sum() {
        int sum = 0;
        return sum;
    }

    int sum(int a) {
        int sum = 0;
        return sum = a;
    }

    int sum(int a, int b) {
        int sum = 0;
        return sum = a + b;
    }

    int sum(int a, int b, int c) {
        int sum = 0;
        return sum = a + b + c;
    }

    int sum(int a, int b, int c, int d) {
        int sum = 0;
        return sum = a + b + c + d;
    }

}
