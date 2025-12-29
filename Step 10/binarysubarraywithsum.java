public class binarysubarraywithsum {
    private static int findsubcount(int[] nums , int goal){
        if(goal<0) return 0;
        int n=nums.length;
        int sum=0;
        int count=0;

        // two pointers 
        int left=0;
        int right=0;

        while(right<n){
            sum+=nums[right];

            // check if sum is greater than goal so decrease the window 
            while(sum>goal){
                sum-=nums[left];
                left++;
            }

            count+=(right-left+1);
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,0,0,1,1,0};
        int n=nums.length;
        // breuteforce
        int goal=2;
        // int count=0;

        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum==goal){
        //             count++;
        //         }
        //         else if(sum>goal){
        //             break;
        //         }
        //     }
        // }
        // System.out.println(count);

        // now applying the optimal so it is 
        // subtract the sum<=goal count - sum<=goal-1 count
        int result=findsubcount(nums, goal)-findsubcount(nums, goal-1);
        System.out.println(result);
    }
}
