import java.util.Stack;

public class removekdigits {
    private static String removek(String s , int k){
        Stack<Character> st = new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            while(!st.empty() && k>0 && (st.peek()-'0')>(s.charAt(i)-'0')){
                st.pop();
                k--;
            }
            st.push(s.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }

        if(st.empty()) return "0";
        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }
        sb.reverse();

        // remove leading zeroes
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "100342";
        int k=3;
        String result =removek(s,k);
        System.out.println(result);
    }
}