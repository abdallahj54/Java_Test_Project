package date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriod {
    public static void main(String[] args) {
        /*
        How many days passed since you were born
        currentDate - dateOfBirth

        How many years passed
        How many months passed
        How many weeks passed
        How many days passed
         */

        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1994, 5, 4);

        System.out.println("-----SetUp-----");
        System.out.println(today); //2022-12-16
        System.out.println(dateOfBirth); //1994-05-04

        System.out.println("\n-----Time that has passed (Incorrect Way)-----");
        System.out.println(Period.between(dateOfBirth, today).getYears()); //28
        System.out.println(Period.between(dateOfBirth, today).getMonths()); //7
        System.out.println(Period.between(dateOfBirth, today).getDays()); //12

        System.out.println("\n-----Time that has passed (Correct Way)-----");
        System.out.println(ChronoUnit.YEARS.between(dateOfBirth, today)); //28
        System.out.println(ChronoUnit.MONTHS.between(dateOfBirth, today)); //343
        System.out.println(ChronoUnit.WEEKS.between(dateOfBirth, today)); //1493
        System.out.println(ChronoUnit.DAYS.between(dateOfBirth, today)); //10453

        System.out.println("\n-----Time between Times (Incorrect Way)-----");
        LocalTime localTime1 = LocalTime.of(12, 44, 15);
        LocalTime localTime2 = LocalTime.of(13, 45, 45);
        System.out.println(Duration.between(localTime1, localTime2).getSeconds());

        System.out.println("\n-----Time between Times (Correct Way)-----");
        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2));
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2));
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2));
    }
}
