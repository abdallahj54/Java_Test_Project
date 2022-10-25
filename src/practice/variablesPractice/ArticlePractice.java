package practice.variablesPractice;

public class ArticlePractice {
    public static void main(String[] args) {
        String myName = "Abdallah";
        String myLastName = "Jaber";
        String myFullName = myName + " Jaber";
        String myHobby1 = "Football";
        String myHobby2 = "Call of Duty";
        String myFavoriteTeam = "Chicago Bears";
        int myAge = 28;
        int birthYear = 1994;
        int yearsWatching = 20;
        String myEmployer = "Credit Union 1";
        String jobTitle = "Mortgage Processing Manager";
        int numberOfEmployees = 8;
        double MonthlyIncome = 123.456;
        char dollarSign = '$';
        boolean isRich = false;


        System.out.println("\tMy name is " + myName + " and I am " + myAge + " years old" +
                ". \nMy favorite hobby is to watch " + myHobby1 + "."
                + " I have been watching " + myHobby1 + " for " + yearsWatching + " years and my favorite team is the "
                + myFavoriteTeam + "."
                + " \nI work for " + myEmployer + " and I am the " + jobTitle + "." +
                " I manage a team of " + numberOfEmployees + " people that work from the office and at home.");

        System.out.println();

        System.out.println("\tMy full name is " + myFullName +
                ". My hobbies are watching " + myHobby1 + " and playing " + myHobby2 + "." + "\nI was born in " + birthYear + "." +
                " My monthly income is " + dollarSign + MonthlyIncome + ".");
    }
}
