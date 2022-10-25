package string_methods;

import java.util.Arrays;

public class _16_split_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a String array
        3. non-static
        4. It takes regex as argument (where you want the split to be)
         */

        String s = "Today is Sunday and the weather is nice";

        String[] arr1 = s.split(" ");
        System.out.println(Arrays.toString(arr1)); // [Today, is, Sunday, and, the, weather, is, nice]
        System.out.println(Arrays.toString(s.split(" "))); // whole thing in 1 line

        String[] arr2 = s.split("is");
        System.out.println(Arrays.toString(arr2)); // [Today , Sunday and the weather,  nice
        System.out.println(Arrays.toString(s.split("is"))); // whole thing in 1 line
    }
}
