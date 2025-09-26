import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
    private static void uniquesub(int ind , int[] arr , List<List<Integer>> ans, List<Integer> drr ){
        ans.add(new ArrayList<>(drr));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;
            drr.add(arr[i]);
            uniquesub(i+1, arr, ans, drr);
            drr.remove(drr.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,2};
        int n=arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> drr=new ArrayList<>();
        Arrays.sort(arr);
        uniquesub(0,arr,ans,drr);

        System.out.println(ans);
    }
}
