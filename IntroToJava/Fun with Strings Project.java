/**
 * Given two strings from user, perform manipulations and operations on them
 *
 * @author Gabe Azzarita
 * @version 20220907
 */
import java.util.Scanner;
import java.util.Random;

public class FunWithStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randGen = new Random();
        
        String longStr;
        String subStr;
        int startPosition;
        int charPosition; 
        String replacementStr;
        
        System.out.print ("Enter a long string: ");
        longStr = input.nextLine ();
        System.out.print ("Enter a substring: ");
        subStr = input.nextLine ();
        System.out.println ("Length of your string: " + (longStr.length()));
        System.out.println ("Length of your substring: " + (subStr.length()));
        startPosition = longStr.indexOf(subStr);
        System.out.println ("Starting position of your substring: " + startPosition);
        System.out.println ("String before your substring: " + longStr.substring(0, startPosition));
        System.out.println ("String after your substring: " + longStr.substring(startPosition + subStr.length()));
        System.out.print ("Enter a position between 0 and " + (longStr.length()-1) + ": ");
        charPosition = input.nextInt();
        System.out.print ("The character at position " + charPosition + " is " + longStr.charAt(charPosition));
    }
}
