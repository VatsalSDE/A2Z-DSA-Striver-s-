import java.lang.reflect.Array;
import java.util.ArrayList;

public class powerset {
    private static void  powset(int[] nums , ArrayList<ArrayList<Integer>> ans){
        // no of subsets 
        int subset=1<<nums.length;

        for(int num=0;num<subset;num++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((num&(1<<j)) != 0){
                    arr.add(nums[j]);
                }
            }
            ans.add(arr);
        }

        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        powset(nums, ans);
       System.out.println(ans);
    }
}
