import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class topkfrequentelement {

    private static int[] brutesoluti(int[] nums , int k){
        HashMap<Integer,Integer> freq = new HashMap<>();

        // put the element into the map with frequencies 
         for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // covert map keys to the list 
        List<Integer> elements=new ArrayList<>(freq.keySet());

        // Step 3: Sort list based on frequency (descending order)
        Collections.sort(elements, (a, b) -> freq.get(b) - freq.get(a));

        int[] result=new int[k];

        for(int i=0;i<k;i++){
            result[i]=elements.get(i);
        }
        return result;
    }

    private static int[] optimalsolution(int[] nums , int k){
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> minheap=new PriorityQueue<>(
            (a,b) -> freq.get(a) - freq.get(b)
        );

        for(int i : freq.keySet()){
            minheap.offer(i);
            if(minheap.size() > k){
                minheap.poll();
            }
        }

        int[] result = new int[k];
        int index=0;
        while(!minheap.isEmpty()){
            result[index++]=minheap.poll();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={1,2,1,2,1,2,3,1,3,2};
        int n=nums.length;

        int k=2;

        // bruteforce
        // int[] result=brutesoluti(nums, k);

        // optimal
        int[] result=optimalsolution(nums, k);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
