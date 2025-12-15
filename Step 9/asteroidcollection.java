import java.util.Stack;

public class asteroidcollection {
    public static void main(String[] args) {
        int[] arr ={3,-4};
        int n=arr.length;

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                st.push(arr[i]);
            }
            else{
                while(!st.empty() && st.peek()>0 && st.peek()<Math.abs(arr[i])){
                    st.pop();
                }
                if(!st.empty() && st.peek()==Math.abs(arr[i])){
                    st.pop();
                }
                else{
                    if(st.empty() || st.peek()<0){
                        st.push(arr[i]);
                    }
                }
            }
        }
        int m=st.size();
        int[] res=new int[m];
        for(int i=m-1;i>=0;i--){
            res[i]=st.pop();
        }
        System.out.println("The final state of asteroids after all collisions is ");
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
