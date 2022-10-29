package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _05_containsAll_retainAll_Methods {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Italy");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Sweden");

        /*
        Task 1
        Check if the countries ArrayList contains Spain
        Print true if it contains, and false otherwise

        Expected Output:
        true
         */
        System.out.println("---Task 1---");
        System.out.println(countries.contains("Spain")); // true

        /*
        Task 2
        Check if the countries ArrayList contains Sweden and Denmark
        Print true if it contains both, and false otherwise

        Expected Output:
        false
         */
        System.out.println("\n---Task 2---");
        System.out.println(countries.contains("Sweden") && countries.contains("Denmark")); // false

        /*
        Contains All
        Check if the countries ArrayList contains Sweden, Spain, Germany, Portugal, Italy
        Print true if it contains both, and false otherwise

        Expected Output:
        true
         */
        System.out.println("\n---containsAll() Method---"); // NOTE: CAN ALSO BE DONE THE SAME WAY AS TASK 2 JUST LONGER

        ArrayList<String> europeCountries = new ArrayList<>();
        europeCountries.add("Sweden");
        europeCountries.add("Spain");
        europeCountries.add("Germany");
        europeCountries.add("Portugal");
        europeCountries.add("Italy");

        System.out.println(countries.containsAll(europeCountries)); // true

        /*
        Retains All
        Check if the countries ArrayList retains Sweden, Spain, Germany, Portugal, Italy
        Print true if it contains both, and false otherwise

        Expected Output:
        [Italy, Germany, Spain, Portugal, Sweden]
         */
        System.out.println("\n---retainAll() Method---");

        countries.retainAll(europeCountries);
        System.out.println(countries); // [Italy, Germany, Spain, Portugal, Sweden]
    }
}
