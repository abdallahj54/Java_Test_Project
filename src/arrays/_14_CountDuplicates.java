package arrays;

import java.util.Arrays;

public class _14_CountDuplicates {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 7, 1, 1, 7, 1};
        int[] numbers2 = {2, 3, 7, 1, 1, 7, 1, 2, 1};

        System.out.println("Example 1: ");
        System.out.println(findHowManyDuplicates(numbers));

        System.out.println("\nExample 2: ");
        System.out.println(findHowManyDuplicates(numbers2));
    }

    /*
    Create a public static method which will take an int array then it will count the duplicates and return it.

    Example 1:
        int[] numbers = {2, 3, 7, 1, 1, 7, 1};

        Expected Output:
            2

    Example 2:
        int[] numbers2 = {2, 3, 7, 1, 1, 7, 1, 2, 1};

        Expected Output:
            3
     */

    public static int findHowManyDuplicates(int[] numbers){
        /*
        1. Create a container -> one int for counting duplicates
        2. fori loop for getting the number you need
         */

        String dup = "";

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(dup.contains(numbers[i] + "")) break;
                if(numbers[i] == numbers[j]){
                    dup += numbers[j] + ",";
                }
            }
        }
        return dup.split(",").length;
    }

}
