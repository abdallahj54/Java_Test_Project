package homeworks;

import java.util.ArrayList;

import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("---Task 1---");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);


        System.out.println("\n---Task 2---");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println("\n---Task 3---");

        ArrayList<Integer> number = new ArrayList<>();

        number.add(23);
        number.add(-34);
        number.add(-56);
        number.add(0);
        number.add(89);
        number.add(100);

        System.out.println(number);

        Collections.sort(number);
        System.out.println(number);


        System.out.println("\n---Task 4---");

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);

        Collections.sort(cities);
        System.out.println(cities);


        System.out.println("\n---Task 5---");

        ArrayList<String> marvelChars = new ArrayList<>();

        marvelChars.add("Spider Man");
        marvelChars.add("Iron Man");
        marvelChars.add("Black Panther");
        marvelChars.add("Deadpool");
        marvelChars.add("Captain America");

        System.out.println(marvelChars);

        ArrayList<String> marvelContains = new ArrayList<>();

        marvelContains.add("Wolverine");
        System.out.println(marvelChars.containsAll(marvelContains));


        System.out.println("\n---Task 6---");

        ArrayList<String> avengers = new ArrayList<>();

        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");

        Collections.sort(avengers);
        System.out.println(avengers);

        ArrayList<String> avengersContains = new ArrayList<>();

        avengersContains.add("Hulk");
        avengersContains.add("Iron Man");

        System.out.println(avengers.containsAll(avengersContains));


        System.out.println("\n---Task 7---");

        ArrayList<Character> chars = new ArrayList<>();

        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');

        System.out.println(chars);

        for (Character element : chars) {
            System.out.println(element);
        }


        System.out.println("\n---Task 8---");

        ArrayList<String> objects = new ArrayList<>();

        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        System.out.println(objects);

        Collections.sort(objects);
        System.out.println(objects);
    }
}
