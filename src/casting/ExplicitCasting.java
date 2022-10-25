package casting;

public class ExplicitCasting {
    public static void main (String[] args){

        // Explicit casting - narrowing - down casting

        int age = 25;

        byte b = (byte) age; // how to transition from big to small ONLY MANUALLY

        System.out.println(b); // 25

        //BUT, we will lose data if bigger primitive holds a data that cannot be stored in the smaller one

        int num1 = 5000;

        byte num2 = (byte) num1; // it seems okay to compiler

        System.out.println(num2); // -120 pops up because it doesn't work as you are losing data
    }
}
