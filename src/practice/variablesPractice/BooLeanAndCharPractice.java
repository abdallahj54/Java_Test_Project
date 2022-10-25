package practice.variablesPractice;

public class BooLeanAndCharPractice {
    public static void main(String[] args) {
        boolean negative = false;
        boolean positive = true;

        System.out.println("Negative = " + "\"" + negative + "\"");
        System.out.println("Positive = " + "\"" + positive + "\"");

        char myFirstChar = 'A';
        char mySecondChar = 'B';
        char myThirdChar = 'D';

        // Expected output: ABD
        System.out.print(myFirstChar);
        System.out.print(mySecondChar);
        System.out.print(myThirdChar + "\n");

        char firstLetter = 'C';
        char secondLetter = 'a';
        char thirdLetter = 't';

        System.out.print(firstLetter);
        System.out.print(secondLetter);
        System.out.print(thirdLetter + "\n");

        char letter1 = 'D';
        char letter2 = 'o';
        char letter3 = 'g';

        System.out.print("\"" + letter1);
        System.out.print(letter2);
        System.out.print(letter3 + "\"" + "\n");
    }
}
