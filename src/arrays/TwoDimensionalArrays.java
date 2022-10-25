package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][] students = {
                {"Ali", "Mehmet", "Alex"},
                {"Alex", "Regina"},
                {"Abdallah", "Newer"},
        };
        System.out.println(students[0][1]); // Mehmet
        System.out.println(students[1][1]); // Regina

        System.out.println(students.length); // 3 (counts from the outer array)

        //Printing inner arrays with fori loop
        for (int i = 0; i < students.length; i++) {
            System.out.println(Arrays.toString(students[i]));
        }

        //Printing inner arrays with foreach loop
        for (String[] group : students) {
            System.out.println(Arrays.toString(group));
        }

        //Printing the multidimensional array
        System.out.println(Arrays.deepToString(students)); // [[Ali, Mehmet, Alex], [Alex, Regina], [Abdallah, Newer]]


        System.out.println("\n---Class Task---\n");
        /*
        Task
        Print each member in different lines

        Expected Output:
        Ali
        Mehmet
        Alex
        Alex
        Regina
        Abdallah
        Newer
         */

        for(String[] group : students){
            for(String student : group){
                System.out.println(student);
            }
        }

    }
}
