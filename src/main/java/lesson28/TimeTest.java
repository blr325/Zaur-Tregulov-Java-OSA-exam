package lesson28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TimeTest {
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! HH:mm");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/yyyy");

    public void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        while (ldt1.isBefore(ldt2)) {
            System.out.println("Работаем с: " + ldt1.format(formatter1));
            ldt1 = ldt1.plus(p);
            System.out.println("До: " + ldt1.format(formatter1));
            System.out.println("Отдыхаем с: " + ldt1.format(formatter2));
            ldt1 = ldt1.plus(d);
            System.out.println("До: " + ldt1.format(formatter2));
        }
    }

    public static void main(String[] args) {
        TimeTest time = new TimeTest();
        LocalDateTime time1 = LocalDateTime.of(2016, 1, 1, 9, 0);
        LocalDateTime time2 = LocalDateTime.of(2016, 2, 16, 9, 0);
        Period period = Period.of(0, 1, 5);
        Duration duration = Duration.ofDays(2);
        time.smena(time1, time2, period, duration);

    }
}
