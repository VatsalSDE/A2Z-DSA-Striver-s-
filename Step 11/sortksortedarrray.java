import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class sortksortedarrray {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k=3;
        int n=arr.length;

        // Bruteforce Solution for this 
        // sort the array with any sorting algorithm okk so here we will directly use the sort function from collections okk so now moving ahead to it 
        // Arrays.sort(arr);
        // System.out.println("The sorted array is ");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // Optimal Solution now for this 
        // now we take the min heap 
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        // we know that the smallest elemnt will be in the k+1 distance only 
        // so first we will add the first k+1 elements into the min heap
        ArrayList<Integer> all=new ArrayList<>();

        for(int i=0;i<=k && i<n;i++){
            pq.offer(arr[i]);
        }

        // now we will pop the top element and simultaneously will add the elemnt to the priority queue
        for(int i=k+1;i<n;i++){
            all.add(pq.poll());
            pq.offer(arr[i]);
        }
        // now we will pop the remaining elements from the priority queue
        // and add them to the array list 
        while(!pq.isEmpty()){
            all.add(pq.poll());
        }
        // now print the array list
        System.out.println("The sorted array is");
        System.out.println(all);
    }
}
