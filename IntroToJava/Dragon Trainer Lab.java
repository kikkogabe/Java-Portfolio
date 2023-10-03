/**
 * Dragon Trainer game where user picks a dragon, cpu randomly picks one, and the winner is decided based on
 * predetermined rules. This will repeat for how many matches the user chooses and at the end we have a 
 * breakdown of the # of wins, loses, and ties and we determine a final winner.
 * 
 * @author Gabe Azzarita
 * @version 10/19/22
 */
import java.util.Random;
import java.util.Scanner;

public class DragonTrainers {
    
    private static final String[] DRAGONS = { "Plant", "Water", "Fire" };

    public static int getNumberOfMatches(Scanner keyboard) {
      // Get the number of matches that will be played from user and make sure it's > 1
      int matchesPlayed;
      System.out.print ("How many matches will we play? ");
      matchesPlayed = keyboard.nextInt();
      while (matchesPlayed < 1) {
         System.out.println ("ERROR - number of matches must be positive!");
         System.out.print ("How many matches will we play? ");
         matchesPlayed = keyboard.nextInt();
      }
      String buffer;
      buffer = keyboard.nextLine();
      return matchesPlayed;
    }

    public static String promptForDragon(Scanner keyboard) {
      // Get the selection of dragon from user and make sure it's not blank
      String dragonType;
      System.out.print ("Please select a dragon [Plant/Water/Fire]: ");
      dragonType = keyboard.nextLine();
      while (dragonType.length() == 0) {
         System.out.println("ERROR - Dragon prompt cannot be empty.");
         System.out.print ("Please select a dragon [Plant/Water/Fire]: ");
         dragonType = keyboard.nextLine();
      }
      return dragonType;
    }

    public static int dragonToNumber(char dChar) {
        // Convert the character entered to the corresponding dragon # by comparing the  
        // character with 'P','W','F' 
        int dNum = -1;
        char plantChar = 'P';
        char waterChar = 'W';
        char fireChar = 'F';
        if (dChar == plantChar) {
            dNum = 0;
        } 
        if (dChar == waterChar) {
            dNum = 1;
        }
        if (dChar == fireChar) {
            dNum = 2;
        }
        return dNum;
    }

    public static int determineWinner(int playerDragon, int cpuDragon) {
        // Determine the winner by comparing the user's dragon with the cpu's
        // Score is assigned with -1 if cpu wins, 1 if user wins, and 0 if tie
        int score = 0;
        if ((playerDragon == 0) && (cpuDragon == 2)) {
            score = -1;
        }
        if ((playerDragon == 1) && (cpuDragon == 0)) {
            score = -1;
        }
        if ((playerDragon == 2) && (cpuDragon == 1)) {
            score = -1;
        }
        if ((playerDragon == 2) && (cpuDragon == 0)) {
            score = 1;
        }
        if ((playerDragon == 0) && (cpuDragon == 1)) {
            score = 1;
        }
        if ((playerDragon == 1) && (cpuDragon == 2)) {
            score = 1;
        }
        if (playerDragon == cpuDragon) {
            score = 0;
        }
        return score;
    }

    public static void displayMatchResult(int playerDragon, int cpuDragon, int winner) {
        // Display match result based on winner and which dragons were played 
        if (winner == 0){
            System.out.println ("A Tie!");
        }
        if (winner == 1) {
            if ((playerDragon == 2) && (cpuDragon == 0)) {
                System.out.println ("Fire defeats Plant - you win!");
            }
            if ((playerDragon == 0) && (cpuDragon == 1)) {
                System.out.println ("Plant defeats Water - you win!");
            }
            if ((playerDragon == 1) && (cpuDragon == 2)) {
                System.out.println ("Water defeats Fire - you win!");
            }            
        }
        if (winner == -1) {
            if ((playerDragon == 0) && (cpuDragon == 2)) {
                System.out.println ("Fire defeats Plant - you lose!");
            }
            if ((playerDragon == 1) && (cpuDragon == 0)) {
                System.out.println ("Plant defeats Water - you lose!");
            }
            if ((playerDragon == 2) && (cpuDragon == 1)) {
                System.out.println ("Water defeats Fire - you lose!");
            }            
        }
    }       

    public static void displayFinalResult(int wins, int losses, int ties) {
        // Display the final stats of the tournament, winner is based on who won more matches
        System.out.println ("The tournament is over!");
        System.out.println ("We tied " + ties + " matches.");
        System.out.println ("I won " + losses + " matches.");
        System.out.println ("You won " + wins + " matches.");
        if (losses == wins) {
            System.out.println ("Neither of us can claim victory here!");
        } else if (losses > wins) {
            System.out.println ("I am the winner!");
        } else {
            System.out.println ("You are the winner!");
        }
    }

    public static void main(String[] args) {
        // Prompt for a random number seed
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a random seed: ");
        int seed = Integer.parseInt(keyboard.nextLine());
        // Create a Random instance with the seed
        Random rnd = new Random(seed);
        // Prompt for number of matches to play
        int totalMatches = getNumberOfMatches(keyboard);

        // Start with wins, losses and ties at 0.
        // Repeat until all matches have been played (use the sum of the
        // results so we don't need another variable)
        int wins = 0, losses = 0, ties = 0;
        while ((wins + losses + ties) < totalMatches) {
            // Ask the user for a dragon to use
            String input = promptForDragon(keyboard);

            // Get the first character of the user's input as an uppercase value
            char dChar = input.toUpperCase().charAt(0);

            // Convert the user's input to an index for the DRAGONS array
            int playerDragon = dragonToNumber(dChar);

            // Generate a choice between 0 and 2 for the computer
            int cpuDragon = rnd.nextInt(3);

            // Display the results
            System.out.println("I chose: " + DRAGONS[cpuDragon] + " dragon.");

            // If the player didn't enter a valid choice, print out an error
            // message and increase the number of losses
            if (playerDragon == -1) {
                System.out.println("You don't have the " + input + " dragon.");
                System.out.println("So no dragon fights for you.");
                System.out.println("I win by default!");
                losses++;
            } else {
                // Print out the player's choice
                System.out.println("You chose: " + DRAGONS[playerDragon] + " dragon.");
                // Determine who won the match.
                int winner = determineWinner(playerDragon, cpuDragon);
                // Display the result of the match.
                displayMatchResult(playerDragon, cpuDragon, winner);

                // Increase the count of wins, losses or ties according to
                // who won the match.
                if (winner > 0) {
                    wins++;
                } else if (winner < 0) {
                    losses++;
                } else {
                    ties++;
                }
            }
            System.out.println();
        }
        // Display the final summary of the match to the screen
        displayFinalResult(wins, losses, ties);

        // Closing scanner
        keyboard.close();
    }

}