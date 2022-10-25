package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println("-----Task 1-----\n");

        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);

        System.out.println(Arrays.toString(numbers));


        System.out.println("\n-----Task 2-----\n");

        String[] letters = new String[5];
        letters[1] = "abc";
        letters[4] = "xyz";

        System.out.println(letters[3]);
        System.out.println(letters[0]);
        System.out.println(letters[4]);

        System.out.println(Arrays.toString(letters));


        System.out.println("\n-----Task 3-----\n");

        int[] numbers1 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numbers1));
        Arrays.sort(numbers1);

        System.out.println(Arrays.toString(numbers1));


        System.out.println("\n-----Task 4-----\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);

        System.out.println(Arrays.toString(countries));


        System.out.println("\n-----Task 5-----\n");

        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(cartoonDogs));

        boolean hasPluto = false;
        for (String cartoonDog : cartoonDogs) {
            if (cartoonDog.equals("Pluto")) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);


        System.out.println("\n-----Task 6-----\n");

        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));

        boolean hasGarfield = false;
        boolean hasFelix = false;

        for (String cartoonCat : cartoonCats) {
            if (cartoonCat.equals("Garfield")) {
                hasGarfield = true;
                if (cartoonCat.equals("Felix")) {
                    hasFelix = true;
                }
                break;
            }
        }
        System.out.println(hasGarfield && hasFelix);


        System.out.println("\n-----Task 7-----\n");

        double[] decimals = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(decimals));

        for (double element : decimals) {
            System.out.println(element);
        }


        System.out.println("\n-----Task 8-----\n");
        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        int lettersC = 0;
        int upper = 0;
        int lower = 0;
        int digits = 0;
        int special = 0;

        System.out.println(Arrays.toString(characters));

        for (Character character : characters) {
            if (Character.isLetter(character)){
                lettersC++;
                if (Character.isUpperCase(character)) upper++;
                else if (Character.isLowerCase(character)) lower++;
            }
            else if (Character.isDigit(character)) digits++;
            else special++;
        }
        System.out.println("Letters = " + lettersC +
                "\nUppercase letter = " + upper +
                "\nLowercase letters = " + lower +
                "\nDigits = " + digits +
                "\nSpecials characters = " + special);


        System.out.println("\n-----Task 9-----\n");

        String[] objects = {"Pen", "notebook", "Book" , "paper", "bag", "pencil", "Ruler"};
        int upperCase = 0;
        int lowerCase = 0;
        int bOrP = 0;
        int bookOrPen = 0;

        System.out.println(Arrays.toString(objects));

        for (String object: objects){
            if (Character.isUpperCase(object.charAt(0))) upperCase++;
            if (Character.isLowerCase(object.charAt(0))) lowerCase++;
            if (object.toLowerCase().charAt(0) == 'p' || object.toLowerCase().charAt(0) == 'b') bOrP++;
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) bookOrPen++;
        }
        System.out.println("Elements stars with uppercase = " + upperCase +
                "\nElements stars with lowercase = " + lowerCase +
                "\nElements stars with B or P = " + bOrP +
                "\nElements having \"book\" or \"pen\" = " + bookOrPen);


        System.out.println("\n-----Task 10-----\n");

        int[] num10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int greaterThan10 = 0;
        int lessThan10 = 0;
        int equalsTo10 = 0;

        System.out.println(Arrays.toString(num10));

        for (Integer numbers10: num10){
            if (numbers10 > 10) greaterThan10++;
            else if (numbers10 < 10) lessThan10++;
            else equalsTo10++;
        }
        System.out.println("Elements that are more than 10 = " + greaterThan10 +
                "\nElements that are less than 10 = " + lessThan10 +
                "\nElements that are 10 = " + equalsTo10);


        System.out.println("\n-----Task 11-----\n");

        int[] num11 = {5, 8, 13, 1, 2};
        int[] num12 = {9, 3, 67, 1, 0};

        System.out.println("1st array is = " + Arrays.toString(num11));
        System.out.println("2nd array is = " + Arrays.toString(num12));

        int[] maxNumbers = new int[5];

        maxNumbers[0] = Math.max(num11[0], num12[0]);
        maxNumbers[1] = Math.max(num11[1], num12[1]);
        maxNumbers[2] = Math.max(num11[2], num12[2]);
        maxNumbers[3] = Math.max(num11[3], num12[3]);
        maxNumbers[4] = Math.max(num11[4], num12[4]);

        System.out.println(Arrays.toString(maxNumbers));
    }
}