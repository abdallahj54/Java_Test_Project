package arrays;

public class _04_CountElements_InIntArrays {
    public static void main(String[] args) {

        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        /*
        Negatives: 2
        Positives: 5
        Neutrals or Zeros: 3

        Even: 6
        Odd: 4

        Max: 10
        Min: -7

        Sum of the numbers: 28
        Average of the numbers: 2
        How many unique numbers do we have: 7
        How many of those numbers are represented in Fibonacci sequences: 6
        prime numbers: 2
        How many numbers can be divided by 5: 6
        Absolute difference between the max and min of these numbers: 17
        Closest number to 9 (take the smallest if you have 2 numbers): 8
         */

        int negatives = 0;
        for (int number : numbers){
            if(number < 0) negatives++;
        }
        System.out.println("Negative count is = " + negatives); // 2

        int positives = 0;
        for (int number : numbers) {
            if(number > 0) positives++;
        }
        System.out.println("Positive count is = " + positives); // 5

        int zero = 0;
        for (int number : numbers) {
            if(number == 0) zero++;
        }
        System.out.println("Neutral or Zero count is = " + zero); // 3

        /*
        Count how many even numbers you have

        Expected Output:
        6
         */

        int even = 0;
        for (int number : numbers) {
            if (number % 2 == 0) even++;
        }
        System.out.println(even); // 6
    }
}
