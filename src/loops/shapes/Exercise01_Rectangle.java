package loops.shapes;

public class Exercise01_Rectangle {
    public static void main(String[] args) {
        /*
        Write a program to print below rectangle
        * * * * * * 1
        *         * 2
        *         * 3
        *         * 4
        *         * 5
        *         * 6
        *         * 7
        * * * * * * 8
         */

        for (int i = 1; i <= 8; i++) {
            if(i == 1 || i ==8) System.out.println("* * * * * *");
            else System.out.println("*         *");
        }

    }
}
