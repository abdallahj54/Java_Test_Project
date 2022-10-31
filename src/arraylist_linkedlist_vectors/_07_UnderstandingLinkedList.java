package arraylist_linkedlist_vectors;

import java.util.Arrays;
import java.util.LinkedList;

public class _07_UnderstandingLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>(Arrays.asList(10.5, 5.5, 20.0));

        System.out.println(numbers); // [10.5, 5.5, 20.0]
        System.out.println(numbers.size()); // 3
        System.out.println(numbers.contains(10.5)); // true
        System.out.println(numbers.indexOf(4)); // -1; this element doesn't exist in the list
        System.out.println(numbers.get(1)); // 5.5

        System.out.println(numbers.getFirst()); // 10.5
        System.out.println(numbers.getLast()); // 20.0
        System.out.println(numbers.offerFirst(4.5)); // true; always returns true and adds to the beginning of the list
        System.out.println(numbers); // [4.5, 10.5, 5.5, 20.0]

        System.out.println(numbers.peek()); // 4.5; returns the first index only
        System.out.println(numbers); // [4.5, 10.5, 5.5, 20.0]

        System.out.println(numbers.pop()); // 4.5; shows the first element and then removes it
        System.out.println(numbers); // [10.5, 5.5, 20.0]

        System.out.println(numbers.pollLast()); // 20.0; shows the first element and then removes it
        System.out.println(numbers); // [10.5, 5.5]

        numbers.push(2.0); // adds 2.0 to the first index
        System.out.println(numbers); // [2.0, 10.5, 5.5]
    }
}
