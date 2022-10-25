package practice.methods;

import string_methods._01_valueOf_Method;

public class VoidMethodPractices {
    public static void main(String[] args) {
        VoidMethodPractices.flavorPicker("chocolate"); // You have a great taste
        VoidMethodPractices.flavorPicker("Chocolate"); // Give me a valid flavor!
        VoidMethodPractices.flavorPicker("strawberry"); // Enjoy it!

        VoidMethodPractices.checkAge(19); // You are a teenage
        VoidMethodPractices.checkAge(20); // You can drive
        VoidMethodPractices.checkAge(25); // You can drink coke
        VoidMethodPractices.checkAge(-25); // Enter a valid age!

        VoidMethodPractices.checkCreditScore(99.34); // Low credit score
        VoidMethodPractices.checkCreditScore(1099.34); // Medium credit score
        VoidMethodPractices.checkCreditScore(2099.34); // Good credit score
        VoidMethodPractices.checkCreditScore(5099.34); // No valid credit score
        VoidMethodPractices.checkCreditScore(-5099.34); // No valid credit score
    }

    /*
    Create a public static method which will take an ice cream flavor and prints the message about your ice cream
     */

    public static void flavorPicker(String flavor) { //void because the requirement is asking to PRINT IT

        if (flavor.equals("chocolate")) {
            System.out.println("You have a great taste");
        } else if (flavor.equals("vanilla")) {
            System.out.println("Not bad!");
        } else if (flavor.equals("strawberry")) {
            System.out.println("Enjoy it!");
        } else {
            System.out.println("Give me a valid flavor!");
        }
    }

    /*
    Create a public static method named as "checkAge", it is going to take an age then prints according to the following:
     */

        public static void checkAge ( int age){ // void because the requirement is asking to "PRINT"
            if (age >= 0 && age <= 19) {
                System.out.println("You are a teenager");
            } else if (age >= 20 && age <= 21) {
                System.out.println("You can drive");
            } else if (age > 21) {
                System.out.println("You can drink coke");
            } else {
                System.out.println("Enter a valid age!");
            }
        }

    /*
    Create a public static method named as "checkCreditScore", it is going to take an age then prints according to the following:
     */

        public static void checkCreditScore ( double balance){
            if (balance >= 0.00 && balance <= 999.99) {
                System.out.println("Low credit score");
            } else if (balance >= 1000.00 && balance <= 1999.99) {
                System.out.println("Medium credit score");
            } else if (balance >= 2000.00 && balance <= 2999.99) {
                System.out.println("Good credit score");
            } else {
                System.out.println("No valid credit score!");
            }
        }
}

