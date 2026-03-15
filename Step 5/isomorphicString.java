import java.util.HashMap;

public class isomorphicString {

    private static boolean checkIsomorphic(String s , String t){
       if(s.length() != t.length()){
            return false;
       }

       HashMap<Character,Character> mp=new HashMap<>();
       int n=s.length();

       for(int i=0;i<n;i++){
        char cs=s.charAt(i);
        char ct=t.charAt(i);

        if(mp.containsKey(cs)){
            if(mp.get(cs) == ct){
                continue;
            }
            else{
                return false;
            }
        }
        else{
            if(mp.containsValue(ct)){
                return false;
            }
            mp.put(cs, ct);
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
