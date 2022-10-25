package casting;

public class PrimitivesToString {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 + num2); // 15 -> both are primitives, so it's just adding the 2 numbers together
        System.out.println("" + num1 + num2); // 510 -> String removes the addition of the 2 numbers
        System.out.println(' ' + num1 + num2); // 47 -> Single quote and space will pull space from the ASCII table and add all numbers together
        System.out.println("" + (num1 + num2)); // 15 -> as a string because of the parenthesis

        System.out.println(String.valueOf(num1) + String.valueOf(num2)); // 510 as a string   equal to "5" + "10" -> 510

        System.out.println(String.valueOf(23) + 5);// 235 as a string     equal to "23" + "5" -> 235
    }
}
