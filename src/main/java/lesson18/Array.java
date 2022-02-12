package lesson18;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = {4, 2, 6, 7, 8, 4, 1, 5, 9, 11, 34, 23, 43, 10};
        String[][] array1 = {{"Объект1", "Объект2", "Объект3"}, {"Объект1", "Объект2", "Объект3"}, {"Объект1", "Объект2"}};
        sort(array);
        System.out.println(Arrays.toString(array));
        showArray(array1);
    }

    static void showArray(String[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(Arrays.toString(array[i]) + ", ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j == array[i].length - 1) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(array[i][j] + ", ");
                }
            }
            if (i == array.length - 1) {
                System.out.print("}");
            } else {
                System.out.print("}, ");
            }
        }
    }

    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

}
