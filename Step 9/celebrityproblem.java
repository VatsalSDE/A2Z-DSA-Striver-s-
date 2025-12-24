public class celebrityproblem {
    public static void main(String[] args) {
        int[][] mat={ {0, 1, 1, 0}, {0, 0, 0, 0}, {1, 1, 0, 0}, {0, 1, 1, 0} };
        int n=mat.length;

        // Bruteforce 
        // int[] knowme=new int[n];
        // int[] iknow=new int[n];

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(mat[i][j]==1){
        //             knowme[j]++;
        //             iknow[i]++;
        //         }
        //     }
        // }

        // boolean flag=false;
        // for(int i=0;i<n;i++){
        //     if(knowme[i]==n-1 && iknow[i]==0){
        //         flag=true;
        //         System.out.println("The celebrity is person "+i);
        //         break;
        //     }
        // }
        // if(flag==false){
        //     System.out.println("There is no celebrity "+" -1 ");
        // }

        // Optimized 
        int top=0;
        int down=n-1;

        while(top<down){
            if(mat[top][down]==1){
                top=top+1;
            }
            else if(mat[down][top]==1){
                down=down-1;
            }
            else{
                top=top+1;
                down=down-1;
            }
        }

        if(top>down) System.out.println(-1);
        boolean flag=false;
        if(top==down){
            for(int i=0;i<n;i++){
                if(i==top){
                    continue;
                }
                else if(mat[top][i]==0 && mat[i][top]==1){
                    continue;
                }
                else{
                    
                    flag=true;
                    break;
                }
            }
        }
        if(flag==true){
            System.out.println(-1);
        }
        else{
            System.out.println(top);
        }
    }
}
