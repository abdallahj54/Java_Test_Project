package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise10_CountCharactersUsingScanner {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and count how many 'l' letters exist in the name

        Lionel -> 2
        Leo    -> 1
        lucy   -> 1
         */

        String name = ScannerHelper.getAName();

        int countL = 0;

        for (int i = 0; i <= name.length() - 1; i++) {
            if(name.charAt(i) == 'l' || name.charAt(i) == 'L') countL++;
        }

        System.out.println(countL);
    }
}
