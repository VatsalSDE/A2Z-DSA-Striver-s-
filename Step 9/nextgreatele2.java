import java.util.Stack;

public class nextgreatele2 {
    public static void main(String[] args) {
        int[] arr ={2,10,12,1,11};
        int n=arr.length;

        int[]nge=new int[n];

        // Bruteforce Approach
        // for(int i=0;i<n;i++){
        //     nge[i]=-1;
        //     for(int j=i+1;j<i+n-1;j++){
        //         if(arr[j%n]>arr[i]){
        //             nge[i]=arr[j%n];
        //             break;
        //         }
        //     }
        // }

        // Optimal Approach Using Monotonic Stack
        Stack<Integer> st=new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            while(!st.empty() && st.peek()<=arr[i%n]){
                st.pop();
            }
            if(i<n){
                nge[i]=st.empty()?-1:st.peek();
            }
            st.push(arr[i%n]);
        }

        System.out.println("The resultant of next greater element in circular array is ");
        for (int i : nge) {
            System.out.print(i + " ");
        }
    }
}
