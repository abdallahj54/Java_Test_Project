package practice.ifElseStatements;

import java.util.Scanner;

public class IfElseRandomPractice {
    public static void main(String[] args) {

        /*
            Write a program that generates a random number between 0 and 50 (both included)
            Print "true" if number is between 10 and 25 (both included)
            Print "false" otherwise
         */

        System.out.println("\n-----Task1-----\n");

        int randomNumber = (int) (Math.random() * (51) + 0);

        System.out.println("Random number is = " + randomNumber);

        System.out.println("\n---Using if/else---");

        if (randomNumber >= 10 && randomNumber <= 25) {
            System.out.println("true");
        } else System.out.println("false");

        System.out.println("\n---Using Ternary---");

        System.out.println((randomNumber >= 10 && randomNumber <= 25) ? "true" : "false");

        System.out.println("\n---Using boolean---");

        boolean myExpression = (randomNumber >= 10 && randomNumber <= 25);
        System.out.println(myExpression);

        System.out.println("\n-----Task2-----\n");

        /*
        Requirement:
        Write a program that generates a random number between 1 and 100 (both 1 and 100 are included)
        Find which quarter and half the number is in

        1st quarter is 1-25
        2nd quarter is 26-50
        3rd quarter is 51-75
        4th quarter is 76-100
        1 half is 1-50
        2nd half is 51-100

        Test data:
        34

        Expected result:
        34 is in the 1st half
        34 is in the 2nd quarter
         */

        int mySecondRandom = (int) (Math.random() * (100 - 1 + 1) + 1); // Random number generator 1 to 100 both included
        System.out.println("My random number is = " + mySecondRandom);

        if (mySecondRandom <= 50) { //restricted to 1 to 50 both included

            System.out.println(mySecondRandom + " is in the 1st half");
            if (mySecondRandom <= 25) {
                System.out.println(mySecondRandom + " is in the 1st quarter");
            } else {
                System.out.println(mySecondRandom + " is in the 2nd quarter");
            }

        } else { //restricted to 51 to 100 both included
            System.out.println(mySecondRandom + " is in the 2nd half");
            if (mySecondRandom <= 75) {
                System.out.println(mySecondRandom + " is in the 3rd quarter");
            } else {
                System.out.println(mySecondRandom + " is in the 4th quarter ");
            }
        }


        /*
        //Scanner//
        Is it raining? (true/false)
        Do you have umbrella? (true/false)
        Are you hungry? (true/false)

        //if else//
        it is raining -> it is raining outside
            if you have umbrella -> you can go outside
            otherwise -> you stay home

        it is not raining -> it is not raining outside
            if you are hungry -> you go to Chic-Fil-A
            otherwise -> you are riding a bike
         */

        /*
        it is raining outside
        you can go outside

        it is not raining outside
        you go to chic-fil-a
         */

        System.out.println("\n----Example Problem with Nested and Scanner----\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Is it raining? (true/false)");
        boolean weather = input.nextBoolean();

        System.out.println("Do you have umbrella? (true/false)");
        boolean umbrella = input.nextBoolean();

        System.out.println("Are you hungry? (true/false)");
        boolean hungry = input.nextBoolean();

        if (weather) {
            System.out.println("it is raining outside");
            if(umbrella){
                System.out.println("you can go outside");
            } else{
                System.out.println("you stay home");
            }
        } else{
            System.out.println("it is not raining");
            if(hungry){
                System.out.println("you go to chic-fil-a");
            }else{
                System.out.println("you are riding a bike!!!");
            }
        }
        }
    }