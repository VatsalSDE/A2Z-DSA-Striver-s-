import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthsmallestelement {
    public static void main(String[] args) {
        int[] arr ={-5, 4, 1, 2, -3};
        int n=arr.length;

        int k=3;

        // Bruteforce Solution

        // Arrays.sort(arr);
        // System.out.println("The "+k+" th smallest element is "+arr[k-1]);

        // Optimal Solution
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            maxHeap.offer(arr[i]);
            if(maxHeap.size()>k) maxHeap.poll();
        }
        System.out.println("The "+k+" th smallest element is "+maxHeap.peek());
    }
}
