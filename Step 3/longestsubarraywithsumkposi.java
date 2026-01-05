import java.util.HashMap;

public class longestsubarraywithsumkposi {

    // brute force using two loops 
    // better approach using the hashmap 
    // below one is the optimal approach code using the two pointers and sliding window concept

    public static void main(String[] args) {
        // longest subarray with given sum k positives 
        int[] arr = {6,4,3,2,5};
        int n=arr.length;

        int k=10;

        // better approach same works for the posi + negative also 
        HashMap<Integer, Integer> presum = new HashMap<>();

        int sum=0;
        int maxlen=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxlen=Math.max(maxlen, i+1);
            }

            // calculate the remaing part 
            int rem = sum-k;

            if(presum.containsKey(rem)){
                int len = i-presum.get(rem);
                maxlen=Math.max(maxlen, len);
            }
            if(!presum.containsKey(sum)){
                presum.put(sum, i);
            }
        }
        


        // optimal method
        // int left =0;
        // int right =0;

        // int maxlen=0;
        // int sum=0;

        // while(right < n){
        //     sum+=arr[right];

        //     while (sum>k && left<=right) {
        //         sum-=arr[left];
        //         left++;
        //     }
        //     if(sum==k){
        //         maxlen=Math.max(maxlen,right-left+1);
        //     }

            
        //     right++;
            
        // }

        System.out.println(maxlen);
    }
}
