import java.util.Scanner;

public class TicTacToe {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
         
      Board board = new Board(); //Import class
      int row, col = 0;
      
      while (true) {   //While loop that runs until there is either a win or board is full
         board.print();
         while (true) { //While loop that runs until a valid row and column is entered
            System.out.print ("Enter row and column numbers:"); //needs changed 
            
            row = input.nextInt() - 1; //Index starts at 0, so we need to subtract 1 to account for this
            col = 3*(input.nextInt()-1); //Account for spaces in between dashes, only valid columns are 0, 3, 6
            
            if (row < 0 || col < 0 || row > 2 || col > 6) {
               System.out.println ("Incorrect cell. Try again!");
            } else if (board.isTaken(row, col)) {
               System.out.println ("Incorrect cell. Try again!");
            } else {
               break;
            }
         }
         board.setRowCol(row, col);
          
         //Checking for win
         if (board.isWin()) {
            board.setRowCol(row,col);
            board.print();
            break;
         }
         
         //Checking for full board
         if (board.isFull()) {
            board.setRowCol (row,col);
            board.print();
            break;
         }
         board.changePlayer();
      }
      System.out.println ("Goodbye!");
      input.close();
   }
}
