package homeworks;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Vector;

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

        int startsWithM = 0, notContainsAorE = 0;

        for (String object : objects) {
            if(object.toLowerCase().startsWith("m")) startsWithM++;
            if(!object.toLowerCase().contains("a") && !object.toLowerCase().contains("e")) notContainsAorE++;
        }
        System.out.println(startsWithM);
        System.out.println(notContainsAorE);


        System.out.println("\n---Task 9---");

        ArrayList<String> kitchen = new ArrayList<>();
        kitchen.add("Plate");
        kitchen.add("spoon");
        kitchen.add("fork");
        kitchen.add("Knife");
        kitchen.add("cup");
        kitchen.add("Mixer");

        System.out.println(kitchen);

        int startsWithUpper = 0, startsWithLower = 0, havingP = 0, startingEndingWithP = 0;

        for (String element : kitchen) {
            if(Character.isUpperCase(element.charAt(0))) startsWithUpper++;
            if(Character.isLowerCase(element.charAt(0))) startsWithLower++;
            if(element.toLowerCase().contains("p")) havingP++;
            if(element.toLowerCase().startsWith("p") || element.toLowerCase().endsWith("p")) startingEndingWithP++;
        }
        System.out.println("Elements starts with uppercase = " + startsWithUpper);
        System.out.println("Elements starts with lowercase = " + startsWithLower);
        System.out.println("Elements having P or p = " + havingP);
        System.out.println("Elements starting or ending with P or p = " + startingEndingWithP);


        System.out.println("\n---Task 10---");
        Integer[] arr = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        ArrayList<Integer> numbers1 = new ArrayList<>();
        Collections.addAll(numbers1, arr);
        System.out.println(numbers1);

        int dividedBy10 = 0, evenAndGreaterThan15 = 0, oddAndLessThan20 = 0, lessThan15OrGreaterThan50 = 0;

        for (Integer element: numbers1){
            if (element % 10 == 0) dividedBy10++;
            if (element % 2 == 0 && element > 15) evenAndGreaterThan15++;
            if (element % 2 == 1 && element < 20) oddAndLessThan20++;
            if (element < 15 || element > 50) lessThan15OrGreaterThan50++;
        }
        System.out.println("Elements that can be divided by 10 = " + dividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + evenAndGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddAndLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + lessThan15OrGreaterThan50);
    }
}
