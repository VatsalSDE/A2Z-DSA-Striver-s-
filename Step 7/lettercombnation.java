import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lettercombnation {
    private static void backtrack(String inp , int ind , HashMap<Character,String> mp , StringBuilder sb , List<String> ans){
        if(ind == inp.length()){
            ans.add(sb.toString());
            return;
        }
        String current = mp.get(inp.charAt(ind));

        for(int k=0;k<current.length();k++){
            sb.append(current.charAt(k));
            backtrack(inp, ind+1, mp, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }   
    public static void main(String[] args) {
        String digits = "2";
        List<String> ans = new ArrayList<>();

        // first store all the combinations
        // so use a hashmap for that 

        HashMap<Character , String> mp = new HashMap<>();
        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");

        // now we will make teb heloper function that will perform the recursion and backtracking

        if(digits.length()==0){
            System.out.println(ans);
        }

        backtrack(digits , 0 , mp , new StringBuilder(),ans);

        System.out.println("The combinations are ");
        System.out.println(ans);
    }
}
