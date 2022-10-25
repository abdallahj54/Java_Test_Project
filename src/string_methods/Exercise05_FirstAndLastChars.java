package string_methods;

import utilities.ScannerHelper;

public class Exercise05_FirstAndLastChars {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their name
        Print first char of the name with message "First character in the name is = "
        Print last char of the name with message "Last character in the name is = "

        John
        First character in the name is = J
        Last character in the name is = n
         */

        String name = ScannerHelper.getAName();

        System.out.println("First character in the name is = " + name.charAt(0)); // J
        System.out.println("Last character in the name is = " + name.charAt(name.length() - 1)); // n
    }
}
