package string_methods;

public class _06_charAt_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a char at given index
        3. non-static
        4. It takes one int as index
         */

        String sentence = "Java is fun";

        char c1 = sentence.charAt(3); // 'a'

        char c2 = sentence.charAt(4); // ' '

        System.out.println(c1); // 'a'
        System.out.println(c2); // ' '

        System.out.println(sentence.charAt(9)); // 'u'

        /*NOTE: Runtime Error - StringIndexOutOfBoundsException (ONCE YOU GET AN ERROR NOTHING AFTER WILL RUN)
        System.out.println(sentence.charAt(-5)); // Runtime Error index out of range: -5
        System.out.println(sentence.charAt(50)); // Runtime Error index out of range: 50
         */

        System.out.println("End of the program");
    }
}
