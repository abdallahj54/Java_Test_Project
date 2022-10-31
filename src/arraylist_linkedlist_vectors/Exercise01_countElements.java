package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_countElements {
    public static void main(String[] args) {
        /*
        Task 1
        Create an ArrayList and store below colors
        Blue
        Brown
        Pink
        Yellow
        Red
        Purple

        Print the ArrayList
        Print the size
        Print each element separately
         */
        System.out.println("---Task 1---");

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink", "Yellow", "Red", "Purple"));
        //the above would also be how to convert an array to an ArrayList as well as adding those elements to the ArrayList right away

        System.out.println(colors);
        System.out.println(colors.size());

        for (String color : colors) {
            System.out.println(color);
        }

        /*
        Task 2
        Count the elements that has length of 6

        Expected Output:
        2
         */
        System.out.println("\n---Task 2---");

        int count6 = 0;

        for (String color : colors) {
            if(color.length() == 6) count6++;
        }
        System.out.println(count6); // 2

        /*
        Task 3
        Count the elements that has 'o'

        Expected Output:
        2
         */
        System.out.println("\n---Task 3---");

        int countO = 0;

        for (String color : colors) {
            if(color.toLowerCase().contains("o")) countO++;
        }
        System.out.println(countO);
    }
}
