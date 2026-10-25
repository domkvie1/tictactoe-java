import java.util.*;

public class TicTacToe{
    static char[][] board = new char[3][3];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                board[row][col] = ' ';
            }
        }
        char current = 'X';
        int moves = 0;
        while(true){
            printBoard(board);
            System.out.println("Current Player: " + current);
            System.out.println("Select a row and Col to place your next move: ");
            if(!sc.hasNextInt()){
                sc.next();
                System.out.println("Numbers only.");
                continue;
            }
            int row = sc.nextInt();
            if(!sc.hasNextInt()){
                sc.next();
                System.out.println("Numbers only.");
                continue;
            }
            int col = sc.nextInt();
            if(row >= 0 && col >= 0 && row < 3 && col < 3 && board[row][col] == ' '){
                board[row][col] = current;
                moves++; 

                if(checkWin(current)){
                    printBoard(board);
                    System.out.println(current + " wins!");
                    break;
                }
                if(moves == 9){
                    printBoard(board);
                    System.out.println("Draw!");
                    break;
                }
                current = (current == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move, try again.");
            }
           
        }
    }
    static boolean checkWin(char p){
        for(int r = 0; r < 3; r++){ 
            if(board[r][0] == p && board[r][1] == p && board[r][2] == p) return true;
        }    
        for(int c = 0; c < 3; c++){
            if(board[0][c] == p && board[1][c] == p && board[2][c] == p) return true;
        }
        if(board[0][0] == p && board[1][1] == p && board[2][2] == p)return true;
        if(board[0][2] == p && board[1][1] == p && board[2][0] == p)return true;
        return false;
    }
    static void printBoard(char[][] board) {
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(board[row][col]);
                if(col != 2) System.out.print(" | ");
            }
            System.out.println();
            if(row != 2) System.out.println("--+---+--");
        }
    }
}
