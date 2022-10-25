package practice.methods;

public class StringMethodPractices {
    public static void main(String[] args) {
        System.out.println(StringMethodPractices.isCharExisting("John", 'o', 1)); // true
        System.out.println(StringMethodPractices.isCharExisting("John", 'o', 2)); // false
        System.out.println(StringMethodPractices.isCharExisting("Peter", 'o', 1)); // false
        System.out.println(StringMethodPractices.isCharExisting("Peter", 'r', 4)); // true

        System.out.println(StringMethodPractices.isCharContained("John", 'o')); // true
        System.out.println(StringMethodPractices.isCharContained("Peter", 'o')); // false
        System.out.println(StringMethodPractices.isCharContained("Peter", 'r')); // true
    }

    /*
    Create a public static method named as "isCharExisting" which will take a String, a char, and an index,
    it will return true if that char is existing in that String at the given index
     */
    public static boolean isCharExisting (String str, char c,int index){
       return str.charAt(index) == c;
    }

    /*
    Create a public static method named as "isCharContained" which will take a String, a char,
    and it will return true if that char is existing in that string
     */
    public static boolean isCharContained(String str1, char c){
        return str1.contains(String.valueOf(c));
    }

}
