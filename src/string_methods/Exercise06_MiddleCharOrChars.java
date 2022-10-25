package string_methods;

import utilities.ScannerHelper;

public class Exercise06_MiddleCharOrChars {
    public static void main(String[] args) {
        /*
        to get the middle on an odd numbered name s.charAt(s.length() / 2)
        to get the middle of an even numbered name s.substring(s.length() / 2 -1, s.length() / 2 + 1)

        Write a program that asks user to enter a name
        Find middle character if the name has odd count of characters
        Find middle 2 chars if the name has even counted of characters

        Example Output:

        Olena -> Middle char is = E
        Yildiz -> Middle chars are = ld
         */

        String name = ScannerHelper.getAName();

        if(name.length() % 2 == 0){
            System.out.println("Middle chars are = " + name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
        } else {
            System.out.println("Middle char is = " + name.charAt(name.length() / 2));
        }
    }
}
