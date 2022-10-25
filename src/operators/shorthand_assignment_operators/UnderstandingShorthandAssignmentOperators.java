package operators.shorthand_assignment_operators;

public class UnderstandingShorthandAssignmentOperators {
    public static void main(String[] args) {
        int age = 10;

        System.out.println(age); //10

        //What will be the age 5 years later

        age += 5; //cannot have space between the + and the =

        System.out.println(age); //15

        /*
        Task2
         */
        int num1 = 50;
        num1 = num1 % 12 ;

        System.out.println(num1 %= 12); //num1 = num1 % 12
    }
}
