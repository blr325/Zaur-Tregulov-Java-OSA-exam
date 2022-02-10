package lesson2;

public class test1 {
    public static void main(String[] args) {
        getByte();
        getShort();
        getInt();
        getLong();
        getFloatAndDouble();
        getDouble();
        getChar();
    }

    private static void getChar() {
        char c1 = 49;
        char c2 = 0B00110001;
        char c3 = '\u0031';
        char c4 = 0X31;
        System.out.println(c1 +" "+ c2 + " " + c3 + " " + c4);
    }

    private static void getDouble() {
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 +" "+ bool2);
    }

    private static void getFloatAndDouble() {
        float f1 = 12345.12345F;
        float f2 = 54321.54321F;

        double d1 = 123.123;
        double d2 = 321.321;
        System.out.println(f1 +" "+ f2 + " " + d1 + " " + d2);
    }

    private static void getLong() {
        long l1 = 123456789L;
        long l2 = 0B111010110111100110100010101;
        long l3 = 0726746425;
        long l4 = 0X75bcd15;
        System.out.println(l1 +" "+ l2 + " " + l3 + " " + l4);
    }

    private static void getInt() {
        int i1 = 0;
        int i2 = 0B0;
        int i3 = 00;
        int i4 = 0X0;
        System.out.println(i1 +" "+ i2 + " " + i3 + " " + i4);
    }

    private static void getShort() {
        short s1 = 1300;
        short s2 = 0B10100010100;
        short s3 = 02424;
        short s4 = 0X514;
        System.out.println(s1 +" "+ s2 + " " + s3 + " " + s4);
    }

    private static void getByte() {
        byte b1 = 12;
        byte b2 = 0B1100;
        byte b3 = 014;
        byte b4 = 0XC;
        System.out.println(b1 +" "+ b2 + " " + b3 + " " + b4);
    }

}
