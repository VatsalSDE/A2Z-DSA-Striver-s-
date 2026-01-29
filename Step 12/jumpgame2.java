public class jumpgame2 {

    private static int minJumps(int[] nums , int position){
         if (position >= nums.length - 1) return 0;

        // If stuck at a 0
        if (nums[position] == 0) return Integer.MAX_VALUE;

        int minStep = Integer.MAX_VALUE;

        // Try every jump from 1 to nums[position]
        for (int jump = 1; jump <= nums[position]; jump++) {
            int subResult = minJumps(nums, position + jump);
            if (subResult != Integer.MAX_VALUE) {
                minStep = Math.min(minStep, 1 + subResult);
            }
        }

        return minStep;
    }

    private static int optimigreedy(int[] arr ){
        int jump=0;
        int currentend=0;
        int farthest=0;

        int n=arr.length;

        for(int i=0;i<n-1;i++){
            farthest=Math.max(farthest, i+arr[i]);

            if(i==currentend){
                jump++;
                currentend=farthest;
            }
        }
        return jump;
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        int n=nums.length;
        // System.out.println(minJumps(nums, 0));

        System.out.println(optimigreedy(nums));
    }
}