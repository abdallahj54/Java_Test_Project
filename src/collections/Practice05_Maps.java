package collections;

import java.util.HashMap;
import java.util.Map;

public class Practice05_Maps {
    public static void main(String[] args) {
        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

        // Keys: Day, Color, City, Car, Pet
        // Values: Friday, Black, Chicago, Lexus, Turtle

        /*
        Get keys and print them
        [Car, Color, City, Day, Pet]
         */

        System.out.println("-----Get Keys and Print them-----");
        System.out.println(favorites.keySet()); //[Car, Color, City, Day, Pet]
        for (String fav : favorites.keySet()){
            System.out.println(fav);
        }

        /*
        Print each value with a loop
         */

        System.out.println("\n-----Print Each Value with a Loop-----");
        for (String value : favorites.values()) {
            System.out.println(value);
        }

        /*
        Print all entries as below
        1. Key = Car and the value for it = Lexus
        2. Key = Color and the value for it = Black
        3. Key = City and the value for it = Chicago
        4. Key = Day and the value for it = Friday
        5. Key = Pet and the value for it = Turtle
         */

        int i = 1;

        for (Map.Entry<String, String> entry : favorites.entrySet()) {
            System.out.println(i++ + ". Key = " + entry.getKey() + " and the value for it = " + entry.getValue());
        }
    }
}
