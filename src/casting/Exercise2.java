package casting;

public class Exercise2 {
    public static void main(String[] args) {

        System.out.println('A' + 'b' + 20 + " Hello" + 2 + 1); //183 Hello21
            // 'A' and 'b' get converted to the ASCII Table value
            // plus 20

        System.out.println('A' + 'b' + 20 + " Hello" + (2 + 1)); // 183 Hello3
    }
}
