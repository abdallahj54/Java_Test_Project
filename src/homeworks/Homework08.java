package homeworks;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {
        System.out.println("---Task 1---");
        System.out.println(countConsonants("hello"));


        System.out.println("\n---Task 2---");
        System.out.println(wordArray("Hello, nice to meet you!!"));


        System.out.println("\n---Task 3---");
        System.out.println(removeExtraSpaces("java is  fun"));


        System.out.println("\n---Task 4---");
        System.out.println(count3OrLess());

    }
    //Task 1
    public static int countConsonants(String str){
        str = str.replaceAll("[^A-Za-z]", "");
        str = str.replaceAll("[AEIOUaeiou]", "");

        return str.length();
    }

    //Task 2
    public static String wordArray(String str){
        str = removeExtraSpaces(str);
        str = str.replaceAll("[^A-Za-z ]", "");
        return Arrays.toString(str.split(" "));
    }

    //Task 3
    public static String removeExtraSpaces(String str){
        str = str.replaceAll("[\\s]{1,}", " ");
        return str;
    }

    //Task 4
    public static int count3OrLess(){
        String str = ScannerHelper.getAString();

        Pattern pattern = Pattern.compile("[A-Za-z]{1,3}");
        Matcher match = pattern.matcher(str);

        int counter = 0;

        while(match.find()){
            counter++;
        }
        return counter;
    }
}
