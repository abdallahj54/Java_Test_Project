package string_methods;

public class _14_isEmpty_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a boolean
        3. non-static
        4. It doesn't take any arguments
         */

        String s1 = "Hello";
        String s2 = " ";
        String s3 = "";

        System.out.println(s1.isEmpty()); // false
        System.out.println(s2.isEmpty()); // false
        System.out.println(s3.isEmpty()); // true
    }
}
