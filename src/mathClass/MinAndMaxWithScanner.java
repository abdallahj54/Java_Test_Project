package mathClass;

import java.util.Scanner;

public class MinAndMaxWithScanner {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        /*
        Get 2 numbers from user and find their max and min then print them with messages

        Output:
            "Hey user give me a number"
            -> input = 10
            "Hey user give another number"
            -> input = 15

            Max of your numbers is 15
            Min of your numbers is 10
         */

        int num1, num2;

        System.out.println("Hey user give me a number");
        num1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Hey user give me another number");
        num2 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Max of your numbers is " + Math.max(num1, num2));
        System.out.println("Min of your numbers is " + Math.min(num1, num2));

        /*
        Get 3 numbers from the user and find their max and min then print them with messages

        Output:
        "Hey user give me a number"
            -> input = 10
            "Hey user give another number"
            -> input = 15
            "Hey user give me the last number"
            -> input = 20

            Max of your numbers is 20
            Min of your numbers is 10
         */

        int input1, input2, input3;

        System.out.println("Hey user give me a number");
        input1 = inputReader.nextInt();

        System.out.println("Hey user give me another number");
        input2 = inputReader.nextInt();

        System.out.println("Hey user give me the last number");
        input3 = inputReader.nextInt();

        System.out.println("Max of your numbers is " + Math.max(Math.max(input1, input2), input3));
        System.out.println("Min of your numbers is " + Math.min(Math.min(input1, input2), input3));
    }
}
