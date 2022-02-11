package lesson8;

public class Class1 {
    static final double pi = Math.PI;

    static int multiplyNumbers(int a, int b, int c) {
        return a * b * c;
    }

    static void splitNumbers(int a, int b) {
        System.out.printf("Разделили %d на %d получили %d , остаток %d\n", a, b, (a / b), (a % b));
    }

    double countAreaCircle(double rad) {
        return pi * rad * rad;
    }

    double countLengthCircle(double rad) {
        return pi * 2 * rad;
    }
    void printInfo (double rad){
        System.out.println("Радиус = " + rad);
        System.out.println("Площадь = " + countAreaCircle(rad));
        System.out.println("Длинна окружности = " + countLengthCircle(rad));
    }
}
