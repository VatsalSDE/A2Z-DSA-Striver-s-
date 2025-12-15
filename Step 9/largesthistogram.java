import java.util.Stack;

public class largesthistogram {

    private static int[] pse(int[] arr){
        int n=arr.length;
        int[] pres=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
            pres[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return pres;
    }
    
    private static int[] nse(int [] arr){
        int n=arr.length;
        int[] nexs=new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            nexs[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return nexs;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int n=arr.length;

        // Bruteforce Solution

        // int[] prevs=pse(arr);
        // int[] nexts=nse(arr);

        // int maxarea=0;

        // for(int i=0;i<n;i++){
        //     int width=nexts[i]-prevs[i]-1;
        //     int area =arr[i]*width;
        //     maxarea=Math.max(maxarea,area);    
        // }
        // System.out.println("Largest Histogram Area: "+maxarea);

        // Optimal Solution
        Stack<Integer> st = new Stack<>();
        int maxarea=0;

        for(int i=0;i<n;i++){
            while(!st.empty() && arr[st.peek()] > arr[i]){
                int height=st.peek();
                st.pop(); // to remove the elemnt because we have already stored it okk
                int nse=i;
                int pse=st.isEmpty()?-1:st.peek();
                int width=nse-pse-1;
                int area=arr[height]*width;
                maxarea=Math.max(maxarea,area);
            }
            st.push(i);
        }
        while(!st.empty()){
            int height=st.peek();
            st.pop(); // to remove the elemnt because we have already stored it okk
            int nse=n;
            int pse=st.isEmpty()?-1:st.peek();
            int width=nse-pse-1;
            int area=arr[height]*width;
            maxarea=Math.max(maxarea,area);
        }
        System.out.println("Largest Histogram Area: "+maxarea);
    }
}