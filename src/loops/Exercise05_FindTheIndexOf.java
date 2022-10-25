package loops;

public class Exercise05_FindTheIndexOf {
    public static void main(String[] args) {

        System.out.println("findFirstIndexOf\n");

        System.out.println("1. " + findFirstIndexOf("I love Java", 'a')); // 1. 8
        System.out.println("2. " + findFirstIndexOf("Banana", 'a')); // 2. 1
        System.out.println("3. " + findFirstIndexOf("Banana", 't')); // 3. -1

        System.out.println("\nfindLastIndexOf\n");

        System.out.println("1. " + findLastIndexOf("I love Java", 'a')); // 1. 10
        System.out.println("2. " + findLastIndexOf("Banana", 'a')); // 2. 5
        System.out.println("3. " + findLastIndexOf("Banana", 't')); // 3. -1

        System.out.println("\nclearChar\n");

        System.out.println("1. " + clearChar("I love Java", 'a')); // 1. I love Jv
        System.out.println("2. " + clearChar("Banana", 'a')); // 2. Bnn
        System.out.println("3. " + clearChar("Banana", 't')); // 3. Banana

        System.out.println("\nclearWord\n");

        System.out.println("1. " + clearWord("I love Java", "av")); // 1. I love Ja
        System.out.println("2. " + clearWord("I love Java", "ava")); // 2. I love J
        System.out.println("3. " + clearWord("I love Java", "Jav")); // 3. I love a
        System.out.println("4. " + clearWord("Banana", "an")); // 4. Ba
        System.out.println("5. " + clearWord("Banana", "bananananaa")); // 5. (empty)

        System.out.println("\nfrontAndBack\n");

        System.out.println("1. " + frontAndBack("abcxxxabc")); // 1. abc
        System.out.println("2. " + frontAndBack("abxxxab")); // 2. ab
        System.out.println("3. " + frontAndBack("axxxa")); // 3. a
        System.out.println("4. " + frontAndBack("wordxxxword")); // 4. word

        System.out.println("\nmostRepeatedChar\n");

        System.out.println("1. " + mostRepeatedChar("I love Java")); // 1. v
        System.out.println("2. " + mostRepeatedChar("Banana")); // 2. a
        System.out.println("3. " + mostRepeatedChar("Python")); // 3. P
    }

    /*
    Create a public static method named as findFirstIndexOf() and it will take a String,
     and a char then it will return the index of the first occurrence of the char.
     If the char doesn't exist in the string then return -1

     Example:

     "I love Java", 'a' -> 8
     "Banana, 'a'       -> 1
     "Banana, 't'       -> -1
     */
    public static int findFirstIndexOf(String s, char c){

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }

    /*
    Create a public static method named as findLastIndexOf() and it will take a String,
     and a char then it will return the index of the last occurrence of the char.
     If the char doesn't exist in the string then return -1

     Example:

     "I love Java", 'a' -> 10
     "Banana, 'a'       -> 5
     "Banana, 't'       -> -1
     */

    public static int findLastIndexOf(String s, char c){
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }

    /*
    Create a public static method named as clearChar() and it will take a String,
    and a char then it will return the String without the given char.

    Example:
    "I love Java", 'a'  -> "I love Jv"
    "Banana", 'a'       -> "Bnn"
    "Banana", 't'       -> "Banana"
     */
    public static String clearChar(String s, char c){
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != c){
                newS += s.charAt(i);
            }
        }
        return newS;
    }

    /*
    Create a public static method named as clearWord() and it will take two Strings,
    then it will return the String without the given second string. If the second String is bigger than
    the first one return empty

    Example:
    "I love Java", "av"           -> "I love Ja"
    "Banana", "an"                -> "Ba"
    "Banana", "bananananaa"       -> ""
     */
    public static String clearWord(String s, String word){
        if(word.length() > s.length()){
            return "";
        }

        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if(!s.substring(i).startsWith(word)){
                newS += s.charAt(i);
            } else{
                i += word.length() - 1;
            }
        }
        return newS;
    }

    /*
    Create a public static method named as frontAndBack() and it will take a String,
    then it will return a String which has the most common words from start and end.

    Examples:
    "abcxxxabc"      -> "abc"
    "abxxxab"        -> "ab"
    "axxxa"          -> "a"
    "wordxxxword"    -> "word"
     */
    public static String frontAndBack(String s){
        /*
        1. Create container
        2. Create fori loop (0, s.length() / 2)
        3. Get the substring and check if it is starting and ending the same.
           If it is starting and ending the same update the container.
         */

        String newS = "";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.endsWith(s.substring(0, i + 1))){
                newS = s.substring(0, i + 1);
            }
        }
        return newS;
    }

    /*
    Create a public static method named as mostRepeatedChar() and it will take a String,
    then it will return the most repeated char from String. If there is same amount of repetition return the first one
     Hint: use a String container
     Hint 2: use nested loop

    Example:
    "I love Java"  -> 'v'
    "Banana"       -> 'a'
    "Python"       -> 'P'
     */

    public static char mostRepeatedChar(String s){
        /*
        1. container
        2. fori loop -> check every single letter
        3. if the current char has the bigger repetition update the container
        4. return the container
         */

        char mostRepeated = ' ';
        int mostAmountOfRepetition = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) continue;
            if (countChar(s, s.charAt(i)) > mostAmountOfRepetition){
                mostRepeated = s.charAt(i);
                mostAmountOfRepetition = countChar(s, s.charAt(i));
            }
        }

        return mostRepeated;
    }

    //supporting count char method it will take a String, and a char then it will return the number of
    //occurrence of that char
    public static int countChar(String s, char c){
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) counter++;
        }
        return counter;
    }

}
