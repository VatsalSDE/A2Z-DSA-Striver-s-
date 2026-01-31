public class setmatrixzero {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int n=matrix.length;
        int m=matrix[0].length;

        // Bruteforce
        // here we will take two boolean array for rows and columns 
        // boolean[] row = new boolean[n];
        // boolean[] col = new boolean[m];

        // // now we will mark the particluar row and column as true where matrix[i][j]==0

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(matrix[i][j]==0){
        //             row[i]=true;
        //             col[j]=true;
        //         }
        //     }
        // }

        // // now we will mark the elements 0

        // // first setting the rows 
        // for(int i=0;i<n;i++){
        //     if(row[i]){
        //         for(int j=0;j<m;j++){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }
        // // now setting the columns
        // for(int j=0;j<m;j++){
        //     if(col[j]){
        //         for(int i=0;i<n;i++){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }

        // // printing the matrix
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // Optimal Solution using two variables 
        boolean firstrow=false;
        boolean firstcol=false;

        // checking for the first row 
        for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                firstrow=true;
                break;
            }
        }

        // check for the first column
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                firstcol=true;
                break;
            }
        }

        // now for the rest of the matrix
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        // now setting the zeros
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        // now setting the first row
        if(firstrow){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        // now setting the first column
        if(firstcol){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        // printing the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
