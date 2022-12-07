package homeworks;

import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("---Task 1---");
        String s1 = " Hello World ";
        System.out.println(noSpace(s1));

        System.out.println("\n---Task 2---");
        String s2 = "Tech Global";
        System.out.println(replaceFirstLast(s2));

        System.out.println("\n---Task 3---");
        String s3 = "Java";
        System.out.println(hasVowel(s3));

        System.out.println("\n---Task 4---");
        int i1 = 2010;
        System.out.println(checkAge(i1));

        System.out.println("\n---Task 5---");
        int i2 = 0, i3 = 0, i4 = 6;
        System.out.println(averageOfEdges(i2, i3, i4));

        System.out.println("\n---Task 6---");
        String[] sAr = {"java", "hello", "123", "xyz"};
        System.out.println(Arrays.toString(noA(sAr)));

        System.out.println("\n---Task 7---");
        int[] iAr = {7, 4, 11, 23, 17};
        System.out.println(Arrays.toString(no3or5(iAr)));

        System.out.println("\n---Task 8---");
        int[] iAr2 = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(iAr2));
    }

    //Task 1
    public static String noSpace(String s) {
        String noS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') noS += s.charAt(i);
        }
        return noS;
    }

    //Task 2
    public static String replaceFirstLast(String s) {
        if (s.length() < 2) {
            return "";
        }
        String begin = "", end = "";
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isSpaceChar(s.charAt(i))) {
                begin += s.charAt(i);
                break;
            }
        }
        for (int i = s.length() - 1; i > 0; i--) {
            if (!Character.isSpaceChar(s.charAt(i))) {
                end += s.charAt((i));
                break;
            }
        }
        return end + s.substring(s.indexOf(begin) + 1, s.lastIndexOf(end)) + begin;
    }

    //Task 3
    public static Boolean hasVowel(String s) {
        if (s.toLowerCase().contains("a") |
                s.toLowerCase().contains("e") |
                s.toLowerCase().contains("i") |
                s.toLowerCase().contains("o") |
                s.toLowerCase().contains("u")) {
            return true;
        }
        return false;
    }

    //Task 4
    public static String checkAge(int yearOfBirth) {
        int age = 2022 - yearOfBirth;
        if (age < 16 & age >= 0) return "AGE IS NOT ALLOWED";
        else if (age > 100 | age < 0) return "AGE IS NOT VALID";
        else return "AGE IS ALLOWED";
    }

    //Task 5
    public static int averageOfEdges(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (max + min) / 2;
    }

    //Task 6
    public static String[] noA(String[] strings) {
        String[] noAStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith("A") | strings[i].startsWith("a")) {
                noAStrings[i] = "###";
            } else {
                noAStrings[i] = strings[i];
            }
        }
        return noAStrings;
    }

    // Task 7
    public static int[] no3or5(int[] ints) {
        int[] no3or5ints = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0 & ints[i] % 5 == 0) {
                no3or5ints[i] = 101;
            } else if (ints[i] % 5 == 0) {
                no3or5ints[i] = 99;
            } else if (ints[i] % 3 == 0) {
                no3or5ints[i] = 100;
            } else {
                no3or5ints[i] = ints[i];
            }
        }
        return no3or5ints;
    }

    //Task 8
    public static Boolean isPrime(int num){
        for (int i = 2; i < num - 1; i++) {
            if(num % i == 0) return false;
        } return true;
    }
    public static int countPrimes(int[] nums){
        int count = 0;
        for (int num : nums) {
            if(num > 1 & isPrime(num)) count++;
        } return count;
    }
}
