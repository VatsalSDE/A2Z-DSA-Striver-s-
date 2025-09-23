import java.lang.reflect.Array;
import java.util.ArrayList;

public class combinationsum {
    private static void findcombinations(int ind , int[] arr , int target , ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> drr){

        // base condition 
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(drr));
            }
            return;
        }

        // take the element with the given condition that it could be taken n number of times
        if(arr[ind]<=target){
            drr.add(arr[ind]);
            findcombinations(ind, arr, target-arr[ind], ans, drr);
            drr.remove(drr.size()-1);
        }

        // not take the element 
        findcombinations(ind+1, arr, target, ans, drr);
    }
    public static void main(String[] args) {
        int[] arr={2,3,5};
        int n=arr.length;

        int target =8;
        ArrayList<ArrayList <Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();

        findcombinations(0,arr,target,ans,ds);
        System.out.println(ans);
    }
}
