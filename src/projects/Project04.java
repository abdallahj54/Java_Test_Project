package projects;

import utilities.RandomNumberGenerator;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1-----\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Hey User, please enter a string: ");
        String str = input.nextLine();

        if (str.length() < 8){
            System.out.println("This String does not have 8 characters");
        }
        else {
            System.out.println(str.substring(str.length()-4) + (str.substring(4, str.length()-4)) + (str.substring(0, 4)));
        }


        System.out.println("\n-----TASK 2-----\n");

        System.out.println("Hey User, please enter a sentence: ");
        String str1 = input.nextLine();

        if (str1.contains(" ")) {
            System.out.println(str1.substring(str1.lastIndexOf(" ") +1) +str1.substring(str1.indexOf(" ") , str1.lastIndexOf(" ") +1)  + str1.substring(0, str1.indexOf(" ")) ) ;
        }
        else {
            System.out.println("This sentence does not have 2 or more words to swap");
        }


        System.out.println("\n-----TASK 3-----\n");

        String str2 = "These books are so stupid";
        str2 = str2.replace("stupid", "nice");

        System.out.println(str2);

        String str3 = "I like idiot behaviors";
        str3 = str3.replace("idiot", "nice");

        System.out.println(str3);

        String str4 = "I had some stupid t-shirts in the past and also some idiot look shoes";
        str4 = str4.replace("stupid", "nice");
        str4 = str4.replace("idiot", "nice");

        System.out.println(str4);

        System.out.println("\n-----TASK 4-----\n");

        System.out.println("Hey User, please enter your name:");
        String str5 = input.nextLine();

        if (str5.length() < 2) {
            System.out.println("Invalid Input");
        } else if (str5.length() % 2 == 0) {
            System.out.println(str5.substring(str5.length() / 2 -1, str5.length() / 2 + 1));
        } else {
            System.out.println(str5.substring(str5.length() / 2 -1, str5.length() / 2));
        }


        System.out.println("\n-----TASK 5-----\n");

        System.out.println("Hey User, please enter a country: ");
        String str6 = input.nextLine();

        if (str6.length() < 5) {
            System.out.println("Invalid Input");
        } else if (str6.length() >= 5) {
            System.out.println(str6.substring(2, str6.length()-2));
        }


        System.out.println("\n-----Task 6-----\n");
        System.out.println("Hey user, Please enter your address ");
        String str7 = input.nextLine();

        System.out.println(str7.replace('a','*' ).replace('A', '*')
                .replace('e', '#').replace('E', '#')
                .replace('i', '+').replace('I','+')
                .replace('u', '$').replace('U', '$')
                .replace('o', '@').replace('O', '@'));


        System.out.println("\n-----TASK 7-----\n");

        int num1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int num2 = RandomNumberGenerator.getARandomNumber(0, 25);

        String s = " ";

        for (int i = Math.min(num1,num2); i < Math.max(num1,num2); i++) {
            if(i % 5 != 0){
                s += i + "-";
            }
        }
        System.out.println(s.substring(0, s.length()-1));


        System.out.println("\n-----TASK 8-----\n");

        int counter = 1;

        System.out.println("Hey user, Please enter a sentence ");
        String sen1 = input.nextLine();

        for (int i = 0; i < sen1.length() ; i++) {
            if(sen1.charAt(i) == ' '){
                counter += 1;
            }}
        if (!sen1.contains(" ")) {
            System.out.println("This sentence does not have multiple words");
        }else
            System.out.println("This sentence has " + counter + " words");


        System.out.println("\n-----TASK 9-----\n");

        int num;
        System.out.println("Hey user, Please enter a positive number ");
        num = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= num ; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("FooBar");
            } else if (i % 2 == 0) {
                System.out.println("Foo");
            } else if (i % 3 == 0) {
                System.out.println("Bar");
            } else {
                System.out.println(i);
            }
        }


        System.out.println("\n-----TASK 10-----\n");

        System.out.println("Hey user, Please enter a word");
        String word = input.nextLine(), palindrome = "";

        if (word.length() < 1) {
            System.out.println("This word does not have 1 or more characters");
        }
        for (int i = word.length()-1; i >= 0 ; i--) {
            palindrome += word.charAt(i);
        } if (palindrome.toLowerCase().equals(word.toLowerCase())) {
            System.out.println("This word is a Palindrome");
        }else {
            System.out.println("This word is not a Palindrome");
        }


        System.out.println("\n-----TASK 11-----\n");

        System.out.println("Please enter a String");
        String str8 = input.nextLine();
        int countA = 0;

        if (str8.length() < 1) {
            System.out.println("This sentence does not have any characters");
        }
        for (int i = 0; i < str8.length(); i++) {
            if (str8.toLowerCase().charAt(i) == 'a') {
                countA+= 1;
            }
        }
        System.out.println("This sentence has " + countA + " a or A letters.");
    }
}
