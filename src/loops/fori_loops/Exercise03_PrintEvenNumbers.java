package loops.fori_loops;

public class Exercise03_PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print only even numbers from bt 0 to 10 (0 and 10 are included)

        Expected output:
        0
        2
        4
        6
        8
        10
         */

        for (int i = 0; i <= 10; i++){
            if(i % 2 == 0) System.out.println(i); // to print odd numbers from range == would be 1 instead of 0
        }

    }
}
