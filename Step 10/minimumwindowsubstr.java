import java.util.HashMap;
import java.util.Map;

public class minimumwindowsubstr {
    // helper function too be used okk for validation for the bruteforce method 
    private static boolean isValid(Map<Character,Integer> smp,Map<Character,Integer>mp){
        for(Character key:mp.keySet()){
            if(smp.getOrDefault(key,0)<mp.get(key)){
                return false;
            }
        }
        return true;
    }
    // This is the bruteforce function to be implemented 
    private static String brutefominimuwindow(String s , String t){
        int n=s.length();
        int m=t.length();
        Map<Character,Integer> mp=new HashMap<>();
        // so here we have set our needed map okk 
        for(int i=0;i<m;i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }

        // now we take the map for our input string
        Map<Character,Integer> smp=new HashMap<>();

        int minlen=Integer.MAX_VALUE;
        String ans="";

        for(int i=0;i<n;i++){
            smp.clear();
            for(int j=i;j<n;j++){
                smp.put(s.charAt(j), smp.getOrDefault(s.charAt(j), 0)+1);

                // now check if the curent string is valid or not so for that
                if(isValid(smp,mp)){
                    int len=j-i+1;
                    if(len<minlen){
                        minlen=len;
                        ans=s.substring(i, j+1);
                    } 
                    break; 
                }
            } 
        }
        return ans;
    }

    // The optimal function for this 
    private static String optimalsubwindow(String s , String t){
        int n=s.length();
        int m=t.length();

        int left=0;
        int right=0;
        int count=0;
        int minlen=Integer.MAX_VALUE;
        int sindex=-1;

        int[] hash=new int[256];

        // so now updating the hasharray according to the t string 
        for(int i=0;i<m;i++){
            hash[t.charAt(i)]++;
        }

        //now will apply the logic
        while(right<n){
            if(hash[s.charAt(right)]>0){
                count++;
            }
            hash[s.charAt(right)]--;

            while(count==m){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    sindex=left;
                }
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)]>0){
                    count--;
                }
                left++;
            }
            right++;
        }
        return sindex==-1?"":s.substring(sindex, sindex+minlen);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        // String result = brutefominimuwindow(s, t);
        // System.out.println(result);

        String result=optimalsubwindow(s, t);
        System.out.println(result);
    }
}