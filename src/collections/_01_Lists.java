package collections;

import java.util.LinkedList;

public class _01_Lists {
    public static void main(String[] args) {
        /*
        - They preserve insertion order
        - They allow duplicates (including empty and null)
        - They allow null elements

        - Performance
        - Memory
        - Initial Capacity
        - Load
        - The way they store data
         */

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.offer("Orange");
        fruits.offerFirst("Pineapple");

        System.out.println(fruits.element()); //Pineapple
        System.out.println(fruits.getFirst()); //Pineapple

        System.out.println(fruits); //[Pineapple, Apple, Orange]

        fruits.clear();

        System.out.println(fruits.poll()); //null
        //System.out.println(fruits.remove()); //NoSuchElementException because it is empty already
    }
}
