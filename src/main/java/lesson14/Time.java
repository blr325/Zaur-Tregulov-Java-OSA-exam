package lesson14;

public class Time {
    public static void main(String[] args) {
        printTime();
    }

    public static void printTime() {
        OUTER:
        for (int hour = 0; hour <= 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int second = 0; second < 60; second++) {
                    if (second * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + " : " + minute + " : " + second);

                }
            }
        }

    }
}


