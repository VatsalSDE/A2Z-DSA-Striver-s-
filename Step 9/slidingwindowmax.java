import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class slidingwindowmax {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,2,1,6};
        int n=arr.length;

        int k=3;
        int[] maxofwindow=new int[n-k+1];

        // bruteforce method
        // for(int i=0;i<=n-k;i++){   
        //     int max=Integer.MIN_VALUE;
        //     for(int j=i;j<i+k;j++){
        //         if(arr[j]>max){
        //             max=arr[j];
        //         }
        //     }
        //     maxofwindow[i]=max;
        // }   
        // for(int i=0;i<maxofwindow.length;i++){
        //     System.out.print(maxofwindow[i] + " ");
        // }

        // optimized method using dequeue
        Deque<Integer> dq=new LinkedList<>();
        List<Integer> re=new ArrayList<>();

        for(int i=0;i<n;i++){
            //first we will check if the window is of proper size or not if greter than k the remove the elements 
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }

            // now we will remove the smaller valued values from the front if encountered the larger value 
            while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
                dq.pollLast();
            }

            // now we will add the i to the dq ate at last that is from back 
            dq.offerLast(i);

            // now once the first window is confirmed add the value to output
            if(i>=k-1){
                re.add(arr[dq.peekFirst()]);
            }
        }
        for(int i=0;i<maxofwindow.length;i++){
            maxofwindow[i]=re.get(i);
        }
        for(int i=0;i<maxofwindow.length;i++){
            System.out.print(maxofwindow[i] + " ");
        }
    }
}