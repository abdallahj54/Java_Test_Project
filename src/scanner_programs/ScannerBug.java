package scanner_programs;

import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt(); // or using nextInt(), nextByte(), nextDouble() next line will be empty and cause error when running

        scanner.nextLine(); //moving cursor to the next line of input (MUST BE THERE IF USING ABOVE METHOD AT ALL)

        System.out.println("Please enter your address: ");
        String address = scanner.nextLine();

        System.out.println("Age is " + age);
        System.out.println("Address is " + address);

        System.out.println("Please enter 2 numbers");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();

        System.out.println(num1 / num2); //2 numbers divided by each other make sure you put a space between 2 numbers i.e. 21 3 in console
    }
}
