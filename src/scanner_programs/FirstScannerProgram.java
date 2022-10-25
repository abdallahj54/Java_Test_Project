package scanner_programs;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {

        //1. create a scanner object (this will auto input the "import java.util.Scanner;" above main method Scanner(java.util)

        //dataType varName = value;

        String fName, lName;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        fName = inputReader.next(); //Manually enter name in the console then hit enter * if 2 or more names use nextLine() instead of next()

        System.out.println("Please enter your last name:");
        lName = inputReader.next(); //Manually enter last name in the console then hit enter

        System.out.println("Your full name is = " + fName + " " + lName); //System recognizes full name is Abdallah Jaber
    }
}
