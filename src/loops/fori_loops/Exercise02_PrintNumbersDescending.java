package loops.fori_loops;

public class Exercise02_PrintNumbersDescending {
    public static void main(String[] args) {
        /*
        Write a java program to print numbers from 100 to 0 (100 and 0 are included)

        Expected output:
            100
            99
            98
            .
            .
            .
            2
            1
            0
         */

        for(int i = 100; i >=0; i--){
            System.out.println(i);
        }

    }
}
