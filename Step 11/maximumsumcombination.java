import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class maximumsumcombination {

    private static List<Integer> optimal(int[] nums1 , int nums2[],int k){

        int n = nums1.length;

        // Step 1 to sort the arrays 
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Step 2 Initialize a min heap by the lambda function
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> b[0]-a[0]
        );

        // take a hashset for the tracking okk
        HashSet<String> visited = new HashSet<>();

        int i=n-1;
        int j=n-1;

        pq.offer(new int[] {nums1[i] + nums2[j],i,j});
        visited.add(i+","+j);

        List<Integer> result = new ArrayList<>();

        while(k>0 && !pq.isEmpty()){
            
            int[] curr = pq.poll();

            result.add(curr[0]);

            i=curr[1];
            j=curr[2];

            if(i-1>=0 && !visited.contains((i-1)+","+j)){
                pq.offer(new int[]{nums1[i - 1] + nums2[j], i - 1, j});
                visited.add((i - 1) + "," + j);
            }
            if(j-1>=0 && !visited.contains(i+","+(j-1))){
                pq.offer(new int[]{nums1[i] + nums2[j - 1], i, j - 1});
                visited.add(i + "," + (j - 1));
            }

            k--;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1={7,3};
        int[] nums2={1,6};

        // Bruteforce
        // int sum=0;
        // PriorityQueue<Integer> minheap= new PriorityQueue<>();
        // int k=2;

        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         int currsum=nums1[i]+nums2[j];
        //         minheap.add(currsum);
        //         if(minheap.size()>k){
        //             minheap.poll();
        //         }
        //     }
        // }
        // while(!minheap.isEmpty()){
        //     System.out.println(minheap.poll());
        // }

        // Optimal Solution
        List<Integer> ans= optimal(nums1, nums2, 2);
        for(int sum: ans){
            System.out.println(sum);
        }
    }
}