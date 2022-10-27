package arrays;

import java.util.Arrays;

public class _11_charArray_Recap {
    public static void main(String[] args) {
        // Create a char array which will hold your name's letters with new and curly bracket methods

        System.out.println("Creating a char array only knowing the length and assigning the values: \n");
        char[] initials = new char[8];
        initials[0] = 'A';
        initials[1] = 'b';
        initials[2] = 'd';
        initials[3] = 'a';
        initials[4] = 'l';
        initials[5] = 'l';
        initials[6] = 'a';
        initials[7] = 'h';
        System.out.println(Arrays.toString(initials));

        System.out.println("\nCreating a char array when you know the elements: \n");
        char[] initials2 = {'A', 'b', 'd', 'a', 'l', 'l', 'a', 'h'};
        System.out.println(Arrays.toString(initials2));

        System.out.println("\nPrinting the array without the brackets: \n");
        //Print name removing the square brackets E.O -> Abdallah
        for (char element : initials2) {
            System.out.print(element);
        }

    }
}
