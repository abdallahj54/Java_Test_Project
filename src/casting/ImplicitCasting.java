package casting;

public class ImplicitCasting {
    public static void main (String[] args){

        //implicit casting - widening - upcasting fitting smaller numbers into bigger variable types
        byte b = 127; // byte range is -128 to 127

        int i = b;

        System.out.println(i); // 127

        float f = 10.5F;
        double d = f;

        System.out.println(d); // 10.5
    }
}
