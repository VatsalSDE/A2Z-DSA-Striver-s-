public class wordsearch {
    private static boolean dfs(char[][] arr , int i , int j , int ind , String s){
        // base condition
        if(ind==s.length()){
            return true;
        }

        // now the condition for out of bound situations
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length||arr[i][j]!=s.charAt(ind)){
            return false;
        }

        // now we have to mark the visited cell as it can not visit again
        char temp=arr[i][j];
        arr[i][j]='#';

        // now applying the dfs and backtracking
        boolean flag = dfs(arr,i+1,j,ind+1,s) || dfs(arr,i-1,j,ind+1,s) || dfs(arr,i,j+1,ind+1,s) || dfs(arr,i,j-1,ind+1,s);

        // now again unmark the cell
        arr[i][j]=temp;

        return flag;
    }
    public static void main(String[] args) {
        char[][] arr= {{'A','N','S','Q'},{'S','O','L','R'},{'K','T','O','G'}};
        int n=arr.length;
        int m=arr[0].length;
        String s = "SORO";
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==s.charAt(0) && dfs(arr,i,j,0,s)){
                    flag=true;
                }
            }
        }
        if(flag==true){
            System.out.println("yes String is there and word search complete");
        }
        else{
            System.out.println("No String is not there");
        }
    }
}
