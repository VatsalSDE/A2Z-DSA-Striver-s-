import java.util.Stack;

public class maximalRectangles {

    private static int largesthistogram(int[] arr){
        int n=arr.length;

        int maxarea=0;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.empty() && arr[st.peek()] > arr[i]){
                int height=st.pop();
                int nse=i;
                int pse=st.empty()?-1:st.peek();
                int width=nse-pse-1;
                int area=arr[height] * width;
                maxarea=Math.max(area,maxarea);
            }
            st.push(i);
        }

        while(!st.empty()){
            int height=st.pop();
                int nse=n;
                int pse=st.empty()?-1:st.peek();
                int width=nse-pse-1;
                int area=arr[height] * width;
                maxarea=Math.max(area,maxarea);
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,0,1,0,1},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        int n=arr.length;
        int m=arr[0].length;
        int maxarea=0;

        int[][] prefsum=new int[n][m];

        // now we will find the prefix sum at every elemnt so can easily make the histograms okk
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=arr[i][j];
                if(arr[i][j]==0){
                    prefsum[i][j]=0;
                    sum=0;
                }
                else{
                    prefsum[i][j]=sum;
                }
            }
        }
        // now we have the prefix sum matrix
        // so we will pass every row of the prefix sum to the larget histogram code and it will return the area then we have to take the max area of all the rows 

        for(int i=0;i<n;i++){
            int area = largesthistogram(prefsum[i]);
            maxarea=Math.max(maxarea,area);
        }
        System.out.println("The maximum area of rectangle is "+maxarea);
    }
}
