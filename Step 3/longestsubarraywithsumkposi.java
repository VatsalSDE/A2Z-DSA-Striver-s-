public class longestsubarraywithsumkposi {

    // brute force using two loops 
    // better approach using the hashmap 
    // below one is the optimal approach code using the two pointers and sliding window concept

    public static void main(String[] args) {
        // longest subarray with given sum k positives 
        int[] arr = {2,5,3,4,6};
        int n=arr.length;

        int k=7;

        int left =0;
        int right =0;

        int maxlen=0;
        int sum=arr[0];

        while(right < n){
            while (sum>k && left<=right) {
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen,right-left+1);
            }

            right++;
            if(right<n) sum+=arr[right];
        }
        System.out.println(maxlen);
        
    }
}
