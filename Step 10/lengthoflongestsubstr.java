import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class lengthoflongestsubstr {
    public static void main(String[] args) {
        String s = "abcddabac";
        int n=s.length();

        // Naive Approach
        // int maxlength=0;

        // for(int i=0;i<n;i++){
        //     int[] hash=new int[256];
        //     Arrays.fill(hash, 0);

        //     for(int j=i;j<n;j++){
        //         if(hash[s.charAt(j)]==1) break;
        //         hash[s.charAt(j)]=1;

        //         int len=j-i+1;
        //         maxlength=Math.max(maxlength, len);
        //     }
        // }
        // System.out.println("The maximum length of the substring without the repeating character is "+maxlength);

        // some optimized approach
        // int left=0;
        // int right=0;
        // int maxlength=0;

        // taking a hashset
        // Set<Character> st=new HashSet<>();
        // while(right<n){
        //     if(!st.contains(s.charAt(right))){
        //         st.add(s.charAt(right));
        //         int len=right-left+1;
        //         maxlength=Math.max(maxlength, len);
        //         right++;
        //     }
        //     else{
        //         st.remove(s.charAt(left));
        //         left++;
        //     }
        // }
        // System.out.println("The maximum length of the substring without the repeating character is "+maxlength);

        // final optimized code
        int left=0;
        int right=0;
        int maxlength=0;
        HashMap<Character,Integer> mp = new HashMap<>();

        while(right<n){
            if(mp.containsKey(s.charAt(right))){
                left=Math.max(mp.get(s.charAt(right))+1,left);
            }
            mp.put(s.charAt(right), right);
            int len=right-left+1;
            maxlength=Math.max(maxlength, len);
            right++;    
        }
        System.out.println("The maximum length of the substring without the repeating character is "+maxlength);
    }
}
