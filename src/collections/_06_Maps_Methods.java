package collections;

import java.util.*;

public class _06_Maps_Methods {
    public static void main(String[] args) {

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("France", "Paris");

        System.out.println(capitals); //{France=Paris}

        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");

        System.out.println(capitals); //{Italy=Rome, France=Paris, Germany=Berlin, Spain=Madrid}

        System.out.println("\n-----Retrieve Values With Their Keys-----");
        System.out.println(capitals.get("Spain")); //Madrid
        System.out.println(capitals.get("Belgium")); //null (default is null when there is no key with that name)
        System.out.println(capitals.getOrDefault("Belgium", "Does not exist!")); //Overrides the default of null

        System.out.println("\n-----Check if Map Contains Given Key or Value-----");
        System.out.println(capitals.containsKey("Germany")); //true
        System.out.println(capitals.containsKey("Portugal")); //false

        System.out.println(capitals.containsValue("Ankara")); //false
        System.out.println(capitals.containsValue("Berlin")); //true

        System.out.println("\n-----Update the Value for the Specified Key-----");
        System.out.println(capitals.replace("Ukraine", "Kyiv")); //null (the key doesn't exist)
        System.out.println(capitals.replace("Germany", "berlin", "Munich")); //false (the old value doesn't exist)
        System.out.println(capitals.replace("Germany", "Berlin", "Munich")); //true

        capitals.put("Turkey", "Ankara");
        System.out.println(capitals); //{Turkey=Ankara, Italy=Rome, France=Paris, Germany=Munich, Spain=Madrid}

        capitals.put("Turkey", "Istanbul"); //This acts like a re-assignment since we already have that key
        System.out.println(capitals); //{Turkey=Istanbul, Italy=Rome, France=Paris, Germany=Munich, Spain=Madrid}

        System.out.println("\n-----Removing Entries-----");
        capitals.remove("France");
        System.out.println(capitals); //{Turkey=Istanbul, Italy=Rome, Germany=Munich, Spain=Madrid}
        capitals.remove("US"); //if we printed it would be NULL since it doesn't exist
        capitals.remove("Germany", "Stuttgart"); //if we printed it would be FALSE since it doesn't exist
        System.out.println(capitals); //{Turkey=Istanbul, Italy=Rome, Germany=Munich, Spain=Madrid}

        System.out.println(capitals.remove("Germany", "Munich")); //true
        System.out.println(capitals); //{Turkey=Istanbul, Italy=Rome, Spain=Madrid}

        System.out.println("\n-----Advanced Map Methods-----");
        //Keys: Turkey, Italy, Spain
        //Values: Istanbul, Rome, Madrid

        Set<String> set = capitals.keySet();
        System.out.println(set); //[Turkey, Italy, Spain]

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet); //[Italy, Spain, Turkey]

        Collection<String> collection = capitals.values();
        System.out.println(collection); //[Istanbul, Rome, Madrid]

        ArrayList<String> list = new ArrayList<>(capitals.values());

        System.out.println("\n-----Iterating Keys-----");
        for (String s : capitals.keySet()) {
            System.out.println(s);
        }

        System.out.println("\n-----Iterating Values-----");
        for (String s : capitals.values()) {
            System.out.println(s);
        }

        System.out.println("\n-----Getting all the entries-----");
        Set<Map.Entry<String, String>> entries = capitals.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }
    }
}
