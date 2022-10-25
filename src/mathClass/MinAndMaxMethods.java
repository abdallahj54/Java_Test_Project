package mathClass;

public class MinAndMaxMethods {

    public static void main(String[] args) {
        //Math class doesn't need an object for using their methods. Simply call the class name and the methods after it

        int maxNumber = Math.max(80, 27); // 80

        int maxNumber2 = Math.max(maxNumber, 125); // 80

        int maxNumber3 = Math.max(maxNumber2, 625); // 625

        System.out.println("maxNumber = " + maxNumber); // 80
        System.out.println("maxNumber2 = " + maxNumber2); // 125
        System.out.println("maxNumber3 = " + maxNumber3); // 625

        int minNumber = Math.min(80, 27); // 27

        int minNumber2 = Math.min(minNumber, 2); // 2

        int minOfTwoNeg = Math.min(-40, -60); // -60

        System.out.println("\nminNumber = " + minNumber); // 27
        System.out.println("minNumber2 = " + minNumber2); // 2
        System.out.println("minOfTwoNeg = " + minOfTwoNeg); // -60

        double maxOfTwoDecimals = Math.max(1.7, 6.5); // 6.5

        System.out.println("\nmaxOfTwoDecimals = " + maxOfTwoDecimals); // 6.5

        double maxOfTwoDecimalNeg = Math.max(-5.4, -27.2); // -5.4

        System.out.println("maxOfTwoDecimalNeg = " + maxOfTwoDecimalNeg); // -5.4

        /*
         Find the max value of the given numbers and print them

         6, 9
         17, 49
         34.2, 12.5
         -14, -32
         */

        int maxOfGivenNum = Math.max(6, 9);
        int maxOfGivenNum2 = Math.max(17, 49);
        double maxOfDecimal = Math.max(34.2, 12.5);
        int maxOfGivenNum3 = Math.max(-14, -32);
        int maxOfGivenNum4 = Math.max(17, 49);
        int maxOfGivenNum5 = Math.max(maxOfGivenNum4, 125);

        System.out.println("\nmaxOfGivenNum = " + maxOfGivenNum); // 9
        System.out.println("maxOfGivenNum = " + maxOfGivenNum2); // 49
        System.out.println("maxOfDecimal = " + maxOfDecimal); // 34.2
        System.out.println("maxOfGivenNum = " + maxOfGivenNum3); // -14
        System.out.println("maxOfGivenNum = " + maxOfGivenNum4); // 49
        System.out.println("maxOfGivenNum = " + maxOfGivenNum5); // 125

        System.out.println("\n\nTask for class");
        System.out.println("Max is " + Math.max(6,9));
        System.out.println("Max is " + Math.min(17,49));
        System.out.println("Max is " + Math.min(34.2,12.5));
        System.out.println("Max is " + Math.min(-14,-32));

       // 25, 125, 625

        System.out.println("Max is " + Math.max(Math.max(25,125), (625)));

        /*
        Find the min value of the given numbers and print them
            6,9
            17, 49
            34.2, 12.5
            -14, -32
            17, 49, 125
            45, 32, 56, 89
         */

        System.out.println("\n\nMin is " + Math.min(6, 9)); // 6
        System.out.println("Min is " + Math.min(17, 49)); // 17
        System.out.println("Min is " + Math.min(34.2, 12.5)); // 12.5
        System.out.println("Min is " + Math.min(-14, -32)); // -32
        System.out.println("Min is " + Math.min(Math.min(17,49), 125)); // 17  FOR 3 NUMBERS DO IT THIS WAY
        System.out.println("Min is " + Math.min(Math.min(45, 32), Math.min(56,89))); // 32 FOR 4 NUMBERS DO IT THIS WAY

    }
}
