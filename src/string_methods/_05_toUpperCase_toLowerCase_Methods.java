package string_methods;

public class _05_toUpperCase_toLowerCase_Methods {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a String
        3. non-static
        4. The one we used below does NOT take any arguments - there are overloaded methods (multiple of the same one)
         */

        String name = "John";

        System.out.println(name.toLowerCase()); // john
        System.out.println(name.toUpperCase()); // JOHN

        System.out.println("hello".toUpperCase()); // HELLO
        System.out.println("heLLo".toLowerCase()); // hello

        System.out.println("abc".toUpperCase().toLowerCase()); // abc (converts to Upper case first and finally to lower case)

        System.out.println("ab".toUpperCase().concat("xY".toLowerCase()).toLowerCase()); // ABxy
    }
}
