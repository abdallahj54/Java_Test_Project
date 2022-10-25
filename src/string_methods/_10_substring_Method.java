package string_methods;

public class _10_substring_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a string
        3. non-static
        4. it takes up to 2 ints and is overloaded
         */

        String s = "TechGlobal";

        // Get "Global"
        String s1 = s.substring(4); // from index 4 to the end
        System.out.println(s1); // Global

        // Get "Tech"
        String s2 = s.substring(0,4);
        System.out.println(s2); // Tech
    }
}
