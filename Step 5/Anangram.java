import java.util.HashMap;

public class Anangram {

    private static boolean checkAnag(String s , String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> s1=new HashMap<>();
        HashMap<Character,Integer> t2=new HashMap<>();

        int n=s.length();

        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            s1.put(c1,s1.getOrDefault(c1, 1)+1);

            t2.put(c2,t2.getOrDefault(c2, 1)+1);
        }

        for(char c : s1.keySet()){
            if(!t2.containsKey(c) || !s1.get(c).equals(t2.get(c))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean res = checkAnag(s,t);
        if(res){
            System.out.println("The strings are anagrams");
        }
        else{
            System.out.println("The strings are not anagrams");
        }
    }
}
