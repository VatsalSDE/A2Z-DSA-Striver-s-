import java.util.HashMap;

public class isomorphicString {

    private static boolean checkIsomorphic(String s , String t){
        if(s.length() != t.length()){
            return false;
        }

        int n=s.length();
        HashMap<Character,Character> mp = new HashMap<>();

        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(mp.containsKey(c1)){
                if(mp.get(c1)!=c2){
                    return false;
                }
            }
            else{
                if(mp.containsValue(c2)){
                    return false;
                }
                mp.put(c1,c2);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean res = checkIsomorphic(s,t);
        if(res){
            System.out.println("The strings are isomorphic");
        }
        else{
            System.out.println("The strings are not isomorphic");
        }
    }
}
