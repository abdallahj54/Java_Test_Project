package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Pen", "Pencil", "Book", "Notebook", "MacBook Pro"));

        /*
        Task
        Remove elements that contain 'book'
        - This is case Insensitive

        Print the list

        Expected Output:
        [Pen, Pencil]
         */

        Iterator<String> objectIterator = objects.iterator();

        while(objectIterator.hasNext()){
            String o = objectIterator.next();
            if(o.toLowerCase().contains("book")) objectIterator.remove();
        }
        System.out.println(objects);
    }
}
