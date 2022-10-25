package utilities;

import java.util.Scanner;

public class ScannerHelper {

    /*
    Create a method that asks user to enter a name and RETURN it
     */

    public static String getAName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = input.nextLine();

        return name;
    }

    /*
    Create a method that asks user to enter an age and RETURN it
     */

    public static int getAnAge(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an age: ");
        int age = input.nextInt();
        input.nextLine();

        return age;
    }

    /*
    Create a method that asks user to enter an address and RETURN it
     */

    public static String getAnAddress(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an address: ");
        String address = input.nextLine();

        return address;
    }
    /*
    Create a method that asks user to enter a string and RETURN it
     */

    public static String getAString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String");
        String string = input.nextLine();

        return string;
    }

    /*
    Create a method that asks user to enter their full name and RETURN it
     */

    public static String getFullName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String fName = input.nextLine();

        return fName;
    }
    /*
    Create a method that asks user to enter their favorite colors and RETURN it
     */
    public static String getFavColors(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your favorite colors: ");
        String favColors = input.nextLine();

        return favColors;
    }

    /*
    Create a method that asks user to enter a number and RETURN it
     */
    public static int getANumber(){
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        input.nextLine();

        return num;
    }


}
