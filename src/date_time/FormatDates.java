package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {

        System.out.println("-----Formatting Date-----");
        Date date = new Date();
        System.out.println(date); //Fri Dec 16 21:47:28 CST 2022 (EEE MMM dd hh:mm:ss z yyyy)

        System.out.println("\n-----Printing in MM/dd/yyyy Format-----");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formatter.format(date));

        System.out.println("\n-----Printing in yyyy Format-----");
        formatter = new SimpleDateFormat("yyyy");
        System.out.println(formatter.format(date)); //2022

        System.out.println("\n-----Printing in 1 line of Code-----");
        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(new Date())); //09 o'clock PM, Central Standard Time
    }
}
