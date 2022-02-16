package lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {

    private static void abc(String... str) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        removeDuplicate(list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static void removeDuplicate(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));
                }
            }
        }
    }

    public static void main(String[] args) {
        abc("1", "3", "1", "2", "5", "4", "4");
    }
}
