package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {
        /*
        TASK 1
        Create an ArrayList and store below cities in it:
        Chicago
        Berlin
        Miami

        Print the size of the ArrayList
        Print the ArrayList

        Expected Output:
        3
        [Chicago, Berlin, Miami]
         */

        System.out.println("---Task 1---");
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");

        System.out.println(cities.size()); // 3
        System.out.println(cities); // [Chicago, Berlin, Miami]

        /*
        Task 2
        Update Miami to be Evanston and print the ArrayList

        Expected Output:
        [Chicago, Berlin, Evanston]
         */

        System.out.println("\n---Task 2---");

        cities.set(2, "Evanston");

        System.out.println(cities); // [Chicago, Berlin, Evanston]

        /*
        Task 3
        Remove Berlin and print the ArrayList
        Print the size

        Expected Output:
        [Chicago, Evanston]
        2

        Then remove Chicago and reprint the ArrayList and size

        Expected Output:
        [Evanston]
        1
         */

        System.out.println("\n---Task 3---");

        cities.remove("Berlin");

        System.out.println(cities); // [Chicago,Evanston]
        System.out.println(cities.size()); // 2

        cities.remove("Chicago");

        System.out.println(cities);
        System.out.println(cities.size());

        /*
        Task 4
        Add below cities to ArrayList
        New York
        Rome
        Ghent

        Print the ArrayList and its size

        Expected Output:
        [Evanston, New York, Rome, Ghent]
        4
         */

        System.out.println("\n---Task 4---");

        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");

        System.out.println(cities); // [Evanston, New York, Rome, Ghent]
        System.out.println(cities.size()); // 4

        /*
        Task 5
        Remove all Elements
        Print the ArrayList
        Print the size

        Expected Output:
        []
        0
         */

        System.out.println("\n---Task 5---");

        cities.clear(); // can also be done with cities.removeAll(cities);

        System.out.println(cities); // []
        System.out.println(cities.size()); // 0
    }
}
