package arrays;

import java.util.Arrays;

public class _02_intArray {
    public static void main(String[] args) {

        // 1. Create an int array and store 0, -5, 2, 10, 5, 2, -1, 0
        int[] numbers = {0, -5, 2, 10, 5, 2, -1, 0};

        // 2. Print the array
        System.out.println(Arrays.toString(numbers));

        // 3. Iterate the array (print each element)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // For each loop way - enhanced for loop
        for (int element : numbers){ // For each element in numbers, print the number
            System.out.println(element);
        }

    }
}
