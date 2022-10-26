package practice.arraysPractice;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // [[1,1], [2,4], [3,9]]  -> outer size = 3, inner sizes = 2
        int[][] numbersSquare = new int[3][2]; // Creates an empty multidimensional array
        int[][] numbersSquare2 = {{1, 1}, {2, 4}, {3, 9}}; // Created an int multidimensional array

        System.out.println(Arrays.deepToString(numbersSquare));
        System.out.println(Arrays.deepToString(numbersSquare2));

        System.out.println(numbersSquare2[0][0]); // 1
        System.out.println(numbersSquare2[1][1]); // 4
        System.out.println(numbersSquare2[2][0]); // 3
    }
}
