package utilities;

public class RandomNumberGenerator {

    /*
    Create a method that generates a random SOLID number between 2 numbers (both numbers are included) and RETURNS it
     */
    public static int getARandomNumber(int i1, int i2){
        return (int)(Math.random() * (Math.abs(i1-i2) + 1)) + Math.min(i1, i2);
    }

    /*
    Create a method that generates a random DECIMAL between 2 numbers (both numbers are included) and RETURNS it
     */
    public static double getARandomNumber(double i1, double i2){
        return (double)(Math.random() * (Math.abs(i1 - i2) + 1)) + Math.min(i1,i2);
    }

}
