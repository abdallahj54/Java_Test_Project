package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        System.out.println("\n------Task 1------\n");

        Scanner scanner = new Scanner(System.in);

        int input1, input2, input3;

        System.out.println("Hey User, please enter your first number: ");
        input1 = scanner.nextInt();

        System.out.println("Hey User, please enter your second number: ");
        input2 = scanner.nextInt();

        System.out.println("Hey User, please enter your third number: ");
        input3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The product of the numbers entered is = " + input1 * input2 * input3);

        System.out.println("\n------Task 2------\n");

        String firstName, lastName;
        int birthYear;
        int currentYear = 2022;

        System.out.println("Hey User, please enter your first name: ");
        firstName = scanner.nextLine();

        System.out.println("Hey User, please enter your last name: ");
        lastName = scanner.nextLine();

        System.out.println("Hey User, please enter the year you were born: ");
        birthYear = scanner.nextInt();
        scanner.nextLine();

        System.out.println(firstName + " " + lastName + "'s" + " age is = " + (currentYear - birthYear) + ".");

        System.out.println("\n------Task 3------\n");

        String fullName;
        double yourWeight;
        double weightConversion = 2.205; // KG to LBS

        System.out.println("Hey User, please enter your full name: ");
        fullName = scanner.nextLine();

        System.out.println("Hey User, please enter your weight in kilograms: ");
        yourWeight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(fullName + "'s weight is = " + yourWeight * weightConversion + " lbs.");

        System.out.println("\n------Task 4------\n");

        String studentName1, studentName2, studentName3;
        int studentAge1, studentAge2, studentAge3;

        System.out.println("Student 1, please enter your full name: ");
        studentName1 = scanner.nextLine();

        System.out.println("Student 1, please enter your age: ");
        studentAge1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Student 2, please enter your full name: ");
        studentName2 = scanner.nextLine();

        System.out.println("Student 2, please enter your age: ");
        studentAge2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Student 3, please enter your full name: ");
        studentName3 = scanner.nextLine();

        System.out.println("Student 3, please enter your age: ");
        studentAge3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(studentName1 + "'s age is " + studentAge1 + ".");
        System.out.println(studentName2 + "'s age is " + studentAge2 + ".");
        System.out.println(studentName3 + "'s age is " + studentAge3 + ".");

        System.out.println("The average age is " + (studentAge1 + studentAge2 + studentAge3) / 3 + ".");
        System.out.println("The eldest age is " + Math.max(Math.max(studentAge1, studentAge2), studentAge3) + ".");
        System.out.println("The youngest age is " + Math.min(Math.min(studentAge1, studentAge2), studentAge3) + ".");
    }
}
