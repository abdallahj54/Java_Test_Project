package mathClass;

import java.util.Scanner;

public class AbsoluteMethod {

    public static void main(String[] args) {

        System.out.println("Difference between your numbers is = " + Math.abs(10 - 14)); // will give you 4
        System.out.println("Difference between your numbers is = " + Math.abs(14 - 10)); // will give you 4
        System.out.println("Subtraction between your numbers is = " + (10 - 14)); // will give you -4

        /*
        Write a program that asks user for two ages and get the difference between the ages and print them. Then find the max and min.

        Output:
        "Please enter an age"
        input -> 24
        Please enter another age"
        input -> 32

        "Difference between your ages is = 8"
         */

        Scanner inputReader = new Scanner(System.in);

        int age1, age2;

        System.out.println("Please enter an age");
        age1 = inputReader.nextInt();

        System.out.println("Please enter another age");
        age2 = inputReader.nextInt();

        System.out.println("Difference between your ages is = " + Math.abs(age1 - age2));

        System.out.println("Biggest age is = " + Math.max(age1, age2));
        System.out.println("Smalled age is = " + Math.min(age1, age2));
    }
}
