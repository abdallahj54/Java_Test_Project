package arraylist_linkedlist_vectors;

import java.util.*;

public class _08_ConvertingAnArrayToAnArrayList {
    public static void main(String[] args) {
        /*
        Create an ArrayList of cities -> "Tokyo", "Berlin", "Moscow", "Denver"
        Create a LinkedList of characters -> 'A', '#', '5', '+'
        Create a vector of numbers -> 1, 2, 2, 7, 10
         */
        System.out.println("---Way 1 with Arrays.asList() Method");
        String[] arr1 = {"Tokyo", "Berlin", "Moscow", "Denver"};
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(cities); // [Tokyo, Berlin, Moscow, Denver]


        System.out.println("\n---Way 2 with loops (Manual Way)---");
        char[] arr2 = {'A', '#', '5', '+'};
        LinkedList<Character> characters = new LinkedList<>();

        for (Character c : arr2) {
            characters.add(c);
        }
        System.out.println(characters); // [A, #, 5, +]


        System.out.println("\n---Way 3 with Collections.addAll() Method---");
        Integer[] arr3 = {1, 2, 2, 7, 10};
        Vector<Integer> numbers = new Vector<>();
        Collections.addAll(numbers, arr3); // first it is the name of the list you want it go in to, then the list it is coming from
        System.out.println(numbers); // [1, 2, 2, 7, 10]
    }
}
