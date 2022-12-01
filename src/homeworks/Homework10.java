package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("\n---Task 1---");
        System.out.println(countWords("      Java is fun       "));


        System.out.println("\n---Task 2---");
        System.out.println(countA("TechGlobal is a QA bootcamp"));


        System.out.println("\n---Task 3---");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(numbers));


        System.out.println("\n---Task 4---");
        ArrayList<Integer> noDups = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicates(noDups));


        System.out.println("\n---Task 5---");
        ArrayList<String> noDuplicates= new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicatesElements(noDuplicates));


        System.out.println("\n---Task 6---");
        String str = "   I   am      learning     Java      ";
        System.out.println(removeExtraSpaces(str));


        System.out.println("\n---Task 7---");
        int[] num1 = {3, 0, 0, 7, 5, 10};
        int[] num2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(num2, num1)));


        System.out.println("\n---Task 8---");
        int[] num4 = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(num4));
    }

    //Task 1
    public static int countWords(String str) {
        if (str.replaceAll("[^a-zA-Z]", "").isEmpty()) return 0;
        return str.trim().split("\\s+").length;
       /*
       WAY 2:
       str = str.replaceAll("[^a-zA-Z ]", "");
        boolean isWord = false;
        int counter = 0;
        int i = 0;
        while(i<str.length()){
            if(str.charAt(i) == ' ')isWord = true;
            else if(isWord){
                isWord = false;
                counter++;
            }
            i++;
        }
        return counter;
        */
    }


    //Task 2
    public static int countA(String str) {
        return str.replaceAll("[^aA]", "").length();
    }

    //Task 3
    public static int countPos(ArrayList<Integer> arr) {
        int counter = 0;

        for (int i : arr) {
            if (i > 0) counter++;
        }
        return counter;
    }

    //Task 4
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {

        ArrayList<Integer> newArr = new ArrayList<>();

        for (Integer integer : arr) {
            if (!newArr.contains(integer)) newArr.add(integer);
        }
        return newArr;
    }

    //Task 5
    public static ArrayList<String> removeDuplicatesElements(ArrayList<String> arr) {

        ArrayList<String> newArr = new ArrayList<>();

        for (String str : arr) {
            if (!newArr.contains(str)) newArr.add(str);
        }
        return newArr;
    }

    //Task 6
    public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
        /*
        WAY 2:
        String newStr = "";
        char[] strAsArr = str.toCharArray();
        for (int i = 0; i < strAsArr.length; i++) {
            if(strAsArr[i] != ' ') newStr += strAsArr[i];
            else if(i != strAsArr.length-1 && strAsArr[i+1] != ' ') newStr += strAsArr[i];
        }
        return newStr.trim();

         */
    }

    //Task 7
    public static int[] add(int[] arr1, int[] arr2) {
        int smallerLength = Math.min(arr1.length, arr2.length);
        int largerLength = Math.max(arr1.length, arr2.length);
        int[] arr = new int[largerLength];
        for (int i = 0; i < smallerLength; i++) {
            arr[i] = arr1[i] + arr2[i];
        }

        for (int i = smallerLength; i < largerLength; i++) {
            if (arr1.length > arr2.length) arr[i] = arr1[i];
            else arr[i] = arr2[i];
        }

        return arr;
    }

    //Task 8
    public static int findClosestTo10(int[] arr) {

        Arrays.sort(arr);
        int numberBefore10=0;
        int numberAfter10=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 10) numberBefore10 = arr[i];
        }
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i] > 10) numberAfter10 = arr[i];
        }

        if(arr[0] >= 10) return numberAfter10;
        else if(arr[arr.length-1] <= 10) return numberBefore10;
        else {
            if(Math.abs(10-numberBefore10) <= Math.abs(10-numberAfter10)) return numberBefore10;
            else return numberAfter10;
        }
    }
}