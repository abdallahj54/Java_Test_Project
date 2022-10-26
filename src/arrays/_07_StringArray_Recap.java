package arrays;

import java.util.Arrays;

public class _07_StringArray_Recap {
    public static void main(String[] args) {
        // Create a string array with a length of 4

        String[] fruits = new String[4];

        System.out.println(Arrays.toString(fruits));

        //Assign "Apple" to index 0 and "Kiwi" to index 3 and print the array

        fruits[0] = "Apple";
        fruits[3] = "Kiwi";

        System.out.println(Arrays.toString(fruits));

        // Assign "Grapes" to index 1 and "Orange" to index of 2 and print the array

        fruits[1] = "Grapes";
        fruits[2] = "Orange";

        System.out.println(Arrays.toString(fruits));


        System.out.println("\nReassigning values: ");

        // Reassign index 0 to index of 3 and to index of 2 (Pulling from existing array)

        fruits[3] = fruits[0];
        fruits[2] = fruits[0];

        System.out.println(Arrays.toString(fruits));

        System.out.println("\nPrinting values with foreach loop: ");

        for (String element : fruits) {
            System.out.println(element);
        }

    }
}
