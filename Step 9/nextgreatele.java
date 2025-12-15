import java.util.Stack;

public class nextgreatele {
    public static void main(String[] args) {
        int[] arr = {6,0,8,1,3};

        int n=arr.length;
        int[] nge = new int[n];

        // bruteforce approach

        // for(int i=0;i<n;i++){
        //     nge[i]=-1;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>arr[i]){
        //             nge[i]=arr[j];
        //             break;
        //         }
        //     }
        // }

        // optimal approach is 
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }

        System.out.println("The resultant of next greater element is ");
        for (int i : nge) {
            System.out.print(i + " ");
        }
    }
}
