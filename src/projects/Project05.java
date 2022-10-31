package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("---Task 1---");
        int[] numbers = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSort(numbers);


        System.out.println("\n---Task 2---");
        findGreatestAndSmallest(numbers);


        System.out.println("\n---Task 3---");
        int[] numbers2 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(numbers2);


        System.out.println("\n---Task 4---");
        findSecondGreatestAndSmallest(numbers2);


        System.out.println("\n---Task 5---");
        String[] words = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(words);


        System.out.println("\n---Task 6---");
        String[] objects = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(objects);
    }

    // Task 1
    public static void findGreatestAndSmallestWithSort(int[] numbers){

        Arrays.sort(numbers);
        if (numbers.length > 0){
            System.out.println("Smallest = " + numbers[0]);
            System.out.println("Greatest = " + numbers[numbers.length -1]);
        } else{
            System.out.println("Array is empty!");
        }
    }

    // Task 2
    public static void findGreatestAndSmallest(int[] numbers){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (max < n){
                max = n;
            }

            if(min > n){
                min = n;
            }
        }

        if (numbers.length > 0){
            System.out.println("Smallest = " + min);
            System.out.println("Greatest = " + max);
        } else{
            System.out.println("Array is empty!");
        }
    }

    // Task 3
    public static void findSecondGreatestAndSmallestWithSort(int[] arrayName){
        Arrays.sort(arrayName);
        System.out.println("Second Smallest = " + arrayName[2]);
        System.out.println("Second Greatest = " + arrayName[arrayName.length - 3]);
    }

    // Task 4
    public static int findMax(int[] numbers){
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            if(n > max) max = n;
        }
        return max;
    }
    public static int findMin(int[] numbers){
        int min = Integer.MAX_VALUE;
        for (int n : numbers) {
            if(n < min) min = n;
        }
        return min;
    }
    public static void findSecondGreatestAndSmallest(int[] numbers){
        int secondMax = Integer.MIN_VALUE, secondMin = Integer.MAX_VALUE;

        for (int n : numbers) {
            if(n > secondMax && n < findMax(numbers)){
                secondMax = n;
            }

            if(n < secondMin && n > findMin(numbers)){
                secondMin = n;
            }
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }

    // Task 5
    public static void findDuplicatedElementsInAnArray(String[] arrayName){
        ArrayList<String> duplicates = new ArrayList<>();
        for (int i = 0; i < arrayName.length; i++) {
            for (int j = 1; j < arrayName.length; j++) {
                if(arrayName[i] == arrayName[j] & i != j & !duplicates.contains(arrayName[i])){
                    duplicates.add(String.valueOf(arrayName[i]));
                }
            }
        }
        for (String duplicate: duplicates) {
            System.out.println(duplicate);
        }
    }

    // Task 6
    public static void findMostRepeatedElementInAnArray(String[] arrayName){
        ArrayList<String> duplicates = new ArrayList<>();
        for (int i = 0; i < arrayName.length; i++) {
            int count = 0;
            for (int j = 1; j < arrayName.length; j++) {
                if(arrayName[i] == arrayName[j] & i != j){
                    count++;
                } duplicates.add("" + count + arrayName[i]);
            }
        }
        Collections.sort(duplicates);
        System.out.println(duplicates.get(duplicates.size() - 1).substring(1));
    }

}
