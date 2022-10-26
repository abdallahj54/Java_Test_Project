package arrays;

import java.util.Arrays;

public class _09_Find_Max_Min {
    public static void main(String[] args) {
        int[] numbers1 = {5, 3, 2, 4, 7, -5};

        System.out.println("Task 1 With Sort: \n");
        printMaxAndMinWithSort(numbers1);

        System.out.println("\nTask 1 Without Sort: \n");
        printMaxAndMinWithoutSort(numbers1);
    }

    /*
    Create a public static method which will take an int array then it will find the
    max and min numbers from there and print it

    Examples:
        Array -> int[] numbers = {5, 3, 2, 4, 7, -5}

    Output:
        Max = 7
        Min = -5

    NOTE: DO IT WITH AND WITHOUT SORT METHOD (2 WAYS IN TOTAL)
    Method Names:
        printMaxAndMinWithSort
        printMaxAndMinWithoutSort
     */
    public static void printMaxAndMinWithSort (int[] numbers){
        /*
        - Sort
        - Print first and last
         */

        Arrays.sort(numbers);
        if (numbers.length > 0){
            System.out.println("Max = " + numbers[numbers.length -1]);
            System.out.println("Min = " + numbers[0]);
        } else{
            System.out.println("Array is empty!");
        }
    }

    public static void printMaxAndMinWithoutSort (int[] numbers){
        /*
        - Containers -> max, min
        - loop -> if my current max is bigger than the current number
        - Print
         */

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (max < n){
                max = n;
            }

            if(min > n){
                min = n;
            }
        }

        if (numbers.length > 0){
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
        } else{
            System.out.println("Array is empty!");
        }
    }

}
