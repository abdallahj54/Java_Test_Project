package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {
        // create a double array with these values 1.5, 2.3, -1.3, -3.7

        double[] decimals = {1.5, 2.3, -1.3, -3.7};
        char[] chars = {'a', 'b', 'c', 'd'};

        System.out.println(Arrays.toString(decimals));
        System.out.println("The length of the array is " + decimals.length);

        //Sort the array and print it

        Arrays.sort(decimals);
        System.out.println("Array after sorting -> " + Arrays.toString(decimals));

        /*
        Print each value on a separate line

        Expected Output:
        -3.7
        -1.3
        1.5
        2.3
         */
        System.out.println("\nForeach printing elements on a separate line: ");

        for (double element : decimals) {
            System.out.println(element);
        }

        /*
        Expected Output:
        -3.7 - a -> at the index of 0
        -1.3 - b -> at the index of 1
        1.5 - c -> at the index of 2
        2.3 - d -> at the index of 3
         */

        System.out.println("\nFori loop print two arrays below: ");

        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i] + " - " + chars[i]);
        }


    }
}
