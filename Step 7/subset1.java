import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class subset1 {
    private static void subset(int ind , int sum , ArrayList<Integer> arr , ArrayList<Integer> ans){
        if(ind == arr.size()){
            ans.add(sum);
            return;
        }

        subset(ind+1, sum+arr.get(ind), arr, ans);

        subset(ind+1, sum, arr, ans);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);

        ArrayList<Integer> ans = new ArrayList<>();
        subset(0,0,arr,ans);

        Collections.sort(ans);

        System.out.println(ans);
    }
}
