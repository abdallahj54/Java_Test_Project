package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice03_SubSets {
    public static void main(String[] args) {
        /*
        Create a collection to store below numbers

        3, 2, 7, 10, 15, 20, 7, 5

        Find all the elements more than 7                     -> [10, 15, 20]
        Find all the elements less than or equal to 5         -> [2, 3, 5]
        Find all the elements between 5 and 15 both inclusive -> [5, 7, 10, 15]
         */

        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(3, 2, 7, 10, 15, 20, 7, 5));
        System.out.println(set.tailSet(7, false)); //[10, 15, 20]
        System.out.println(set.headSet(5, true)); //[2, 3, 5]
        System.out.println(set.subSet(5, true, 15, true)); //[5, 7, 10, 15]

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(10);

        System.out.println(numbers); //[1, 2, 3, 7, 10]

        System.out.println(numbers.first()); //1
        System.out.println(numbers); //[1, 2, 3, 7, 10]

        System.out.println(numbers.pollFirst()); //1 (shows you the first element and then removes it when you reprint the set
        System.out.println(numbers); //[2, 3, 7, 10]

        numbers.clear();

        //System.out.println(numbers.last()); //NoSuchElementException
        //System.out.println(numbers.first()); //NoSuchElementException

        System.out.println(numbers.pollFirst()); //null
        System.out.println(numbers.pollLast()); //null
    }
}
