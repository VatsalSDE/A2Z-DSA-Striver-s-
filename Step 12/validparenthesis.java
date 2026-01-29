public class validparenthesis {

    private static boolean isvalid(String s , int ind , int cnt){
        if(cnt<0){
            return false;
        }
        if(ind==s.length()){
            return (cnt==0);
        }
        if(s.charAt(ind)=='('){
            return isvalid(s, ind+1, cnt+1);
        }
        else if (s.charAt(ind)==')'){
            return isvalid(s, ind+1, cnt-1);
        }
        else{ // it must be the asterik noww okk
            return (isvalid(s, ind+1, cnt+1) || isvalid(s, ind+1, cnt-1) || isvalid(s, ind+1, cnt));
        }
        
    }

    private static boolean greedyisvalid(String s){
        int n = s.length();

        int min=0;
        int max=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                min++;
                max++;
            }
            else if(s.charAt(i)==')'){
                min--;
                max--;
            }
            else{
                min--;
                max++;
            }
            if(max<0){
                return false;
            }
            if(min<0){
                min=0;
            }
        }
        return (min==0);
    }
    public static void main(String[] args) {
        String s="(*))";
        int cnt=0;
        System.out.println(greedyisvalid(s));
    }
}
