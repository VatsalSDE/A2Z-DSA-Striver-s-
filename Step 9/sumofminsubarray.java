import java.util.Stack;

public class sumofminsubarray {

    private static int[] findnse(int[] arr){
        int n=arr.length;
        int[] nse=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.empty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.empty()?n:st.peek();
            st.push(i);
        }
        return nse;
    }
    private static int[] findpse(int[] arr){
        int n=arr.length;
        int[] pse=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.empty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            pse[i]=st.empty()?-1:st.peek();
            st.push(i);
        }
        return pse;
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        int n=arr.length;

        // BRUTEFORCE METHOD
        // long sum=0;
        // int MOD = (int)1e9 + 7;

        // for(int i=0;i<n;i++){
        //     int min=arr[i];
        //     for(int j=i;j<n;j++){
        //         min=Math.min(min,arr[j]);
        //         sum=(sum+min)%MOD;
        //     }
        // }
        // System.out.println("The sum of minimum elements of all subarrays is "+(int)sum);

        //Optimal Method

        // Using the pse and nse method 
        // the main formula is left * right *value
        // left=i-pse[i];
        // right =nse[i]-i;

        int[] nse=findnse(arr);
        int[] pse=findpse(arr);
        long sum=0;
        int MOD = (int)1e9 + 7;
        for(int i=0;i<n;i++){
            long left=i - pse[i];
            long right=nse[i] - i;
            long value=arr[i];

            sum=(sum + (left * right % MOD) * value % MOD) % MOD;
        }
        System.out.println("The sum of minimum elements of all subarrays is "+(int)sum);
    }
}
