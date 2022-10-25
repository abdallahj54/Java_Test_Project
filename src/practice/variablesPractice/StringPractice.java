package practice.variablesPractice;

import java.sql.SQLOutput;

public class StringPractice {
    public static void main(String[] args) {
        String schoolName = "TechGlobal";
        String myName = "Abdallah";
        int myAge = 28;
        double myHeight = 5.11;
        boolean isEligibleToDrive = true;

        System.out.println("My school name is " +
                "\"" + schoolName + "\"" + ". My name is " + myName +
                ". I am " + myAge + " years old. \nMy height is " + myHeight + "." +
                " I am eligible to drive " + "\"" + isEligibleToDrive + "\".");

        /*
            Java is a high-level\hard, class-based, object-oriented programming language that is
        designed to have as few implementation "dependencies" as possible. It is a general-purpose
        programming language intended to let programmers write once, run anywhere (WORA),
        meaning that compiled Java code can run on all platforms that support Java without the need to recompile.
         */

        System.out.println("\tJava is a high-level\\hard, class-based, object-oriented programming language that is \n" +
                "designed to have as few implementation \"dependencies\" as possible. It is a general-purpose \n" +
                "programming language intended to let programmers write once, run anywhere (WORA),\n" +
                "meaning that compiled Java code can run on all platforms that support Java without the need to recompile.");
    }
}
