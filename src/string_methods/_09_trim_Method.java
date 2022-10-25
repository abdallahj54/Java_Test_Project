package string_methods;

public class _09_trim_Method {
    public static void main(String[] args) {

        /*
        1. return
        2. returns a string
        3. non-static
        4. it takes NO arguments
         */

        //Trim removes the initial and backend spaces in a string DOESN'T reassign unless you tell it to

        String s1 = "  Hello   ";

        System.out.println(s1.length()); // 10
        System.out.println(s1.trim().length()); // 5

        System.out.println("  Hello World   ".trim()); // proof that only the first and end space gets trimmed
    }
}
