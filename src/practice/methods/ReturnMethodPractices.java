package practice.methods;

public class ReturnMethodPractices {
    public static void main(String[] args) {
        System.out.println(ReturnMethodPractices.findDifference(6, 9)); // 3
        System.out.println(ReturnMethodPractices.findDifference(4, 1)); // 3
        System.out.println(ReturnMethodPractices.findDifference(99, 23)); // 76

        System.out.println(ReturnMethodPractices.findDifference(99.23, 23.99)); // 75.24
        System.out.println(ReturnMethodPractices.findDifference(6.12, 12.76)); // 6.64
        System.out.println(ReturnMethodPractices.findDifference(9.63, 43.1)); // 33.47

        System.out.println(ReturnMethodPractices.isIncluded("John", "John Doe")); // true
        System.out.println(ReturnMethodPractices.isIncluded("John Doe", "John")); // true
        System.out.println(ReturnMethodPractices.isIncluded("Doe", "John")); // false
    }

    /*
    Create a public static method names as "findDifference" it will take two values and returns the positive difference
     */

    public static int findDifference(int num1, int num2){
        return Math.abs(num1 - num2);
    }

    /*
    Create a public static method names as "findDifference" it will take two decimal values and returns the positive difference
    */

   public static double findDifference(double num1, double num2){
       return Math.abs(num1 - num2);
   }

   /*
   Create a public static method named as "isIncluded" which takes 2 String values, and returns true
   if the small string is inside the other one. NOTE: You have to check which string is bigger, then check if it is included
    */

    public static boolean isIncluded(String str1, String str2){
        // is str1 containing str2 OR str2 containing str1

        if(str1.length() > str2.length()) return str1.contains(str2);
        return str2.contains(str1);
    }
}
