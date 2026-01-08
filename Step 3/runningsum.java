public class runningsum {
    // this is leetcode 1480
    // done for more practice 
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;

        // now the answer array
        int[] ans = new int[n];
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            ans[i]=sum;
        }
        // print the ans array
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
