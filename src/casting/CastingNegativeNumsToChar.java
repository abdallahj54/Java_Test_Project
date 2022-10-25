package casting;

public class CastingNegativeNumsToChar {
    public static void main(String[] args) {

        int negative = -32;

        char myChar = (char) negative;

        System.out.println("Negative number of char value = " + myChar);

        int num1 = 48;
        char char1 = (char) num1;

        System.out.println("Zero = " + char1);

        int num2 = 65;
        char char2 = (char) num2;

        System.out.println("A = " + char2);

        int num3 = 97;
        char char3 = (char) num3;

        System.out.println("a = " + char3);

        char myCharO = 'U';
        int oAsciiValue = myCharO;

        System.out.println("Uppercase O = " + myCharO);
        System.out.println("O ASCII Value = " + oAsciiValue);

        if(oAsciiValue >= 65 && oAsciiValue <= 90){
            System.out.println("Your char is Uppercase");
        } else System.out.println("Your char is NOT Uppercase");
    }
}
