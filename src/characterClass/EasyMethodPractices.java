package characterClass;

public class EasyMethodPractices {
    public static void main(String[] args) {

        String s1 = "2860 south river road des plaines il";
        String s2 = "12345 $#^&^@ TechGlobal";

        System.out.println("String: \"" + s1 + "\" has: \n" + countLetters(s1) + " letters");
        System.out.println("String: \"" + s2 + "\" has: \n" + countLetters(s2) + " letters");


        System.out.println("\nIn Class Practice:\n");

        String s3 = "12345 $#^&^@ TechGlobal";
        String s4 = "TeChGloBal";
        String s5 = "123123 TeChGloBal #$%#$%";

        System.out.println("String: \"" + s3 + "\" has: \n" + countUpperCase(s3) + " uppercase letters");
        System.out.println("String: \"" + s4 + "\" has: \n" + countUpperCase(s4) + " uppercase letters");
        System.out.println("String: \"" + s5 + "\" has: \n" + countUpperCase(s5) + " uppercase letters");

        System.out.println("\n");

        String s6 ="12345 $#^&^@ TechGlobal";
        printStringAttributes(s6);

    }

    /*
    Crate a public static method which will take a String and return the number of LETTERS
     */
    public static int countLetters(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

    /*
    Create a public static method named as countUpperCase which will take a String and counts the upper case letters then returns it
     */
    public static int countUpperCase(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

    /*
    Create a public static method named as printStringAttributes which will take a String
    and prints the message dynamically for the string

    Print Output -> "Given "(string)" has:
                    x amount of upper cases
                    x amount of lower cases
                    x amount of letters
                    x amount of digits
                    x amount of spaces
                    x amount of specials"

    Example Output:
    Given "12345 $#^&^@ TechGlobal" has:
         2 amount of upper cases
         8 amount of lower cases
         10 amount of letters
         5 amount of digits
         2 amount of spaces
         6 amount of specials
     */
    public static void printStringAttributes(String s){
        int upperC = 0, lowerC = 0, letterC = 0, digitC = 0, spaceC = 0, specialC = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                letterC++;
                if(Character.isUpperCase(c)){
                    upperC++;
                } else {
                    lowerC++;
                }
            } else if (Character.isDigit(c)) {
                digitC++;
            } else if (Character.isWhitespace(c)) {
                spaceC++;
            } else{
                specialC++;
            }
        }
        System.out.println("Given \"" + s + "\"has:\n"
                + upperC + " amount of upper cases\n"
                + lowerC + " amount of lower cases\n"
                + letterC + " amount of letters\n"
                + digitC + " amount of digits\n"
                + spaceC + " amount of spaces\n"
                + specialC + " amount of specials");
    }

}
