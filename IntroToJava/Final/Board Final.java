public class Board {
	
    private char[][] board = new char [3][9]; 
    private char currentPlayer;

    //Class constructor for the class, sets currentPlayer as x and fills array with dashes and spaces as needed
    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {  
                if (j == 0 || j == 3 || j == 6) {
                    this.board[i][j] = '-';
                } else {
                    this.board[i][j] = ' ';
                }   
            }
        }
        this.currentPlayer = 'x'; 
    }
	
    //Method that prints board and prints part of concluding statements if there is a winner
    public void print() {
        System.out.println ("Current Board");
        System.out.println ("-------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print (this.board[i][j]);
            }
            System.out.println();
        }
        if (isWin()) {
            System.out.println (this.currentPlayer + " player wins!");
        } else if (isFull()) {    
            System.out.println ("There is no winner!");   
        } else {
            System.out.print (this.currentPlayer + " player: ");
        }
    }
	
    //Checks if board is full of characters other than dashes
    public boolean isFull() {
        boolean isFull = true;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 9; j+= 3) {
                if (this.board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    //Added this method myself to make main method simpler, checks if spot is taken by character other than dash
    public boolean isTaken (int row, int col) {
        if (this.board[row][col] != '-') {
            return true;
        } else {
            return false;
        }
    }
	
    //This method checks if there is a winner
    public boolean isWin() {
        if (checkRows() || checkColumns() || checkDiagonals()) {
            return true;
        } else {
            return false;
        }
    }
    
    //Method checks if any row is occupied by same character other than dash
    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if ((this.board[i][0] == (this.board[i][3])) && (this.board[i][3] == (this.board[i][6]))) {
                if (this.board[i][0] != '-') { //Make sure that three in a row are not dashes
                    return true;    
                } else {
                    return false;
                }
            }
        }
        return false;
    }
	 
    //Method checks if any column is occupied by same character other than dash
    private boolean checkColumns() {
        for (int j = 0; j < 9; j += 3) {
            if ((this.board[0][j] == (this.board[1][j])) && (this.board[1][j] == (this.board[2][j]))) {
                if (this.board[0][j] != '-') { //Make sure three in a column are not dashes
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;     
    }
	
    //Method checks if any diagonal is occupied by same character other than dashes
    private boolean checkDiagonals() {
        if (this.board[1][3] != '-') {
            if ((this.board[0][0] == this.board[1][3]) && (this.board[1][3] == this.board[2][6])) {
                if (this.board[1][3] != '-') { //Make sure three in a diagonal are not dashes 
                    return true;
                } else {
                    return false;
                }
            } else if ((this.board[0][6] == this.board[1][3]) && (this.board[1][3] == this.board[2][0])){
                if (this.board[1][1] != '-') { //Make sure three in a diagonal are not dashes
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return false;
    }
     
    //Method that changes the current player
    public void changePlayer() {
        if (this.currentPlayer == 'x') {
            this.currentPlayer = 'o';
        } else {
            this.currentPlayer = 'x';
        }
    }

    //Method that sets desired row and column to currentPlayer's value
    public boolean setRowCol(int row, int col) {
        if (this.board[row][col] == '-'){
            this.board [row][col] = this.currentPlayer;
            return true;
        } else {
            return false;
        }
    }
}
