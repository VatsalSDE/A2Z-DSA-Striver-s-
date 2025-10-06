import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

  // this is the recursive bruteforce approach which very time consuming so we need to apply the optimal approach for this 
public class wordbreak {
    private static boolean canBreak(int start, String s, Set<String> dict) {
        
        if (start == s.length()) return true;

        
        for (int end = start + 1; end <= s.length(); end++) {
            String prefix = s.substring(start, end);

            
            if (dict.contains(prefix)) {
                if (canBreak(end, s, dict)) {
                    return true;  
                }
            }
        }

        
        return false;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        ArrayList<String> arr = new ArrayList<>();
        arr.add("leet");
        arr.add("code");

        Set<String> dict = new HashSet<>(arr);
        System.out.println(canBreak(0, s, dict));
    }
}
