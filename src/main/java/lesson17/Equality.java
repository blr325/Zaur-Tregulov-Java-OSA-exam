package lesson17;


public class Equality {
   static boolean isEquality(StringBuilder sb1, StringBuilder sb2){
        return  sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Test");
        StringBuilder sb2 = new StringBuilder("Test");
        StringBuilder sb3 = new StringBuilder("Test1");

        System.out.println(isEquality(sb1, sb2));
        System.out.println(isEquality(sb1, sb3));

    }
}

