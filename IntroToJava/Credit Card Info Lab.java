/**
 * Checking the credit card number a user inputs, making sure its valid and outputting
 * the check digit and sum. 
 *
 * @author Gabe Azzarita
 * @version 20220926
 */
import java.util.Scanner;

public class LuhnAlgorithm {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      String creditCardNum;
      int length;
      
      System.out.print ("Enter a credit card number (enter a blank line to quit): ");
      creditCardNum = input.nextLine();
      length = creditCardNum.length();
      if (length == 0) {
         System.out.println ("Goodbye!");
      } else {
         while (length != 0){
            length = creditCardNum.length();
            if (length == 0) {
               System.out.println ("Goodbye!");
            } else if (length == 16) {
               long tempNum = Long.parseLong(creditCardNum);
               long lastDigit;
               int sum = 0;
               while (tempNum > 0) {
                  lastDigit = (tempNum % 10);
                  sum += lastDigit;
                  tempNum = (tempNum / 10);
               } 
               sum -= Character.getNumericValue(creditCardNum.charAt(length-1));
               System.out.println ("DEBUG: Sum is " + sum);
               System.out.println ("Check digit is: " + creditCardNum.charAt(length-1));
               System.out.println ();
               System.out.print ("Enter a credit card number (enter a blank line to quit): ");
               creditCardNum = input.nextLine();
            } else {
               System.out.println ("ERROR! Number MUST have exactly 16 digits.");
               System.out.println ();
               System.out.print ("Enter a credit card number (enter a blank line to quit): ");
               creditCardNum = input.nextLine();   
         
            }
         }
      }
      
    }
}