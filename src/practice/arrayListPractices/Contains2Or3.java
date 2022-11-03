package practice.arrayListPractices;

import utilities.RandomNumberGenerator;

import java.util.ArrayList;

public class Contains2Or3 {
    public static void main(String[] args) {
        System.out.println("---Task 1---");
        System.out.println(contains2Or3());

        System.out.println("\n---Task 2---");
        System.out.println(contains7Or13());
    }

    /*
    Task 1
    Create a public static method which will generate 5 numbers between 1 and 10 (both included)
    then store all of them inside an ArrayList and return true if is it containing "2" or "3"
     */
    public static boolean contains2Or3(){
        ArrayList<Integer> randoms = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            randoms.add(RandomNumberGenerator.getARandomNumber(1, 10));
        }
        System.out.println(randoms);
        return randoms.contains(2) || randoms.contains(3);
    }

    /*
    Task2
    Create a public static method which will generate 7 numbers between -20 and 20 (both included)
    then store all of them inside an ArrayList and return true if is it containing "7" or "13"
     */
    public static boolean contains7Or13(){
        ArrayList<Integer> randoms = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            randoms.add(RandomNumberGenerator.getARandomNumber(-20, 20));
        }
        System.out.println(randoms);
        return randoms.contains(7) || randoms.contains(13);
    }

}
