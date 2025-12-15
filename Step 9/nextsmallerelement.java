import java.util.Stack;

public class nextsmallerelement {
    public static void main(String[] args) {
        int[] arr={4,8,5,2,25};
        int n=arr.length;

        int[] nse=new int[n];

        // BruteForce Method
        // for(int i=0;i<n;i++){
        //     nse[i]=-1;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]<arr[i]){
        //             nse[i]=arr[j];
        //             break;
        //         }
        //     }
        // }

        // Optimal Method

        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.empty()){
                nse[i]=-1;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(arr[i]);
        }

        System.out.println("The final resultant of next smaller element is");
        for (int i : nse) {
            System.out.print(i + " ");
        }
    }
}
