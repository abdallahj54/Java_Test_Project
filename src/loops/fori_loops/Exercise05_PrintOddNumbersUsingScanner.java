package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise05_PrintOddNumbersUsingScanner {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter a number and
        print all the odd numbers starting from 0 to the given number (0 and given number included)

        Test Data:
        7

        Expected output:
        1
        3
        5
        7
         */

        int number = ScannerHelper.getANumber();

        System.out.println("\n---The odd numbers from zero to " + number + " are as follows:\n");

        for (int i = 0; i <= number; i++) {
            if(i % 2 == 1) System.out.println(i);
        }

    }
}
