import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class sortCharactersByfreq {
    public static void main(String[] args) {
        String s ="tree";
        int n=s.length();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        list.sort((a,b)->map.get(b)-map.get(a));

        StringBuilder ans = new StringBuilder();
        for(char c : list){
            int freq=map.get(c);

            for(int i=1;i<=freq;i++){
                ans.append(c);
            }
        }

        System.out.println("The final output is the ");
        System.out.println(ans.toString());
    }
}
