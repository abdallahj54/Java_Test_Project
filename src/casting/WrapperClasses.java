package casting;

public class WrapperClasses {
    public static void main(String[] args) {
        // int vs Integer

        int i1 = 25;

        System.out.println(i1); // 25

        Integer i2 = 2147483647;

        System.out.println(i2); // 25

        int i3 = i2;

        System.out.println(Integer.MAX_VALUE); // finds the max value for the Integer data type
        System.out.println(Integer.MIN_VALUE); // finds the min value for the Integer data type

        System.out.println(Integer.max(3, 5)); // 5


        String s = "25";

        System.out.println(Integer.valueOf(s) + 5); // 30 -> extra step happens here which is why intellij prefers the next way
        System.out.println(Integer.parseInt(s) + 5); // 30 -> intellij prefers this way
    }
}
