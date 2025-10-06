import java.util.ArrayList;

public class ExpressionAddOperator {
    public static void dfs(String s , int ind , String path , long eval , long prev , int target , ArrayList<String> res){
        if(ind == s.length()){
            if(eval==target){
                res.add(path);
            }
            return; // <- always return when index reaches end
        }

        for(int i=ind;i<s.length();i++){
            if(i>ind && s.charAt(ind)=='0') break; // skip numbers like "05"
            String currstr=s.substring(ind, i+1);
            long curr=Long.parseLong(currstr);

            if(ind==0){
                dfs(s, i+1, currstr, curr, curr, target, res);
            }
            else{
                // addition
                dfs(s, i+1, path + "+" + currstr, eval+curr, curr, target, res);

                // subtraction
                dfs(s, i+1, path + "-" + currstr, eval-curr, -curr, target, res);

                // multiplication
                long neweval = eval-prev + prev*curr;
                long newprev=prev*curr;
                dfs(s, i+1, path + "*" + currstr, neweval, newprev, target, res);
            }
        }
    }
    public static void main(String[] args) {
        String s= "123";
        int target=6;
        ArrayList<String> res = new ArrayList<>();

        dfs(s,0,"",0L,0L,target,res);

        System.out.println(res);
    }
}
