package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        // 1. Declare a String array called as countries and assign size of 3
        String[] countries = new String[3];

        // 2. Assigning values to specific elements
        countries[1] = "Spain";

        // 3. Print a specific index from an array (Using print ln)
        System.out.println(countries[0]); // null
        System.out.println(countries[1]); // Spain
        System.out.println(countries[2]); // null

        // 4. Printing an array
        System.out.println(Arrays.toString(countries)); // [null, Spain, null]

        // Assign Belgium to index of 2 and print the array once again   Expected Output: [null, Spain, Belgium]
        countries[2] = "Belgium";
        System.out.println(Arrays.toString(countries)); // [null, Spain, Belgium]

        // 5. Update existing elements (Re-Assignment)
        countries[1] = "France";
        System.out.println(Arrays.toString(countries)); // [null, France, Belgium]

        // 6. Getting the length of an array - how many elements - 3
        System.out.println(countries.length); // 3

        // 7. Printing each element separately (Using fori loop)
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }

    }
}
