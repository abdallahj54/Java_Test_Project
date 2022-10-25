package loops.fori_loops;

public class Exercise04_PrintNumbersDividedBy5 {
    public static void main(String[] args) {
        /*
        Write a Java program to find all numbers divisible by 5 bt 1 to 50 (1 and 50 are included)

        Expected output:
        5
        10
        15
        .
        .
        .
        40
        45
        50
         */

        for (int i = 1; i <= 50 ; i++) {
            if(i % 5 == 0) System.out.println(i);
        }

    }
}
