package lesson19;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Test {

    static String[] abc(String[]... str) {
        int length = 0;
        for (String[] strings : str) {
            length += strings.length;
        }
        String[] str1 = new String[length];
        int count = 0;
        for (String[] strings : str) {
            for (String string : strings) {
                str1[count] = string;
                count++;
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        String[] array = getArray();
        checkArray(args, array);

        System.out.println(Arrays.toString(array));
    }

    @NotNull
    private static String[] getArray() {
        return abc(new String[]{"массив 0-0", "массив 0-1", "массив 0-2"},
                new String[]{"массив 1-0", "массив 1-1", "массив 1-2"},
                new String[]{"массив 2-0", "массив 2-1", "массив 2-2", "массив 2-3"},
                new String[]{"массив 3-0", "массив 3-1"});
    }

    private static void checkArray(String[] args, String[] array) {
        for (String s : args) {
            for (int i = 0; i < array.length; i++) {
                if (s.equals(array[i])) {
                    array[i] = null;
                }
            }
        }
    }


}
