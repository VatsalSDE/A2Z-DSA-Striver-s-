import java.util.HashMap;

public class longetsybsatmostkdistinct {
    public static void main(String[] args) {
        String s = "aababbcaacc";
        int n=s.length();
        int k=2;

        // Bruteforce Approach Extreme Naive
        // int maxlength=0;
        // HashMap<Character,Integer> mp = new HashMap<>();

        // for(int i=0;i<n;i++){
        //     mp.clear();
        //     for(int j=i;j<n;j++){
        //         char c =s.charAt(j);

        //         mp.put(c, mp.getOrDefault(c, 0)+1);

        //         if(mp.size()>k) break;

        //         maxlength=Math.max(maxlength, j-i+1);
        //     }
        // }
        // System.out.println(maxlength);

        // optimal approach 
        int maxlength=0;
        int left=0;
        int right=0;
        HashMap<Character,Integer>mp = new HashMap<>();

        while(right<n){
            char c = s.charAt(right);
            mp.put(c, mp.getOrDefault(c, 0)+1);

            // if the size of the map is greater than k so we need to take out from left 
            while (mp.size()>k) {
                char leftchar=s.charAt(left);
                mp.put(leftchar, mp.get(leftchar)-1);
                if(mp.get(leftchar)==0){
                    mp.remove(leftchar);
                }
                left++;
            }
            maxlength=Math.max(maxlength, right-left+1);
            right++;
        }
       System.out.println(maxlength);
    }
}