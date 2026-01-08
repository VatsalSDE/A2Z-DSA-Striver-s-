public class concatenation {
    //leetcode 1929 this is for extra 
    public static void main(String[] args) {
        int[] arr= {1,2,1};
        int n=arr.length;

        int[] ans = new int[2*n];

        for(int i=0;i<n;i++){
            ans[i]=arr[i];
            ans[i+n]=arr[i];
        }
        // print the ans array
        for(int i=0;i<2*n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
