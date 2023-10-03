/**
 * DESCRIPTION OF PROGRAM HERE
 *
 * @author Gabe Azzarita
 * @version 20220921
 */
import java.util.Scanner;
import java.util.Random;

public class GuessANumber {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       
      // Creating variables
      int seed;
      int guessNum;
      int randNum; 
      int attempts = 1;
        
      // Selecting seed and creating function for random number based on that seed
      System.out.print ("Enter a random seed: ");
      seed = input.nextInt();
      Random rnd = new Random(seed);
      randNum = rnd.nextInt(200)+1;
        
      System.out.print ("Enter a guess between 1 and 200: ");
      guessNum = input.nextInt();
      while (guessNum != randNum) {
         if ((guessNum < 0) || (guessNum > 200)) {
            System.out.println ("Your guess is out of range.  Pick a number between 1 and 200.");
            if (guessNum <0) {
               System.out.println ("Your guess was too low - try again.");   
            } else {
               System.out.println ("Your guess was too high - try again.");
            }
            System.out.println ();
            System.out.print ("Enter a guess between 1 and 200: ");
            guessNum = input.nextInt();
         } else if (guessNum != randNum) {
            if (guessNum < randNum) {
               System.out.println ("Your guess was too low - try again.");
            }
            else {
               System.out.println ("Your guess was too high - try again.");  
            }
            System.out.println ();
            System.out.print ("Enter a guess between 1 and 200: ");
            guessNum = input.nextInt();            
         }   
            attempts += 1;
      }
      System.out.println ("Congratulations!  Your guess was correct!");
      System.out.println ();
      System.out.println ("I had chosen " + randNum + " as the target number.");
      System.out.println ("You guessed it in " + attempts + " tries.");   
      if (attempts == 1) {
         System.out.println ("That was impossible!");
      } else if (attempts > 1 && attempts < 4) {
         System.out.println ("You're pretty lucky!");
      } else if (attempts >= 4 && attempts < 8) {
         System.out.println ("Not bad, not bad...");
      } else if (attempts == 8) {
         System.out.println ("That was not very impressive.");
      } else if (attempts > 8 && attempts < 11) {
         System.out.println ("Are you having any fun at all?");
      } else if (attempts >= 11)
         System.out.println ("Maybe you should play something else.");
    }
}