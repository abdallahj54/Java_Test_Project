package casting;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /*
        PS5 -> $600
        $20 per day saving

        Expected output:
        You can buy PS5 in 30 days
         */

        Scanner inputReader = new Scanner(System.in);
        double priceForPS5 = 600;

        System.out.println("The price for the PS5 is currently = $" + priceForPS5);
        System.out.println("How much are you going to save daily?");
        double dailySavings = inputReader.nextDouble();

        System.out.println("You can buy PS5 in " + (int) (priceForPS5 / dailySavings) + " days"); //explicit because double is bigger than int
    }
}
