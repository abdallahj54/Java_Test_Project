package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        System.out.println("---Task1---");

        Scanner inputReader = new Scanner(System.in);

        int num1, num2;

        System.out.println("Hey User, please enter the first number: ");
        num1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Hey User, please enter the second number: ");
        num2 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));

        System.out.println("\n------Task2------\n");

        int input1, input2, input3, input4, input5;

        System.out.println("Hey User, please enter the first number: ");
        input1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Hey User, please enter the second number: ");
        input2 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Hey User, please enter the third number: ");
        input3 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Hey User, please enter the fourth number: ");
        input4 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Hey User, please enter the fifth number: ");
        input5 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Max value = " + Math.max(Math.max(input1, input2),Math.max(input3, input4)));
        System.out.println("Min value = " + Math.min(Math.min(input1, input2),Math.min(input3, input4)));

        System.out.println("\n------Task3------");

        int randomNumber50To100 = (int) (Math.random() * (100 - 50 + 1) + 50);

        int random1 = 55, random2 = 67, random3 = 90;

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("The sum of numbers is = " + (random1 + random2 + random3));

        System.out.println("\n------Task4------");

        double alexMoney = 125;
        double mikeMoney = 220;
        double loan = 25.5;

        System.out.println("Alex's money: $" + (alexMoney - loan));
        System.out.println("Mike's money: $" + (mikeMoney + loan));

        System.out.println("\n------Task5------");

        int costOfBike = 390;
        double dailySavings = 15.60;
        int days = (int) ((int) costOfBike / dailySavings);

        System.out.println(days);

        System.out.println("\n------Task6------");

        String s1 = "5", s2 = "10";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("Sum of 5 and 10 is = " + (i1 + i2));
        System.out.println("Product of 5 and 10 is = " + (i1 * i2));
        System.out.println("Division of 5 and 10 is = " + (i1 / i2));
        System.out.println("Subtraction of 5 and 10 is = " + (i1 - i2));
        System.out.println("Remainder of 5 and 10 is = " + (i1 % i2));

        System.out.println("\n------Task7------");

        String v1 = "200", v2 = "-50";

        int v3 = Integer.parseInt(v1);
        int v4 = Integer.parseInt(v2);

        System.out.println("The greatest value is = " + Math.max(v3, v4));
        System.out.println("The smallest value is  = " + Math.min(v3, v4));
        System.out.println("The average value is = " + (v3 + v4) / 2);
        System.out.println("The absolute difference is = " + Math.abs(v3 - v4));

        System.out.println("\n------Task8------");

        double savingsDaily = .96;
        int daysToSave = (int) ((int) 24 / savingsDaily);
        int daysToSave1 = (int) ((int) 168 / savingsDaily);

        System.out.println(daysToSave + " days");
        System.out.println(daysToSave1 + " days");
        System.out.println("$" + 150 * savingsDaily);

        System.out.println("\n------Task9------");

        int costOfComputer = 1250;
        double dailySavings2 = 62.5;
        int days1 = (int) ((int) costOfComputer / dailySavings2);

        System.out.println(days1);

        System.out.println("\n------Task10------");

        int costOfCar = 14265;
        double option1 = 475.50;
        double option2 = 951;

        int monthsToPay1 = (int) ( costOfCar / option1);
        int monthsToPay2 = (int) ( costOfCar / option2);

        System.out.println("Option 1 will take " + monthsToPay1 + " months");
        System.out.println("Option 2 will take " + monthsToPay2 + " months");

        System.out.println("\n------Task11------");

        int inputA, inputB;

        System.out.println("Hey User, please enter your first number: ");
        inputA = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Hey User, please enter your second number: ");
        inputB = inputReader.nextInt();
        inputReader.nextLine();

        double inputAa = inputA, inputBb = inputB;

        System.out.println(inputAa / inputBb);



        System.out.println("\n------Task12------");

        int randomNumber0To100 = (int) (Math.random() * (100 + 1));
        int randomNumber0To1001 = (int) (Math.random() * (100 + 1));
        int randomNumber0To1002= (int) (Math.random() * (100 + 1));

        boolean ifNumberBiggerThan25 = randomNumber0To100 > 25 && randomNumber0To1001 > 25 && randomNumber0To1002 > 25;

        System.out.println(ifNumberBiggerThan25);



        System.out.println("\n------Task13------");

        System.out.println("Hey User, please enter a number between 1 and 7: ");
        int userInput1 = inputReader.nextInt();

        if(userInput1 == 1){
            System.out.println("MONDAY");
        } else if (userInput1 == 2) {
            System.out.println("TUESDAY");
        } else if (userInput1 == 3) {
            System.out.println("WEDNESDAY");
        } else if (userInput1 == 4) {
            System.out.println("THURSDAY");
        } else if (userInput1 == 5) {
            System.out.println("FRIDAY");
        } else if (userInput1 == 6) {
            System.out.println("SATURDAY");
        } else if (userInput1 == 7) {
            System.out.println("SUNDAY");
        } else{
            System.out.println("Number entered not within scope");
        }

        System.out.println("\n------Task14------");

        int exam1, exam2, exam3;

        System.out.println("Tell me your exam results?");
        exam1 = inputReader.nextInt();
        exam2 = inputReader.nextInt();
        exam3 = inputReader.nextInt();
        inputReader.nextLine();

        int average = (exam1 + exam2 + exam3) / 3;

        if(average >= 70){
            System.out.println("YOU PASSED!");
        } else{
            System.out.println("YOU FAILED!");
        }

        System.out.println("\n------Task15------");

        int number1, number2, number3;

        System.out.println("Enter 3 numbers");
        number1 = inputReader.nextInt();
        number2 = inputReader.nextInt();
        number3 = inputReader.nextInt();
        inputReader.nextLine();

        if(number1 == number2 && (number2 == number3)){
            System.out.println("TRIPLE MATCH");
        } else if (number1 == number2 || number2 == number3 || number1 == number3) {
            System.out.println("DOUBLE MATCH");
        } else{
            System.out.println("NO MATCH");
        }
    }
}
