package strings;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        String s3 = s1 + " " + s2; // "Hello" + "World"

        System.out.println(s3); //Hello World

        System.out.println("\n------Concatenation with + operator------\n");
        String firstName = "Abdallah";
        String lastName = "Jaber";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName); // Abdallah Jaber

        System.out.println("\n------Concatenation with concat() method------\n");

        String fullName2 = firstName.concat(lastName); //AbdallahJaber
        String fullName3 = firstName.concat(" ").concat(lastName); //Abdallah Jaber //you get the "str: " "" by adding double quotes in the concat
        System.out.println(fullName2);
        System.out.println(fullName3);
    }
}
