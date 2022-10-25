package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {
        /*
        TASK-1
        Create a char array and store values below
        #
        $
        5
        A
        b
        H

        Print the array

        Expected Output:
        [#, $, 5, A, b, H]
         */

        System.out.println("\n-----Task 1-----\n");

        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters));


        System.out.println("\n-----Task 2-----\n");
        /*
        Task-2
        Print the size of the array with a message

        Expected Output:
        The size of the array is = 6
         */

        System.out.println("The size of the array is = " + characters.length);


        System.out.println("\n-----Task 3-----\n");
        /*
        Task-3
        Print each element using fori loop

        Expected Output:
        #
        $
        5
        A
        b
        H
         */

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }


        System.out.println("\n-----Task 4-----\n");
        /*
        Task-4
        Print each element using foreach loop

        Expected Output:
        #
        $
        5
        A
        b
        H
         */

        for (char element : characters) {
            System.out.println(element);
        }


        System.out.println("\n-----Task 5-----\n");
        /*
        Task-5
        Print each element that are letters (foreach loop)

        Expected Output:
        A
        b
        H
         */

        for (char element : characters) {
            if(Character.isLetter(element)) System.out.println(element);
        }


        System.out.println("\n-----Task 6-----\n");
        /*
        Task-6
        Count how many uppercase characters you have in the array

        Expected Output:
        2
         */

        int countUpper = 0;

        for (char element : characters){
            if(Character.isUpperCase(element)) countUpper++;
        }
        System.out.println(countUpper);
    }
}
