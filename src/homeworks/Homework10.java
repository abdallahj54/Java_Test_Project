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
        System.out.println(removeDuplicateNumbers(noDups));


        System.out.println("\n---Task 5---");
        ArrayList<String> noDuplicates= new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicateElements(noDuplicates));


        System.out.println("\n---Task 6---");
        String str = "   I   am      learning     Java      ";
        System.out.println(removeExtraSpaces(str));


        System.out.println("\n---Task 7---");
        int[] num1 = {3, 0, 0, 7, 5, 10};
        int[] num2 = {6, 3, 2};
        System.out.println(Arrays.toString(sumOfArrays(num2, num1)));


        System.out.println("\n---Task 8---");
    }

    //Task 1
    public static int countWords(String str) {
        return str.trim().split("[ ]+").length;
    }

    //Task 2
    public static int countA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a') count++;
        }
        return count;
    }

    //Task 3
    public static int countPos(ArrayList<Integer> numbers) {
        int count = 0;
        for (Integer number : numbers) {
            if (number > 0) count++;
        }
        return count;
    }

    //Task 4
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> dups) {
        HashSet<Integer> removeD = new HashSet<>();
        removeD.addAll(dups);
        ArrayList<Integer> noDups = new ArrayList<>();
        noDups.addAll(removeD);
        return noDups;
    }

    //Task 5
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> dupsE) {
        HashSet<String> removeE = new HashSet<>();
        removeE.addAll(dupsE);
        ArrayList<String> noDupsE = new ArrayList<>();
        noDupsE.addAll(removeE);
        return noDupsE;
    }

    //Task 6
    public static String removeExtraSpaces(String str) {
        String s = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) == ' ')) {
                continue;
            }
            else s += str.charAt(i);
        }
        return s;
    }

    //Task 7
    public static int[] sumOfArrays(int[] first, int[] second) {
        int[] third = new int[Math.max(first.length, second.length)];
        for (int i = 0; i < Math.min(first.length, second.length); i++) {
            third[i] = first[i] + second[i];
        }
        for (int i = Math.min(first.length, second.length); i < third.length; i++) {
            if (first.length > second.length){
                third[i] = first[i];
            }else {
                third[i] = second[i];
            }
        }
        return third;
    }

    //Task 8
}