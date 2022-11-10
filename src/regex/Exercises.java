package regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {

        System.out.println("---Testing shortcuts---");
        System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}", "JohnDoe_123")); // true
        System.out.println(Pattern.matches("[\\w\\- ]{8,15}", "JohnDoe_123 ")); // true \\w is all letters and underscore
        System.out.println(Pattern.matches("[\\d]{8,15}", "12345678")); // true \\d all numbers
        System.out.println(Pattern.matches("[\\D]{8,15}", "difbhikbef")); // true \\D all non-numbers
        System.out.println(Pattern.matches(".+", "johnDoe123$% ")); // true "." is all characters


        System.out.println("\n---Exercise 1---");
        // creating a regex pattern to check for social security number formatting
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "000-00-0000")); // true


        System.out.println("\n---Exercise 2---");
        // creating a regex pattern to check for phone number formatting
        System.out.println(Pattern.matches("[(]?[\\d]{3}[)]?-[\\d]{3}-[\\d]{4}", "(708)-600-6774")); // true


        System.out.println("\n---Exercise 3---");
        //How much wood would a wood chuck chuck if a wood chuck could chuck wood
        // replace wood with ****
        // How much **** would a **** chuck chuck if a **** chuck could chuck ****

        String str = "How much wood would a wood chuck chuck if a wood chuck could chuck wood";
        System.out.println(str.replaceAll("wood", "****"));


        System.out.println("\n---Exercise 4---");
        // create a regex pattern removing specials and white spaces from string
        String str1 = " abc 123 $#^ ";
        System.out.println(str1.replaceAll("[^a-zA-Z0-9]","")); // abc123


        System.out.println("\n---Exercise 5---");
        // create a regex pattern for a first and last name FORMAT: 2Letters+ 2Letters+
        System.out.println(Pattern.matches("[A-Za-z]{2,} [A-Za-z]{2,}", "John Doe")); // true
        System.out.println(Pattern.matches("[A-Za-z]{2,} [A-Za-z]{2,}", "J Doe")); // false
        System.out.println(Pattern.matches("[A-Za-z]{2,} [A-Za-z]{2,}", "John D")); // false


        System.out.println("\n---Exercise 6---");
        // create a regex pattern that prints an array one with letters and one with numbers from a string
        String str2 = "A1b2C3";

        System.out.println(Arrays.toString(str2.replaceAll("[^A-Za-z]", "").toCharArray())); // [A,b,C]
        System.out.println(Arrays.toString(str2.replaceAll("[^0-9]", "").toCharArray())); // [1,2,3]

        System.out.println("\n---Exercise 7---");
        // create a regex pattern that checks for email address formatting
        System.out.println(Pattern.matches("[A-Za-z0-9_.]{1,}@[A-Za-z.]{1,}", "user@domain.com")); // true
        System.out.println(Pattern.matches("[A-Za-z0-9_.]{1,}@[A-Za-z.]{1,}", "@domain.com")); // false
        System.out.println(Pattern.matches("[A-Za-z0-9_.]{1,}@[A-Za-z.]{1,}", "user_123.456@domain.com")); // true
    }
}
