package lesson9;

import java.util.Arrays;

public class lesson9 {
    public static void main(String[] args) {
        People[] peoples = {new People("Андрей"),
                new People("Антон"),
                new People("Артем"),
                new People("Алексей"),
                new People("Артур"),
                new People("Альберт"),
                new People("Афанасий"),
                new People("Авдей"),};
        for (int i = peoples.length-1; i >= 2; i--) {
            peoples[i] = null;
        }
        System.out.println(Arrays.toString(peoples));
    }

}
