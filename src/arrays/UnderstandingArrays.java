package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        String name = "James"; // holding a single name

        String[] names = {"Beyza", "Andrii", "Vlad", "Samir", "Olena"}; // holding a collection of names

        //Retrieving an element from an array - using index (first element starts at 0)
        System.out.println(names[2]); // Vlad
        System.out.println(names[4]); // Olena

        /*
        ArrayIndexOutOfBoundException
          System.out.println(names[5]); because 5 is out of the range
          System.out.println(names[-1]); because the count always starts with zero NEVER negative
         */

        int age = 25;

        int[] ages = {21, 23, 25};
        System.out.println(ages[2]); // 25
    }
}
