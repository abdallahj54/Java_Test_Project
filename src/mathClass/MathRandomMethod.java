package mathClass;

public class MathRandomMethod {

    public static void main(String[] args) {

        double myRandom = Math.random();
        int myRandomBetween0to10 = (int) (Math.random() * 11); // to get a solid number from 0 to 10
        double myRandomBetween0to102 = Math.random() * 10; // to get a decimal number from 0 to 9
        int myDice = (int) (Math.random() * 6) + 1; // to get 0 to 6

        /*
        (int)(randomNumber * (big point - small point + 1) + small point
        10 - 0 + 1
         */

        // 50 - 100

        int myRandomBetween50to100 = (int)(Math.random() * (100 - 50 + 1) + 50);

        System.out.println("Random number is = " + Math.random()); //will always be from 0.0 to 0.9999999999
        System.out.println("Random number is = " + myRandom); // will be 0.0 to 0.9999999
        System.out.println("Random number between 0 to 10 is = " + myRandomBetween0to10); // will be 0 to 9
        System.out.println("My dice value = " + myDice);

        System.out.println("My random number between 50 to 100 is = " + myRandomBetween50to100);


        int myRandomBetween20to40 = (int)(Math.random() * (40 - 20 + 1) + 20);

        System.out.println("Random number between 20 to 40 is = " + myRandomBetween20to40);
    }
}
