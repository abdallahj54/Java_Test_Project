package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.println("------Task 1------\n");

        int input1, input2;

        System.out.println("Please enter your first number: ");
        input1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your second number: ");
        input2 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The number 1 entered by user is: " + input1);
        System.out.println("The number 2 entered by user is: " + input2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (input1 + input2));

        System.out.println("\n------Task 2------\n");

        int num1, num2;

        System.out.println("Please enter your first number: ");
        num1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your second number: ");
        num2 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The product of the given 2 numbers is: " + num1 * num2);

        System.out.println("\n------Task 3------\n");

        double num3, num4;

        System.out.println("Please enter your first number: ");
        num3 = inputReader.nextDouble();
        inputReader.nextLine();

        System.out.println("Please enter your second number: ");
        num4 = inputReader.nextDouble();
        inputReader.nextLine();

        System.out.println("The sum of the given numbers is = " + (num3 + num4));
        System.out.println("The product of the given numbers is = " + num3 * num4);
        System.out.println("The subtraction of the given numbers is = " + (num3 - num4));
        System.out.println("The division of the given numbers is = " + num3 / num4);
        System.out.println("The sum of the given numbers is = " + num3 % num4);

        System.out.println("\n------Task 4------\n");

        System.out.println("1.\t\t" + (-10 + (+ 7 * 5)));
        System.out.println("2.\t\t" + (72+24) % 24);
        System.out.println("3.\t\t" + (10 + (-3*9) / 9));
        System.out.println("4.\t\t" + (5 + (18/3) * 3 - (6 % 3)));

        System.out.println("\n------Task 5------\n");

        int num5, num6;

        System.out.println("Please enter your first number: ");
        num5 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your second number: ");
        num6 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The average of the given numbers is: " + (num5 + num6) / 2);

        System.out.println("\n------Task 6------\n");

        int num7, num8, num9, num10, num11;

        System.out.println("Please enter your first number: ");
        num7 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your second number: ");
        num8 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your third number: ");
        num9 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your fourth number: ");
        num10 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your fifth number: ");
        num11 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The average of the given numbers is: " + (num7 + num8 + num9 + num10 + num11) / 5);

        System.out.println("\n------Task 7------\n");

        int num12, num13, num14;

        System.out.println("Please enter your first number: ");
        num12 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your second number: ");
        num13 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your third number: ");
        num14 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The 5 multiplied with 5 is = " + num12 * num12);
        System.out.println("The 6 multiplied with 6 is = " + num13 * num13);
        System.out.println("The 10 multiplied with 10 is = " + num14 * num14);

        System.out.println("\n------Task 8------\n");

        int side1;

        System.out.println("Please enter the value of 1 side: ");
        side1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Perimeter of the square = " + side1 * 4);
        System.out.println("Area of the square = " + side1 * side1);

        System.out.println("\n------Task 9------\n");

        double yearlySalary = 90_000;

        System.out.println("A Software Engineer in Test can earn $" + yearlySalary * 3 + " in 3 years.");

        System.out.println("\n------Task 10------\n");

        String favBook;
        String favColor;
        int favNumber;

        System.out.println("Please enter your favorite book: ");
        favBook = inputReader.nextLine();

        System.out.println("Please enter your favorite color: ");
        favColor = inputReader.nextLine();

        System.out.println("Please enter your favorite number: ");
        favNumber = inputReader.nextInt();
        inputReader.nextLine();

        System.out.print("User's favorite book is: " + favBook +
                "\nUser's favorite color is: " + favColor +
                "\nUser's favorite number is: " + favNumber);

        System.out.println("\n------Task 11------\n");

        String firstName, lastName, emailAddress, address, phoneNumber;
        int age;

        System.out.println("Please enter your first name: ");
        firstName = inputReader.nextLine();

        System.out.println("Please enter your last name: ");
        lastName = inputReader.nextLine();

        System.out.println("Please enter your age: ");
        age = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your email address: ");
        emailAddress = inputReader.nextLine();

        System.out.println("Please enter your phone number: ");
        phoneNumber = inputReader.nextLine();

        System.out.println("Please enter your home address: ");
        address = inputReader.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + "." + " " +
                firstName + "'s" + " age is " + age + "." + " " + firstName + "'s" + " email " +
                "\naddress is " + emailAddress + "," + " phone number is " + phoneNumber + "," + " and address " +
                "\nis " + address + ".");
    }
}
