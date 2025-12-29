public class nicesubaarays {

    private static int countnice(int[] nums , int k){
        
        int n=nums.length;
        int left=0;
        int right=0;
        int count=0;
        int oddcount=0;
        while(right<n){
            if(nums[right]%2!=0){
                oddcount++;
            }

            while(oddcount>k){
                if(nums[left]%2!=0){
                    oddcount--;
                }
                left++;
            }

            count+=(right-left+1);
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,1,1};
        int n=nums.length;
        int count=0;
        int k=3;
        
        // Bruteforce Approach 
        // for(int i=0;i<n;i++){
        //     int oddcount=0;
        //     for(int j=i;j<n;j++){
        //         if(nums[j]%2!=0){
        //             oddcount++;
        //         }
        //         if(oddcount>k){
        //             break;
        //         }
        //         if(oddcount==k){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);

        // optimal approach 
        count=countnice(nums,k)-countnice(nums,k-1);
        System.out.println(count);
    }
}
