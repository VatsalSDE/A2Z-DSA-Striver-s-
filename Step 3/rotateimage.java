public class rotateimage {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;
        int m=matrix[0].length;

        // steps to do this are like 
        // transpose 
        // reverse each rows and we have required rotated 90 degrees matrix 

        // Transposing the matrix
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                // swap matrix[i][j] and matrix[j][i]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // now reversing the each row 
        for(int i=0;i<n;i++){
            int left=0;
            int right=m-1;
            while(left<right){
                // swap matrix[i][left] and matrix[i][right]
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;

                left++;
                right--;
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
