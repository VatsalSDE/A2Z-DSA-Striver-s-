import java.util.ArrayList;

public class spiralmatrix {
    public static void main(String[] args) {
        int[][] matrix={ { 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 },{ 13, 14, 15, 16 } };
        int n=matrix.length;
        int m=matrix[0].length;

        ArrayList<Integer> all = new ArrayList<>();
        // so we will print this in four steps 

        int minrow=0;
        int maxrow=n-1;
        int mincol=0;
        int maxcol=m-1;

        // now first traversing from left to right 
        while(minrow<=maxrow && mincol<=maxcol){
            // traversing from left to right 
            for(int j=mincol;j<=maxcol;j++){
                all.add(matrix[minrow][j]);
            }
            minrow++;

            // traversing from top to bottom
            for(int i=minrow;i<=maxrow;i++){
                all.add(matrix[i][maxcol]);
            }
            maxcol--;

            // travesring from right to left
            if(minrow<=maxrow){
                for(int j=maxcol;j>=mincol;j--){
                    all.add(matrix[maxrow][j]);
                }
                maxrow--;
            }
            // traversing from bottom to top
            if(mincol<=maxcol){
                for(int i=maxrow;i>=minrow;i--){
                    all.add(matrix[i][mincol]);
                }
                mincol++;
            }
        }
    }
}
