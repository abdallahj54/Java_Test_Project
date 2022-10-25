package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        System.out.println("-----Task 1-----");

        String result = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0)
                result += i + " - ";
        }

        System.out.println(result.substring(0, result.length() - 3));

        System.out.println("\n-----Task 2-----\n");

        String result1 = "";

        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0)
                result1 += i + " - ";
        }

        System.out.print(result1.substring(0, result1.length() - 3));

        System.out.println("\n-----Task 3-----\n");

        String result2 = "";

        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0)
                result2 += i + " - ";
        }

        System.out.print(result2.substring(0, result2.length() - 3));

        System.out.println("\n-----Task 4-----\n");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i * i);
        }

        System.out.println("\n-----Task 5-----\n");

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println(sum);

        System.out.println("\n-----Task 6-----\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Hey user, please enter a positive number: ");
        int num = input.nextInt();
        input.nextLine();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println(factorial);

        System.out.println("\n-----Task 7-----\n");

        String name = ScannerHelper.getFullName();

        int vowel = 0;

        for (int J = 0; J < name.length(); J++) {
            if (name.charAt(J) == 'a' || name.charAt(J) == 'e' || name.charAt(J) == 'i' ||
                    name.charAt(J) == 'o' || name.charAt(J) == 'u' || name.charAt(J) == 'A' ||
                    name.charAt(J) == 'E' || name.charAt(J) == 'I' || name.charAt(J) == 'O' ||
                    name.charAt(J) == 'U') vowel++;
        }

        System.out.println("There are " + vowel + " vowel letters in this full name");

        System.out.println("\n-----Task 8-----\n");

        int total = 0;
        int numbers;

        do {
            System.out.println("Please enter a number:");
            numbers = input.nextInt();
            if (numbers >= 100){
                System.out.println("This number is already more than 100");
                break;
            }
            else{
                total += numbers;
                if (total >=100) break;
            }

        }
        while (numbers < 100);
        if (total >= 100)System.out.println("Sum of the entered numbers is at least 100");

        System.out.println("\n-----Task 9-----\n");

        int first = 0;
        int second = 1;
        String resultFib = "";

        System.out.println("Hey User, please enter a number: ");
        int numFibonacci = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numFibonacci; i++) {
            resultFib += first + " - ";
            int sumOfFirstAndSecond = first + second;
            first = second;
            second = sumOfFirstAndSecond;
        }

        System.out.println(resultFib.substring(0, resultFib.length()-3));

        System.out.println("\n-----Task 10-----\n");

        String fName = ScannerHelper.getAName().toLowerCase();

        while(fName.charAt(0) != 'j'){
            fName = ScannerHelper.getAName().toLowerCase();
        }

        System.out.println("End of the program");
    }
}
