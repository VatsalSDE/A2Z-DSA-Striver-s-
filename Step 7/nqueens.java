import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nqueens {
    private static boolean isSafe(char[][] board , int row , int col){
        int n=board.length;

        // first checking the row on the left side that is 
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }

        // now checking the upper left diagonal 
        for(int i=row-1 , j=col-1 ; i>=0 && j>=0 ; i-- , j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // now checking the lower left diagonal 
        for(int i=row+1, j=col-1 ; i<n && j>=0 ; i++,j--){
            if(board[i][j]=='Q'){
                return false ;
            }
        }

        return true;
    }
    private static List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    private static void solvequeens(char[][] board , int col , List<List<String>> ans){
        int n=board.length;

        // base case for this problem 
        if(col==n){
            ans.add(construct(board)); // -->> here we have made the construct function so it will convert the 2d array into the array list 
            return;
        }

        // now we need to traverse in every row of the column to place the queen position
        for(int row=0;row<n;row++){
            if(isSafe(board , row, col)){
                board[row][col]='Q'; // -->> here we are placing the queen in the position 
                solvequeens(board,col+1,ans); // -->> now we will move to the next column 
                board[row][col]='.'; // -->> here we are backtracking and removing the queen from the position
            }  //-->> here we have made the is safe function that will check that is the positioning of the queen is safe or not 
        }
    }
    public static void main(String[] args) {
        int n=4;
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solvequeens(board,0,ans);

        System.out.println(ans);
    }
}
