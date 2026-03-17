import java.util.HashMap;
import java.util.HashSet;

public class countnoofsubstring {

    static int optimalsubstri(String s , int k){
        int n=s.length();

        int left=0;
        int right=0;

        HashMap<Character,Integer> map = new HashMap<>();

        int count=0;

        while(right<n){
            char c =s.charAt(right);
            map.put(c, map.getOrDefault(c,0)+1);

            // shrink the window if size is greater 
            while(map.size()>k){
                char leftchar=s.charAt(left);

                map.put(leftchar, map.get(leftchar)-1);

                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                left++;
            }
            // if size is equal to k then add the count of substring
            count+=right-left+1;
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "pqpqs";
        int k=2;
        // int n=s.length();
        // int count=0;
        // for(int i=0;i<n;i++){
        //     HashSet<Character> st=new HashSet<>();
        //     for(int j=i;j<n;j++){
        //         st.add(s.charAt(j));
        //         if(st.size()==k){
        //             count++;
        //         }
        //         else if(st.size()>k){
        //             break;
        //         }
        //     }
        // }
        // System.out.println(count);

        int ans = optimalsubstri(s, k) - optimalsubstri(s, k-1);
        System.out.println(ans);
    }
}
