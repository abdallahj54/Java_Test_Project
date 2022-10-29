package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {
        /*
        Task 1
        Create an ArrayList to store below numbers
        10
        15
        20
        10
        20
        30

        Print the ArrayList and its size

        Expected Output:
        [10, 15, 20, 10, 20, 30]
        6
         */

        System.out.println("---Task 1---");
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers); // [10, 15, 20, 10, 20, 30]
        System.out.println(numbers.size()); // 6

        System.out.println("\n---Contains Method---");

        System.out.println(numbers.contains(10)); // true
        System.out.println(numbers.contains(12)); // false
        System.out.println(numbers.contains(20)); // true
        System.out.println(numbers.contains(22)); // false

        System.out.println("\n---indexOf() method---");

        System.out.println(numbers.indexOf(15)); // 1
        System.out.println(numbers.indexOf(25)); // -1
        System.out.println(numbers.indexOf(20)); // 2

        System.out.println("\n---lastIndexOf() method---");

        System.out.println(numbers.lastIndexOf(30)); // 5
        System.out.println(numbers.lastIndexOf(35)); // -1
        System.out.println(numbers.lastIndexOf(10)); // 3

        System.out.println("\n---Retrieving each element with fori loop---");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\n---Retrieving each element with foreach loop---");

        for (Integer element : numbers) {
            System.out.println(element);
        }

    }
}
