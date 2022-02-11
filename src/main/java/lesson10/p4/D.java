package lesson10.p4;

import lesson10.p1.A;
import lesson10.p1.p2.p3.C;
import lesson10.p4.p5.E;

import static lesson10.p1.p2.B.*;

public class D {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        E e = new E();

        int d = a.peremennayaClassaA + staticPeremennayaClassaB + staticPeremennaya2ClassaB + c.peremennayaClassaC +
                e.peremennayaClassaE;
        System.out.println("Результат сложения переменных из разных пакетов = " + d);
    }
}
