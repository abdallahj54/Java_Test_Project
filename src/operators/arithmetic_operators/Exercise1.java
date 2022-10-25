package operators.arithmetic_operators;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        Write a Java program that calculates and prints the area and perimeter of a rectangle
        Write the Pseudo Code first
        Area = a*b
        Perimeter = 2*(a+b)

        Assume that you have a rectangle
        The short side is equal to 4 units
        The long side is equal to 7 units
        Find area and the perimeter of the rectangle

        Expected output:
        Area is = 28
        Perimeter is = 22
         */

        int shortSide1 = 4, longSide2 = 7;

        System.out.println("Area is = " + shortSide1 * longSide2);
        System.out.println("Perimeter is = " + 2 * (shortSide1 + longSide2));
    }
}
