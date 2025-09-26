import java.util.*;

public class combinationsum3 {
    private static void combisum3(int start , int k, int n , List<Integer> drr,List<List<Integer>> ans){
        if(drr.size()==k && n==0){
            ans.add(new ArrayList<>(drr));
            return;
        }
        // invalid case check
        if(drr.size() > k || n<0){
            return;
        }

        for(int i=start;i<=9;i++){
            drr.add(i);
            combisum3(i+1, k, n-i, drr, ans);
            drr.remove(drr.size()-1);
        }

    }
    public static void main(String[] args) {
        int k=2;
        int n=5;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> drr = new ArrayList<>();

        combisum3(1,k,n,drr,ans);
        System.out.println(ans);
    }
}
