package string_methods;

public class _01_valueOf_Method {
    public static void main(String[] args) {

        /*
        1. return
        2. returns a String
        3. Static (called by class name)
        4. takes arguments (there are many overloaded valueOf() methods)
         */

        int num = 125;

        String numString = String.valueOf(num); // "125"

        System.out.println(num + 5); // 130 (because it is numerical)
        System.out.println(numString + 5); // "1255" (because it is a string)
    }
}
