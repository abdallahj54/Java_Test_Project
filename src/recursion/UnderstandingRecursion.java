package recursion;

public class UnderstandingRecursion {

    public static void print(){
        System.out.println("Hello");
        print();
    }

    //Create a method that prints a number from 1 to given positive number
    public static void printNumbers(int end){
        for (int i = 1; i <= end; i++) {
            System.out.println(i);
        }
    }

    //Recursive Way
    public static void printNumbersRecursively(int end){ //5
        if(end == 0) return;
        printNumbersRecursively(end - 1);
        System.out.println(end);
    }


    public static void main(String[] args) {
        //print(); //StackOverFlowError
        System.out.println("-----Printing Numbers Non-Recursive-----");
        printNumbers(5);

        System.out.println("\n-----Printing Numbers Using Recursion-----");
        printNumbersRecursively(5);

        System.out.println("End of the program");

    }
}
