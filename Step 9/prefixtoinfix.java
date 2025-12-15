import java.util.Stack;

public class prefixtoinfix {
    public static void main(String[] args) {
        String s = "*+PQ-MN";
        int n= s.length();
        
        Stack<String> st = new Stack<>();
        for(int i = n-1;i>=0;i--){
            char ch =s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }
            else{
                String top1=st.pop();
                String top2=st.pop();
                String temp = "("+top1+ch+top2+")";
                st.push(temp);
            }
        }
        System.out.println("The infix expression is "+ st.pop());
    }
}
