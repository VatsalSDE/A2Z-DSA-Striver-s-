import java.util.HashMap;
import java.util.Map;

public class singlenumberpart3 {
    private static void brutesin3 (int[] nums){
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i], 1);
            }
        }

        int[] ans =new int[2];
        int j=0;
        for(Map.Entry<Integer, Integer> entry:mp.entrySet() ){
            if(entry.getValue()==1){
                ans[j]=entry.getKey();
                j++;
            }
        }
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] optimizedsin3(int[] nums){
        int n=nums.length;

        int num=0;

        for(int i=0;i<n;i++){
            num=num^nums[i];
        }

        int rightmost=(num&num-1) ^ num;

        int xor1=0; 
        int xor2=0;

        for(int i=0;i<n;i++){
            if((nums[i] & rightmost) != 0){
                xor1=xor1^nums[i];
            }
            else{
                xor2=xor2^nums[i];
            }
        }

        if(xor1>xor2) return new int[]{xor2,xor1};
        return new int[]{xor1,xor2};
    }
    public static void main(String[] args) {
        int nums[] = {2,4,2,6,3,7,7,3};
        int n = nums.length;
        // bruteforce 
        // brutesin3(nums);

        //optimized
        int[] ans=optimizedsin3(nums);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
