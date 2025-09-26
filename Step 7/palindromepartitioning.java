import java.util.ArrayList;
import java.util.List;

public class palindromepartitioning {
    private static boolean ispalindrome(String s , int start , int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    private static void partition(int ind , String s , List<String> arr , List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(arr));
            return;
        }

        // now traverse 
        for(int i=ind;i<s.length();++i){
            if(ispalindrome(s, ind, i)){
                arr.add(s.substring(ind, i+1));
                partition(ind+1, s, arr, ans);
                arr.remove(arr.size()-1);
            }
        }

    }
    public static void main(String[] args) {
        String s = "aabb";
        List<List<String>> ans = new ArrayList<>();
        List<String> arr= new ArrayList<>();

        //calling the function
        partition(0,s,arr,ans);
        System.out.println(ans);
    }
}
