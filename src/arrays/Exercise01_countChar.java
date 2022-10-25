package arrays;

import java.util.Arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {
        /*
        Assume you are give as below

        String word = "Java"

        Count how many 'a' you have in the string

        Expected Output:
        2
         */

        String word = "Java";

        int countA = 0;

        for (char element : word.toCharArray()) {
            if(element == 'a') countA++;
        }
        System.out.println(countA);
    }
}
