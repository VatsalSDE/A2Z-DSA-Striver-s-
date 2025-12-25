public class maxconsecutiveones3 {
    public static void main(String[] args) {
        int[] nums={1,1,1,0,0,0,1,1,1,1,0};
        int k=3;
        int maxlength=0;
        int n=nums.length;

        // Naive or Bruteforce Approach
        // for(int i=0;i<n;i++){
        //     int cnt=0;
        //     for(int j=i;j<n;j++){
        //         if(nums[j]==0){
        //             cnt++;
        //         }
        //         else if(cnt<=k){
        //             int len=j-i+1;
        //             maxlength=Math.max(maxlength, len);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // System.out.println("The maximum length of consecutive 1's after flipping at most k 0's is "+maxlength);

        // optimal approach
        int left=0;
        int right=0;
        int zeroCount=0;
        while(right<n){
            if(nums[right]==0) zeroCount++;
            while(zeroCount>k){
                if(nums[left]==0) zeroCount--;
                left++;
            }
            int len=right-left+1;
            maxlength=Math.max(maxlength, len);
            right++;
        }
        System.out.println("The maximum length of consecutive 1's after flipping at most k 0's is "+maxlength);
    }
}
