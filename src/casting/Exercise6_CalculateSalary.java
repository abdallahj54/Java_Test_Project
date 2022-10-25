package casting;

public class Exercise6_CalculateSalary {
    public static void main(String[] args) {
        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";

        /*
        Task 1
        Find min and max salary

        Expected output:
        Min salary = $4000.5
        Max salary = $6000.25
         */
        double s1 = Double.parseDouble(salary1);
        double s2 = Double.parseDouble(salary2);
        double s3 = Double.parseDouble(salary3);

        double minSalary = Math.min(Math.min(s1,s2), s3);

        System.out.println("Min salary = $" + minSalary);
        System.out.println("Max salary = $" + Math.max(Math.max(s1, s2), s3));

        /*
        Task 2
        Calculate the 10 percent of the min salary

        Expected Output:
        400.05
         */

        System.out.println(minSalary * 0.1);
    }
}
