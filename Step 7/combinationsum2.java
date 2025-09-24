import java.util.ArrayList;
import java.util.Arrays;

public class combinationsum2 {

    private static void combin2(int ind , int target , int[] arr , ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> drr){
        if(target==0){
            ans.add(new ArrayList<>(drr));
            return;
        }

        for(int i=ind ; i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target){
                break;
            }   
            drr.add(arr[i]);
            combin2(i+1, target-arr[i], arr, ans, drr);
            drr.remove(drr.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2};
        int n=arr.length;
        int target=4;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        combin2(0,target,arr,ans,new ArrayList<>());
        System.out.println(ans);
    }
}
