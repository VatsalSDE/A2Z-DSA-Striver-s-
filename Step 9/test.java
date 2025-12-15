public class test {
    public static void main(String[] args) {
        char[][] matrix={{'1','0','1','0'},{'1','1','0','1'},{'1','0','0','1'}};

        int n=matrix.length;
        int m=matrix[0].length;

        int[][] newm=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                newm[i][j]=(int)(matrix[i][j])-(int)('0');
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(newm[i][j]+" ");
            }
            System.out.println();
        }

    }
}
