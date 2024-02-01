public class NQueen{
    public static void nQueen(char[][] board, int row){
        //Base Case
        if(row == board.length){
            printBoard(board);
            return;
        }
        //Recursion
        for(int i = 0; i < board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                nQueen(board,row+1);
                board[row][i] = '.';
            }
        }
    }
    
    public static boolean isSafe(char[][] board, int row, int col ){
        //checking above
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //checking left
        for(int j = col-1; j >= 0; j--){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //checking diagonally left
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //checking diagonally right
        for(int i = row-1, j = col+1; i >= 0 && j <board.length; i--,j++){
            if(board[i][j] == 'Q'){
            return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][] board){
        System.out.println("========New Board========");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                 System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 4;
        char[][] board = new char[n][n];
        
        //initialize
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = '.';
            }
        }
        
        nQueen(board, 0);
    }
}