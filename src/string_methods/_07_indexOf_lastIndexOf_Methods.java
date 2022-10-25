package string_methods;

public class _07_indexOf_lastIndexOf_Methods {
    public static void main(String[] args) {
        /*
        1. return
        2. returns int which matches index
        3. non-static
        4. It takes a char or String - there are overloaded methods
         */

        String company = "TechGlobal School";

        int firstIndexOfO = company.indexOf('o'); // 6
        int lastIndexOfO = company.lastIndexOf('o'); // 15

        System.out.println(firstIndexOfO); // 6
        System.out.println(lastIndexOfO); // 15

        // Find the first and last indexes of l -> expected 5 and 16

        System.out.println(company.indexOf('l')); // 5
        System.out.println(company.lastIndexOf('l')); // 16

        System.out.println(company.indexOf('X')); // -1 (because it is NOT FOUND)

        System.out.println(company.indexOf("School")); // 11
    }
}
