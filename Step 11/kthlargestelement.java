import java.util.Arrays;
import java.util.PriorityQueue;

public class kthlargestelement {
    public static void main(String[] args) {
        int[] arr = {-5, 4, 1, 2, -3};
        int n=arr.length;

        int k=1;

        // bruteforce solution
        // first sort the array and then the n-kth element will be the kth largest 
        // Arrays.sort(arr);
        // System.out.println("The "+k+"th largest element is: "+arr[n-k]);

        // optimal solution by using the priority queue ok so go for it now 
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            pq.offer(arr[i]);
            if(pq.size()>k) pq.poll();
        }
        System.out.println("The "+k+"th largest element is: "+pq.peek());
    }
}
