package practice.ifElseStatements;

public class IfElsePractice {
    public static void main (String[] args){
        /*
        if the number is between 0-24 print "first quarter"
        if the number is between 25-49 print "second quarter"
        if the number is between 50-74 print "third quarter"
        */

        int myInt = 23;

        if(myInt >= 0 && myInt <= 24){ // all numbers between 0 and 24 including 0 and 24
            //System.out.println("first quarter");
        } else if(myInt >= 25 && myInt <= 49){ // all numbers between 25 and 49 including 25 and 49
            //System.out.println("second quarter");
        } else if (myInt >= 50 && myInt <= 74) { // all numbers between 50 and 74 including 50 and 74
            //System.out.println("third quarter");
        }

         /*
        if the number is between -50 to -1 print "number is negative part"
        if the number is 0 print "number is zero"
        if the number is between 1 and 50 print "number is positive part"
        */

        int myInt1 = 0;

        if(myInt1 >= -50 && myInt1 <= -1) {
            System.out.println("number is negative part");
        } else if (myInt1 == 0) {
            System.out.println("number is zero");
        } else if (myInt1 >= 1 && myInt1 <= 50) {
            System.out.println("number is positive part");
        } else System.out.println("Outside of range");
    }
}
