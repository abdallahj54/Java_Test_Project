package methods;

import utilities.RandomNumberGenerator;

public class RandomNumberPractices {
    public static void main(String[] args) {
        /*
        Generate 5 random numbers and find their average
        First -> between 5 and 15
        Second -> between 3 and 10
        Third -> between 50 and 55
        Fourth -> between 6 and 63
        Fifth -> between 100 and 113
         */

        int r1 = RandomNumberGenerator.getARandomNumber(5, 15);
        int r2 = RandomNumberGenerator.getARandomNumber(3, 10);
        int r3 = RandomNumberGenerator.getARandomNumber(50, 55);
        int r4 = RandomNumberGenerator.getARandomNumber(6, 63);
        int r5 = RandomNumberGenerator.getARandomNumber(100, 113);

        System.out.println("Number 1 = " + r1);
        System.out.println("Number 2 = " + r2);
        System.out.println("Number 3 = " + r3);
        System.out.println("Number 4 = " + r4);
        System.out.println("Number 5 = " + r5);

        System.out.println("The average is = " + (r1 + r2 + r3 + r4 + r5) / 5);
    }
}
