package primitives;

import javax.xml.soap.SOAPPart;

public class Numbers {
    public static void main(String[] args){
        /*
        There are 6 primitives used to store numbers as data,
        byte, short, int, long -> used to store absolute numbers like 3
        float, double -> used for floating number like 10.5

        byte -> 1 byte
        short -> 2 bytes
        int -> 4 bytes
        long -> 8 bytes ("L" required to be placed after the number

        NOTE: Most of the case we use int and it is enough

        John
        his age -> 45
        his favorite number = 70
        his balance -> 400.45
         */

        //dataType variableName = value;
        System.out.println("\n---------Primitive Numbers - byte------");
        byte age = 45;
        long favNumber = 2147483648L;
        long myNumber = 1;

        System.out.println(age); //45 should show in the console
        System.out.println(favNumber); //70 should show in the console

        /*
        Floating numbers
        float -> 4 bytes
        double -> 8 bytes

        Note: Most of the case we use double
         */
        System.out.println("\n---------Floating Numbers - Double------");
        float balance1 = 23.238075489574F;
        double balance2 = 23.238075489574;
        double price = 23.5;

        System.out.println(price); //23.5 should show in the console
        System.out.println(balance1);
        System.out.println(balance2);


        System.out.println("\n---------Floating Numbers - Transaction------");
        double transaction = 20;

        System.out.println(transaction);


    }
}
