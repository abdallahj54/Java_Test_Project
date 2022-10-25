package casting;

public class CastingChars {
    public static void main(String[] args) {
        int i1 = 65;

        System.out.println(i1); // 65

        char c1 = (char)i1; //converts absolute numbers to a char (ASCII TABLE)

        System.out.println(c1); // A

        System.out.println(51); // 51
        System.out.println((char) 51); // 3

        System.out.println((char) 123); // {

        System.out.println((char) 127); // inputs a space

        System.out.println((char) 1020); // inputs a random symbol


        char char1 = 'A';
        char char2 = 97; // 'a'

        System.out.println(char1 + char2); // 162 this would be the ASCII values added together
        System.out.println("" + char1 + char2); // to get Aa
        System.out.println("" + (char1 + char2)); //  162 because priority is the math and then converted to string
        System.out.println(char1 + char2 + ""); // 162 as a string same as above
        System.out.println(char1 + "" + char2); // Aa same as the second example
    }
}
