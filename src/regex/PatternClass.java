package regex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}"); // creating a regex pattern

        System.out.println("---How to print out a regex pattern---");
        System.out.println(pattern); // returns the pattern [a-z0-9]{5,10}
        System.out.println(pattern.pattern()); // returns the pattern as a string [a-z0-9]{5,10}
        System.out.println(pattern.toString()); // returns the pattern as a string [a-z0-9]{5,10}


        System.out.println("\n---Regex pattern and matches---");
        System.out.println(Pattern.matches(pattern.pattern(), "Apple")); // false ('A' not in the scope)
        System.out.println(Pattern.matches(pattern.pattern(), "hello world")); // false (more than 10 characters)
        System.out.println(Pattern.matches(pattern.pattern(), "hello")); // true


        System.out.println("\n---Regex pattern and split---");
        String str = "I go to school at TechGlobal and i love it";
        String[] arr = str.split(" [a-z0-9]{5,10}"); // space outside the brackets means it must have a space before the range
        System.out.println(Arrays.toString(arr)); // [I go to,  at TechGlobal and i love it]


        System.out.println("\n---Exercise 01---");
        pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");

        Scanner input = new Scanner(System.in);
        System.out.println("Hey User, please enter a username");
        String username = input.nextLine();

        if (username.matches("[a-zA-Z0-9]{5,10}")){
            System.out.println("Valid Username");
        } else System.out.println("Error! Username must be 5 to 10 characters long and can only contain letters and numbers");

    }
}
