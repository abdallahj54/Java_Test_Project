package conditional_statements.if_else_statements;

public class ifElseSyntax {
    public static void main(String[] args) {
        /*
        - if or else statements are used to control the flow of the program based on the conditions
        - conditions are always boolean statements (true or false)
        - if block can be used without else block
        - else block can NOT be used without if block
         */

        boolean condition = false;

        if(condition){
            //This is the if block, and it executes if the condition is true
            System.out.println("AAA"); //if condition is true, this pops up
        }
        else{
            //This is the else block, and it executes if the condition is false
            System.out.println("BBB"); //if condition is false, this pops up
        }

        System.out.println("End of the program!");
    }
}
