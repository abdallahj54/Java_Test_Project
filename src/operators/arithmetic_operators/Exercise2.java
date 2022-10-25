package operators.arithmetic_operators;

public class Exercise2 {
    public static void main(String[] args) {
        /*
        An average salary for an SDET in the US is 90k.
        Write a Java program tha calculates and prints the monthly and bi-weekly and
        weekly average amount that an SDETs makes in the US

        Expected Output
        Monthly: 7500
        Bi-Weekly: 3461
        Weekly: 1730
         */
        double yearlySalary = 90_000;
        System.out.println("Monthly: " + yearlySalary / 12);
        System.out.println("Bi-weekly: " + yearlySalary / 26);
        System.out.println("Weekly: " + yearlySalary / 52);
    }
}
