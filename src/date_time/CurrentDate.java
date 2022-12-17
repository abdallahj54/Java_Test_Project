package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {

        System.out.println("-----Date Class-----");
        Date date = new Date();
        System.out.println(date); //Fri Dec 16 21:29:30 CST 2022 (pulled from the machines time)

        System.out.println("\n-----Local Date Class-----");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); //2022-12-16 (yyyy-MM-dd)

        System.out.println(localDate.plusDays(7)); //2022-12-23
        System.out.println(localDate.getMonth()); //DECEMBER
        System.out.println(localDate.getMonthValue()); //12
        System.out.println(localDate.getDayOfWeek()); //Friday
        System.out.println(localDate.getDayOfMonth()); //16
        System.out.println(localDate.getDayOfYear()); //350

        System.out.println("\n-----Local Time Class-----");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); //21:35:18.863 (hh:mm:ss.SSS)

        System.out.println(localTime.minus(2, ChronoUnit.HOURS)); //subtracts 2 hours from the current time

        System.out.println("\n-----Local Date Time Class-----");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); //2022-12-16T21:37:32.534 (yyyy-MM-ddThh:mm:ss.SSS)
    }
}
