package string_methods;

public class _08_length_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns int which is the total count of characters
        3. non-static
        4. does not take any arguments
         */

        String s = "John";

        int len = s.length();
        System.out.println(len); // 4

        System.out.println("".length()); // 0 (no space in between quotes)
        System.out.println(" ".length()); // 1 (1 space in between quotes)
        System.out.println("  ".length()); // 2 (2 spaces in between quotes)
    }
}
