package operators.arithmetic_operators;

public class UnderstandingArithmeticOperators {
    public static void main(String[] args) {
        /*
        Find the result of below expressions
        3 + 5 = 8
        5 - 2 = 3
        10 / 2 = 5
        2 * 4 = 8
        10 % 3 = 1
         */
        System.out.println("------Example1------");
        System.out.println(3 + 5);
        System.out.println(5 - 2);
        System.out.println(10 / 2);
        System.out.println(2 * 4);
        System.out.println(10 % 3);

        /*
        Create 2 int variables called as num1 and num2
        And store 6 and 4 in these variables respectively
        Find their
        sum
        subtraction
        product
        division
        remainder
         */
        System.out.println("\n------Example2------");

        int num1 = 6, num2 = 4;

        System.out.println("The sum of numbers is = " + (num1 + num2)); // 10 (double () is only needed for addition and subtraction
        System.out.println("The subtraction of number is = " + (num1 - num2)); // 2
        System.out.println("The product of these numbers is = " + num1 * num2); // 24
        System.out.println("The division of these numbers is = " + num1 / num2); // 1
        System.out.println("The remainder of these numbers is = " + num1 % num2); // 2
    }
}
