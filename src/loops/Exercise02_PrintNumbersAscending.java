package loops;

public class Exercise02_PrintNumbersAscending {
    public static void main(String[] args) {
        /*
        Write a program that prints numbers from 1 to 10 as below

        Expected Output:
        1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10
         */

        System.out.println("\n-----Beginner Way-----\n");

        for (int i = 1; i <= 10; i++){
            if(i != 10) System.out.print(i + " - ");
            else System.out.print(i);
        }

        System.out.println("\n-----Advanced Way-----\n"); // this way would be more dynamic than the beginner way

        String result = "";

        for (int i = 1; i <= 10; i++) {
            result += i + " - ";
        }

        System.out.println(result.substring(0, result.length() - 3));

    }
}
