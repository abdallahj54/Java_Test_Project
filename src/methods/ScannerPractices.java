package methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class ScannerPractices {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter their name and then age
        Print the info in below format

        {name}'s age is {age}.

         */

        System.out.println("\n---Using Custom Scanner Method---");
      /*

        Write a program that asks user to enter their name and then age
        Print the info in below format

        {name}'s age is {age}.
        Address is {address}
       */

        String name = ScannerHelper.getAName();
        int age = ScannerHelper.getAnAge();
        String address = ScannerHelper.getAnAddress();

        System.out.println(name + "'s age is " + age + "." + "\nAddress is " + address);
    }
}
