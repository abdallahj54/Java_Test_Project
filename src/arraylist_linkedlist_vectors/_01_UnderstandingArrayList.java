package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {

        // 1. Declaring an array vs an ArrayList
        String[] names1 = new String[3];
        ArrayList<String> names2 = new ArrayList<>(); // capacity = 10 by default if parenthesis left empty

        // 2. Getting the size of an array vs an ArrayList
        System.out.println("---Size of array vs ArrayList---");
        System.out.println("The size of the array = " + names1.length); // 3
        System.out.println("The size of the ArrayList = " + names2.size()); // 0

        // 3. Printing an array vs ArrayList
        System.out.println("\n---Printing arrays vs ArrayList---");
        System.out.println("The array = " + Arrays.toString(names1)); // [null, null, null]
        System.out.println("The ArrayList = " + names2); // []

        // 4. Adding elements to specific indexes
        System.out.println("\n---Adding elements arrays vs ArrayList---");
        names1[0] = "Alex";
        names2.add(0, "John"); // names2.add("John") can also be used in this instance since the arrayList is empty
        System.out.println("The array = " + Arrays.toString(names1)); // [Alex, null, null]
        System.out.println("The ArrayList = " + names2); // [John]

        // TASK 1
        System.out.println("\n---Task 1---");
        names1[1] = "Ali";
        names1[2] = "Andrii";
        System.out.println("The array = " + Arrays.toString(names1)); // [Alex, Ali, Andrii]
        names2.add("Joe"); // without specifying index, it will input into the next available space
        names2.add("Jane");
        System.out.println("The ArrayList = " + names2); // [John, Joe, Jane]

        // TASK 2
        System.out.println("\n---Task 2---");
        names2.add("Abdallah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Suzanne");
        names2.add("Hazal");
        names2.add("Yildiz");
        names2.add("Samir");
        System.out.println("The ArrayList = " + names2); // [John, Joe, Jane, Abdallah, Vlad, Saeed, Suzanne, Hazal, Yildiz, Samir]
        System.out.println("The size of the ArrayList = " + names2.size()); // 10

        // 5. Updating an existing element in array vs ArrayList
        System.out.println("\n---Updated existing elements array vs ArrayList---");
        names1[1] = "Mike";
        System.out.println("The array = " + Arrays.toString(names1)); // [Alex, Mike, Andrii]
        names2.set(1, "Olena");
        System.out.println("The ArrayList = " + names2); // [John, Olena, Jane, Abdallah, Vlad, Saeed, Suzanne, Hazal, Yildiz, Samir]
    }
}
